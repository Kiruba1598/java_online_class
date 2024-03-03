import java.util.Arrays;
import java.util.*;
public class Java_online_class 
{
	static String []s;
	static Scanner sc = new Scanner(System.in);
	private static void b_software() //Basics of Software
	{
		System.out.println("\t\t\tWELCOME TO BASICS OF SOFTWARE SECTION");
		System.out.println();
		System.out.println("1) Definition of Program");
		System.out.println("2) Definition of Programming Language");
		System.out.println("3) Definition of Application");
		System.out.println("4) Types of Languages");
		System.out.println("5) Types of Translators");
		System.out.println("6) Exit");
		System.out.println();

		System.out.println("Enter the Topic you need to learn");

		int choice = sc.nextInt();
		System.out.println();

		if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6)
		{
		while (choice >= 1 && choice <= 6)
		{
		switch (choice)
		{
		case 1 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Program:\n\tIt is just an instruction which is used to create an application.");
				System.out.println("\n\t\tEx: Maggi(In Real Time)");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				System.out.println("Enter the Topic you need to visit");
				System.out.println("1) Definition of Program");
				System.out.println("2) Definition of Programming Language");
				System.out.println("3) Definition of Application");
				System.out.println("4) Types of Languages");
				System.out.println("5) Types of Translators");
				System.out.println("6) Exit");
				System.out.println();
				choice = sc.nextInt();
				System.out.println();
				break;
			}

		case 2:
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Programming Language:\n\t* The language which is used to write the program is called as Programming Language.");
				System.out.println("\t* In IT, we are having many programming languages available such as JAVA, PYTHON, PHP, RUBY, C, C#, NODE JS etc.");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				System.out.println("Enter the Topic you need to visit");
				System.out.println("1) Definition of Program");
				System.out.println("2) Definition of Programming Language");
				System.out.println("3) Definition of Application");
				System.out.println("4) Types of Languages");
				System.out.println("5) Types of Translators");
				System.out.println("6) Exit");
				System.out.println();
				choice = sc.nextInt();
				System.out.println();
				break;
			}

		case 3:
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Application:\n\tThe collection of programs is called as application. We are having three types of applications. They are");
				System.out.println("\t\t(i) Stand alone Application\n\t\t(ii) Web Application\n\t\t(iii) Mobile Application (or) Client Server Application");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				System.out.println("Enter the Topic you need to visit");
				System.out.println("1) Definition of Program");
				System.out.println("2) Definition of Programming Language");
				System.out.println("3) Definition of Application");
				System.out.println("4) Types of Languages");
				System.out.println("5) Types of Translators");
				System.out.println("6) Exit");
				System.out.println();
				choice = sc.nextInt();
				System.out.println();
				break;
			}
			
