package java_problems;

import java.util.Scanner;

public class Strongnumber {
	 
	public static int factor(int temp)
	 {
		  
		 int fact = 1 ;
		for( int i=1 ; i <= temp ;i++)
		{
			fact = fact * i ;
		}
		return fact ;
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Strongnumber st =new Strongnumber();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number");
		int num =sc.nextInt();
		int actualno = num;
		int temp =0 ;
		int sum = 0;
		 while(num != 0)
		 {
			 temp = num % 10 ;
			  
			 sum = sum + factor(temp) ;
			 
			 num = num / 10 ;
		 }
		 
		if ( actualno == sum )
			System.out.print("Strong number");
		else
			System.out.print("Not a Strong number");

			
		 
		 
		 
		 
		 
	}

}
