package java_problems;

import java.util.Scanner;

public class factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number");
		 int no =sc.nextInt();
		 int factor=1;
		 for( int i =1 ;i <= no ; i++ )
		 {
			 factor = factor * i ;
		 }
		 System.out.print("factor of no. "+no + "is " + factor );

	}

}
