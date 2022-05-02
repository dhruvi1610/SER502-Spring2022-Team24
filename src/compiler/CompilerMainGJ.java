package compiler;

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


public class CompilerMainGJ {
	public static void main(String[] args) throws IOException {
		try {			
			//if (args.length > 0) {
				String filePath = "Sample/example4.gj";
				CharStream antlrIntermediate = CharStreams.fromFileName(filePath); //takes stream of characters from file
				GJGrammarLexer GJLexer = new GJGrammarLexer(antlrIntermediate); //lexer that takes intermediate code
				CommonTokenStream tkStream = new CommonTokenStream(GJLexer); //create tokens from Lexter 
				GJGrammarParser GJparser = new GJGrammarParser(tkStream); 
				ParseTree t = GJparser.program(); //create parse tree

				GJCompiler gjc = new GJCompiler(); //create GJCompiler object

				gjc.visit(t); //visit tree
				List<String> intermediate = Arrays.asList(gjc.giveOutput().split("\\n")); //This stores intermediate code
				if (intermediate.size() > 1) {
					PrintWriter writer = new PrintWriter(filePath.replace("gj", "egj"), "UTF-8");
					for (int i = 0; i < intermediate.size(); i++) {
						writer.println(intermediate.get(i));
					}
					writer.close();
				}
				System.out.println("EGJ created successfully!");

		//	}
		} catch (Exception e) {
			System.out.println("File not found");
		}
	}
}
