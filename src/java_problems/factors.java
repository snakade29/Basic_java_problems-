package java_problems;

import java.util.Scanner;

public class factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number");
		 int no =sc.nextInt();
		 int factor =0;
		 for( int i =1 ;i<= no ; i++ )
		 {
			 if ( no % i ==0)
			 {
				 System.out.print(" " + i);
			 }
			 
		 }
	

	}

}