		case 4:
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Types of Languages:\n\tWe are having Three types of languages. They are");
				System.out.println("\t\t(i) Low Level Language/ Binary Language\n\t\t(ii) Mid Level Language/ Assembly Level Language\n\t\t(iii) High Level Language/ Programming Language");
				System.out.println();
				System.out.println("(i) Low Level Language/ Binary Language:\n\t* It is the language which is the combination of '0's and '1's.\n\t* The level of the language is very low to understand by the programmer. Therefore, there is a need of another language.");
				System.out.println();
				System.out.println("(ii) Mid Level Language/ Assembly Level Language:\n\t* In Assembly Level Language, we are having some pre-defined words called as Mnimonics.\n\t* The level of the language is partially understandable by the programmer.\n\t* The translator used here is \"Assembler\".");
				System.out.println();
				System.out.println("(iii) High Level Language/ Programming Language:\n\t* It is programmer friendly language.\n\t* With the help of high level language, it is easy for the programmer to create complex applications.\n\t* We use \"Compiler\" as translator to convert high level language to low level language (Binary language).\n\t* We are having high level language such as JAVA, PYTHON, C, C#, PHP etc.");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				System.out.println("Enter the Topic you need to visit");
				System.out.println("1) Definition of Program");
				System.out.println("2) Definition of Programming Language");
				System.out.println("3) Definition of Application");
				System.out.println("4) Types of Languages");
				System.out.println("5) Types of Translators");
				System.out.println("6) Exit");
				System.out.println();
				choice = sc.nextInt();
				System.out.println();
				break;
			}

		case 5:
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Types of Translators:\n\tWe are having three types of translaors. They are");
				System.out.println("\t\t(i) Compiler\n\t\t(ii) Interpreter\n\t\t(iii) Assembler");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				System.out.println("Enter the Topic you need to visit");
				System.out.println("1) Definition of Program");
				System.out.println("2) Definition of Programming Language");
				System.out.println("3) Definition of Application");
				System.out.println("4) Types of Languages");
				System.out.println("5) Types of Translators");
				System.out.println("6) Exit");
				System.out.println();
				choice = sc.nextInt();
				System.out.println();
				break;
			}
		}

		if (choice == 6)
		{
			System.out.println("\t\t\tTHANKS FOR VISITING BASIC'S OF SOFTWARE SECTION");
			break;
		}
		}
		}

		else 
			System.out.println("\t\t\tYour Entered Choice is not matching with any of the Topic's.");
		
	}


	static void b_cmd(int a) //Basics of Command Prompt
	{
		switch (a)
		{
		case 1 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Command Prompt:\n\t* It is an application which is used to write the command to perform the task.");
				System.out.println("\t* Command Prompt is case insensitive.");
				System.out.println("\n\t\t(i) Directory/ Package:- It is just a folder.\n\t\t(ii) Woring Directory:- The current folder/ directory which is in use is called as working directory.");
				System.out.println("\t\t(iii) Aboslute Path:- The path starting from the root folder is called as Absolute Path.");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				break;
			}

		case 2:
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Basic Commands used in Command Prompt:\n\t(i)    \"cls\" \t\t\t- It is used to clear the screen.\n\t(ii)   \"drivename:\" \t\t- It is used to jump from one drive to another drive.");
				System.out.println("\t(iii)  \"dir\" \t\t\t- It is used to list the directories and files.\n\t(iv)   \"dir/s\" \t\t\t- It is used to list all the directories and files.");
				System.out.println("\t(v)    \"mkdir fn1 fn2 fn3\"/ \"md fn1 fn2\" - It is used to create the directories/ Folders.\n\t(vi)   \"cd fn\"  \t\t- It is used to change the directories.");
				System.out.println("\t(vii)  \"cd..\" \t\t\t- It is used to tkae the control to the previous directory.\n\t(viii) \"cd fn1\fn2\fn3\" \t\t- It is used to take us the control to the multiple folders/ directories.");
				System.out.println("\t(ix)   \"cd..opp of /..opp of /..\" \t- It is used to take the control more than one previous directories.\n\t(x)    \"rename old_foldername new_foldername\" \t- It is used to rename the folders/ directories.");
				System.out.println("\t(xi)   \"rmdir foldername\" \t- It is used to delete the folder/ directory.\n\t(xii)  \"exit\" \t\t\t- It is used to closed the command prompt application.");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				break;
			}
		}
		
	}

	String history_java(String b) //History of JAVA
	{
		System.out.println("***************************************************************************************************************************************");
		System.out.println("History of JAVA:\n\t* James Gosslings and his team, Initiated the Java Language Project in 1991. It was a small team called Green Team.");
		System.out.println("\t* Initially it was designed for Embeded System (Basic control devices) in appliances like Set-top-Boxes and other Electronic Devices.");
		System.out.println("\t* Initially JAVA was called has \"Green Talk\" by James Gossling and the file extension was \".gt\".");
		System.out.println("\t* After that it was called \"Ook\".");
		System.out.println("\t* Ook is a symbol of strength and chosen as a National Tree of many countries like France, Germany etc.");
		System.out.println("\t* In 1995, Ook was renamed as \"JAVA\". Because it was already a trade mark by Ook Technologies.");
		System.out.println("\t* The team gathered to choose a new name and the suggested words were \"dynamic, revolutionary, silk, jolt, DNA etc.\"");
		System.out.println("\t* They wanted something that reflected the essence of technology, cool and unique.");
		System.out.println("\t* Since JAVA suggested it was unique and Basically, it is an Island of Indonesia where the First Coffee was produced called as JAVA Coffee");
		System.out.println("\t* Since JAVA name is given by James Gossling while having cup of coffee nearby his office.");
		System.out.println("\t* Initially JAVA is developed by James Gosslings and Team. Now it is owned by Oracle Corporation from 2020 Jan 27.");
		System.out.println("***************************************************************************************************************************************");
		System.out.println();
		return "This is how the JAVA evolved";
	}


	public static void file() //File, File Handling, Types of files
	{
		System.out.println("\t\t\tWELCOME TO FILE, FILE HANDLING AND TYPES OF FILES");
		System.out.println();
		System.out.println("1) File");
		System.out.println("2) File Handling");
		System.out.println("3) Types of Files");
		System.out.println("4) Exit");
		System.out.println();

		System.out.println("Enter the Topic you need to learn");

		int choice = sc.nextInt();
		System.out.println();
		
		if (choice == 1 || choice == 2 || choice == 3 || choice == 4)
		{
		while (choice >= 1 && choice <= 4)
		{
		switch (choice)
		{
		case 1 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("File:\n\t* It is just a container which is used to store the data permanently.");
				System.out.println("\t* Each and every file will be having file name and extension.");
				System.out.println("\t* The extension of the file will specify what type of data is present inside the file.");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				System.out.println("Enter the Topic you need to visit");
				System.out.println("1) File");
				System.out.println("2) File Handling");
				System.out.println("3) Types of Files");
				System.out.println("4) Exit");
				System.out.println();
				choice = sc.nextInt();
				System.out.println();
				break;
			}

		case 2 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("File Handling:\n\t* The process of");
				System.out.println("\t\t(i) Creating\n\t\t(ii) Writing\n\t\t(iii) Reading\n\t\t(iv) Upating\n\t\t(v) Closing\n\t\t(vi) Deleting");
				System.out.println("\t  the file is called as File Handling.");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				System.out.println("Enter the Topic you need to visit");
				System.out.println("1) File");
				System.out.println("2) File Handling");
				System.out.println("3) Types of Files");
				System.out.println("4) Exit");
				System.out.println();
				choice = sc.nextInt();
				System.out.println();
				break;
			}

		case 3 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Types of Files:\n\t* We are having two types of files");
				System.out.println("\t\t(i) Source File\n\t\t(ii) Executable file");
				System.out.println();
				System.out.println("(i) Source File:\n\t* A file which contains the instructions written in High Level Language is called as Source File.\n\t* Source File is created by the programmer.");
				System.out.println("\t* We can able to create source file by using \"Editors\".\n\t* We are having two types of editors.\n\t\t(i) Text Editor (Ex: VS code, Notepad++, Bracket, Editplus, Nano etc)\n\t\t(ii) IDE's - Integrated Development Environment (Ex: Eclipse, IntelliJ Idea, J Developer, My Eclipse etc.)");
				System.out.println();
				System.out.println("(ii) Executable File:\n\t* It is a file which is created by the compiler and ready to execute.");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				System.out.println("Enter the Topic you need to visit");
				System.out.println("1) File");
				System.out.println("2) File Handling");
				System.out.println("3) Types of Files");
				System.out.println("4) Exit");
				System.out.println();
				choice = sc.nextInt();
				System.out.println();
				break;
			}
		}

		if (choice == 4)
		{
			System.out.println("\t\t\tTHANKS FOR VISITING FILE, FILE HANDLING AND TYPES OF FILES SECTION");
			break;
		}
		}
		}

		else 
			System.out.println("\t\t\tYour Entered Choice is not matching with any of the Topic's.");
	}


	private static void prog_c_java(char c) //Program created using C and JAVA Programming Language
	{
		switch (c)
		{
		case 'a' , 'A' :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Program created using \"C\" Programming Language:\n\t* Program created using C-Programming Language is Platform dependent.");
				System.out.println("\t* It is one step compilation programming language.");
				System.out.println("\t* In C,it is \"write once, run there itself\".");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				break;
			}

		case 'b' , 'B' :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Program created using \"JAVA\" Programming Language:\n\t* Program created using JAVA is Platform independent.");
				System.out.println("\t* It is two step compilation programming language.");
				System.out.println("\t* The executable file of JAVA is having .class extension.");
				System.out.println("\t* .class files contains the instructions written in Byte code.");
				System.out.println("\t* It is also called Intermediate file.");
				System.out.println("\t* JAVA is also famous for the Slogan \"WORA - Write Once Run Anywhere\".");
				System.out.println("\t* JDK is available separately for each platforms.");
				System.out.println("\t* JAVA is platform independent and JVM is platform dependent.");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				break;
			}
		}
		
	}

	protected static void jdk() //Structure of JDK
	{
		System.out.println("\t\t\tWELCOME TO STRUCTURE OF JDK");
		System.out.println();
		System.out.println("1) JDK");
		System.out.println("2) JavaC");
		System.out.println("3) Compile Time");
		System.out.println("4) Java");
		System.out.println("5) Run Time");
		System.out.println("6) JVM");
		System.out.println("7) Expansions of JDK components");
		System.out.println("8) Exit");
		System.out.println();

		System.out.println("Enter the Topic you need to learn");

		int choice = sc.nextInt();
		System.out.println();
		
		if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6 || choice == 7 || choice == 8)
		{
		while (choice >= 1 && choice <= 8)
		{
		switch (choice)
		{
		case 1 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("JDK:\n\t* The main purpose using JDK is to compile and execute the java instructions.");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				System.out.println("Enter the Topic you need to visit");
				System.out.println("1) JDK");
				System.out.println("2) JavaC");
				System.out.println("3) Compile Time");
				System.out.println("4) Java");
				System.out.println("5) Run Time");
				System.out.println("6) JVM");
				System.out.println("7) Expansions of JDK components");
				System.out.println("8) Exit");
				System.out.println();
				choice = sc.nextInt();
				System.out.println();
				break;
			}

		case 2 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("JavaC:\n\t* We can invoke (i.e. activate/awake) java compiler using the javac filename.java");
				System.out.println("\t* The job of the compiler is to convert java code into byte code.");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				System.out.println("Enter the Topic you need to visit");
				System.out.println("1) JDK");
				System.out.println("2) JavaC");
				System.out.println("3) Compile Time");
				System.out.println("4) Java");
				System.out.println("5) Run Time");
				System.out.println("6) JVM");
				System.out.println("7) Expansions of JDK components");
				System.out.println("8) Exit");
				System.out.println();
				choice = sc.nextInt();
				System.out.println();
				break;
			}

		case 3 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Compile Time:\n\t* The time taken by the compiler to check the code and to add some instructions inorder to obtain executable file is called as compile time.");
				System.out.println("\t* At compile time, it can be CTS (or) CTE.");
				System.out.println("\t* CTS means .class file (Executable file) will be generated.");
				System.out.println("\t* CTE means .class file (Executable file) will not be generated.");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				System.out.println("Enter the Topic you need to visit");
				System.out.println("1) JDK");
				System.out.println("2) JavaC");
				System.out.println("3) Compile Time");
				System.out.println("4) Java");
				System.out.println("5) Run Time");
				System.out.println("6) JVM");
				System.out.println("7) Expansions of JDK components");
				System.out.println("8) Exit");
				System.out.println();
				choice = sc.nextInt();
				System.out.println();
				break;
			}

		case 4 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Java:\n\t* We use this tool to execute.");
				System.out.println("\t* We can invoke this JAVA tool using the command java classname.");
				System.out.println("\t* This tool internally calls JVM which will be used to execute the application.");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				System.out.println("Enter the Topic you need to visit");
				System.out.println("1) JDK");
				System.out.println("2) JavaC");
				System.out.println("3) Compile Time");
				System.out.println("4) Java");
				System.out.println("5) Run Time");
				System.out.println("6) JVM");
				System.out.println("7) Expansions of JDK components");
				System.out.println("8) Exit");
				System.out.println();
				choice = sc.nextInt();
				System.out.println();
				break;
			}

		case 5 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Run Time:\n\t* The time taken by the JVM to convert byte code into binaries is called as Run Time.");
				System.out.println("\t* Run Time can be success (RTS) or it can be error (RTE).");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				System.out.println("Enter the Topic you need to visit");
				System.out.println("1) JDK");
				System.out.println("2) JavaC");
				System.out.println("3) Compile Time");
				System.out.println("4) Java");
				System.out.println("5) Run Time");
				System.out.println("6) JVM");
				System.out.println("7) Expansions of JDK components");
				System.out.println("8) Exit");
				System.out.println();
				choice = sc.nextInt();
				System.out.println();
				break;
			}

		case 6 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("JVM:\n\t* Convert byte code to binaries.");
				System.out.println("\t* Helps to create run time environment.");
				System.out.println("\t* Helps to create the memory block at the runtime.");
				System.out.println("\t* Helps to load and verify the code.");
				System.out.println("\t* It is an \"interpreter\" (Read line by line and execute).");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				System.out.println("Enter the Topic you need to visit");
				System.out.println("1) JDK");
				System.out.println("2) JavaC");
				System.out.println("3) Compile Time");
				System.out.println("4) Java");
				System.out.println("5) Run Time");
				System.out.println("6) JVM");
				System.out.println("7) Expansions of JDK components");
				System.out.println("8) Exit");
				System.out.println();
				choice = sc.nextInt();
				System.out.println();
				break;
			}

		case 7 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Expansions of JDK components:\n\t--> jar - JAVA Archive\n\t--> JIT - Just In Time Compilation\n\t--> JRE - JAVA Run Time Environment\n\t--> JDK - JAVA Development Kit\n\t--> JVM - JAVA Virtual Machine.");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				System.out.println("Enter the Topic you need to visit");
				System.out.println("1) JDK");
				System.out.println("2) JavaC");
				System.out.println("3) Compile Time");
				System.out.println("4) Java");
				System.out.println("5) Run Time");
				System.out.println("6) JVM");
				System.out.println("7) Expansions of JDK components");
				System.out.println("8) Exit");
				System.out.println();
				choice = sc.nextInt();
				System.out.println();
				break;
			}
		}

		if (choice == 8)
		{
			System.out.println("\t\t\tTHANKS FOR VISITING STRUCTURE OF JDK");
			break;
		}
		}
		}

		else 
			System.out.println("\t\t\tYour Entered Choice is not matching with any of the Topic's.");
		
	}

	
	public static void adv() //Advantages of JAVA
	{
		System.out.println("***************************************************************************************************************************************");
		System.out.println("Advantages of JAVA:\n\t* Simple to understand because syntax is very easy.");
		System.out.println("\t* Platform Independent (WORA).");
		System.out.println("\t* Secured: It is more secure language compared to other language. In this language, all code is covered in byte code after compilation\n\t  which is not readable by human");
		System.out.println("\t* High Performance.");
		System.out.println("\t* It is object oriented - Java will treat everything as a object to solve the created problems.");
		System.out.println("\t* Architectural Neutral that means Application created using java can run on any available processors in the real world.");
		System.out.println("\t* Portable - If any language supports platform dependent and architectural neutral feature known as portable.");
		System.out.println("\t* Supports Multi-Threadings.");
		System.out.println("\t* It is distributed - Multiple client system depends on multiple server system so that even problem occurred in one server will never be\n\t  reflected on other client system.");
		System.out.println("\t* Robust means Strong - It is robust or strong programming language becasue of its capability to handle Run - time Error and automatic garbage collection.");
		System.out.println("***************************************************************************************************************************************");
		System.out.println();
	}
	
	static int term(int a) //Important terminologies used in JAVA
	{
		System.out.println("\t\t\tWELCOME TO IMPORTANT TERMINOLOGIES USED IN JAVA");
		System.out.println();
		System.out.println("1) Tokens");
		System.out.println("2) Variables");
		System.out.println("3) Datatype and its types");
		System.out.println("4) Areas of class in JAVA");
		System.out.println("5) Types of Variables in JAVA");
		System.out.println("6) Exit");
		System.out.println();

		System.out.println("Enter the Topic you need to learn");

		int choice = sc.nextInt();
		System.out.println();
		
		if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6)
		{
		while (choice >= 1 && choice <= 6)
		{
		switch (choice)
		{
		case 1 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Tokens:\n\t* Tokens are the basic building blocks of JAVA Programming Language.");
				System.out.println("\t* We are having four types of tokens.\n\t\t(i) Keywords\n\t\t(ii) Identifier\n\t\t(iii) Separators\n\t\t(iv) Literals");
				System.out.println();
				System.out.println();
				System.out.println("(i) Keywords:\n\t* Keywords are the pre-defined words of JAVA programming language.");
				System.out.println("\t* It is also called as reserved words (which will be reserved in JAVA library).");
				System.out.println("\t* Keywords should be written in Lowercase.");
				System.out.println("\t* We are having 49+ Keywords present inside Java library.");
				System.out.println("\t\tEx: public, static, void, class, int etc.");
				System.out.println();
				System.out.println("(ii) Identifiers:\n\t* Identifiers are the components of JAVA.");
				System.out.println("\t* We need to provide names for the identifiers to identify it.");
				System.out.println("\t* We are having identifiers such as");
				System.out.println("\t\tclass\n\t\tMethods\n\t\tVariables\n\t\tInterface");
				System.out.println();
				System.out.println("Rules of Identifiers:\n\t(1) We cannot start identifer name with numbers, but we can have numbers inbetween or last.");
				System.out.println("\t(2) We can't provide space inbetween the letters of identifier name.");
				System.out.println("\t(3) Except $ and _, no other special characters are allowed for the identifers.");
				System.out.println("\t(4) We cannot use Keywords as identifier names.");
				System.out.println();
				System.out.println("(iii) Separators:\n\t* We need separator to separate the Java instructions.");
				System.out.println("\t* We are having separators such as \"{,},(,),.,;,[,].?\".");
				System.out.println();
				System.out.println("(iv) Literals/ Data:\n\t* Literals is nothing but data.");
				System.out.println("\t* We are having following literals/ data available in JAVA.");
				System.out.println("\t\t1) Integer Literals/ Data\n\t\t\tEx: 4,148,154,2 etc.");
				System.out.println("\t\t2) Floating Literals/ Data (or) Decimal Literals/ Data\n\t\t\tEx: 1.36,34.126,0.36,14.814 etc.");
				System.out.println("\t\t3) Character Literals/ Data\n\t\t\tEx: 'A','$','4' etc.");
				System.out.println("\t\t4) String Literals/ Data");
				System.out.println("\t\t5) Bollean Literals/ Data\n\t\t\tEx: True, False");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				System.out.println("Enter the Topic you need to visit");
				System.out.println("1) Tokens");
				System.out.println("2) Variables");
				System.out.println("3) Datatype and its types");
				System.out.println("4) Areas of class in JAVA");
				System.out.println("5) Types of Variables in JAVA");
				System.out.println("6) Exit");
				System.out.println();
				choice = sc.nextInt();
				System.out.println();
				break;
			}

		case 2 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Variables:\n\t* Variable is just a container which is used to store the data.");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				System.out.println("Enter the Topic you need to visit");
				System.out.println("1) Tokens");
				System.out.println("2) Variables");
				System.out.println("3) Datatype and its types");
				System.out.println("4) Areas of class in JAVA");
				System.out.println("5) Types of Variables in JAVA");
				System.out.println("6) Exit");
				System.out.println();
				choice = sc.nextInt();
				System.out.println();
				break;
			}

		case 3 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Datatypes:\n\t* Datatype is used to specify what type of data need to be stored inside the variable.");
				System.out.println("\t* We are having two types of Datatypes. They are;");
				System.out.println("\t\t-> Primitive Datatypes");
				System.out.println("\t\t-> Non Primitive Datatypes");
				System.out.println();
				System.out.println();
				System.out.println("Primitive Datatypes:\n\t* In JAVA we are having \"8 Primitive datatypes\".");
				System.out.println("\t* It is having capability to store single values.");
				System.out.println("\t* Such datatypes are byte, short, int, long, float, decimal, char, boolean");
				System.out.println();
				System.out.println("Non Primitive Datatypes:\n\t* In JAVA, we can create \"n-number of Non-Primitive datatypes\".");
				System.out.println("\t* It is having capability to store multiple values.");
				System.out.println("\t* Example for such non primitive datatypes are class, interface, Object, arrays, String etc.");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				System.out.println("Enter the Topic you need to visit");
				System.out.println("1) Tokens");
				System.out.println("2) Variables");
				System.out.println("3) Datatype and its types");
				System.out.println("4) Areas of class in JAVA");
				System.out.println("5) Types of Variables in JAVA");
				System.out.println("6) Exit");
				System.out.println();
				choice = sc.nextInt();
				System.out.println();
				break;
			}

		case 4 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Types of Variables in JAVA:\n\n(i) Global Variable:\n\t* Any variable which is created in the Global area is called Global Variable.");
				System.out.println("\t* Global variable is visible everywhere (throughout the class).");
				System.out.println("\t* Global variable should be started with prefix \"static\".");
				System.out.println();
				System.out.println("(ii) Local Variable:\n\t* Any variable which is created in the local area is called as Local Variable.");
				System.out.println("\t* Local variables are visible only within local area.");
				System.out.println("\t* We cannot prefix \"static\" for local variables.");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				System.out.println("Enter the Topic you need to visit");
				System.out.println("1) Tokens");
				System.out.println("2) Variables");
				System.out.println("3) Datatype and its types");
				System.out.println("4) Areas of class in JAVA");
				System.out.println("5) Types of Variables in JAVA");
				System.out.println("6) Exit");
				System.out.println();
				choice = sc.nextInt();
				System.out.println();
				break;
			}

		case 5 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Areas of class in JAVA:\n\n(i) Global Area:\n\t* The area present inside the class block is called Global Area.");
				System.out.println("\t* Anything which is created in the Global area is visible throughout the class.");
				System.out.println();
				System.out.println("(ii) Local Area:\n\t* The area present inside the block other than the class block is called as Local Area.");
				System.out.println("\t* Anything which is created in the Local area is only available within the local area.");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				System.out.println("Enter the Topic you need to visit");
				System.out.println("1) Tokens");
				System.out.println("2) Variables");
				System.out.println("3) Datatype and its types");
				System.out.println("4) Areas of class in JAVA");
				System.out.println("5) Types of Variables in JAVA");
				System.out.println("6) Exit");
				System.out.println();
				choice = sc.nextInt();
				System.out.println();
				break;
			}
		}

		if (choice == 6)
		{
			System.out.println("\t\t\tTHANKS FOR VISITING IMPORTANT TERMINOLOGIES USED IN JAVA");
			break;
		}
		}
		}

		else 
			System.out.println("\t\t\tYour Entered Choice is not matching with any of the Topic's.");

		return 1;
	}
	
	private static void operator(int a) //Operators and types of operators
	{
		switch (a)
		{
		case 1 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("1. Type Cast Operator:\n\t* It is unary Operator.\n\t\tSyntax: (type) variable_name;\n\nType Casting:\n\t* The process of Converting one data type into another datatype is called as Type Casting.");
				System.out.println("\t* We can classify Type Casting as given below\n\t\t--> Primitive Type Casting\n\t\t--> Non Primitive Type Casting.");
				System.out.println("\n--> Primitive Type Casting:\n\t* The process of converting one primitive datatype into another primitive datatype is called Primitive Type Casting.");
				System.out.println("\t* We can classify Primitive Type Casting into two types. That is Widening and Narrowing.");
				System.out.println("\nWidening:\n\tThe process of converting lower range datatype into higher range datatype is called as Widening. Widening is possible implicitly.\n\n\tEx: short<---byte, float<---long, int<---short etc.");
				System.out.println("\nNarrowing:\n\t* The process of converting higher range datatypes into lower range datatypes is called as Narrowing.\n\t* We can't achieve narrowing implicitly.");
				System.out.println("\t* We can do it with the help of Type Cast Operator.");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				break;
			}

		case 2 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("2. Arithmetic Operator:\n\t* We are having following arithmetic operator which is given below.\n\t\tAddition (+)\n\t\tSubtraction (-)\n\t\tMultiplication (*)\n\t\tDivision (/)\n\t\tModulus (%)");
				System.out.println("\n--> Addition Operator:\n\t* It is a binary operator.\n\t* We use addition operator for performing addition and concatenation.");
				System.out.println("\n\nExpression Table for Addition Operator:");
				System.out.println("\nExpression:\n\t* The combination of operator along with operands is called as expression.\n\t* Every expression gives result. Being a programmer, we have to decide what type of container need to be used to store the result.");
				System.out.println("\nConcatenation:\n\tConcatenation is used to merge strings/ values with the another string.");
				System.out.println("\n\nExpression Table for Addition Operator w.r.t Concatenation:");
				System.out.println("\n--> Subtraction Operator:\n\t* It is a binary operator.\n\t* We use subtraction operator for performing subtraction.");
				System.out.println("\n\nExpression Table for Subtraction Operator:");
				System.out.println("\n--> Multiplication Operator:\n\t* It is a binary operator.\n\t* We use multiplication operator for performing Multiplication.");
				System.out.println("\n--> Division Operator:\n\t* It is a binary operator.\n\t* We use division operator to obtain the Quotient.\n\nNote:\nInteger/Integer = Integer\nDecimal/Decimal = Integer\nInteger/Decimal = Decimal\nDecimal/Integer = Decimal");
				System.out.println("\n--> Modulus Operator:\n\t* It is a binary operator.\n\t* We use this operator to obtain the remainder.");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				break;
			}

		case 3 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("3. Relational Operator:\n\t* We are having following relational operators which is given below;\n\t\t==,<,>,<=,>=,!=\n\t* All the relational operator return type (or) resultant type will be Boolean");
				System.out.println("\t* Therefore, to store the result, we have to use Boolean type of containers.");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				break;
			}

		case 4 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("4. Logical Operators:\n\t* We are having following Logical operator which is given below\n\t\t(i) Logical AND (&&)\n\t\t(ii) Logical OR (||)\n\t\t(iii) Logical NOT (!)");
				System.out.println("\n(i) Logical AND (&&):\n\t* It is a unary operator.\n\t* The return type of Logical AND operator is \"Boolean\".\n\t\tSyntax: x && y");
				System.out.println("\t* AND operator will return \"true\" only if both the condition is satisfied.");
				System.out.println("\n\nExpression Table for Logical AND Operator:");
				System.out.println("\n(ii) Logical OR (||):\n\t* It is a unary operator.\n\t* The return type of Logical OR operator is \"Boolean\".\n\t\tSyntax: x || y");
				System.out.println("\t* OR operator will return \"true\" if any one of the condition is satisfied.");
				System.out.println("\n\nExpression Table for Logical OR Operator:");
				System.out.println("\n(iii) Logical NOT (!):\n\t* It is a unary operator.\n\t* The return type of Logical NOT operator is \"Boolean\".\n\t\tSyntax: !(x)");
				System.out.println("\n\nExpression Table for Logical NOT Operator:");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				break;
			}

		case 5 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("5. Conditional Operator:\n\t* It is a ternary operator.\n\t\tSyntax: (x) ? y : z;");
				System.out.println("\nCase (i): Whenever Operand 1 is true, Operand 2 will be executed.\n\nCase (ii): Whenever operand 1 is false, Operand 3 will be executed.");
				System.out.println("\nNote:\n\t* While storing the expression of Conditional operator, the operand 2 and operand 3 should be homogeneous.");
				System.out.println("\t* If we are printing the expression of conditional operator, operand 2 and operand 3 can be heterogeneous.");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				break;
			}

		case 6 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("6. Increment Operator (++):\n\t* We use increment operator to increase the value of the variable by 1 unit.");
				System.out.println("\t* We are having following types in increment operator.\n\t\t--> Pre-Increment Operator\n\t\t--> Post-Increment Operator");
				System.out.println("\n--> Pre Increment Operator:\n\tIn pre-increment operator, we increase the value of the variable before using the variable.\n\t\tSyntax: ++variable;");
				System.out.println("--> Post Increment Operator:\n\tIn post-increment operator, we increase the value of the variable after using the variable.\n\t\tSyntax: variable++;");
				System.out.println("\nDecrement Operator (--):\n\t* We use decrement operator to decrease the value of the variable by 1 unit.");
				System.out.println("\t* We are having following types in decrement operator.\n\t\t--> Pre-Decrement Operator\n\t\t--> Post-Decrement Operator");
				System.out.println("\n--> Pre Decrement Operator:\n\tIn pre-decrement operator, we decrease the value of the variable before using the variable.\n\t\tSyntax: --variable;");
				System.out.println("--> Post Decrement Operator:\n\tIn post-decrement operator, we decrease the value of the variable after using the variable.\n\t\tSyntax: variable--;");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				break;
			}

		case 7 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("7. Compound Assignment Operator:\n\t* It is a binary operator.\n\t* We are having following compound assignment operators which is given below,");
				System.out.println("\t\t+=\n\t\t-=\n\t\t*=\n\t\t/=\n\t\t%=\n\t* It is the combination of Arithmatic operators and Assignment operators.");
				System.out.println("\t* We use Compound Assignment Operator to increase (or) decrease the value of the variable by 1 unit (or) more than 1 unit.");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				break;
			}
		}
	}

	public static void stmnts(int a) //Different types of statements in JAVA
	{
		switch (a)
		{
		case 1 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Print Statement:\n\t* It is one of the type in \"Printing Statements\".");
				System.out.println("\t* We use print statement for printing the data.");
				System.out.println("\t* If we need to print the data in a same line, we use \"Print\" statement.");
				System.out.println("\t* Data is mandatory for print statement, otherwise CTE will occur.");
				System.out.println();
				System.out.println("\t\tSystem.out.print(data)");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				break;
			}

		case 2 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Println Statement:\n\t* It is one of the type in \"Printing Statements\".");
				System.out.println("\t* We use println statement for printing the data.");
				System.out.println("\t* If we need to print the data line by line, we use \"Println\" statement.");
				System.out.println("\t* Data is optional for the println statement.");
				System.out.println();
				System.out.println("\t\tSystem.out.print([data])");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				break;
			}

		case 3 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Declaration Statement:\n\t* This statement is used to create a memory.");
				System.out.println();
				System.out.println("\t\t datatype variable_name;");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				break;
		}

		case 4 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Declaration & Initialization Statement:\n\t* This statement is used for memory creation & allocation.");
				System.out.println();
				System.out.println("\t\t datatype variable_name = value/expression;");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				break;
		}

		case 5 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Initialization Statement:\n\t* This statement is used for using the created memory.");
				System.out.println();
				System.out.println("\t\t datatype variable_name;");
				System.out.println("\t\t variable_name = value/expression;");
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				break;
		}
		}
	}

	public static void pg_cs(int nn)
	{
		if (nn == 1)
		{
			System.out.println("\t\t\tPrograms Created Using Decision Making Statements");
			System.out.println();
			System.out.println("Enter the Programs you need to learn");
			System.out.println("1. Program for finding the entered character is vowel or consonant");
			System.out.println("2. Program for finding largest of three numbers");
			System.out.println("3. Program for finding the given number is divisible by both 3 and 5 (or) not");
			System.out.println("4. Program for finding the given number is odd or even");
			System.out.println("5. Program for finding the largest of given two or three number based on the customer choice using switch statement");
			System.out.println("6. Exit");

			int choice2 = sc.nextInt();
			System.out.println();
			while (choice2 == 1 || choice2 == 2 || choice2 == 3 || choice2 == 4 || choice2 == 5 || choice2 == 6)
			{
			if (choice2 == 1)
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("1. Program for finding the entered character is vowel or consonant");
				System.out.println();
				
				System.out.println("import java.util.Scanner;");
				System.out.println("class pg_1"); 
				System.out.println("{");
				System.out.println("	static Scanner sc = new Scanner(System.in);");
				System.out.println("	public static void main(String[] args)"); 
				System.out.println("	{");
				System.out.println("		System.out.println(Enter the Alphabet);");
				System.out.println("		char ch = sc.next().charAt(0);");
				System.out.println("		System.out.println(Processing....);");
				System.out.println();
				System.out.println("		if(((ch=='a')||(ch=='A')) || ((ch=='e')||(ch=='E')) || ((ch=='i')||(ch=='I')) || ((ch=='o')||(ch=='O')) || ((ch=='u')||(ch=='U')))");
				System.out.println("		{");
				System.out.println("			System.out.println(Entered character is a Vowel);");
				System.out.println("		}");
				System.out.println();
				System.out.println("		if(((ch!='a')&&(ch!='A')) && ((ch!='e')&&(ch!='E')) && ((ch!='i')&&(ch!='I')) && ((ch!='o')&&(ch!='O')) && ((ch!='u')&&(ch!='U')))");
				System.out.println("		{");
				System.out.println("			System.out.println(Entered character is a Consonant);");
				System.out.println("		}");
				System.out.println("	}");
				System.out.println("}");
				System.out.println();
				System.out.println("***************************************************************************************************************************************");

				System.out.println("If you want to execute a program, please enter 'Y'");
				char option = sc.next().charAt(0);
				System.out.println();

				if (option == 'Y' || option == 'y')
				{
						System.out.println("\t\t\tEXECUTION STARTED");
						System.out.println();
						System.out.println("\t\t\tEnter the Alphabet");
						char ch = sc.next().charAt(0);
						System.out.println("\t\t\tProcessing....");
		
						if(((ch=='a')||(ch=='A')) || ((ch=='e')||(ch=='E')) || ((ch=='i')||(ch=='I')) || ((ch=='o')||(ch=='O')) || ((ch=='u')||(ch=='U')))
						{
							System.out.println("\t\t\tEntered character is a Vowel");
						}

						if(((ch!='a')&&(ch!='A')) && ((ch!='e')&&(ch!='E')) && ((ch!='i')&&(ch!='I')) && ((ch!='o')&&(ch!='O')) && ((ch!='u')&&(ch!='U')))
						{
							System.out.println("\t\t\tEntered character is a Consonant");
						}
						System.out.println();
						System.out.println("\t\t\tEXECUTION ENDED");
						System.out.println();
				}
				else
					System.out.println("You have entered the Character other than 'Y'");
					
				System.out.println();
				System.out.println("Enter the Programs you need to visit");
				System.out.println("1. Program for finding the entered character is vowel or consonant");
				System.out.println("2. Program for finding largest of three numbers");
				System.out.println("3. Program for finding the given number is divisible by both 3 and 5 (or) not");
				System.out.println("4. Program for finding the given number is odd or even");
				System.out.println("5. Program for finding the largest of given two or three number based on the customer choice using switch statement");
				System.out.println("6. Exit");
				choice2 = sc.nextInt();
				System.out.println();

			}

			if (choice2 == 2)
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("2. Program for finding largest of three numbers");
				System.out.println();
				
				System.out.println("import java.util.Scanner;");
				System.out.println("class pg_2"); 
				System.out.println("{");
				System.out.println("	static Scanner sc = new Scanner(System.in);");
				System.out.println("	public static void main(String[] args)"); 
				System.out.println("	{");
				System.out.println("		System.out.println(To find Largest of Three numbers);");
				System.out.println("		System.out.println(Enter the fist number);");
				System.out.println("		int a = sc.nextInt();");
				System.out.println("		System.out.println(Enter the second number)");
				System.out.println("		int b = sc.nextInt();");
				System.out.println("		System.out.println(Enter the third number);");
				System.out.println("		int c = sc.nextInt();");
				System.out.println();
				System.out.println("		System.out.println(Processing.....);");
				System.out.println();
				System.out.println("		if (a>b && a>c)");
				System.out.println("		{");
				System.out.println("			System.out.println(a+ is largest among all the three numbers.....);");
				System.out.println("		}");
				System.out.println();
				System.out.println("		if (b>a && b>c)");
				System.out.println("		{");
				System.out.println("			System.out.println(b+ is largest among all the three numbers.....)");
				System.out.println("		}");
				System.out.println();
				System.out.println("		if (c>a && c>b)");
				System.out.println("		{");
				System.out.println("			System.out.println(c+ is largest among all the three numbers.....);");
				System.out.println("		}");
				System.out.println("	}");
				System.out.println("}");
				System.out.println();
				System.out.println("***************************************************************************************************************************************");

				System.out.println("If you want to execute a program, please enter 'Y'");
				char option = sc.next().charAt(0);
				System.out.println();

				if (option == 'Y' || option == 'y')
				{
						System.out.println("\t\t\tEXECUTION STARTED");
						System.out.println();
						System.out.println("To find Largest of Three numbers");
						System.out.println("\t\t\tEnter the fist number");
						int a = sc.nextInt();
						System.out.println("\t\t\tEnter the second number");
						int b = sc.nextInt();
						System.out.println("\t\t\tEnter the third number");
						int c = sc.nextInt();

						System.out.println("\t\t\tProcessing.....");
		
						if (a>b && a>c)
						{
							System.out.println(a+" is largest among all the three numbers.....");
						}

						if (b>a && b>c)
						{
							System.out.println(b+" is largest among all the three numbers.....");
						}

						if (c>a && c>b)
						{
							System.out.println(c+" is largest among all the three numbers.....");
						}
						System.out.println();
						System.out.println("\t\t\tEXECUTION ENDED");
						System.out.println();
				}
				else
					System.out.println("You have entered the Character other than 'Y'");

				System.out.println();
				System.out.println("Enter the Programs you need to visit");
				System.out.println("1. Program for finding the entered character is vowel or consonant");
				System.out.println("2. Program for finding largest of three numbers");
				System.out.println("3. Program for finding the given number is divisible by both 3 and 5 (or) not");
				System.out.println("4. Program for finding the given number is odd or even");
				System.out.println("5. Program for finding the largest of given two or three number based on the customer choice using switch statement");
				System.out.println("6. Exit");
				choice2 = sc.nextInt();
				System.out.println();

			}

			if (choice2 == 3)
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("3. Program for finding the given number is divisible by both 3 and 5 (or) not");
				System.out.println();
				System.out.println("import java.util.Scanner;");
				System.out.println("class pg_3"); 
				System.out.println("{");
				System.out.println("	static Scanner sc = new Scanner(System.in);");
				System.out.println("	public static void main(String[] args)"); 
				System.out.println("	{");
				System.out.println("		System.out.print(Enter the number : );");
				System.out.println("		int num = sc.nextInt();");
				System.out.println("		System.out.println();");
				System.out.println("		System.out.println()");
				System.out.println("		if (num%3==0 && num%5==0)");
				System.out.println("		{");
				System.out.println("			System.out.println(num+ is divisble by both 3 and 5);");
				System.out.println("		}");
				System.out.println("		else");
				System.out.println("		{");
				System.out.println("			System.out.println(num+ is not divisble by both 3 and 5);");
				System.out.println("		}");
				System.out.println("	}");
				System.out.println("}");
				System.out.println();
				System.out.println("***************************************************************************************************************************************");

				System.out.println("If you want to execute a program, please enter 'Y'");
				char option = sc.next().charAt(0);
				System.out.println();

				if (option == 'Y' || option == 'y')
				{
						System.out.println("\t\t\tEXECUTION STARTED");
						System.out.println();
						System.out.print("Enter the number : ");
						int num = sc.nextInt();
						System.out.println();

						if (num%3==0 && num%5==0)
						{
							System.out.println(num+" is divisble by both 3 and 5");
						}
						else
						{
							System.out.println(num+" is not divisble by both 3 and 5");
						}
						System.out.println();
						System.out.println("\t\t\tEXECUTION ENDED");
						System.out.println();
				}
				else
					System.out.println("You have entered the Character other than 'Y'");

				System.out.println();
				System.out.println("Enter the Programs you need to visit");
				System.out.println("1. Program for finding the entered character is vowel or consonant");
				System.out.println("2. Program for finding largest of three numbers");
				System.out.println("3. Program for finding the given number is divisible by both 3 and 5 (or) not");
				System.out.println("4. Program for finding the given number is odd or even");
				System.out.println("5. Program for finding the largest of given two or three number based on the customer choice using switch statement");
				System.out.println("6. Exit");
				choice2 = sc.nextInt();
				System.out.println();

			}

			if (choice2 == 4)
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("4. Program for finding the given number is odd or even");
				System.out.println();
				
				System.out.println("import java.util.Scanner;");
				System.out.println("class pg_4"); 
				System.out.println("{");
				System.out.println("	static Scanner sc = new Scanner(System.in);");
				System.out.println("	public static void main(String[] args)"); 
				System.out.println("	{");
				System.out.println("		System.out.println(Enter the number : );");
				System.out.println("		int num = sc.nextInt();");
				System.out.println("		System.out.println();");
				System.out.println("		System.out.println()");
				System.out.println("		if (num%2==0)");
				System.out.println("		{");
				System.out.println("			System.out.println(num+ is a even number);");
				System.out.println("		}");
				System.out.println("		else");
				System.out.println("		{");
				System.out.println("			System.out.println(num+ is a odd number);");
				System.out.println("		}");
				System.out.println("	}");
				System.out.println("}");
				System.out.println();
				System.out.println("***************************************************************************************************************************************");

				System.out.println("If you want to execute a program, please enter 'Y'");
				char option = sc.next().charAt(0);
				System.out.println();

				if (option == 'Y' || option == 'y')
				{
						System.out.println("\t\t\tEXECUTION STARTED");
						System.out.println();
						System.out.println();
						System.out.println("Enter the number :\n");
						int num = sc.nextInt();
						System.out.println();

						if (num%2==0)
						{
							System.out.println(num+" is a even number");
						}
						else
						{
							System.out.println(num+" is a odd number");
						}
						System.out.println();
						System.out.println("\t\t\tEXECUTION ENDED");
						System.out.println();
				}
				else
					System.out.println("You have entered the Character other than 'Y'");

				System.out.println();
				System.out.println("Enter the Programs you need to visit");
				System.out.println("1. Program for finding the entered character is vowel or consonant");
				System.out.println("2. Program for finding largest of three numbers");
				System.out.println("3. Program for finding the given number is divisible by both 3 and 5 (or) not");
				System.out.println("4. Program for finding the given number is odd or even");
				System.out.println("5. Program for finding the largest of given two or three number based on the customer choice using switch statement");
				System.out.println("6. Exit");
				choice2 = sc.nextInt();
				System.out.println();

			}

			if (choice2 == 5)
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("5. Program for finding the largest of given two or three number based on the customer choice using switch statement");
				System.out.println();
				
				System.out.println("import java.util.Scanner;");
				System.out.println("class pg_5"); 
				System.out.println("{");
				System.out.println("	static Scanner sc = new Scanner(System.in);");
				System.out.println("	public static void main(String[] args)"); 
				System.out.println("	{");
				System.out.println("		System.out.println(Select your choice : );");
				System.out.println("		int num = sc.nextInt();");
				System.out.println("		System.out.println();");
				System.out.println("		switch (num)");
				System.out.println("		{");
				System.out.println("		case 1:");
				System.out.println("			{");
				System.out.println("				System.out.print(Enter the value of a :);");
				System.out.println("				int a = sc.nextInt();");
				System.out.println("				System.out.println();");
				System.out.println("				System.out.print(Enter the value of b :);");
				System.out.println("				int b = sc.nextInt();");
				System.out.println("				System.out.println();");
				System.out.println("				if (a>b)");
				System.out.println("				{");
				System.out.println("					System.out.println(a+ is the largest of two numbers);");
				System.out.println("				}");
				System.out.println("				else");
				System.out.println("					System.out.println(b+ is the largest of two numbers);");
				System.out.println("					break;");
				System.out.println("			}");
				System.out.println("		case 2:");
				System.out.println("			{");
				System.out.println("				System.out.print(Enter the value of a :);");
				System.out.println("				int a = sc.nextInt();");
				System.out.println("				System.out.println();");
				System.out.println("				System.out.print(Enter the value of b :);");
				System.out.println("				int b = sc.nextInt();");
				System.out.println("				System.out.println();");
				System.out.println("				System.out.print(Enter the value of c :);");
				System.out.println("				int c = sc.nextInt();");
				System.out.println("				System.out.println();");
				System.out.println("				System.out.println();");
				System.out.println("				if (a>b && a>c)");
				System.out.println("				{");
				System.out.println("					System.out.println(a+ is the largest of two numbers);");
				System.out.println("				}");
				System.out.println("				else if (b>a && b>c)");
				System.out.println("				{");
				System.out.println("					System.out.println(b+ is the largest of two numbers);");
				System.out.println("				}");
				System.out.println("				else");
				System.out.println("					System.out.println(c+ is the largest of two numbers);");
				System.out.println("					break;");
				System.out.println("			}");
				System.out.println("		default: System.out.println(INVALID INPUT);");
				System.out.println("		}");
				System.out.println("	}");
				System.out.println("}");
				System.out.println();
				System.out.println("***************************************************************************************************************************************");

				System.out.println("If you want to execute a program, please enter 'Y'");
				char option = sc.next().charAt(0);
				System.out.println();

				if (option == 'Y' || option == 'y')
				{
						System.out.println("\t\t\tEXECUTION STARTED");
						System.out.println();
						System.out.print("\nSelect your choice : ");
						int num = sc.nextInt();

						System.out.println();

						switch (num)
						{
						case 1:
							{
								System.out.print("Enter the value of a :");
								int a = sc.nextInt();
								System.out.println();

								System.out.print("Enter the value of b :");
								int b = sc.nextInt();
								System.out.println();

								if (a>b)
								{
									System.out.println(a+" is the largest of two numbers");
								}
								else
									System.out.println(b+" is the largest of two numbers");

								break;

							}

						case 2:
							{
								System.out.print("Enter the value of a :");
								int a = sc.nextInt();
								System.out.println();

								System.out.print("Enter the value of b :");
								int b = sc.nextInt();
								System.out.println();

								System.out.print("Enter the value of c :");
								int c = sc.nextInt();
								System.out.println();

								if (a>b && a>c)
								{
									System.out.println(a+" is the largest of three numbers");
								}
								else if (b>a && b>c)
								{
									System.out.println(b+" is the largest of three numbers");
								}
								else
									System.out.println(c+" is the largest of three numbers");

								break;
							}

							default: System.out.println("INVALID INPUT");
		
						System.out.println();
						System.out.println("\t\t\tEXECUTION ENDED");
						System.out.println();
				}
				}
				else
					System.out.println("You have entered the Character other than 'Y'");

				System.out.println();
				System.out.println("Enter the Programs you need to visit");
				System.out.println("1. Program for finding the entered character is vowel or consonant");
				System.out.println("2. Program for finding largest of three numbers");
				System.out.println("3. Program for finding the given number is divisible by both 3 and 5 (or) not");
				System.out.println("4. Program for finding the given number is odd or even");
				System.out.println("5. Program for finding the largest of given two or three number based on the customer choice using switch statement");
				System.out.println("6. Exit");
				choice2 = sc.nextInt();
				System.out.println();

			}

			if (choice2 == 6)
			{
				System.out.println("\t\t\tTHANKS FOR VISITING PROGRAMS USING DECISION MAKING STATEMENTS SECTION");
				break;
			}
		}
		}

		if (nn == 2)
		{
			System.out.println("\t\t\tPrograms Created Using Looping Statements");
			System.out.println();
			System.out.println("Enter the Programs you need to learn");
			System.out.println("1. Program for Printing the number in reverse order using While Loop");
			System.out.println("2. Program for printing the product of Digits in the given number using WHILE Loop");
			System.out.println("3. Program for printing the sum of even Digits in the given number using WHILE Loop");
			System.out.println("4. Program for finding the given number is Xylem or Floem using WHILE Loop");
			System.out.println("5. Exit");
			int choice2 = sc.nextInt();
			System.out.println();
			while (choice2 == 1 || choice2 == 2 || choice2 == 3 || choice2 == 4)
			{
			if (choice2 == 1)
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("1. Program for Printing the number in reverse order using WHILE Loop");
				System.out.println();
				System.out.println("import java.util.Scanner;");
				System.out.println("class loop_1"); 
				System.out.println("{");
				System.out.println("	static Scanner sc = new Scanner(System.in);");
				System.out.println("	public static void main(String[] args)"); 
				System.out.println("	{");
				System.out.println("		System.out.println(Enter the number);");
				System.out.println("		int num = sc.nextInt();");
				System.out.println("		while (num>=1)");
				System.out.println("		{");
				System.out.println("			System.out.println(num);");
				System.out.println("			num--;");
				System.out.println("		}");
				System.out.println("	}");
				System.out.println("}");
				System.out.println();
				System.out.println("***************************************************************************************************************************************");

				System.out.println("If you want to execute a program, please enter 'Y'");
				char option = sc.next().charAt(0);
				System.out.println();

				if (option == 'Y' || option == 'y')
				{
						System.out.println("\t\t\tEXECUTION STARTED");
						System.out.println();
						System.out.println("Enter the number");
						int num = sc.nextInt();
						while (num>=1)
						{
							System.out.println(num);
							num--;
						}
						System.out.println();
						System.out.println("\t\t\tEXECUTION ENDED");
						System.out.println();
				}
				else
					System.out.println("You have entered the Character other than 'Y'");

				System.out.println("Enter the Programs you need to visit");
				System.out.println("1. Program for Printing the number in reverse order using While Loop");
				System.out.println("2. Program for printing the product of Digits in the given number using WHILE Loop");
				System.out.println("3. Program for printing the sum of even Digits in the given number using WHILE Loop");
				System.out.println("4. Program for finding the given number is Xylem or Floem using WHILE Loop");
				System.out.println("5. Exit");
				choice2 = sc.nextInt();
				System.out.println();

			}

			if (choice2 == 2)
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("2. Program for printing the product of Digits in the given number using WHILE Loop");
				System.out.println();
				System.out.println("import java.util.Scanner;");
				System.out.println("class loop_2"); 
				System.out.println("{");
				System.out.println("	static Scanner sc = new Scanner(System.in);");
				System.out.println("	public static void main(String[] args)"); 
				System.out.println("	{");
				System.out.println("		System.out.println(Enter the number);");
				System.out.println("		int num = sc.nextInt();");
				System.out.println("		int prod = 1;");
				System.out.println("		while (num>0)");
				System.out.println("		{");
				System.out.println("			prod *= num % 10;");
				System.out.println("			num/=10;");
				System.out.println("		}");
				System.out.println("		System.out.println(Digital Product :+prod);");
				System.out.println("	}");
				System.out.println("}");
				System.out.println();
				System.out.println("***************************************************************************************************************************************");

				System.out.println("If you want to execute a program, please enter 'Y'");
				char option = sc.next().charAt(0);
				System.out.println();

				if (option == 'Y' || option == 'y')
				{
						System.out.println("\t\t\tEXECUTION STARTED");
						System.out.println();
						System.out.print("Enter a number : ");
						int num = sc.nextInt();
						int prod = 1;
						while (num>0)
						{
							prod *= num % 10;
							num/=10;
						}

						System.out.println("Digital Product : "+prod);
						System.out.println();
						System.out.println("\t\t\tEXECUTION ENDED");
						System.out.println();
				}
				else
					System.out.println("You have entered the Character other than 'Y'");

				System.out.println("Enter the Programs you need to visit");
				System.out.println("1. Program for Printing the number in reverse order using While Loop");
				System.out.println("2. Program for printing the product of Digits in the given number using WHILE Loop");
				System.out.println("3. Program for printing the sum of even Digits in the given number using WHILE Loop");
				System.out.println("4. Program for finding the given number is Xylem or Floem using WHILE Loop");
				System.out.println("5. Exit");
				choice2 = sc.nextInt();
				System.out.println();

			}

			if (choice2 == 3)
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("3. Program for printing the sum of even Digits in the given number using WHILE Loop");
				System.out.println();
				System.out.println("import java.util.Scanner;");
				System.out.println("class loop_3"); 
				System.out.println("{");
				System.out.println("	static Scanner sc = new Scanner(System.in);");
				System.out.println("	public static void main(String[] args)"); 
				System.out.println("	{");
				System.out.println("		System.out.println(Enter the number);");
				System.out.println("		int num = sc.nextInt();");
				System.out.println("		int last = 0, sum = 0;");
				System.out.println("		while (num>0)");
				System.out.println("		{");
				System.out.println("			last = num % 10;");
				System.out.println("			if (last % 2 == 0)");
				System.out.println("			{");
				System.out.println("				sum+=last;");
				System.out.println("			}");
				System.out.println("			num/=10;");
				System.out.println("		}");
				System.out.println("		System.out.println(Digital Sum of even numbers : +sum);");
				System.out.println("	}");
				System.out.println("}");
				System.out.println();
				System.out.println("***************************************************************************************************************************************");

				System.out.println("If you want to execute a program, please enter 'Y'");
				char option = sc.next().charAt(0);
				System.out.println();

				if (option == 'Y' || option == 'y')
				{
						System.out.println("\t\t\tEXECUTION STARTED");
						System.out.println();
						System.out.print("Enter the number : ");
						int num = sc.nextInt();
						int last = 0, sum = 0;
						while (num>0)
						{
							last = num % 10;
							if (last % 2 == 0)
							{
								sum+=last;
							}
							num/=10;
						}

						System.out.println("Digital Sum of even numbers : "+sum);
						System.out.println();
						System.out.println("\t\t\tEXECUTION ENDED");
						System.out.println();
				}
				else
					System.out.println("You have entered the Character other than 'Y'");

				System.out.println("Enter the Programs you need to visit");
				System.out.println("1. Program for Printing the number in reverse order using While Loop");
				System.out.println("2. Program for printing the product of Digits in the given number using WHILE Loop");
				System.out.println("3. Program for printing the sum of even Digits in the given number using WHILE Loop");
				System.out.println("4. Program for finding the given number is Xylem or Floem using WHILE Loop");
				System.out.println("5. Exit");
				choice2 = sc.nextInt();
				System.out.println();

			}

			if (choice2 == 4)
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("4. Program for finding the given number is Xylem or Floem using WHILE Loop");
				System.out.println();
				
				System.out.println("import java.util.Scanner;");
				System.out.println("class loop_4"); 
				System.out.println("{");
				System.out.println("	static Scanner sc = new Scanner(System.in);");
				System.out.println("	public static void main(String[] args)"); 
				System.out.println("	{");
				System.out.println("		System.out.println(Enter the number : );");
				System.out.println("		int num = sc.nextInt();");
				System.out.println("		int temp = num, last_digit = 0, mean_digits = 0, first_digit = 0, first_last = 0;");
				System.out.println("		if (num > 999)");
				System.out.println("		{");
				System.out.println("			last_digit = num % 10;");
				System.out.println("			num /= 10;");
				System.out.println("			while (num > 9)");
				System.out.println("			{");
				System.out.println("				mean_digits = mean_digits + (num%10);");
				System.out.println("				num = num/10;");
				System.out.println("			}");
				System.out.println("			first_digit = num;");
				System.out.println("			first_last = first_digit + last_digit;");
				System.out.println("			if (first_last == mean_digits)");
				System.out.println("			{");
				System.out.println("				System.out.println(temp+ is Xylem);");
				System.out.println("			}");
				System.out.println("			else");
				System.out.println("			System.out.println(temp+ is Floem);");
				System.out.println("		}");
				System.out.println("		else");
				System.out.println("		System.out.println(temp+ is Floem);");
				System.out.println("	}");
				System.out.println("}");
				System.out.println();
				System.out.println("***************************************************************************************************************************************");

				System.out.println("If you want to execute a program, please enter 'Y'");
				char option = sc.next().charAt(0);
				System.out.println();

				if (option == 'Y' || option == 'y')
				{
						System.out.println("\t\t\tEXECUTION STARTED");
						System.out.println();
						System.out.println("Enter the number :\n");
						int num = sc.nextInt();
						int temp = num, last_digit = 0, mean_digits = 0, first_digit = 0, first_last = 0; 

						if (num > 999)
						{
							last_digit = num % 10;
							num /= 10;
							while (num > 9)
							{
								mean_digits = mean_digits + (num%10); //mean_digits += (num%10)
								num = num/10;
							}

							first_digit = num;

							first_last = first_digit + last_digit;

							if (first_last == mean_digits)
						{
							System.out.println(temp+" is Xylem");
						}
						else
							System.out.println(temp+" is Floem");
						}
						
						else 
						System.out.println(temp+" is Floem");
						System.out.println();
						System.out.println("\t\t\tEXECUTION ENDED");
						System.out.println();
				}
				else
					System.out.println("You have entered the Character other than 'Y'");

				System.out.println("Enter the Programs you need to visit");
				System.out.println("1. Program for Printing the number in reverse order using While Loop");
				System.out.println("2. Program for printing the product of Digits in the given number using WHILE Loop");
				System.out.println("3. Program for printing the sum of even Digits in the given number using WHILE Loop");
				System.out.println("4. Program for finding the given number is Xylem or Floem using WHILE Loop");
				System.out.println("5. Exit");
				choice2 = sc.nextInt();
				System.out.println();

			}

			if (choice2 == 5)
			{
				System.out.println("\t\t\tTHANKS FOR VISITING PROGRAMS USING LOOPING STATEMENTS SECTION");
				break;
			}
			}

		}
		
	}


	public static void mini_proj (char ch) throws Exception
	{
		if (ch == 'a'|| ch == 'A')
		{
			System.out.println("\t\t\tWELCOME TO SWIGGY...!");
			System.out.println();
			System.out.println("\t\t\tSelect Your Favourite Hotel");
			System.out.println("\t\t\t1. S.S Hyderabad");
			System.out.println("\t\t\t2. Buhari");
			System.out.println("\t\t\t3. A2B");
			System.out.println("\t\t\t4. Amma Canteen");
			System.out.println();
			int hotel = sc.nextInt();
			Thread.sleep(1500);

			switch (hotel)
			{
			case 1 : //S.S Hyderabad Briyani
				{
					System.out.println("\t\t\tThank You For Selecting S.S Hyderabad Briyani");
					System.out.println("Select the Food you like to Taste");
					System.out.println("1. Mutton Briyani\n2. Chicken Briyani\n");
					int food = sc.nextInt();
					System.out.println();
					Thread.sleep(1500);

					switch (food)
					{
					case 1 : //Mutton Briyani
						{
							double price = 380;
							System.out.println("Enter the Qty");
							int qty_to_order = sc.nextInt();
							Thread.sleep(1500);
							double total_price = qty_to_order * price;
							System.out.println();
							System.out.println("Total Bill Amount : "+total_price);
							System.out.println();

							System.out.println("Select the Payment mode");
							System.out.println("1. G-Pay\n2. PhonePe\n");
							int mode_of_payment = sc.nextInt();

							switch (mode_of_payment)
							{
							case 1 : //G-Pay
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

							case 2 : //PhonePe
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

								default: System.out.println("Invalid Mode of Payment");
								break;
							
							}

							break;
						}

					
					case 2 : //Chicken Briyani
						{
							double price = 260;
							System.out.println("Enter the Qty");
							int qty_to_order = sc.nextInt();
							Thread.sleep(1500);
							double total_price = qty_to_order * price;
							System.out.println();
							System.out.println("Total Bill Amount : "+total_price);
							System.out.println();

							System.out.println("Select the Payment mode");
							System.out.println("1. G-Pay\n2. PhonePe\n");
							int mode_of_payment = sc.nextInt();

							switch (mode_of_payment)
							{
							case 1 : //G-Pay
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

							case 2 : //PhonePe
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

								default: System.out.println("Invalid Mode of Payment");
								break;
							
							}
							
							break;
						}
					
					default: System.out.println("Selected Food is not available");
					break;

					}
					break;
				}



			case 2 : // Buhari
				{
					System.out.println("\t\t\tThank You For Selecting Buhari");
					System.out.println("Select the Food you like to Taste");
					System.out.println("1. Mutton Dum Briyani\n2. Chicken Dum Briyani\n3. Idiyappam Briyani\n4. Madras Egg Parotta\n5. Ceylon Egg Parotta\n");
					int food = sc.nextInt();
					System.out.println();
					Thread.sleep(1500);

					switch (food)
					{
					case 1 : //Mutton Dum Briyani
						{
							double price = 335;
							System.out.println("Enter the Qty");
							int qty_to_order = sc.nextInt();
							Thread.sleep(1500);
							double total_price = qty_to_order * price;
							System.out.println();
							System.out.println("Total Bill Amount : "+total_price);
							System.out.println();

							System.out.println("Select the Payment mode");
							System.out.println("1. G-Pay\n2. PhonePe\n");
							int mode_of_payment = sc.nextInt();

							switch (mode_of_payment)
							{
							case 1 : //G-Pay
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

							case 2 : //PhonePe
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

								default: System.out.println("Invalid Mode of Payment");
								break;
							
							}

							break;
						}

					
					case 2 : //Chicken Dum Briyani
						{
							double price = 305;
							System.out.println("Enter the Qty");
							int qty_to_order = sc.nextInt();
							Thread.sleep(1500);
							double total_price = qty_to_order * price;
							System.out.println();
							System.out.println("Total Bill Amount : "+total_price);
							System.out.println();

							System.out.println("Select the Payment mode");
							System.out.println("1. G-Pay\n2. PhonePe\n");
							int mode_of_payment = sc.nextInt();

							switch (mode_of_payment)
							{
							case 1 : //G-Pay
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

							case 2 : //PhonePe
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

								default: System.out.println("Invalid Mode of Payment");
								break;
							
							}
							
							break;
						}

					case 3 : //Idiyappam Briyani
						{
							double price = 305;
							System.out.println("Enter the Qty");
							int qty_to_order = sc.nextInt();
							Thread.sleep(1500);
							double total_price = qty_to_order * price;
							System.out.println();
							System.out.println("Total Bill Amount : "+total_price);
							System.out.println();

							System.out.println("Select the Payment mode");
							System.out.println("1. G-Pay\n2. PhonePe\n");
							int mode_of_payment = sc.nextInt();

							switch (mode_of_payment)
							{
							case 1 : //G-Pay
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

							case 2 : //PhonePe
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

								default: System.out.println("Invalid Mode of Payment");
								break;
							
							}
							
							break;
						}

					case 4 : //Madras Egg Parotta
						{
							double price = 265;
							System.out.println("Enter the Qty");
							int qty_to_order = sc.nextInt();
							Thread.sleep(1500);
							double total_price = qty_to_order * price;
							System.out.println();
							System.out.println("Total Bill Amount : "+total_price);
							System.out.println();

							System.out.println("Select the Payment mode");
							System.out.println("1. G-Pay\n2. PhonePe\n");
							int mode_of_payment = sc.nextInt();

							switch (mode_of_payment)
							{
							case 1 : //G-Pay
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

							case 2 : //PhonePe
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

								default: System.out.println("Invalid Mode of Payment");
								break;
							
							}
							
							break;
						}

					case 5 : //Ceylon Egg Parotta
						{
							double price = 265;
							System.out.println("Enter the Qty");
							int qty_to_order = sc.nextInt();
							Thread.sleep(1500);
							double total_price = qty_to_order * price;
							System.out.println();
							System.out.println("Total Bill Amount : "+total_price);
							System.out.println();

							System.out.println("Select the Payment mode");
							System.out.println("1. G-Pay\n2. PhonePe\n");
							int mode_of_payment = sc.nextInt();

							switch (mode_of_payment)
							{
							case 1 : //G-Pay
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

							case 2 : //PhonePe
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

								default: System.out.println("Invalid Mode of Payment");
								break;
							
							}
							
							break;
						}
					
						default: System.out.println("Selected Food is not available");
						break;

					}
					break;
				}



			case 3 : // A2B
				{
					System.out.println("\t\t\tThank You For Selecting A2B");
					System.out.println("Select the Food you like to Taste");
					System.out.println("1. Mushroom Fried Rice\n2. Paneer Fried Rice\n3. Schezwan Fried Rice\n4. Veg Fried Rice\n");
					int food = sc.nextInt();
					System.out.println();
					Thread.sleep(1500);

					switch (food)
					{
					case 1 : //Mushroom Fried Rice
						{
							double price = 260;
							System.out.println("Enter the Qty");
							int qty_to_order = sc.nextInt();
							Thread.sleep(1500);
							double total_price = qty_to_order * price;
							System.out.println();
							System.out.println("Total Bill Amount : "+total_price);
							System.out.println();

							System.out.println("Select the Payment mode");
							System.out.println("1. G-Pay\n2. PhonePe\n");
							int mode_of_payment = sc.nextInt();

							switch (mode_of_payment)
							{
							case 1 : //G-Pay
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

							case 2 : //PhonePe
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

								default: System.out.println("Invalid Mode of Payment");
								break;
							
							}

							break;
						}

					
					case 2 : //Paneer Fried Rice
						{
							double price = 270;
							System.out.println("Enter the Qty");
							int qty_to_order = sc.nextInt();
							Thread.sleep(1500);
							double total_price = qty_to_order * price;
							System.out.println();
							System.out.println("Total Bill Amount : "+total_price);
							System.out.println();

							System.out.println("Select the Payment mode");
							System.out.println("1. G-Pay\n2. PhonePe\n");
							int mode_of_payment = sc.nextInt();

							switch (mode_of_payment)
							{
							case 1 : //G-Pay
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

							case 2 : //PhonePe
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

								default: System.out.println("Invalid Mode of Payment");
								break;
							
							}
							
							break;
						}

					case 3 : //Schezwan Fried Rice
						{
							double price = 260;
							System.out.println("Enter the Qty");
							int qty_to_order = sc.nextInt();
							Thread.sleep(1500);
							double total_price = qty_to_order * price;
							System.out.println();
							System.out.println("Total Bill Amount : "+total_price);
							System.out.println();

							System.out.println("Select the Payment mode");
							System.out.println("1. G-Pay\n2. PhonePe\n");
							int mode_of_payment = sc.nextInt();

							switch (mode_of_payment)
							{
							case 1 : //G-Pay
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

							case 2 : //PhonePe
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

								default: System.out.println("Invalid Mode of Payment");
								break;
							
							}
							
							break;
						}

					case 4 : //Veg Fried Rice
						{
							double price = 250;
							System.out.println("Enter the Qty");
							int qty_to_order = sc.nextInt();
							Thread.sleep(1500);
							double total_price = qty_to_order * price;
							System.out.println();
							System.out.println("Total Bill Amount : "+total_price);
							System.out.println();

							System.out.println("Select the Payment mode");
							System.out.println("1. G-Pay\n2. PhonePe\n");
							int mode_of_payment = sc.nextInt();

							switch (mode_of_payment)
							{
							case 1 : //G-Pay
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

							case 2 : //PhonePe
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

								default: System.out.println("Invalid Mode of Payment");
								break;
							
							}
							
							break;
						}
					
						default: System.out.println("Selected Food is not available");
						break;

					}
					break;
				}


			case 4 : // Amma Canteen
				{
					System.out.println("\t\t\tThank You For Selecting A2B");
					System.out.println("Select the Food you like to Taste");
					System.out.println("1. Idly and Sambar\n2. Sambar Rice\n3. Curd Rice\n4. Chappathi and Dhal\n");
					int food = sc.nextInt();
					System.out.println();
					Thread.sleep(1500);

					switch (food)
					{
					case 1 : //Idly and Sambar
						{
							double price = 1;
							System.out.println("Enter the Qty");
							int qty_to_order = sc.nextInt();
							Thread.sleep(1500);
							double total_price = qty_to_order * price;
							System.out.println();
							System.out.println("Total Bill Amount : "+total_price);
							System.out.println();

							System.out.println("Select the Payment mode");
							System.out.println("1. G-Pay\n2. PhonePe\n");
							int mode_of_payment = sc.nextInt();

							switch (mode_of_payment)
							{
							case 1 : //G-Pay
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

							case 2 : //PhonePe
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

								default: System.out.println("Invalid Mode of Payment");
								break;
							
							}

							break;
						}

					
					case 2 : //Sambar Rice
						{
							double price = 5;
							System.out.println("Enter the Qty");
							int qty_to_order = sc.nextInt();
							Thread.sleep(1500);
							double total_price = qty_to_order * price;
							System.out.println();
							System.out.println("Total Bill Amount : "+total_price);
							System.out.println();

							System.out.println("Select the Payment mode");
							System.out.println("1. G-Pay\n2. PhonePe\n");
							int mode_of_payment = sc.nextInt();

							switch (mode_of_payment)
							{
							case 1 : //G-Pay
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

							case 2 : //PhonePe
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

								default: System.out.println("Invalid Mode of Payment");
								break;
							
							}
							
							break;
						}

					case 3 : //Curd Rice
						{
							double price = 5;
							System.out.println("Enter the Qty");
							int qty_to_order = sc.nextInt();
							Thread.sleep(1500);
							double total_price = qty_to_order * price;
							System.out.println();
							System.out.println("Total Bill Amount : "+total_price);
							System.out.println();

							System.out.println("Select the Payment mode");
							System.out.println("1. G-Pay\n2. PhonePe\n");
							int mode_of_payment = sc.nextInt();

							switch (mode_of_payment)
							{
							case 1 : //G-Pay
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

							case 2 : //PhonePe
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

								default: System.out.println("Invalid Mode of Payment");
								break;
							
							}
							
							break;
						}

					case 4 : //Chappathi and Dhal
						{
							double price = 2;
							System.out.println("Enter the Qty");
							int qty_to_order = sc.nextInt();
							Thread.sleep(1500);
							double total_price = qty_to_order * price;
							System.out.println();
							System.out.println("Total Bill Amount : "+total_price);
							System.out.println();

							System.out.println("Select the Payment mode");
							System.out.println("1. G-Pay\n2. PhonePe\n");
							int mode_of_payment = sc.nextInt();

							switch (mode_of_payment)
							{
							case 1 : //G-Pay
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

							case 2 : //PhonePe
								{
									System.out.println("\nEnter Total Bill Amount");
									double user_entered_amount = sc.nextDouble();
									Thread.sleep(1500);
									System.out.println();

									if (user_entered_amount == total_price)
									{
										System.out.println("OTP will be sent to our registered mobile number");
										Thread.sleep(1500);
										int sys_otp = (int)(Math.random()*9999+9999); //Generating OTP
										System.out.println(sys_otp);
										System.out.println();

										System.out.println("Enter the OTP for confirming the order");
										int user_entered_otp = sc.nextInt();
										Thread.sleep(1500);
										System.out.println();

										if (user_entered_otp == sys_otp)
										{
											System.out.println("\t\t\tOrder Placed Successfully");
											System.out.println("\t\t\tWill be Deliverd Soon....");
										}
										
										else 
											System.out.println("Order Failed");
									}

									else
										System.out.println("Payment Failed");


									break;
								}

								default: System.out.println("Invalid Mode of Payment");
								break;
							
							}
							
							break;
						}
					
						default: System.out.println("Selected Food is not available");
						break;

					}
					break;
				}

			
			default: System.out.println("Selected Hotel is Closed Temporarily");
			break;
			}

		}

		if (ch == 'b'|| ch == 'B')
		{
			System.out.println("\t\t\tHUGE WELECOME FOR VISITING QSPIDERS AND JSPIDERS WEBSITE");
			System.out.println();
			Thread.sleep(2000);
			System.out.println("Select the Institute you get to know");
			System.out.println("1. Qspiders\n2. Jspiders");
			System.out.println();
			int inst = sc.nextInt();
			Thread.sleep(2000);

			switch (inst)
			{
			case 1:
			{
			System.out.println("\nQspiders");
			System.out.println("https://www.qspiders.com");
			System.out.println();
			Thread.sleep(2000);
			System.out.print("\t\t\tWELCOME TO COURSES MODULE");
			System.out.println();
			System.out.println("Currently we are providing \"10\" Courses");
			Thread.sleep(1500);
			System.out.println("1. Software Testing");
			Thread.sleep(1500);
			System.out.println("2. Core Java and Selenium");
			Thread.sleep(1500);
			System.out.println("3. SDET");
			Thread.sleep(1500);
			System.out.println("4. Python - Selenium");
			Thread.sleep(1500);
			System.out.println("5. ISTQB");
			Thread.sleep(1500);
			System.out.println("6. API Testing");
			Thread.sleep(1500);
			System.out.println("7. Performance Testing");
			Thread.sleep(1500);
			System.out.println("8. C,C++ Programming");
			Thread.sleep(1500);
			System.out.println("9. DevOps");
			Thread.sleep(1500);
			System.out.println("10. Project");
			Thread.sleep(1500);
			System.out.println();
			System.out.println("Select the course you would like to join");
			int choice = sc.nextInt();
			System.out.println();
			Thread.sleep(1500);

			switch (choice)
			{
			case 1:
				{
					System.out.println("\t\t\tTHANKS FOR CHOOSING \"SOFTWARE TESTING\"");
					System.out.println();
					System.out.println("\t\t\tCourse Content");
					Thread.sleep(1000);
					System.out.println("Manual Testing");
					Thread.sleep(1000);
					System.out.println("Database");
					Thread.sleep(1000);
					System.out.println("Core Java");
					Thread.sleep(1000);
					System.out.println("Selenium");
					Thread.sleep(1000);
					System.out.println("Agile Methodology");
					System.out.println();

					double pack = 22999;
					System.out.println("Discounted Fee of this course : "+pack);
					System.out.println();
					
					System.out.println("Enter the amount if you would like to join in this course");
					double user_entered_pack = sc.nextDouble();
					System.out.println();

					if (user_entered_pack == pack)
					{
						Thread.sleep(2000);
						System.out.println("Choose the Payment Mode");
						System.out.println("1. GPay\n2. PhonePe");
						System.out.println();

						int mode = sc.nextInt();
						System.out.println();
						Thread.sleep(2000);

						switch (mode)
						{
						case 1:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						case 2:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						default: System.out.println("Invalid Mode of Payment");
						break;
						
						}


					}

					else
						System.out.println("Payment Failed");

					break;
				}

			case 2:
				{
					System.out.println("\t\t\tTHANKS FOR CHOOSING \"CORE JAVA AND SELENIUM\"");
					System.out.println();
					System.out.println("\t\t\tCourse Content");
					Thread.sleep(1000);
					System.out.println("Core Java");
					Thread.sleep(1000);
					System.out.println("Selenium");
					System.out.println();

					double pack = 23999;
					System.out.println("Discounted Fee of this course : "+pack);
					System.out.println();
					
					System.out.println("Enter the amount if you would like to join in this course");
					double user_entered_pack = sc.nextDouble();
					System.out.println();

					if (user_entered_pack == pack)
					{
						Thread.sleep(2000);
						System.out.println("Choose the Payment Mode");
						System.out.println("1. GPay\n2. PhonePe");
						System.out.println();

						int mode = sc.nextInt();
						System.out.println();
						Thread.sleep(2000);

						switch (mode)
						{
						case 1:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						case 2:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						default: System.out.println("Invalid Mode of Payment");
						break;
						
						}


					}

					else
						System.out.println("Payment Failed");
					break;
				}

			case 3:
				{
					System.out.println("\t\t\tTHANKS FOR CHOOSING \"SDET\"");
					System.out.println();
					System.out.println("\t\t\tCourse Content");
					Thread.sleep(1000);
					System.out.println("Manual Testing");
					Thread.sleep(1000);
					System.out.println("Database");
					Thread.sleep(1000);
					System.out.println("Core Java");
					Thread.sleep(1000);
					System.out.println("Selenium");
					Thread.sleep(1000);
					System.out.println("Agile Methodology");
					Thread.sleep(1000);
					System.out.println("API Testing");
					System.out.println();

					double pack = 25999;
					System.out.println("Discounted Fee of this course : "+pack);
					System.out.println();
					
					System.out.println("Enter the amount if you would like to join in this course");
					double user_entered_pack = sc.nextDouble();
					System.out.println();

					if (user_entered_pack == pack)
					{
						Thread.sleep(2000);
						System.out.println("Choose the Payment Mode");
						System.out.println("1. GPay\n2. PhonePe");
						System.out.println();

						int mode = sc.nextInt();
						System.out.println();
						Thread.sleep(2000);

						switch (mode)
						{
						case 1:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						case 2:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						default: System.out.println("Invalid Mode of Payment");
						break;
						
						}


					}

					else
						System.out.println("Payment Failed");
					break;
				}

			case 4:
				{
					System.out.println("\t\t\tTHANKS FOR CHOOSING \"PYTHON - SELENIUM\"");
					System.out.println();
					System.out.println("\t\t\tCourse Content");
					Thread.sleep(1000);
					System.out.println("Python");
					Thread.sleep(1000);
					System.out.println("Selenium Tool");
					System.out.println();

					double pack = 20999;
					System.out.println("Discounted Fee of this course : "+pack);
					System.out.println();
					
					System.out.println("Enter the amount if you would like to join in this course");
					double user_entered_pack = sc.nextDouble();
					System.out.println();

					if (user_entered_pack == pack)
					{
						Thread.sleep(2000);
						System.out.println("Choose the Payment Mode");
						System.out.println("1. GPay\n2. PhonePe");
						System.out.println();

						int mode = sc.nextInt();
						System.out.println();
						Thread.sleep(2000);

						switch (mode)
						{
						case 1:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						case 2:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						default: System.out.println("Invalid Mode of Payment");
						break;
						
						}


					}

					else
						System.out.println("Payment Failed");
					break;
				}

			case 5:
				{
					System.out.println("\t\t\tTHANKS FOR CHOOSING \"ISTQB\"");
					System.out.println();
					System.out.println("\t\t\tCourse Content");
					Thread.sleep(1000);
					System.out.println("ISTQB foundation level exam");
					System.out.println();

					double pack = 21999;
					System.out.println("Discounted Fee of this course : "+pack);
					System.out.println();
					
					System.out.println("Enter the amount if you would like to join in this course");
					double user_entered_pack = sc.nextDouble();
					System.out.println();

					if (user_entered_pack == pack)
					{
						Thread.sleep(2000);
						System.out.println("Choose the Payment Mode");
						System.out.println("1. GPay\n2. PhonePe");
						System.out.println();

						int mode = sc.nextInt();
						System.out.println();
						Thread.sleep(2000);

						switch (mode)
						{
						case 1:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						case 2:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						default: System.out.println("Invalid Mode of Payment");
						break;
						
						}


					}

					else
						System.out.println("Payment Failed");
					break;
				}

			case 6:
				{
					System.out.println("\t\t\tTHANKS FOR CHOOSING \"API TESTING\"");
					System.out.println();
					System.out.println("\t\t\tCourse Content");
					Thread.sleep(1000);
					System.out.println("API testing basic");
					Thread.sleep(1000);
					System.out.println("REST");
					Thread.sleep(1000);
					System.out.println("POSTMAN Tool");
					Thread.sleep(1000);
					System.out.println("Rest Assured advance");
					Thread.sleep(1000);
					System.out.println("REST ASSURED");
					Thread.sleep(1000);
					System.out.println("SOAP");
					System.out.println();

					double pack = 25999;
					System.out.println("Discounted Fee of this course : "+pack);
					System.out.println();
					
					System.out.println("Enter the amount if you would like to join in this course");
					double user_entered_pack = sc.nextDouble();
					System.out.println();

					if (user_entered_pack == pack)
					{
						Thread.sleep(2000);
						System.out.println("Choose the Payment Mode");
						System.out.println("1. GPay\n2. PhonePe");
						System.out.println();

						int mode = sc.nextInt();
						System.out.println();
						Thread.sleep(2000);

						switch (mode)
						{
						case 1:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						case 2:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						default: System.out.println("Invalid Mode of Payment");
						break;
						
						}


					}

					else
						System.out.println("Payment Failed");
					break;
				}

			case 7:
				{
					System.out.println("\t\t\tTHANKS FOR CHOOSING \"PERFORMANCE TESTING\"");
					System.out.println();
					System.out.println("\t\t\tCourse Content");
					Thread.sleep(1000);
					System.out.println("JMeter");
					Thread.sleep(1000);
					System.out.println("Load runner");
					System.out.println();

					double pack = 19999;
					System.out.println("Discounted Fee of this course : "+pack);
					System.out.println();
					
					System.out.println("Enter the amount if you would like to join in this course");
					double user_entered_pack = sc.nextDouble();
					System.out.println();

					if (user_entered_pack == pack)
					{
						Thread.sleep(2000);
						System.out.println("Choose the Payment Mode");
						System.out.println("1. GPay\n2. PhonePe");
						System.out.println();

						int mode = sc.nextInt();
						System.out.println();
						Thread.sleep(2000);

						switch (mode)
						{
						case 1:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						case 2:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						default: System.out.println("Invalid Mode of Payment");
						break;
						
						}


					}

					else
						System.out.println("Payment Failed");
					break;
				}

			case 8:
				{
					System.out.println("\t\t\tTHANKS FOR CHOOSING \"C,C++ PROGRAMMING\"");
					System.out.println();
					System.out.println("\t\t\tCourse Content");
					Thread.sleep(1000);
					System.out.println("C++");
					Thread.sleep(1000);
					System.out.println("C Programming");
					System.out.println();

					double pack = 22999;
					System.out.println("Discounted Fee of this course : "+pack);
					System.out.println();
					
					System.out.println("Enter the amount if you would like to join in this course");
					double user_entered_pack = sc.nextDouble();
					System.out.println();

					if (user_entered_pack == pack)
					{
						Thread.sleep(2000);
						System.out.println("Choose the Payment Mode");
						System.out.println("1. GPay\n2. PhonePe");
						System.out.println();

						int mode = sc.nextInt();
						System.out.println();
						Thread.sleep(2000);

						switch (mode)
						{
						case 1:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						case 2:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						default: System.out.println("Invalid Mode of Payment");
						break;
						
						}


					}

					else
						System.out.println("Payment Failed");
					break;
				}

			case 9:
				{
					System.out.println("\t\t\tTHANKS FOR CHOOSING \"DEVOPS\"");
					System.out.println();
					System.out.println("\t\t\tCourse Content");
					Thread.sleep(1000);
					System.out.println("DevOps");
					System.out.println();

					double pack = 27999;
					System.out.println("Discounted Fee of this course : "+pack);
					System.out.println();
					
					System.out.println("Enter the amount if you would like to join in this course");
					double user_entered_pack = sc.nextDouble();
					System.out.println();

					if (user_entered_pack == pack)
					{
						Thread.sleep(2000);
						System.out.println("Choose the Payment Mode");
						System.out.println("1. GPay\n2. PhonePe");
						System.out.println();

						int mode = sc.nextInt();
						System.out.println();
						Thread.sleep(2000);

						switch (mode)
						{
						case 1:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						case 2:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						default: System.out.println("Invalid Mode of Payment");
						break;
						
						}


					}

					else
						System.out.println("Payment Failed");
					break;
				}

			case 10:
				{
					System.out.println("\t\t\tTHANKS FOR CHOOSING \"PROJECT\"");
					System.out.println();
					System.out.println("\t\t\tCourse Content");
					Thread.sleep(1000);
					System.out.println("Project");
					System.out.println();

					double pack = 21999;
					System.out.println("Discounted Fee of this course : "+pack);
					System.out.println();
					
					System.out.println("Enter the amount if you would like to join in this course");
					double user_entered_pack = sc.nextDouble();
					System.out.println();

					if (user_entered_pack == pack)
					{
						Thread.sleep(2000);
						System.out.println("Choose the Payment Mode");
						System.out.println("1. GPay\n2. PhonePe");
						System.out.println();

						int mode = sc.nextInt();
						System.out.println();
						Thread.sleep(2000);

						switch (mode)
						{
						case 1:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						case 2:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						default: System.out.println("Invalid Mode of Payment");
						break;
						
						}


					}

					else
						System.out.println("Payment Failed");
					break;
				}
			
			default: System.out.println("Invalid Course Selected");
			break;
			}
			break;
			}

			case 2:
			{
			System.out.println("\nJspiders");
			System.out.println("https://www.jspiders.com");
			System.out.println();
			Thread.sleep(2000);
			System.out.print("\t\t\tWELCOME TO COURSES MODULE");
			System.out.println();
			System.out.println("Currently we are providing \"10\" Courses");
			Thread.sleep(1500);
			System.out.println("1. Java Full Stack");
			Thread.sleep(1500);
			System.out.println("2. C,C++ Programming");
			Thread.sleep(1500);
			System.out.println("3. J2EE");
			Thread.sleep(1500);
			System.out.println("4. MEAN Stack");
			Thread.sleep(1500);
			System.out.println("5. MERN Stack");
			Thread.sleep(1500);
			System.out.println("6. Android Development");
			Thread.sleep(1500);
			System.out.println("7. Web & Angular");
			Thread.sleep(1500);
			System.out.println("8. Angular");
			Thread.sleep(1500);
			System.out.println("9. Big data Hadoop");
			Thread.sleep(1500);
			System.out.println("10. DevOps");
			Thread.sleep(1500);
			System.out.println();
			System.out.println("Select the course you would like to join");
			int choice = sc.nextInt();
			System.out.println();
			Thread.sleep(1500);

			switch (choice)
			{
			case 1:
				{
					System.out.println("\t\t\tTHANKS FOR CHOOSING \"JAVA FULL STACK\"");
					System.out.println();
					System.out.println("\t\t\tCourse Content");
					Thread.sleep(1000);
					System.out.println("Database");
					Thread.sleep(1000);
					System.out.println("Core Java");
					Thread.sleep(1000);
					System.out.println("J2EE");
					Thread.sleep(1000);
					System.out.println("Frameworks");
					Thread.sleep(1000);
					System.out.println("Web services");
					Thread.sleep(1000);
					System.out.println("Web Technology");
					System.out.println();

					double pack = 17999;
					System.out.println("Discounted Fee of this course : "+pack);
					System.out.println();
					
					System.out.println("Enter the amount if you would like to join in this course");
					double user_entered_pack = sc.nextDouble();
					System.out.println();

					if (user_entered_pack == pack)
					{
						Thread.sleep(2000);
						System.out.println("Choose the Payment Mode");
						System.out.println("1. GPay\n2. PhonePe");
						System.out.println();

						int mode = sc.nextInt();
						System.out.println();
						Thread.sleep(2000);

						switch (mode)
						{
						case 1:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						case 2:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						default: System.out.println("Invalid Mode of Payment");
						break;
						
						}


					}

					else
						System.out.println("Payment Failed");

					break;
				}

			case 2:
				{
					System.out.println("\t\t\tTHANKS FOR CHOOSING \"C,C++ PROGRAMMING\"");
					System.out.println();
					System.out.println("\t\t\tCourse Content");
					Thread.sleep(1000);
					System.out.println("C++");
					Thread.sleep(1000);
					System.out.println("C Programming");
					System.out.println();

					double pack = 19999;
					System.out.println("Discounted Fee of this course : "+pack);
					System.out.println();
					
					System.out.println("Enter the amount if you would like to join in this course");
					double user_entered_pack = sc.nextDouble();
					System.out.println();

					if (user_entered_pack == pack)
					{
						Thread.sleep(2000);
						System.out.println("Choose the Payment Mode");
						System.out.println("1. GPay\n2. PhonePe");
						System.out.println();

						int mode = sc.nextInt();
						System.out.println();
						Thread.sleep(2000);

						switch (mode)
						{
						case 1:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						case 2:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						default: System.out.println("Invalid Mode of Payment");
						break;
						
						}


					}

					else
						System.out.println("Payment Failed");

					break;
				}

			case 3:
				{
					System.out.println("\t\t\tTHANKS FOR CHOOSING \"J2EE\"");
					System.out.println();
					System.out.println("\t\t\tCourse Content");
					Thread.sleep(1000);
					System.out.println("J2EE");
					System.out.println();

					double pack = 24999;
					System.out.println("Discounted Fee of this course : "+pack);
					System.out.println();
					
					System.out.println("Enter the amount if you would like to join in this course");
					double user_entered_pack = sc.nextDouble();
					System.out.println();

					if (user_entered_pack == pack)
					{
						Thread.sleep(2000);
						System.out.println("Choose the Payment Mode");
						System.out.println("1. GPay\n2. PhonePe");
						System.out.println();

						int mode = sc.nextInt();
						System.out.println();
						Thread.sleep(2000);

						switch (mode)
						{
						case 1:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						case 2:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						default: System.out.println("Invalid Mode of Payment");
						break;
						
						}


					}

					else
						System.out.println("Payment Failed");

					break;
				}

			case 4:
				{
					System.out.println("\t\t\tTHANKS FOR CHOOSING \"MEAN STACK\"");
					System.out.println();
					System.out.println("\t\t\tCourse Content");
					Thread.sleep(1000);
					System.out.println("HTML/HTML5");
					Thread.sleep(1000);
					System.out.println("CSS2/CSS3");
					Thread.sleep(1000);
					System.out.println("BOOTSTRAP");
					Thread.sleep(1000);
					System.out.println("JavaScript");
					Thread.sleep(1000);
					System.out.println("MANGODB");
					Thread.sleep(1000);
					System.out.println("EXPRESSJS");
					Thread.sleep(1000);
					System.out.println("Angular");
					Thread.sleep(1000);
					System.out.println("NODEJS");
					System.out.println();

					double pack = 27999;
					System.out.println("Discounted Fee of this course : "+pack);
					System.out.println();
					
					System.out.println("Enter the amount if you would like to join in this course");
					double user_entered_pack = sc.nextDouble();
					System.out.println();

					if (user_entered_pack == pack)
					{
						Thread.sleep(2000);
						System.out.println("Choose the Payment Mode");
						System.out.println("1. GPay\n2. PhonePe");
						System.out.println();

						int mode = sc.nextInt();
						System.out.println();
						Thread.sleep(2000);

						switch (mode)
						{
						case 1:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						case 2:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						default: System.out.println("Invalid Mode of Payment");
						break;
						
						}


					}

					else
						System.out.println("Payment Failed");

					break;
				}

			case 5:
				{
					System.out.println("\t\t\tTHANKS FOR CHOOSING \"MERN STACK\"");
					System.out.println();
					System.out.println("\t\t\tCourse Content");
					Thread.sleep(1000);
					System.out.println("HTML/HTML5");
					Thread.sleep(1000);
					System.out.println("CSS2/CSS3");
					Thread.sleep(1000);
					System.out.println("BOOTSTRAP");
					Thread.sleep(1000);
					System.out.println("JavaScript");
					Thread.sleep(1000);
					System.out.println("MANGODB");
					Thread.sleep(1000);
					System.out.println("EXPRESSJS");
					Thread.sleep(1000);
					System.out.println("REACTJS");
					Thread.sleep(1000);
					System.out.println("NODEJS");
					System.out.println();

					double pack = 20999;
					System.out.println("Discounted Fee of this course : "+pack);
					System.out.println();
					
					System.out.println("Enter the amount if you would like to join in this course");
					double user_entered_pack = sc.nextDouble();
					System.out.println();

					if (user_entered_pack == pack)
					{
						Thread.sleep(2000);
						System.out.println("Choose the Payment Mode");
						System.out.println("1. GPay\n2. PhonePe");
						System.out.println();

						int mode = sc.nextInt();
						System.out.println();
						Thread.sleep(2000);

						switch (mode)
						{
						case 1:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						case 2:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						default: System.out.println("Invalid Mode of Payment");
						break;
						
						}


					}

					else
						System.out.println("Payment Failed");

					break;
				}

			case 6:
				{
					System.out.println("\t\t\tTHANKS FOR CHOOSING \"ANDROID DEVELOPMENT\"");
					System.out.println();
					System.out.println("\t\t\tCourse Content");
					Thread.sleep(1000);
					System.out.println("Android");
					System.out.println();

					double pack = 30999;
					System.out.println("Discounted Fee of this course : "+pack);
					System.out.println();
					
					System.out.println("Enter the amount if you would like to join in this course");
					double user_entered_pack = sc.nextDouble();
					System.out.println();

					if (user_entered_pack == pack)
					{
						Thread.sleep(2000);
						System.out.println("Choose the Payment Mode");
						System.out.println("1. GPay\n2. PhonePe");
						System.out.println();

						int mode = sc.nextInt();
						System.out.println();
						Thread.sleep(2000);

						switch (mode)
						{
						case 1:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						case 2:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						default: System.out.println("Invalid Mode of Payment");
						break;
						
						}


					}

					else
						System.out.println("Payment Failed");

					break;
				}

			case 7:
				{
					System.out.println("\t\t\tTHANKS FOR CHOOSING \"WEB & ANGULAR\"");
					System.out.println();
					System.out.println("\t\t\tCourse Content");
					Thread.sleep(1000);
					System.out.println("Angular");
					Thread.sleep(1000);
					System.out.println("Web Technology");
					System.out.println();

					double pack = 21999;
					System.out.println("Discounted Fee of this course : "+pack);
					System.out.println();
					
					System.out.println("Enter the amount if you would like to join in this course");
					double user_entered_pack = sc.nextDouble();
					System.out.println();

					if (user_entered_pack == pack)
					{
						Thread.sleep(2000);
						System.out.println("Choose the Payment Mode");
						System.out.println("1. GPay\n2. PhonePe");
						System.out.println();

						int mode = sc.nextInt();
						System.out.println();
						Thread.sleep(2000);

						switch (mode)
						{
						case 1:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						case 2:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						default: System.out.println("Invalid Mode of Payment");
						break;
						
						}


					}

					else
						System.out.println("Payment Failed");

					break;
				}

			case 8:
				{
					System.out.println("\t\t\tTHANKS FOR CHOOSING \"ANGULAR\"");
					System.out.println();
					System.out.println("\t\t\tCourse Content");
					Thread.sleep(1000);
					System.out.println("Angular");
					System.out.println();

					double pack = 19999;
					System.out.println("Discounted Fee of this course : "+pack);
					System.out.println();
					
					System.out.println("Enter the amount if you would like to join in this course");
					double user_entered_pack = sc.nextDouble();
					System.out.println();

					if (user_entered_pack == pack)
					{
						Thread.sleep(2000);
						System.out.println("Choose the Payment Mode");
						System.out.println("1. GPay\n2. PhonePe");
						System.out.println();

						int mode = sc.nextInt();
						System.out.println();
						Thread.sleep(2000);

						switch (mode)
						{
						case 1:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						case 2:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						default: System.out.println("Invalid Mode of Payment");
						break;
						
						}


					}

					else
						System.out.println("Payment Failed");

					break;
				}

			case 9:
				{
					System.out.println("\t\t\tTHANKS FOR CHOOSING \"BIG DATA HADOOP\"");
					System.out.println();
					System.out.println("\t\t\tCourse Content");
					Thread.sleep(1000);
					System.out.println("Hadoop");
					System.out.println();

					double pack = 17999;
					System.out.println("Discounted Fee of this course : "+pack);
					System.out.println();
					
					System.out.println("Enter the amount if you would like to join in this course");
					double user_entered_pack = sc.nextDouble();
					System.out.println();

					if (user_entered_pack == pack)
					{
						Thread.sleep(2000);
						System.out.println("Choose the Payment Mode");
						System.out.println("1. GPay\n2. PhonePe");
						System.out.println();

						int mode = sc.nextInt();
						System.out.println();
						Thread.sleep(2000);

						switch (mode)
						{
						case 1:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						case 2:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						default: System.out.println("Invalid Mode of Payment");
						break;
						
						}


					}

					else
						System.out.println("Payment Failed");

					break;
				}

			case 10:
				{
					System.out.println("\t\t\tTHANKS FOR CHOOSING \"DEVOPS\"");
					System.out.println();
					System.out.println("\t\t\tCourse Content");
					Thread.sleep(1000);
					System.out.println("DevOps");
					System.out.println();

					double pack = 20999;
					System.out.println("Discounted Fee of this course : "+pack);
					System.out.println();
					
					System.out.println("Enter the amount if you would like to join in this course");
					double user_entered_pack = sc.nextDouble();
					System.out.println();

					if (user_entered_pack == pack)
					{
						Thread.sleep(2000);
						System.out.println("Choose the Payment Mode");
						System.out.println("1. GPay\n2. PhonePe");
						System.out.println();

						int mode = sc.nextInt();
						System.out.println();
						Thread.sleep(2000);

						switch (mode)
						{
						case 1:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						case 2:
							{
								System.out.println("OTP will be sent to your registered Mobile Number");
								Thread.sleep(2000);
								int sys_otp = (int)(Math.random()*9999+9999);
								System.out.println(sys_otp);
								System.out.println();
								System.out.println("Enter the OPT");
								int user_entered_otp = sc.nextInt();
								System.out.println();
								Thread.sleep(2000);

								if (user_entered_otp == sys_otp)
								{
									System.out.println("\t\t\tPayment Successfully Completed.....");
									System.out.println("Classes will be started within few days with proper Intimation in Telegram Group");
								}

								else
									System.out.println("\t\t\tPayment Failed.....");

								break;
							}

						default: System.out.println("Invalid Mode of Payment");
						break;
						
						}


					}

					else
						System.out.println("Payment Failed");

					break;
				}
			
			default: System.out.println("Invalid Course Selected");
			break;
			}

			break;
			}

			default: System.out.println("Invalid Institute Selected");
			}
		}
	}

	

	public static void main(String[] args) throws Exception
	{
		System.out.println("\n\t\t\tWELCOME TO QSPIDER'S JAVA ONLINE SESSION");
		System.out.println();
		System.out.print("Enter the Passcode if you want to access further: ");
		String passcode = sc.nextLine();
		int count = 0;
		while (count <= 2)
		{
		if (passcode.equals("Mech_brain"))
		{
		System.out.println();
		System.out.println("SYLLABUS:\n");
		System.out.println("\ta) Basics of Software");
		System.out.println("\tb) Basics of Command Prompt");
		System.out.println("\tc) History of JAVA");
		System.out.println("\td) Files, File Handling and Type of Files");
		System.out.println("\te) Program created using 'C' and 'JAVA' Programming Language");
		System.out.println("\tf) Structure of JDK");
		System.out.println("\tg) Advantages of JAVA");
		System.out.println("\th) Important Terminilogies used in JAVA");
		System.out.println("\ti) Default size and Default value of the Primitive Datatypes");
		System.out.println("\tj) Operators and Types of Operators");
		System.out.println("\tk) Steps for achieving Dynamic Reading");
		System.out.println("\tl) Different Statements in JAVA");
		System.out.println("\tm) Control Flow Statements and its Types & Syntaxes");
		System.out.println("\tn) Programs using Conditional Statements");
		System.out.println("\to) Arrays and the way of array creation");
		System.out.println("\tp) Programs using Arrays");
		System.out.println("\tq) Pattern Programs");
		System.out.println("\tr) Mini Projects");
		System.out.println("\ts) Exit");


		System.out.println();
		System.out.println("Choose the Topic from the above \"SYLABUS\"");

		char topic = sc.next().charAt(0);
		System.out.println();

		while (topic == 'a' || topic == 'A' || topic == 'b' || topic == 'B' || topic == 'c' || topic == 'C' || topic == 'd' || topic == 'D' || topic == 'e' || topic == 'E' || topic == 'f' || topic == 'F' || topic == 'g' || topic == 'G' || topic == 'h' || topic == 'H' || topic == 'i' || topic == 'I' || topic == 'j' || topic == 'J' || topic == 'k' || topic == 'K' || topic == 'l' || topic == 'L' || topic == 'm' || topic == 'M' || topic == 'n' || topic == 'N' || topic == 'o' || topic == 'O' || topic == 'p' || topic == 'P' || topic == 'q' || topic == 'Q' || topic == 'r' || topic == 'R' || topic == 's' || topic == 'S')
		{
		if (topic == 'a' || topic == 'A') //Basics of Software
		{
			b_software ();
		}

		if (topic == 'b' || topic == 'B') //Basics of Command Prompt
		{
			System.out.println("\t\t\tWELCOME TO BASICS OF COMMAND PROMPT SECTION");
			System.out.println();
			System.out.println("1) Definition of Command Prompt");
			System.out.println("2) Basic Commands used in Command Prompt");
			System.out.println("3) Exit");
			System.out.println();

			System.out.println("Enter the Topic you need to learn");
			int choice = sc.nextInt();
			System.out.println();

			if (choice == 1 || choice == 2 || choice == 3)
			{
				while (choice == 1 || choice == 2)
				{
					b_cmd (choice);
					System.out.println("Enter the Topic you need to visit");
					System.out.println("1) Definition of Command Prompt");
					System.out.println("2) Basic Commands used in Command Prompt");
					System.out.println("3) Exit");
					System.out.println();
					choice = sc.nextInt();
					System.out.println();
				}

				if (choice == 3)
				{
					System.out.println("\t\t\tTHANKS FOR VISITING BASIC'S OF COMMAND PROMPT SECTION");
				}

				else 
					System.out.println("Your Entered Choice is not matching with any of the Topic's.");
				}
			
			}

		if (topic == 'c' || topic == 'C') //History of JAVA
		{
			Java_online_class ref = new Java_online_class();
			ref.history_java ("history");
		}

		if (topic == 'd' || topic == 'D') //File, File Handling, Types of files
		{
			file ();
		}

		if (topic == 'e' || topic == 'E') //Programs Created using C, JAVA Programming Language
		{
			System.out.println("\t\t\tWELCOME TO PROGRAMS CREATED USING C AND JAVA PROGRAMMING LANGUAGE");
			System.out.println();
			System.out.println("a) Programs Created using C Programming Language");
			System.out.println("b) Programs Created using JAVA Programming Language");
			System.out.println("c) Exit");
			System.out.println();

			System.out.println("Enter the Topic you need to learn");
			char choice2 = sc.next().charAt(0);
			System.out.println();

			if (choice2 == 'a' || choice2 == 'A' || choice2 == 'b' || choice2 == 'B')
			{
				while (choice2 == 'a' || choice2 == 'A' || choice2 == 'b' || choice2 == 'B')
				{
					prog_c_java (choice2);
					System.out.println("Enter the Topic you need to visit");
					System.out.println("a) Programs Created using C Programming Language");
					System.out.println("b) Programs Created using JAVA Programming Language");
					System.out.println("c) Exit");
					System.out.println();
					choice2 = sc.next().charAt(0);
					System.out.println();
				}

				if (choice2 == 'c' || choice2 == 'C')
				{
					System.out.println("\t\t\tTHANKS FOR VISITING PROGRAMS CREATED USING C AND JAVA PROGRAMMING LANGUAGE SECTION");
				}

				else 
					System.out.println("Your Entered Choice is not matching with any of the Topic's.");
				}
			
			}

			if (topic == 'f' || topic == 'F') //Structure of JDK
			{
				jdk ();
			}

			if (topic == 'g' || topic == 'G') //Advantages of JAVA
			{
				adv ();
			}

			if (topic == 'h' || topic == 'H') //Importatnt terminologies used in JAVA
			{
				term(1);
			}
			
			if (topic == 'i' || topic == 'I') //Default Size and Default value of the Primitive datatypes
			{
				System.out.println("\t\t\tWELCOME TO LEARN THE DEFAULT SIZE AND DEFAULT VALUE OF THE PRIMITIVE DATATYPE");
				System.out.println();
				System.out.println("***************************************************************************************************************************************");
				System.out.println("PRIMITIVE DATATYPE\tDEFAULT SIZE\tDEFAULT VALUES\tDATA THAT CAN BE STORED\tDATA STORED AS");
				System.out.println();
				System.out.println("byte              \t1 byte      \t0             \tInteger                \tInteger");
				System.out.println();
				System.out.println("short             \t2 byte      \t0             \tInteger                \tInteger");
				System.out.println();
				System.out.println("int               \t4 byte      \t0             \tInteger                \tInteger");
				System.out.println();
				System.out.println("long              \t8 byte      \t0l/L          \tInteger                \tInteger");
				System.out.println();
				System.out.println("float             \t4 byte      \t0.0f/F        \tInteger/ Decimal       \tDecimal");
				System.out.println();
				System.out.println("double            \t8 byte      \t0.0d/D        \tInteger/ Decimal       \tDecimal");
				System.out.println();
				System.out.println("char              \t2 byte      \tspace         \tcharacter              \tASCII value");
				System.out.println();
				System.out.println("boolean           \t1 bit       \tfalse         \tboolean                \tboolean");
				System.out.println("***************************************************************************************************************************************");
			}

			if (topic == 'j' || topic == 'J') //Operators and Types of Operators
			{
				System.out.println("\t\t\tWELCOME TO LEARN ABOUT OPERATORS AND TYPES OF OPERATORS\n");
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Operators:\n\t* Operators are the pre-defined symbols which is used to perform operations.");
				System.out.println("\t* Operator performs the task on operands.");
				System.out.println("\t* Based on the number of operands that operator can accept, we classify operator into three types. They are,");
				System.out.println("\t\t1. Unary Operator\n\t\t2. Binary Operator\n\t\t3. Ternary Operator");
				System.out.println("\t* In JAVA, we are having following operators which is given below,");
				System.out.println("\t\t1. Type Cast operator\n\t\t2. Arithmetic Operator\n\t\t3. Relational operator\n\t\t4. Logical Operator\n\t\t5. Conditional Operator\n\t\t6. Increment and Decrement Opertor\n\t\t7. Compound Assignment Operator");
				System.out.println();

				System.out.println("Enter the type of operator that you want to learn");
				int choice = sc.nextInt();
				System.out.println();

				if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6 || choice == 7 || choice == 8)
				{
				while (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6 || choice == 7)
				{
					operator (choice);
					System.out.println("1. Type Cast operator");
					System.out.println("2. Arithmetic Operator");
					System.out.println("3. Relational operator");
					System.out.println("4. Logical Operator");
					System.out.println("5. Conditional Operator");
					System.out.println("6. Increment and Decrement Opertor");
					System.out.println("7. Compound Assignment Operator");
					System.out.println("8. Exit");
					System.out.println();
					choice = sc.nextInt();
					System.out.println();
				}

				if (choice == 8)
				{
					System.out.println("\t\t\tTHANKS FOR VISITING OPERATORS SECTION IN JAVA");
				}
				else 
					System.out.println("Your Entered Choice is not matching with any of the Topic's.");
				}
			}

			if (topic == 'l' || topic == 'L') //Different types of statement in JAVA
			{
			System.out.println("\t\t\tWELCOME TO DIFFERENT TYPES OF STATEMENTS IN JAVA");
			System.out.println();
			System.out.println("1) Print Statement");
			System.out.println("2) Println Statement");
			System.out.println("3) Declaration Statement (or) D-Statement");
			System.out.println("4) Declaration & Initialization Statement (or) D&I statement");
			System.out.println("5) Initialization Statement");
			System.out.println("6) Exit");
			System.out.println();

			System.out.println("Enter the Topic you need to learn");
			int choice = sc.nextInt();
			System.out.println();

			if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6)
			{
				while (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5)
				{
					stmnts (choice);
					System.out.println("1) Print Statement");
					System.out.println("2) Println Statement");
					System.out.println("3) Declaration Statement (or) D-Statement");
					System.out.println("4) Declaration & Initialization Statement (or) D&I statement");
					System.out.println("5) Initialization Statement");
					System.out.println("6) Exit");
					System.out.println();
					choice = sc.nextInt();
					System.out.println();
				}

				if (choice == 6)
				{
					System.out.println("\t\t\tTHANKS FOR VISITING DIFFERENT TYPES OF STATEMENTS IN JAVA SECTION");
				}

				else 
					System.out.println("Your Entered Choice is not matching with any of the Topic's.");
				}
			
			}

			if (topic == 'k' || topic == 'K')
			{
				B.dyn();
			}

			if (topic == 'm' || topic == 'M') //Control Flow Statements and its types & Syntaxes
			{
				System.out.println("\t\t\tWELCOME FOR VISITING CONTROL FLOW STATEMENTS\n");
				System.out.println("Control Flow Statements:\n\t* Being a programmer, we can control the execution flow of program using control flow statements.");
				System.out.println("\t* We are having 2 types of Control Flow Statements.\n\t\t--> Decision Making Statements\n\t\t--> Looping Statements\n");
				A.cfs();
			}

			if (topic == 'n' || topic == 'N') //Programs using Conditional Statements
			{
			System.out.println("\t\t\tWELCOME FOR PLAYING WITH JAVA PROGRAMS USING CONDITIONAL STATEMENTS");
			System.out.println();
			System.out.println("1) Programs using Decision Making Statements");
			System.out.println("2) Programs using Looping Statements");
			System.out.println("3) Exit");
			System.out.println();

			System.out.println("Enter the Topic you need to learn");
			int choice = sc.nextInt();
			System.out.println();

			if (choice == 1 || choice == 2 || choice == 3) 
			{
				while (choice == 1 || choice == 2)
				{
					pg_cs (choice);
					System.out.println("Enter the Topic you need to visit");
					System.out.println("1) Programs using Decision Making Statements");
					System.out.println("2) Programs using Looping Statements");
					System.out.println("3) Exit");
					System.out.println();
					choice = sc.nextInt();
					System.out.println();
				}

				if (choice == 3)
				{
					System.out.println("\t\t\tTHANKS FOR VISITING PROGRAMS USING CONDITIONAL STATEMENTS SECTION");
				}

				else 
					System.out.println("Your Entered Choice is not matching with any of the Topic's.");
				}
			
			}

			if (topic == 'o' || topic == 'O')
			{
				A.array(true);
			}

			if (topic == 'p' || topic == 'P') //Programs using Arrays
			{
				System.out.println("\t\t\tWELCOME FOR PLAYING WITH JAVA PROGRAMS USING ARRAYS");
				System.out.println();
				C.mdapg();
			}

			if (topic == 'q' || topic == 'Q')
			{
				System.out.println("\t\t\tWELCOME FOR PLAYING WITH PATTERNS");
				System.out.println();
				P1.main(s);
				Thread.sleep(1000);
				System.out.println();
				P2.main(s);
				Thread.sleep(1000);
				System.out.println();
				P3.main(s);
				Thread.sleep(1000);
				System.out.println();
				P4.main(s);
				Thread.sleep(1000);
				System.out.println();
				P5.main(s);
				Thread.sleep(1000);
				System.out.println();
				P6.main(s);
				Thread.sleep(1000);
				System.out.println();
				P7.main(s);
				Thread.sleep(1000);
				System.out.println();
				P8.main(s);
				Thread.sleep(1000);
				System.out.println();
				P9.main(s);
				Thread.sleep(1000);
				System.out.println();
				P10.main(s);
				Thread.sleep(1000);
				System.out.println();
				P11.main(s);
				Thread.sleep(1000);
				System.out.println();
				P12.main(s);
				Thread.sleep(1000);
				System.out.println();
				P13.main(s);
				Thread.sleep(1000);
				System.out.println();
				P14.main(s);
				Thread.sleep(1000);
				System.out.println();
				P15.main(s);
				Thread.sleep(1000);
				System.out.println();
			}

			if (topic == 'r' || topic == 'R') //Mini Projects
			{
				System.out.println("\t\t\tWELCOME TO MINI PROJECTS WORLD");
				System.out.println();
				System.out.println("a) Swiggy");
				System.out.println("b) Qspiders");
				System.out.println("c) Exit");
				System.out.println();

				System.out.println("Select the Mini Project that you want to feel with");
				char choice = sc.next().charAt(0);
				System.out.println();

				if (choice == 'a' || choice == 'A' || choice == 'b' || choice == 'B' || choice == 'c' || choice == 'C') 
				{
					while (choice == 'a' || choice == 'A' || choice == 'b' || choice == 'B')
					{
						mini_proj (choice);
						System.out.println("Select the Mini Project that you want to feel with again");
						System.out.println("a) Swiggy");
						System.out.println("b) Qspiders");
						System.out.println("c) Exit");
						System.out.println();
						choice = sc.next().charAt(0);
						System.out.println();
					}

					if (choice == 'c' || choice == 'C')
					{
						System.out.println("\t\t\tTHANKS FOR VISITING MINI PROJECTS SECTION");
					}

					else 
						System.out.println("Your Entered Choice is not matching with any of the Topic's.");
				}
				
			}
			
			if (topic == 's' || topic == 'S')
			{
				System.out.println("\t\t\t                                   **************                   ");
				System.out.println("\t\t\tThanks for had a training using \"TABREZ SIR'S\" JAVA Online Class");
				System.out.println("\t\t\t                                   **************                    ");
				break;
			}

			System.out.println();
			System.out.println("Enter the Topic from Sylabus that you want to learn");
			System.out.println();
			System.out.println("SYLLABUS:\n");
			System.out.println("\ta) Basics of Software");
			System.out.println("\tb) Basics of Command Prompt");
			System.out.println("\tc) History of JAVA");
			System.out.println("\td) Files, File Handling and Type of Files");
			System.out.println("\te) Program created using 'C' and 'JAVA' Programming Language");
			System.out.println("\tf) Structure of JDK");
			System.out.println("\tg) Advantages of JAVA");
			System.out.println("\th) Important Terminilogies used in JAVA");
			System.out.println("\ti) Default size and Default value of the Primitive Datatypes");
			System.out.println("\tj) Operators and Types of Operators");
			System.out.println("\tk) Steps for achieving Dynamic Reading");
			System.out.println("\tl) Different Statements in JAVA");
			System.out.println("\tm) Control Flow Statements and its Types & Syntaxes");
			System.out.println("\tn) Programs using Conditional Statements");
			System.out.println("\to) Arrays and the way of array creation");
			System.out.println("\tp) Programs using Arrays");
			System.out.println("\tq) Pattern Programs");
			System.out.println("\tr) Mini Projects");
			System.out.println("\ts) Exit");
			topic = sc.next().charAt(0);
			System.out.println();

			if (topic != 'a' && topic != 'A' && topic != 'b' && topic != 'B' && topic != 'c' && topic != 'C' && topic != 'd' && topic != 'D' && topic != 'e' && topic != 'E' && topic != 'f' && topic != 'F' && topic != 'g' && topic != 'G' && topic != 'h' && topic != 'H' && topic != 'i' && topic != 'I' && topic != 'j' && topic != 'J' && topic != 'k' && topic != 'K' && topic != 'l' && topic != 'L' && topic != 'm' && topic != 'M' && topic != 'n' && topic != 'N' && topic != 'o' && topic != 'O' && topic != 'p' && topic != 'P' && topic != 'q' && topic != 'Q' && topic != 'r' && topic != 'R' && topic != 's' && topic != 'S')
			{
				System.out.println("\t\t\tYour Entered Topic is not matching with any of the Content in the Syllabus.");
				break;
			}

		}
			break;
		}
			

			else
			{
				if (count == 2)
				{
					System.out.println("\nUnavailable because of too many failed attempts. Try again in a few hours\n");
					break;
				}
				else
				{
					count++;
					System.out.println();
					System.out.print("Enter the Correct Passcode if you want to login and access further: ");
					passcode = sc.nextLine();
				}
			}
		}
	}	
}


