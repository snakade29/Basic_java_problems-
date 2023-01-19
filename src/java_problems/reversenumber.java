package java_problems;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number :");
		int num = sc.nextInt();
		int actualnum = num ;
		int reverse =0 ;
	    int temp = 0 ;
		while(num != 0)
		{
			temp = num % 10 ;
		reverse = reverse * 10 + temp ;
		num = num / 10 ;
		}
		
		System.out.print(reverse);
		
		if(actualnum == reverse)
			System.out.print("same");
		else
			System.out.print("diffferent");
			
	}

}
