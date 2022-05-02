package runtime;

import java.io.IOException;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import GJ.GJGrammarLexer;
import GJ.GJGrammarParser;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

/**
 * This class
 * @author
 * @since April-28-2022
 * @version 1.0
 */


public class RuntimeMainGJ {
	public static void main(String[] args) throws IOException {
		try {


			//if (args.length > 0) {
				String pte = "data/example4.egj";			// The example file will be given here for generating output file.
				CharStream antlrIntermediate = CharStreams.fromFileName(pte); //charStream takes stream of characters from the file
				PrintWriter writeOp = new PrintWriter(pte.replace("egj", "output"), "UTF-8"); // creates output file with .output extension


				GJRuntime gjr = new GJRuntime(antlrIntermediate.toString().replaceAll("\r", "")); //run intermediate code
				gjr.run();
				System.out.print("Execution done!\n Output : \n"+gjr.giveOutput().toString()); //print output in console
				writeOp.print(gjr.giveOutput()); //write output to file


		//	}
				writeOp.close();
		} catch (Exception e) {
			System.out.println("Oops!! File not found."+e);
		}
	}
}

