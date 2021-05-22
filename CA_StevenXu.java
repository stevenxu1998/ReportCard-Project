/*Name: Steven Xu
Date: June 4th 2016
Assignment: Culminating
*/
import java.io.*; // import the file
class CA_StevenXu
{
    public static void main (String[] args)
    {
	char ans;
	String name;
	System.out.println ("Please enter the name of the student"); // get the name of the student
	name = In.getString (); //user input
	do
	{
	    System.out.println ("The student is taking ENG4U1, SCH4U1, SPH4U1, MCV4U1, MHF4U1, and FSF4U1"); // ask the user which course he/she wants to input the marks on
	    System.out.println ("Press E for ENG4U1");
	    System.out.println ("Press C for SCH4U1");
	    System.out.println ("Press P for SPH4U1");
	    System.out.println ("Press B for MCV4U1");
	    System.out.println ("Press A for MHF4U1");
	    System.out.println ("Press F for FSF4U1");
	    ans = In.getChar ();
	    if (ans == 'e' || ans == 'E') // if statement for ans
	    {
		english (ans, name);
	    }
	    if (ans == 'c' || ans == 'C')
	    {
		chem (ans, name);
	    }
	    if (ans == 'p' || ans == 'P')
	    {
		physics (ans, name);
	    }
	    if (ans == 'b' || ans == 'B')
	    {
		calc (ans, name);
	    }
	    if (ans == 'a' || ans == 'A')
	    {
		adv (ans, name);
	    }
	    if (ans == 'f' || ans == 'F')
	    {
		french (ans, name);
	    }
	    else
	    {
		System.out.println ("Invalid input");
	    }
	}
	while (ans != 'e' || ans != 'c' || ans != 'p' || ans != 'b' || ans != 'a' || ans != 'f' || ans != 'E' || ans != 'C' || ans != 'P' || ans != 'B' || ans != 'A' || ans != 'F');


    }


    public static void english (char a, String b)  // subject of english
    {
	InputStreamReader isr = new InputStreamReader (System.in); //used for writing files
	BufferedReader br = new BufferedReader (isr);
	double mark, mark2, mark3, mark4, exam;
	double finalmark = 0, fmark = 0;
	String hi;
	final double weight = 10; //set all the weight factors
	final double weight2 = 20;
	final double weight3 = 15;
	final double weight4 = 25;
	final double weight5 = 30;
	char ans;
	hi = b;
	try
	{
	    File sampleFile = new File ("ENG4U1_" + hi + ".txt"); //creating the file
	    FileWriter filewriter = new FileWriter (sampleFile);
	    BufferedWriter output = new BufferedWriter (filewriter);
	    do
	    {
		System.out.println ("Please enter the mark on test 1"); //asking the user
		mark = In.getDouble (); //user input for the mark on test 1
		if (mark < 0 || mark > 100) //bullet proof if the mark is not valid
		{
		    System.out.println ("Invalid Input"); //let the user know
		}
	    }
	    while (mark < 0 || mark > 100); // do while loop to repeat if invalid input is used
	    do
	    {
		System.out.println ("Please enter the mark on test 2"); //asking user
		mark2 = In.getDouble (); //user input for the mark on test2
		if (mark2 < 0 || mark2 > 100) //bullet proof if the mark is not valid
		{
		    System.out.println ("Invalid Input"); //let the user know
		}
	    }
	    while (mark2 < 0 || mark2 > 100); //do while loop to repeat if invalid input is used
	    do
	    {
		System.out.println ("Please enter the mark on test 3"); //asking the user
		mark3 = In.getDouble (); //user input
		if (mark3 < 0 || mark3 > 100) //bullet proof if the mark is invalid
		{
		    System.out.println ("Invalid Input"); //let the user know
		}
	    }
	    while (mark3 < 0 || mark3 > 100); //do while loop to repeat if invalid input is used
	    do
	    {
		System.out.println ("Please enter the mark on test 4"); //asking the user
		mark4 = In.getDouble (); //user input
		if (mark4 < 0 || mark4 > 100) //bullet proof for invalid inputs
		{
		    System.out.println ("Invalid Input"); // let the user know
		}
	    }
	    while (mark4 < 0 || mark4 > 100); //do while loop to repeat if invalid input is used
	    do
	    {
		System.out.println ("Please enter the mark on the exam"); //user input for the exam
		exam = In.getDouble (); //user input
		if (exam < 0 || exam > 100) //bullet proof if an invalid mark is entered
		{
		    System.out.println ("Invalid Input"); //let the user know
		}
	    }
	    while (exam < 0 || exam > 100); //calculating the final mark using the constant variables
	    fmark = ((weight * (mark / 100)) + (weight2 * (mark2 / 100)) + (weight3 * (mark3 / 100)) + (weight4 * (mark4 / 100)) + (weight5 * (exam / 100)));
	    finalmark = (double) Math.round (fmark * 100.0) / 100.0; //rounding the final mark to one decimal place
	    output.write ("Test1 " + String.valueOf (mark)); //writing the test marks on the file
	    output.newLine ();
	    output.write ("Test2 " + String.valueOf (mark2));
	    output.newLine ();
	    output.write ("Test3 " + String.valueOf (mark3));
	    output.newLine ();
	    output.write ("Test4 " + String.valueOf (mark4));
	    output.newLine ();
	    output.write ("Exam " + String.valueOf (exam)); //writing the exam mark on the file
	    output.newLine ();
	    output.write ("Finalmark " + String.valueOf (finalmark)); //writing the final mark on the file
	    output.close (); //close the whole file
	}
	catch (IOException error)
	{
	    error.printStackTrace ();
	}
	System.out.println ("Your file has been written"); //let the user know
	System.out.println ("Your final mark is " + finalmark); //outputing the final mark
    }


