package runtime;

import java.util.*;
import java.util.HashMap;

/**
 * This class evaluates the run() function for execution of instructions found in the intermediate code(read by runtimeMainGJ).
 * @author:Dhruvi Modi
 * @since April-28-2022
 * @version 1.0
 */

public class GJRuntime implements GJRuntimeConstants
{
	public Stack<HashMap<String,GJConvertDataType>> stack = new Stack<>();
	public List<String> antlrintermediate;

	/* Setting program counter to 0 for starting of execution */
	private int pc = 0;
	private String executionOutput = "";

	/* Creating constructor for Evaluator */

	public GJRuntime(String s)
	{
		this.antlrintermediate = Arrays.asList(s.split("\\n"));
	}

	/* This function executes instructions till the programCounter reaches end of intermediateCode */
	public void run() throws Exception
	{
		initializeStack();
		for(int i = this.pc ; i<antlrintermediate.size();i++)
		{
			i =exeInsHandler(antlrintermediate.get(i), i);
		}
	}

	/* This function handles the execution of instruction using switch case */

	public int exeInsHandler(String insNum, int pc) throws Exception
	{
		String[] listIns = divideIn(insNum);
		//System.out.println(pc+" "+Arrays.toString(listIns));

		String type = listIns[0];
		//System.out.println(type);

		switch(type)
		{
			//This case handles store instruction
			case SACHAV:
				handleStore(listIns);
				break;

			//This case handles write instruction
			case LAKH:
				handleShow(listIns);
				break;
			//This case handles arithmetic instructions
			case ADDITION:
			case SUBTRACTION:
			case MULTIPLY:
			case DIVIDE:
				handleArithmetic(listIns);
				break;
			//This case handles boolean comparison instruction
			case VADHARE:
			case VADHARE_K_SARKHU:
			case OCHHU:
			case OCHHU_K_SARKHU:
			case SARKHU:
			case SARKHU_NAHI:
				handleBool(listIns);
				break;
			//This case handles starting of if conditon instruction
			case JO_START:
				pc = handleIf(++pc);
				break;
			//This case handles starting of elseIf conditon instruction
			case NAHITOH_JO_START:
				pc = handleElseIf(++pc);
				break;
			//This case handles starting of else conditon instruction
			case NAHITOH_START:
				pc = handleElse(++pc);
				break;
			//This case handles starting of while loop instruction
			case SUDHI_START:
				pc = handleWhile(++pc);
				break;
			//This case handles unary minus instruction
			case UNARY_MINUS:
				handleUM(listIns);
				break;
			//This case handles comprison between boolean instruction
			case OR:
			case AND:
				handleBool(listIns);
				break;
		}
		return pc;
	}

	/* This function evaluates split instructions */
	 public String[] divideIn(String i) {
	        return i.split("\\s");
	    }

	/* This function evaluates unary minus instruction */
	 private void handleUM(String[] i) throws Exception{
	    	GJConvertDataType val = giveCValue(i[1]);
	    	String tVal = val.findType();
	    	if(tVal.equalsIgnoreCase("INTEGER")) {
	    		giveVal(i[1], new GJConvertDataType(val.convertToInt()*-1));
	    	}else {
	    		throw new Exception("Oops! Sorry This operation can not be performed.");
	    	}
	    }

	/* This function evaluates arithmetic operations */
	 private void handleArithmetic(String[] i) throws Exception {
			GJConvertDataType first = giveCValue(i[2]);
			GJConvertDataType second = giveCValue(i[3]);
			String firstType = first.findType();
			String secondType = second.findType();

			if(firstType!=secondType) {
				throw new Exception("The data type is different");
			}else if(firstType==secondType && !firstType.equalsIgnoreCase("integer")) {
				throw new Exception("Oops! Can not perform arithmetic exception on Boolean Type");
			}
			else {
				int firstOp = first.convertToInt();
		    	int secondOp = second.convertToInt();

		    	switch(i[0]) {
	            case ADDITION:
	                giveVal(i[1], new GJConvertDataType(firstOp + secondOp));
	                break;
	            case SUBTRACTION:
	                giveVal(i[1], new GJConvertDataType(firstOp - secondOp));
	                break;
	            case MULTIPLY:
	                giveVal(i[1], new GJConvertDataType(firstOp * secondOp));
	                break;
	            case DIVIDE:
	                giveVal(i[1], new GJConvertDataType(firstOp / secondOp));
	                break;
			}

			}
	 }

	 /* This function calls execution output */
	public String giveOutput()
	{
		return this.executionOutput;
	}

	/* This function evaluates store instruction */
	public void handleStore(String[] i) {
		//System.out.println("Setting value: "+instruction[1]+ " " + instruction[2]);
        if(i[1].equals(ACCUMULATOR)) {
            giveVal(ACCUMULATOR, giveCValue(i[2]));
        }
        else {
            giveVal(i[1], findVal(i[2]));
        }
    }

