package runtime;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class GJRuntime implements GJRuntimeConstants{

	private Stack<HashMap<String, DataValues>> memoryStack = new Stack<>();
    private List<String> intermediateCode;
    private boolean storeReturn = false;

    private int programCounter = 0;
    private String output = "";


	 public GJRuntime(String intermediateCode) {
	        this.intermediateCode = Arrays.asList(intermediateCode.split("\\n"));
	        System.out.println("intermediate code"+ this.intermediateCode) ;
	    }


	 public void execute() {
		 initializeStackMemory();

	        while(programCounter < intermediateCode.size()) {
	        	//programCounter = executeInstructionHandler(intermediateCode.get(programCounter), programCounter) + 1;
	        }

	        System.out.println();
	    }

	    private void initializeStackMemory() {

	    	memoryStack.push(new HashMap<>());

	    }

	    private String[] splitInstruction(String instruction) {
	        return instruction.split("\\s");
	    }

}