# SER502-Team24

********************************Semester Project for SER 502 Spring 2022******************************************

Team Members:
-Jay Patel(jpatel89)
-Krishna Pandya(kpandya5)
-Dhruvi Modi(dmodi5)
-Keyur Desai(krdesai2)
-Anand Bhattacharya(abhatt63)

Language Name : GJ
We are extremely delighted to come up with a language that has words similar to our language ‘Gujarati’. The keywords for this language are aligned to the traditional Gujarati language. We are experiencing that influence of western culture is increasing day by day in India, and people are leaning more towards languages that are internationally recognized, spoken and understood. We are in a hope that, one day this language will be more popular and people will want to learn Gujarati language to better understand a widely accepted programming language(GJ).

Tools used -
- Eclipse
- Antlr
- Git



System that are used to build compiler and runtime -
- Windows 
- MacOS


Programming Language used to create compiler and runtime: java
For generating lexical analyzer and parser: ANTLR4 
Integrated Development Environment(IDE): Eclipse 
Version Control System/Platform: Git and GitHub

Follow the below steps to install this git project:

1. Clone this git project or
2. Download this git project and Unzip the project in a new folder.
3. Open the project in Eclipse using following steps:
    Files >> Open Project From File System. Browser your project folder here upto extracted project directory.
4. Right click on the project->Go to buid path-> Configure the build path
5. Under the library steps, click on add External Jars-> Under classpath -> Add antlr jar provided in the resource folder
6. Add your code of the program to the file under-sample folder(You can either create a new file or change the code of any existing file with the GJ extension)
7. Set the file path in the CompilerMainGJ.java file and run that file. It will generate the egj file and now run egj file, set the path in the RuntimeMainGJ.java file and it will produce the .output file, which is the evaluation of our intermediate code.

------------------------------------------------------------------------------------------------------
How to run JAR files which are provided in doc folder:
1) Download JAR files as per your JAVA version:
 -JAVA version can be found by using JAVA –version.
2) Put the appropriate JAR files in a folder that contains the sample example files.
 - For example, if you have installed JAVA having version 17, then it is required to download   CompilerMain.java and RuntimeMain.java present in Java jdk 17 jar SER 502 folder inside the doc folder.	
3) Perform the following command to produce the intermediate file from the example file.
	-> java -jar CompilerMain17.jar examplefilename.gj
4) Then perform, the following to produce output file from intermediate file:
	->java -jar RunTime.jar examplefilename.egj
5) The generated file will be examplefilename.output which will have output.

-------------------------------------------------------------------------------------------------------
How to run runnable JAR file:

If you successfully have setup the project in eclipse as per above 7 instructions 

1) Firstly from CompilerMainGJ and RuntimeMainGJ uncomment the line -> if(args.length > 0) and add args[0]
instead of local file path.
2)Click on Window-> Preferences -> Java -> Compiler then set JDK compliance according to your jdk version
3) Click on Apply and close it. 
4) Write click on compiler package. Click Export -> Java -> Runnable JAR file.
5) Set the launch configuration as CompilerMainGJ. Set export destination and give appropriate name. In the library handling click on  ‘package required libraries into generated JAR’ and click finish.
6) Similarly, choose launch configuration for RuntimeMainGJ file and it will generate JAR file for runtime.


For Developers:
Step 1: 
Install ANTLR4 step by step guide is provided.
https://www.youtube.com/watch?v=p2gIBPz69DM
Step 2:
compile using command 'antlr4 GJGrammar.g4' in command prompt.
Step 3:
run using grun 'GJGrammar.g4 program', here prgram is starting symbol of grammar.
Step 4:
Compile java files using 'javac GJGrammar*.java'
Environment used for the project: Windows system
 
Link to the YouTube video(will be added in milestone-2) : https://www.youtube.com/watch?v=iBnJ_Os4QAg
