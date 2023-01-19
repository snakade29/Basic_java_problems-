package java_problems;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number :");
		int num = sc.nextInt();
		int num1 = 0 ,num2 = 1,num3=0;
		System.out.print(num1+" "+num2+" ");
		for(int i = 0 ; i <= num-3 ;i++)
		 {
			num3 = num1 + num2 ;
			System.out.print(num3 + " ");
			num1 = num2 ;
			num2 = num3 ;
		 }
		
	}

}
