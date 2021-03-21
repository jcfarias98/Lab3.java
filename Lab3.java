package labJava;
//AUTHOR: Jessica Farias
//FILENAME: Lab3.java
//SPECIFICATIONS: Final weighted total calculator
//FOR: CSE110- Lab 3
//TIME SPENT: 1 hour 30 minutes

import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args)
	{
		
		//Declare three variables
		double hw = 0;
		double midterm = 0;
		double finalExam = 0;
		Scanner scanner = new Scanner(System.in);
		
		//Declare a loop control variable
		int i = 0;
		
		//loop for inputing each grade
		while ( i <= 2) 
		{
			if (i == 0) 
			{
				System.out.print("enter your homework grade: ");
				hw = scanner.nextDouble();
				
				//checking entered value is in the domain or not
				
				if (hw >= 0 && hw <= 100) 
				{
					//increment loop variable
					i++;
				} 
				else 
				{
					//prompt to enter a valid grade
					System.out.println("[ERR] Invalid input. A Homework grade should be in [0,100]");
				}
			}
			if (i == 1 ) 
			{
				System.out.print("enter your MIDTERM grade: ");
				midterm = scanner.nextDouble();
				//checking entered value is in the domain or not 
				if (midterm >= 0 && midterm <= 100) 
				{
					//increment loop variable
					i++;
				} 
				else 
				{
					//prompt to enter a valid grade
					System.out.println("[ERR] Invalid input. A Midterm grade should be in [0,100]");
				}
			}
			if (i == 2) 
			{
				System.out.print("Enter your final exam: ");
				finalExam = scanner.nextDouble();		
				//checking entered value is in the domain or not 
				if (finalExam >= 0 && finalExam <= 200) 
				{
					//increment loop variable 
					i++;
				} 
				else 
				{
					//prompt to enter a valid grade
					System.out.print("[ERR] Invalid input. A Final exam grade should be in [0,200]");
				}
			}
		}
		//calculating weighted total
		double weightedTotal = (finalExam /200*50) + (midterm*0.25) + (hw*0.25);
		//printing weighted total
		System.out.println("[INFO] Student's Weighted Total is " + weightedTotal);
		
		//checking weighted total is greater than or equals to 50
		if (weightedTotal >= 50)
		{
			//print PASSED message
			System.out.print("[INFO] Student PASSED the class");
		} 
		else 
		{
			//print FAILED message
			System.out.print("[INFO] Student FAILED the class");
		}
		scanner.close();
	}
}