class A
{
	static Scanner sc = new Scanner (System.in);
	public static void cfs()
	{

		System.out.println("Enter the type of Control Flow Statements from the below listed");
		System.out.println("1) Decision Making Statements");
		System.out.println("2) Looping Statements");
		System.out.println("3) Exit");
		System.out.println();
		int ch = sc.nextInt();
		System.out.println();

		if (ch == 1 || ch == 2 || ch == 3)
		{
		while (ch >= 1 && ch <= 3)
		{
		switch (ch)
		{
		case 1 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Decision Making Statements:\n\t* We use decision making statements to decide whether the instruction need to be executed or ignored.");
				System.out.println("\t* We are having following Decision making statements.");
				System.out.println("\t\t(i) if statement\n\t\t(ii) if-else statement\n\t\t(iii) else-if-ladder statement\n\t\t(iv) switch statement");
				System.out.println();
				System.out.println("Enter the type of Decision Making Statement that you need to learn");
				System.out.println("1) if statement");
				System.out.println("2) if-else statement");
				System.out.println("3) else-if-ladder statement");
				System.out.println("4) switch statement");
				System.out.println("5) Exit");
				System.out.println();
				int choice2 = sc.nextInt();
				System.out.println();
				if (choice2 == 1 || choice2 == 2 || choice2 == 3 || choice2 == 4 || choice2 == 5)
				{
					while (choice2 >= 1 && choice2 <= 5)
					{
					switch (choice2)
					{
					case 1 :
						{
							System.out.println("If Statement:\n\nSyntax:\n\tif(boolean)\n\t{\n\t\t[Stmnts]\n\t\t[Stmnts]\n\t\t.\n\t\t.\n\t\t.\n\t};");
							System.out.println();
							System.out.println("Enter the type of Decision Making Statement that you need to learn");
							System.out.println("1) if statement");
							System.out.println("2) if-else statement");
							System.out.println("3) else-if-ladder statement");
							System.out.println("4) switch statement");
							System.out.println("5) Exit");
							System.out.println();
							choice2 = sc.nextInt();
							System.out.println();
							break;
						}
					case 2 :
						{
							System.out.println("If-Else Statement:\n\nSyntax:\n\tif(boolean)\n\t{\n\t\t[Stmnts]\n\t\t[Stmnts]\n\t\t.\n\t\t.\n\t\t.\n\t}\n\telse\n\t{\n\t\t[Stmnts]\n\t\t[Stmnts]\n\t\t.\n\t\t.\n\t\t.\n\t};");
							System.out.println();
							System.out.println("Enter the type of Decision Making Statement that you need to learn");
							System.out.println("1) if statement");
							System.out.println("2) if-else statement");
							System.out.println("3) else-if-ladder statement");
							System.out.println("4) switch statement");
							System.out.println("5) Exit");
							System.out.println();
							choice2 = sc.nextInt();
							System.out.println();
							break;
						}
					case 3 :
						{
							System.out.println("Else If Ladder Statement:\n\nSyntax:\n\tif(boolean)\n\t{\n\t\t[Stmnts]\n\t\t[Stmnts]\n\t\t.\n\t\t.\n\t\t.\n\t}\n\telse if(boolean)\n\t{\n\t\t[Stmnts]\n\t\t[Stmnts]\n\t\t.\n\t\t.\n\t\t.\n\t}\n\t[else\n\t{\n\t\t[Stmnts]\n\t\t[Stmnts]\n\t\t.\n\t\t.\n\t\t.\n\t}];");
							System.out.println();
							System.out.println("Enter the type of Decision Making Statement that you need to learn");
							System.out.println("1) if statement");
							System.out.println("2) if-else statement");
							System.out.println("3) else-if-ladder statement");
							System.out.println("4) switch statement");
							System.out.println("5) Exit");
							System.out.println();
							choice2 = sc.nextInt();
							System.out.println();
							break;
						}
					case 4 :
						{
							System.out.println("Switch Statement:\n\t* We use Switch statement for matching the switch data in a case.\n\nSyntax:\n\tswitch(value/variable/expression)\n\t{\n\t\tcase value/expression:\n\t\t\t[Stmnts]\n\t\t\t[Stmnts]\n\t\t\t.\n\t\t\t.\n\t\t\t[break;]\n\t\t}\n\t\tcase value/expression:\n\t\t\t[Stmnts]\n\t\t\t[Stmnts]\n\t\t\t.\n\t\t\t.\n\t\t\t[break;]\n\t\t}\n\t\tdefault:\n\t\t\t[Stmnt]\n\t\t\t[break;]\n\t\t}\n\t};");
							System.out.println("\n\t* We cannot pass variable in a case.");
							System.out.println();
							System.out.println("Enter the type of Decision Making Statement that you need to learn");
							System.out.println("1) if statement");
							System.out.println("2) if-else statement");
							System.out.println("3) else-if-ladder statement");
							System.out.println("4) switch statement");
							System.out.println("5) Exit");
							System.out.println();
							choice2 = sc.nextInt();
							System.out.println();
							break;
						}
					}

					if (choice2 == 5)
					{
						break;
					}
					}
				}
				System.out.println("***************************************************************************************************************************************");
				System.out.println();
				System.out.println("Enter the type of Control Flow Statements that you need to visit");
				System.out.println("1) Decision Making Statements");
				System.out.println("2) Looping Statements");
				System.out.println("3) Exit");
				System.out.println();
				ch = sc.nextInt();
				System.out.println();
				break;
			}

			case 2 :
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("Looping Statements:\n\t* We use looping statement to repeat same set of instruction repeatedly or again and again.");
				System.out.println("\t* The process of repeating is called Iteration.\n\t* We are having 4 types of looping statements as below");
				System.out.println("\t\t(i) while loop\n\t\t(ii) do-while loop\n\t\t(iii) for loop\n\t\t(iv) for-each loop/ Advance for-loop");
				System.out.println();
				System.out.println("Enter the type of Looping Statement that you need to learn");
				System.out.println("1) while loop");
				System.out.println("2) do while loop");
				System.out.println("3) for loop");
				System.out.println("4) Exit");
				System.out.println();
				int choice2 = sc.nextInt();
				System.out.println();
				if (choice2 == 1 || choice2 == 2 || choice2 == 3 || choice2 == 4)
				{
					while (choice2 >= 1 && choice2 <= 4)
					{
					switch (choice2)
					{
					case 1 :
						{
							System.out.println("While loop:\n\nSyntax:\n\twhile(boolean)\n\t{\n\t\t[Stmnts]\n\t\t[Stmnts]\n\t\t.\n\t\t.\n\t\t.\n\t};");
							System.out.println();
							System.out.println("Enter the type of Decision Making Statement that you need to learn");
							System.out.println("1) while loop");
							System.out.println("2) do while loop");
							System.out.println("3) for loop");
							System.out.println("4) Exit");
							System.out.println();
							choice2 = sc.nextInt();
							System.out.println();
							break;
						}
					case 2 :
						{
							System.out.println("Do-While loop:\n\nSyntax:\n\tdo\n\t{\n\t\t[Stmnts]\n\t\t[Stmnts]\n\t\t.\n\t\t.\n\t\t.\n\t} while(condition);");
							System.out.println();
							System.out.println("Enter the type of Decision Making Statement that you need to learn");
							System.out.println("1) while loop");
							System.out.println("2) do while loop");
							System.out.println("3) for loop");
							System.out.println("4) Exit");
							System.out.println();
							choice2 = sc.nextInt();
							System.out.println();
							break;
						}
					case 3 :
						{
							System.out.println("For loop:\n\nSyntax:\n\tfor ([Initialization];[Condition];[Updation])\n\t{\n\t\t[Stmnts]\n\t\t[Stmnts]\n\t\t.\n\t\t.\n\t\t.\n\t};");
							System.out.println();
							System.out.println("Enter the type of Decision Making Statement that you need to learn");
							System.out.println("1) while loop");
							System.out.println("2) do while loop");
							System.out.println("3) for loop");
							System.out.println("4) Exit");
							System.out.println();
							choice2 = sc.nextInt();
							System.out.println();
							break;
						}
					}

					if (choice2 == 4)
					{
						break;
					}
					}
					System.out.println("***************************************************************************************************************************************");
					System.out.println();
				}
				else 
				System.out.println("\t\t\tYour Entered Choice is not matching with any of the Topic's.");
				System.out.println();
				System.out.println("Enter the type of Control Flow Statements that you need to visit");
				System.out.println("1) Decision Making Statements");
				System.out.println("2) Looping Statements");
				System.out.println("3) Exit");
				System.out.println();
				ch = sc.nextInt();
				System.out.println();
				break;
			}
		}
		if (ch == 3)
		{
			System.out.println("\t\t\tThanks for visiting Control Flow Statements");
			break;
		}
		}
		}

		else 
			System.out.println("\t\t\tYour Entered Choice is not matching with any of the Topic's.");
	}


	public static void array(boolean a)
	{
		System.out.println("***************************************************************************************************************************************");
		System.out.println("\t\t\tWelcome to learn about Arrays.");
		System.out.println("\nArrays:\n\tArray is a linear organized data structure which is used to store homogeneous elements\n\t\t\t(or)\n\tArray is a continuous (or) contigeous memory block which is used to store homogeneous elements.");
		System.out.println("\nCharacteristics of Arrays:\n\t* It is a homogeneous collection of elements.\n\t* It contains Index.\n\t* It is fixed size (once array is created, we can't increase/ decrease the size of array.\n\t* We can print the length of the array using the variable length.");
		System.out.println("\n\nSingle Dimensional Array:\n\nDynamic way of Array creation:\n\n-->Syntax for Declaration of Array:\n\tdatatype []variable;\n\t\t(or)\n\tdatatype variable[];");
		System.out.println("\n-->Syntax for Declaration & Initialization of Array:\n\tdatatype []variable = new datatype [integer size];");
		System.out.println("\n-->Syntax for Initialization of Array:\n\tdatatype []variable\n\n\tvariable = new datatype [integer size];");
		System.out.println("\nStatic way of Array creation:\n\tFor the static way of array creation, we cannot declare and initialize in a separate lines.\n\n-->Syntax:\n\tdatatype []variable = {v1,v2,v3,...};");
		System.out.println("\n\nMulti Dimensional Array:\n\t* One Array containing another array is called as Multi-Dimensional Array.\n\t* Multi Dimensional Arrays represent matrix.\n\t* We can create Multi Dimensional arrays in Two ways, Dynamic way and Static way.\n\nDynamic way of Multi-Dimensional Array creation:\n\n-->Syntax for Declaration of Multi Dimensional Array:\n\tdatatype variable[][];");
		System.out.println("\n-->Syntax for Declaration & Initialization of Multi Dimensional Array:\n\tdatatype [][]variable = new datatype [Row size][[Column Size]];");
		System.out.println("\n-->Syntax for Initialization of Multi Dimensional Array:\n\tdatatype [][]variable\n\n\tvariable = new datatype [Row size][[Column Size]];");
		System.out.println("\nStatic way of Multi Dimensional Array creation:\n\tFor the static way of Multi Dimensional Array Creation, we cannot declare and initialize in a separate lines.\n\n-->Syntax:\n\tdatatype [][]variable = {{v1,v2,v3,...},{v1,v2,v3,...}};");
		System.out.println();
		System.out.println("***************************************************************************************************************************************");
	}
}

