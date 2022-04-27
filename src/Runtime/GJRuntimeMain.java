package runtime;

import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class GJRuntimeMain {

	public static void main(String[] args) throws IOException {


		 String inputFile = "Example.cgj";

	        String inputPath = "./src/data/";

	        String path = inputPath + inputFile;
	        System.out.println(path);

	        if (args.length > 0) {
	            path = args[0];
	        }

	        CharStream code = CharStreams.fromFileName(path);

	        PrintWriter writer = new PrintWriter(path.replace("cgj", "output"), "UTF-8");

	        try {

	            GJRuntime runtime = new GJRuntime(code.toString());
	        }
	        catch(Exception e) {
	        	e.printStackTrace();
	        }

	}

}