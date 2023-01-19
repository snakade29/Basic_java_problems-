package java_problems;

import java.util.Scanner;

public class perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number");
		 int no =sc.nextInt();
		 int factor=1;
		 int sum = 0 ;
		 for( int i =1 ;i < no ; i++ )
		 {
			if ( no % i== 0)
			{
				sum = sum + i; 
			}
		 }
		 if (no == sum )
		 {
			 System.out.print("perfect number");
		 }
		 else{
			 System.out.print("not a perfect number");
			 
		 }

	}

}