class B
{
	public static void dyn() //Steps for achieving Dynamic Reading in JAVA
	{
		System.out.println("***************************************************************************************************************************************");
		System.out.println("Dynamic Reading:\n\t* Taking the input from the user at the Run-time is called as Dynamic Reading.\n\t* We can achieve \"dynamic reading\" with the help of a \"built-in class\" called as \"scanner class\"");
		System.out.println("\n\tSteps for achieving Dynamic Reading:-");
		System.out.println("\nStep 1: We have to import Scanner class from java library\n\timport java.util.Scanner;\n\timport java.*;\n\tuse this import statement as the first instruction of the source file.");
		System.out.println("\nStep 2: Create static Scanner object in Global Area\n\t\"static Scanner variable_name = new Scanner (System.in);\"");
		System.out.println("\nStep 3: Display the message.");
		System.out.println("\nStep 4: Read the data using Scanner class Method\n\t(i) int a = ref.nextInt(); --> to read Integer\n\t(ii) double b = ref.nextDouble(); --> To read Decimal\n\t(iii) char c = ref.next().charAt(0); --> To read Character");
		System.out.println("***************************************************************************************************************************************");
		System.out.println();
	}
}

class C
{
	static Scanner sc = new Scanner (System.in);
	public static void mdapg ()
	{
			System.out.println("Enter the Programs you need to learn");
			System.out.println("1. Program for taking the array input from the user and printing the output");
			System.out.println("2. Program for performing the addition of two arrays");
			System.out.println("3. Program for Merging of Given 4 Arrays");
			System.out.println("4. Program for making the Array in Descending order using Bubble Sort Algorithm");
			System.out.println("5. Program for printing the Zig-Zag Multidimensional Array");
			System.out.println("6. Exit");
			int choice2 = sc.nextInt();
			System.out.println();
			while (choice2 == 1 || choice2 == 2 || choice2 == 3 || choice2 == 4 || choice2 == 5)
			{
			if (choice2 == 1)
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("1. Program for taking the array input from the user and printing the output");
				System.out.println();
				System.out.println("Enter the size of an array : ");
				int size = sc.nextInt();
				int a[] = new int[size];

				for (int i=0;i<size ;i++ )
				{
					System.out.println("Enter the value for a["+i+"] : ");
					a[i] = sc.nextInt();
				}
					

				System.out.println("\nOUTPUT : ");
				for (int j=0 ;j<size ;j++)
				{
					System.out.println(a[j]);
				}
				System.out.println("***************************************************************************************************************************************");
				System.out.println();

				System.out.println("Enter the Programs you need to visit");
				System.out.println("1. Program for taking the array input from the user and printing the output");
				System.out.println("2. Program for performing the addition of two arrays");
				System.out.println("3. Program for Merging of Given 4 Arrays");
				System.out.println("4. Program for making the Array in Descending order using Bubble Sort Algorithm");
				System.out.println("5. Program for printing the Zig-Zag Multidimensional Array");
				System.out.println("6. Exit");
				choice2 = sc.nextInt();
				System.out.println();

			}

			if (choice2 == 2)
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("2. Program for performing the addition of two arrays");
				System.out.println();
				int a[] = {1,2,3,4};
				int b[] = {1,2,3,4};
				int c[] = new int[a.length];

				System.out.println(Arrays.toString(a));
				System.out.println("+");
				System.out.println(Arrays.toString(b));
				System.out.println("=");


				for (int i=0;i<c.length;i++)
				{
					c[i] = a[i]+b[i];
				}

				System.out.println(Arrays.toString(c));
				System.out.println("***************************************************************************************************************************************");
				System.out.println();

				System.out.println("Enter the Programs you need to visit");
				System.out.println("1. Program for taking the array input from the user and printing the output");
				System.out.println("2. Program for performing the addition of two arrays");
				System.out.println("3. Program for Merging of Given 4 Arrays");
				System.out.println("4. Program for making the Array in Descending order using Bubble Sort Algorithm");
				System.out.println("5. Program for printing the Zig-Zag Multidimensional Array");
				System.out.println("6. Exit");
				choice2 = sc.nextInt();
				System.out.println();

			}