	/* This function evaluates print instruction (Batav in GJ) */
	public void handleShow(String[] i) {
    	GJConvertDataType batavData = giveCValue(i[1]);
    	//System.out.println(batavData.convertToString());
        if (null != batavData) {
            try {
                createOutput(batavData.convertToString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

	/* This function adds the output of specific instruction for final output*/
	public void createOutput (String output) {
        this.executionOutput += output + "\n";
    }

	/* This function evaluates boolean instructions */
	public void handleBool(String[] ins) throws Exception
	{
		GJConvertDataType first = giveCValue(ins[2]);
		GJConvertDataType second = giveCValue(ins[3]);
		String firstType = first.findType();
		String secondType = second.findType();
		if(firstType!=secondType) {
			throw new Exception("The data type is different");
		}else if(firstType==secondType && !firstType.equalsIgnoreCase("integer")) {
			boolean firstBool = first.convertToBoolean();
	        boolean secondBool = second.convertToBoolean();

	        switch(ins[0]) {

	            case AND:
	            	giveVal(ins[1], new GJConvertDataType(firstBool && secondBool));
	            	break;

	            case OR:
	            	giveVal(ins[1], new GJConvertDataType(firstBool || secondBool));
	            	break;
	        }
		} else if(firstType==secondType && firstType.equalsIgnoreCase("integer") && secondType.equalsIgnoreCase("integer")) {
			int firstIns = first.convertToInt();
			int secondIns = second.convertToInt();

			switch(ins[0]) {

				case OCHHU:
//					System.out.println(firstIns+"<"+secondIns);
					giveVal(ins[1], new GJConvertDataType(firstIns < secondIns));
					break;

				case VADHARE:
//					System.out.println(firstIns+">"+secondIns);
					giveVal(ins[1], new GJConvertDataType(firstIns > secondIns));
					break;

				case SARKHU:
//					System.out.println(firstIns+"=="+secondIns);
					giveVal(ins[1], new GJConvertDataType(firstIns == secondIns));
					break;
			}
		}

	}

	/* This function handles the execution of instruction */
	public GJConvertDataType giveCValue(String res)
	{
		if(res.equals("NULL"))
		{
			return null;
		}
		else if(checkIntegerVal(res))
		{
			return new GJConvertDataType(Integer.parseInt(res));
		}
		else if(checkBoolVal(res))
		{
			return new GJConvertDataType(Boolean.parseBoolean(res));
		}
		else {
			return findVal(res);
		}
	}

	/* This function is used to check if given value is an integer value */
	public boolean checkIntegerVal(String res)
	{
		try
		{
			Integer.parseInt(res);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	/* This function is used to check if given value is a boolean value */
	public boolean checkBoolVal(String res) {
        try {
        	Boolean bool = Boolean.parseBoolean(res);
        	if(!bool && !res.equalsIgnoreCase("FALSE")) {
        		 return false;
        	}
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

	/* This function is used to execute a while loop */
	public int handleWhile(int pcStart) throws Exception {
        int a;

        while(true) {
            a = handleSection(pcStart, END_CONDITION ,false);
            //System.out.println("Accumulator: "+findVal(ACCUMULATOR).convertToBoolean());
            boolean flag= findVal(ACCUMULATOR).convertToBoolean();
			//System.out.println("Success till here!");

            if(flag) {

            	a = handleSection(a, SUDHI_END,false);

            }
            else {
            	//System.out.println("Ending while");
                a = handleSection(a, SUDHI_END,true);
            	//System.out.println("executing else for b.");
                break;
            }
        }
        return a;
    }

	/* This function is used to execute instructions within a '{ }' brackets */
	 public int handleSection(int pc, String halt,boolean jump) throws Exception {
	    	//System.out.println(programCounter+" : "+antlrintermediate.size());
	        while(pc >= 0) {
	            String in = antlrintermediate.get(pc);
	            if (in.equals(halt)) {
	                break;
	            }
	            else {
	            	if(!jump) {
	            		pc =exeInsHandler(in, pc);
	            	}
	            	pc = pc +1;
	            }
	        }
	        return pc;
	    }

	/* This function is used to execute an if instruction */
	 private int handleIf(int pc) throws Exception {

	    	pc = handleSection(pc, END_CONDITION,false);
	    	if(findVal(ACCUMULATOR).convertToBoolean()){
	    		pc = handleSection(pc, JO_END,false);
	    		pc = handleSection(pc, JO_TOH_END,true);
	    	} else {
	    		pc = handleSection(pc, JO_END,true);
	    	}
	    	return pc;
	    }

	/* This function is used to execute an else instruction */
	 private int handleElse(int pc) throws Exception {
	    	pc = handleSection(pc, NAHITOH_END,false);
	     	return pc;
	    }

	/* This function is used to execute an else-if instruction */
	 private int handleElseIf(int pc) throws Exception {
	    	pc = handleSection(pc, END_CONDITION,false);
	    	if(findVal(ACCUMULATOR).convertToBoolean()){
	    		pc = handleSection(pc, NAHITOH_JO_END,false);
	    		pc = handleSection(pc, NAHITOH_JO_END,true);
	    	} else {
	    		pc = handleSection(pc, NAHITOH_JO_END,true);
	    	}
	    	return pc;
	    }

	/* This function is used to execute an unary minus instruction */
	 private void handleUMI(String[] ins) throws Exception{
	    	GJConvertDataType op = giveCValue(ins[1]);
	    	String operandDatatype = op.findType();
	    	if(operandDatatype.equalsIgnoreCase("INTEGER")) {
	    		giveVal(ins[1], new GJConvertDataType(op.convertToInt()*-1));
	    	}else {
	    		throw new Exception("Unable to do unary operation on binary");
	    	}
	    }

	/* This function is used to set value in a hashmap */
	 private void giveVal(String id, GJConvertDataType res) {
	        HashMap<String, GJConvertDataType> hm = stack.peek();
	        hm.put(id, res);
	    }

	/* This function is used to set value in a hashmap */
    private GJConvertDataType findVal(String id) {
        HashMap<String, GJConvertDataType> hm = stack.peek();
		//hashMap.entrySet().forEach(entry -> {
		// if(entry.getKey().equals("KHA"))
		// System.out.println(entry.getKey() + " " + entry.getValue().convertToInt());
		// });
        return hm.get(id);
    }


	/* This function initializes stack memory by pushing new HashMap */
	public void initializeStack()
	{
		stack.push(new HashMap<>());
	}
}