    ////////////////////////////////////rest of the comments on english method is the same for the rest of the methods



    public static void chem (char a, String b)  //subject of chemistry
    {
	InputStreamReader isr = new InputStreamReader (System.in);
	BufferedReader br = new BufferedReader (isr);
	double mark, mark2, mark3, mark4, exam;
	double finalmark = 0, fmark = 0;
	String hi;
	final double weight = 10;
	final double weight2 = 20;
	final double weight3 = 15;
	final double weight4 = 25;
	final double weight5 = 30;
	hi = b;
	try
	{
	    File sampleFile = new File ("SCH4U1_" + hi + ".txt");
	    FileWriter filewriter = new FileWriter (sampleFile);
	    BufferedWriter output = new BufferedWriter (filewriter);
	    do
	    {
		System.out.println ("Please enter the mark on test 1");
		mark = In.getDouble ();
		if (mark < 0 || mark > 100)
		{
		    System.out.println ("Invalid Input");
		}
	    }
	    while (mark < 0 || mark > 100);
	    do
	    {
		System.out.println ("Please enter the mark on test 2");
		mark2 = In.getDouble ();
		if (mark2 < 0 || mark2 > 100)
		{
		    System.out.println ("Invalid Input");
		}
	    }
	    while (mark2 < 0 || mark2 > 100);
	    do
	    {
		System.out.println ("Please enter the mark on test 3");
		mark3 = In.getDouble ();
		if (mark3 < 0 || mark3 > 100)
		{
		    System.out.println ("Invalid Input");
		}
	    }
	    while (mark3 < 0 || mark3 > 100);
	    do
	    {
		System.out.println ("Please enter the mark on test 4");
		mark4 = In.getDouble ();
		if (mark4 < 0 || mark4 > 100)
		{
		    System.out.println ("Invalid Input");
		}
	    }
	    while (mark4 < 0 || mark4 > 100);
	    do
	    {
		System.out.println ("Please enter the mark on the exam");
		exam = In.getDouble ();
		if (exam < 0 || exam > 100)
		{
		    System.out.println ("Invalid Input");
		}
	    }
	    while (exam < 0 || exam > 100);
	    fmark = ((weight * (mark / 100)) + (weight2 * (mark2 / 100)) + (weight3 * (mark3 / 100)) + (weight4 * (mark4 / 100)) + (weight5 * (exam / 100)));
	    finalmark = (double) Math.round (fmark * 100.0) / 100.0;
	    output.write ("Test1 " + String.valueOf (mark));
	    output.newLine ();
	    output.write ("Test2 " + String.valueOf (mark2));
	    output.newLine ();
	    output.write ("Test3 " + String.valueOf (mark3));
	    output.newLine ();
	    output.write ("Test4 " + String.valueOf (mark4));
	    output.newLine ();
	    output.write ("Exam " + String.valueOf (exam));
	    output.newLine ();
	    output.write ("Finalmark " + String.valueOf (finalmark));
	    output.close ();
	}
	catch (IOException error)
	{
	    error.printStackTrace ();
	}
	System.out.println ("Your file has been written");
	System.out.println ("Your final mark is " + finalmark);
    }