			if (choice2 == 3)
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("3. Program for Merging of Given 4 Arrays");
				System.out.println();
				int a[] = {1,2,3,4};
				int b[] = {4,5};
				int c[] = {6,7,8};
				int d[] = {8,9,10,11,12};

				int e[] = new int[a.length+b.length+c.length+d.length];
				int m = 0,n=0,p=0,q=0;

				for (int i=0;i<e.length;i++)
				{
					if (m<a.length)
					{
						e[i] = a[m];
						m++;
					}

					else if (m==a.length && n<b.length)
					{
						e[i] = b[n];
						n++;
					}

					else if (n==b.length && p<c.length)
					{
						e[i] = c[p];
						p++;
					}

					else 
					{
						e[i] = d[q];
						q++;
					}
					
				}

				System.out.println(Arrays.toString(e));
				System.out.println("***************************************************************************************************************************************");
				System.out.println();

				System.out.println("Enter the Programs you need to visit");
				System.out.println("1. Program for taking the array input from the user and printing the output");
				System.out.println("2. Program for performing the addition of two arrays");
				System.out.println("3. Program for Merging of Given 4 Arrays");
				System.out.println("4. Program for making the Array in Descending order using Bubble Sort Algorithm");
				System.out.println("5. Program for printing the Zig-Zag Multidimensional Array");
				System.out.println("6. Exit");
				choice2 = sc.nextInt();
				System.out.println();

			}

			if (choice2 == 4)
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("4. Program for making the Array in Descending order using Bubble Sort Algorithm");
				System.out.println();
				
				int a[] = new int[5];
				int m =0;
				

				for (int i=0; i<a.length; i++)
				{
					System.out.println("Enter the value of a["+i+"]");
					a[i] = sc.nextInt();
				}
				System.out.println(Arrays.toString(a));

				for (int i=(a.length-1); i>=1; i-- )
				{
					for (int j=(a.length-1); j>=1; j--)
					{
						if (a[j] > a[j-1])
						{
							m = a[j];
							a[j] = a[j-1];
							a[j-1] = m;
						}
					}
				}

				System.out.println(Arrays.toString(a));
				System.out.println("***************************************************************************************************************************************");
				System.out.println();

				System.out.println("Enter the Programs you need to visit");
				System.out.println("1. Program for taking the array input from the user and printing the output");
				System.out.println("2. Program for performing the addition of two arrays");
				System.out.println("3. Program for Merging of Given 4 Arrays");
				System.out.println("4. Program for making the Array in Descending order using Bubble Sort Algorithm");
				System.out.println("5. Program for printing the Zig-Zag Multidimensional Array");
				System.out.println("6. Exit");
				choice2 = sc.nextInt();
				System.out.println();

			}

			if (choice2 == 5)
			{
				System.out.println("***************************************************************************************************************************************");
				System.out.println("5. Program for printing the Zig-Zag Multidimensional Array");
				System.out.println();
				
				int a[][] = new int[4][3];

				for (int i=0;i<a.length;i++)
				{
					for (int j=0;j<a[i].length;j++)
					{
						System.out.println("Enter the value of a["+i+"]["+j+"] :");
						a[i][j] = sc.nextInt();
					}
				}

				System.out.println();
				
				for (int i=0;i<a.length;i++)
				{
					for (int j=0;j<a[i].length;j++)
					{
						System.out.print(a[i][j]+" ");
					}
					System.out.println();
				}

				System.out.println();

				for (int i=a.length-1;i>=0;i--)
				{
					if (i%2!=0)
					{
						for (int j=a[i].length-1;j>=0;j--)
						{
							System.out.print(a[i][j]+" ");
						}
					}

					else
					{
						for (int j=0;j<a[i].length;j++)
						{
							System.out.print(a[i][j]+" ");
						}
					}
					

					System.out.println();
				}
				System.out.println("***************************************************************************************************************************************");
				System.out.println();

				System.out.println("Enter the Programs you need to visit");
				System.out.println("1. Program for taking the array input from the user and printing the output");
				System.out.println("2. Program for performing the addition of two arrays");
				System.out.println("3. Program for Merging of Given 4 Arrays");
				System.out.println("4. Program for making the Array in Descending order using Bubble Sort Algorithm");
				System.out.println("5. Program for printing the Zig-Zag Multidimensional Array");
				System.out.println("6. Exit");
				choice2 = sc.nextInt();
				System.out.println();

			}

			if (choice2 == 6)
			{
				System.out.println("\t\t\tTHANKS FOR VISITING PROGRAMS USING ARRAYS");
				break;
			}
			}
	}
}

