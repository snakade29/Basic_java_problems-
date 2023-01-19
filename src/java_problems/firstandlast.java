package java_problems;

import java.util.Scanner;

public class firstandlast {
	public static int firstnum (int num) {
	
		int num1 = num;
	     num1 = num1 % 10 ;
	return num1;
	}
	public static int secondnum (int num) {
		
		int num1 = num;
     while(num1 >= 10)
	{
	     num1 = num1 / 10 ;
	}
	return num1;
	}
	
	public static void main(String [] args)
	{
		System.out.print("enter the number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int actualnum = num ;
		int   sum = firstnum(num) + secondnum(num) ;
		System.out.print("first and last  num " + sum );
	     
	    
	 
	}

}