    public static void physics (char a, String b)  // subject of physics
    {
	InputStreamReader isr = new InputStreamReader (System.in);
	BufferedReader br = new BufferedReader (isr);
	double mark, mark2, mark3, mark4, exam;
	double finalmark = 0, fmark = 0;
	String hi;
	final double weight = 10;
	final double weight2 = 20;
	final double weight3 = 15;
	final double weight4 = 25;
	final double weight5 = 30;
	hi = b;
	try
	{
	    File sampleFile = new File ("SPH4U1_" + hi + ".txt");
	    FileWriter filewriter = new FileWriter (sampleFile);
	    BufferedWriter output = new BufferedWriter (filewriter);
	    do
	    {
		System.out.println ("Please enter the mark on test 1");
		mark = In.getDouble ();
		if (mark < 0 || mark > 100)
		{
		    System.out.println ("Invalid Input");
		}
	    }
	    while (mark < 0 || mark > 100);
	    do
	    {
		System.out.println ("Please enter the mark on test 2");
		mark2 = In.getDouble ();
		if (mark2 < 0 || mark2 > 100)
		{
		    System.out.println ("Invalid Input");
		}
	    }
	    while (mark2 < 0 || mark2 > 100);
	    do
	    {
		System.out.println ("Please enter the mark on test 3");
		mark3 = In.getDouble ();
		if (mark3 < 0 || mark3 > 100)
		{
		    System.out.println ("Invalid Input");
		}
	    }
	    while (mark3 < 0 || mark3 > 100);
	    do
	    {
		System.out.println ("Please enter the mark on test 4");
		mark4 = In.getDouble ();
		if (mark4 < 0 || mark4 > 100)
		{
		    System.out.println ("Invalid Input");
		}
	    }
	    while (mark4 < 0 || mark4 > 100);
	    do
	    {
		System.out.println ("Please enter the mark on the exam");
		exam = In.getDouble ();
		if (exam < 0 || exam > 100)
		{
		    System.out.println ("Invalid Input");
		}
	    }
	    while (exam < 0 || exam > 100);
	    fmark = ((weight * (mark / 100)) + (weight2 * (mark2 / 100)) + (weight3 * (mark3 / 100)) + (weight4 * (mark4 / 100)) + (weight5 * (exam / 100)));
	    finalmark = (double) Math.round (fmark * 100.0) / 100.0;
	    output.write ("Test1 " + String.valueOf (mark));
	    output.newLine ();
	    output.write ("Test2 " + String.valueOf (mark2));
	    output.newLine ();
	    output.write ("Test3 " + String.valueOf (mark3));
	    output.newLine ();
	    output.write ("Test4 " + String.valueOf (mark4));
	    output.newLine ();
	    output.write ("Exam " + String.valueOf (exam));
	    output.newLine ();
	    output.write ("Finalmark " + String.valueOf (finalmark));
	    output.close ();
	}
	catch (IOException error)
	{
	    error.printStackTrace ();
	}
	System.out.println ("Your file has been written");
	System.out.println ("Your final mark is " + finalmark);
    }


