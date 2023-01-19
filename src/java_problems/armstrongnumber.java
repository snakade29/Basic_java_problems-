package java_problems;

import java.util.Scanner;

public class armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 int actualnum = num ;
		 int temp = 0;
		 int sum = 0;
		 while(num != 0)
		 {
			temp = num % 10 ;
		    sum = sum + temp * temp * temp ;
		    num = num/10 ;
		 }
		 if (actualnum == sum)
		 {
		  System.out.println("armstrongnumber");
			 
		 }
		 else 
			 System.out.print("Not an armstrongnumber");
		 

	}

}
