package Taskk02;

import java.util.Scanner;

public class Task2 {
	public static void main(String args[])
	 {
	 try{
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Input Integer 1 :");
		 int a= sc.nextInt();
		 System.out.println("Input Integer 2 :");
		 int b= sc.nextInt();
		 
		 int c = a/b;
		 if(b==0) {
			 throw new ArithmeticException("Zero Should Not be enter");
		 }
		 
		 System.out.println("\n\tDivision of 2 integer :"+c);
	 }
	 
	 catch(ArithmeticException e) {
		 System.out.println ("\nAritematic Exception \ninput is invalid, please give integer number");
	 }
	 
	 catch(Exception ex)
	 {
		 System.out.println("Exceeeppptioon is "+ex);
		 } 

	 } 
}