    public static void calc (char a, String b)  // subject of calculus
    {
	InputStreamReader isr = new InputStreamReader (System.in);
	BufferedReader br = new BufferedReader (isr);
	double mark, mark2, mark3, mark4, exam;
	double finalmark = 0, fmark = 0;
	String hi;
	final double weight = 10;
	final double weight2 = 20;
	final double weight3 = 15;
	final double weight4 = 25;
	final double weight5 = 30;
	hi = b;
	try
	{
	    File sampleFile = new File ("MCV4U1_" + hi + ".txt");
	    FileWriter filewriter = new FileWriter (sampleFile);
	    BufferedWriter output = new BufferedWriter (filewriter);
	    do
	    {
		System.out.println ("Please enter the mark on test 1");
		mark = In.getDouble ();
		if (mark < 0 || mark > 100)
		{
		    System.out.println ("Invalid Input");
		}
	    }
	    while (mark < 0 || mark > 100);
	    do
	    {
		System.out.println ("Please enter the mark on test 2");
		mark2 = In.getDouble ();
		if (mark2 < 0 || mark2 > 100)
		{
		    System.out.println ("Invalid Input");
		}
	    }
	    while (mark2 < 0 || mark2 > 100);
	    do
	    {
		System.out.println ("Please enter the mark on test 3");
		mark3 = In.getDouble ();
		if (mark3 < 0 || mark3 > 100)
		{
		    System.out.println ("Invalid Input");
		}
	    }
	    while (mark3 < 0 || mark3 > 100);
	    do
	    {
		System.out.println ("Please enter the mark on test 4");
		mark4 = In.getDouble ();
		if (mark4 < 0 || mark4 > 100)
		{
		    System.out.println ("Invalid Input");
		}
	    }
	    while (mark4 < 0 || mark4 > 100);
	    do
	    {
		System.out.println ("Please enter the mark on the exam");
		exam = In.getDouble ();
		if (exam < 0 || exam > 100)
		{
		    System.out.println ("Invalid Input");
		}
	    }
	    while (exam < 0 || exam > 100);
	    fmark = ((weight * (mark / 100)) + (weight2 * (mark2 / 100)) + (weight3 * (mark3 / 100)) + (weight4 * (mark4 / 100)) + (weight5 * (exam / 100)));
	    finalmark = (double) Math.round (fmark * 100.0) / 100.0;
	    output.write ("Test1 " + String.valueOf (mark));
	    output.newLine ();
	    output.write ("Test2 " + String.valueOf (mark2));
	    output.newLine ();
	    output.write ("Test3 " + String.valueOf (mark3));
	    output.newLine ();
	    output.write ("Test4 " + String.valueOf (mark4));
	    output.newLine ();
	    output.write ("Exam " + String.valueOf (exam));
	    output.newLine ();
	    output.write ("Finalmark " + String.valueOf (finalmark));
	    output.close ();
	}
	catch (IOException error)
	{
	    error.printStackTrace ();
	}
	System.out.println ("Your file has been written");
	System.out.println ("Your final mark is " + finalmark);
    }


    public static void adv (char a, String b)  // subject of advanced functions
    {
	InputStreamReader isr = new InputStreamReader (System.in);
	BufferedReader br = new BufferedReader (isr);
	double mark, mark2, mark3, mark4, exam;
	double finalmark = 0, fmark = 0;
	String hi;
	final double weight = 10;
	final double weight2 = 20;
	final double weight3 = 15;
	final double weight4 = 25;
	final double weight5 = 30;
	hi = b;
	try
	{
	    File sampleFile = new File ("MHF4U1_" + hi + ".txt");
	    FileWriter filewriter = new FileWriter (sampleFile);
	    BufferedWriter output = new BufferedWriter (filewriter);
	    do
	    {
		System.out.println ("Please enter the mark on test 1");
		mark = In.getDouble ();
		if (mark < 0 || mark > 100)
		{
		    System.out.println ("Invalid Input");
		}
	    }
	    while (mark < 0 || mark > 100);
	    do
	    {
		System.out.println ("Please enter the mark on test 2");
		mark2 = In.getDouble ();
		if (mark2 < 0 || mark2 > 100)
		{
		    System.out.println ("Invalid Input");
		}
	    }
	    while (mark2 < 0 || mark2 > 100);
	    do
	    {
		System.out.println ("Please enter the mark on test 3");
		mark3 = In.getDouble ();
		if (mark3 < 0 || mark3 > 100)
		{
		    System.out.println ("Invalid Input");
		}
	    }
	    while (mark3 < 0 || mark3 > 100);
	    do
	    {
		System.out.println ("Please enter the mark on test 4");
		mark4 = In.getDouble ();
		if (mark4 < 0 || mark4 > 100)
		{
		    System.out.println ("Invalid Input");
		}
	    }
	    while (mark4 < 0 || mark4 > 100);
	    do
	    {
		System.out.println ("Please enter the mark on the exam");
		exam = In.getDouble ();
		if (exam < 0 || exam > 100)
		{
		    System.out.println ("Invalid Input");
		}
	    }
	    while (exam < 0 || exam > 100);
	    fmark = ((weight * (mark / 100)) + (weight2 * (mark2 / 100)) + (weight3 * (mark3 / 100)) + (weight4 * (mark4 / 100)) + (weight5 * (exam / 100)));
	    finalmark = (double) Math.round (fmark * 100.0) / 100.0;
	    output.write ("Test1 " + String.valueOf (mark));
	    output.newLine ();
	    output.write ("Test2 " + String.valueOf (mark2));
	    output.newLine ();
	    output.write ("Test3 " + String.valueOf (mark3));
	    output.newLine ();
	    output.write ("Test4 " + String.valueOf (mark4));
	    output.newLine ();
	    output.write ("Exam " + String.valueOf (exam));
	    output.newLine ();
	    output.write ("Finalmark " + String.valueOf (finalmark));
	    output.close ();
	}
	catch (IOException error)
	{
	    error.printStackTrace ();
	}
	System.out.println ("Your file has been written");
	System.out.println ("Your final mark is " + finalmark);
    }