class P1 
{
	public static void main(String[] args) 
	{
		int n=7;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if(i>=j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}


class P2 
{
	public static void main(String[] args) 
	{
		int n=7;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if(i<=j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}


class P3 
{
	public static void main(String[] args) 
	{
		int n=7;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if(i+j>=n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}



class P4 
{
	public static void main(String[] args) 
	{
		int n=7;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if(i+j<=n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}


class P5 
{
	public static void main(String[] args) 
	{
		int n=7;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if(i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}


class P6 
{
	public static void main(String[] args) 
	{
		int n=7;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if(i+j==n-1||i==0||j==0||j==n-1||i==n-1||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

class P7
{
	public static void main(String[] args) 
	{
		int n=7;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if(i>=j && i+j>=n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

class P8
{
	public static void main(String[] args) 
	{
		int n=7;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if(i+j>=n-1 &&i<=j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

class P9
{
	public static void main(String[] args) 
	{
		int n=7;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if(i>=j && i+j<=n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

class P10
{
	public static void main(String[] args) 
	{
		int n=7;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if(i<=j && i+j<=n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

class P11
{
	public static void main(String[] args) 
	{
		int n=7;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if(i<=j && i+j<=n-1 || i>=j && i+j>=n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}


class P12
{
	public static void main(String[] args) 
	{
		int n=7;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if(i<=j && i+j<=n-1 || i>=j && i+j>=n-1)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}

class P13
{
	public static void main(String[] args) 
	{
		int n=7;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if(i+j>=n-1-n/2  && i+j<=n-1+n/2 && i<=j+n/2 && i>=j-n/2 )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

class P14
{
	public static void main(String[] args) 
	{
		int n=7;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if(i+j<=n-1-n/2  || i+j>=n-1+n/2 || i>=j+n/2 || i<=j-n/2 )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

class P15
{
	public static void main(String[] args) throws Exception
	{
		int n=7;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				Thread.sleep(50);
				if(i==0 ||j==n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for (int j=0;j<n ;j++ )
			{
				Thread.sleep(50);
				if(j==0||i==0||j==n-1||i==n/2 )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for (int j=0;j<n ;j++ )
			{
				Thread.sleep(50);
				if(j==0 ||i==0||i+j==n-1 && i<=n/2||i==j && i>=n/2||i==n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");

			for (int j=0;j<n ;j++ )
			{
				Thread.sleep(50);
				if(j==0 ||i==0||i+j==n-1 &&i<=n/2 ||i==j && i>=n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for (int j=0;j<n ;j++ )
			{
				Thread.sleep(50);
				if(i==0||j==0||i==n/2||i==n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for (int j=0;j<n ;j++ )
			{
				Thread.sleep(50);
				if(i==0 ||i+j==n-1||i==n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}	
