package java_problems;

import java.util.Scanner;

public class evendigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 int actualnum = num ;
		 int temp = 0;
		 int sum = 0;
		 for(int i =2 ; i <= num+num ;i++)
		 {
			 if (i % 2 ==0)
			 {
				 System.out.println( + i);
			 }
		 }
	}

}