    public static void french (char a, String b)  // subject of french
    {
	InputStreamReader isr = new InputStreamReader (System.in);
	BufferedReader br = new BufferedReader (isr);
	double mark, mark2, mark3, mark4, exam;
	double finalmark = 0, fmark = 0;
	String hi;
	final double weight = 10;
	final double weight2 = 20;
	final double weight3 = 15;
	final double weight4 = 25;
	final double weight5 = 30;
	hi = b;
	try
	{
	    File sampleFile = new File ("FSF4U1_" + hi + ".txt");
	    FileWriter filewriter = new FileWriter (sampleFile);
	    BufferedWriter output = new BufferedWriter (filewriter);
	    do
	    {
		System.out.println ("Please enter the mark on test 1");
		mark = In.getDouble ();
		if (mark < 0 || mark > 100)
		{
		    System.out.println ("Invalid Input");
		}
	    }
	    while (mark < 0 || mark > 100);
	    do
	    {
		System.out.println ("Please enter the mark on test 2");
		mark2 = In.getDouble ();
		if (mark2 < 0 || mark2 > 100)
		{
		    System.out.println ("Invalid Input");
		}
	    }
	    while (mark2 < 0 || mark2 > 100);
	    do
	    {
		System.out.println ("Please enter the mark on test 3");
		mark3 = In.getDouble ();
		if (mark3 < 0 || mark3 > 100)
		{
		    System.out.println ("Invalid Input");
		}
	    }
	    while (mark3 < 0 || mark3 > 100);
	    do
	    {
		System.out.println ("Please enter the mark on test 4");
		mark4 = In.getDouble ();
		if (mark4 < 0 || mark4 > 100)
		{
		    System.out.println ("Invalid Input");
		}
	    }
	    while (mark4 < 0 || mark4 > 100);
	    do
	    {
		System.out.println ("Please enter the mark on the exam");
		exam = In.getDouble ();
		if (exam < 0 || exam > 100)
		{
		    System.out.println ("Invalid Input");
		}
	    }
	    while (exam < 0 || exam > 100);
	    fmark = ((weight * (mark / 100)) + (weight2 * (mark2 / 100)) + (weight3 * (mark3 / 100)) + (weight4 * (mark4 / 100)) + (weight5 * (exam / 100)));
	    finalmark = (double) Math.round (fmark * 100.0) / 100.0;
	    output.write ("Test1 " + String.valueOf (mark));
	    output.newLine ();
	    output.write ("Test2 " + String.valueOf (mark2));
	    output.newLine ();
	    output.write ("Test3 " + String.valueOf (mark3));
	    output.newLine ();
	    output.write ("Test4 " + String.valueOf (mark4));
	    output.newLine ();
	    output.write ("Exam " + String.valueOf (exam));
	    output.newLine ();
	    output.write ("Finalmark " + String.valueOf (finalmark));
	    output.close ();
	}
	catch (IOException error)
	{
	    error.printStackTrace ();
	}
	System.out.println ("Your file has been written");
	System.out.println ("Your final mark is " + finalmark);
    }
}


