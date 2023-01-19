package java_problems;

import java.util.Scanner;

public class neonnumber {
	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number");
		 int num =sc.nextInt();
		 int actualnum = num;
		 int temp =0 ;
		 int sum =0 ;
		 int no =0;
		 while(num != 0)
		 {
		    temp = num % 10 ;
		    sum = sum + temp ;
		    num = num / 10 ;
		 }
		  no =sum * sum ;
		  if (actualnum == no)
		  System.out.println("Neon number");
		  else 
			  System.out.println("Not a Neon number");
			  
	}

}
