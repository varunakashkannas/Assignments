package com.tcs.creatio.crm.langugebasics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.System.Logger;
import java.time.LocalDateTime;

public class myfirstjavaprogram {

	/* sample test programs to understand basics of print statement */

	public static void main(String[] args) throws FileNotFoundException {

		// understanding the print statement
		System.out.print("Hello, Automation Engineer!");

		// println statement
		System.out.println("VARUN AKASH KANNA");

		// printf statement
		System.out.printf("%s is an engineer: empid is %d: status is %b: salary is %f", "Varun", 123456, true,
				1000000.09);
		System.out.println();
		System.out.printf("%s is an engineer: empid is %d: status is %b: salary is %f", "priya", 987654, true,
				2000000.09);
		System.out.println();
		System.out.println("==================================================================");

		// print using format
		System.out.format("total gross salary is %.2f %n", 300000.9876554);
		System.out.println(12345);
		System.out.println();

		// print using write - which throws ASCII value of the input
		System.out.write(56);
		System.out.println();

		// error print - prints the statements in red color
		System.err.println("error while print statement using log");

		// using append - join multiple print statements
		System.out.append("salary details of month: ").append("january & february");
		System.out.println();
		
		String a ="10";
		String b ="20";
		System.out.println(a+b);
		
				

		// using printwriter - all writer statement will be saved in seperate text file
		PrintWriter writer = new PrintWriter("C:\\VarunStudy\\AutomationTraining\\AutomationProject\\src\\logs.txt");
		writer.println(LocalDateTime.now() + "java basics session 1 completed on 3Apr2025");
		writer.println(LocalDateTime.now() + "java basics session 2 completed on 4Apr2025");
		writer.close();

		// using log - displays all the logs of the project
		// Logger log = Logger.getLogger("Mylogger");
		// log.info("log information");

	}

}
