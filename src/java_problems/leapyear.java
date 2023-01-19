package java_problems;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year");
		int year =sc.nextInt();
		boolean leap =false ;
		
		if( year/4 ==0)
		{
		  if(year/100 == 0)
		  { if(year/400 ==0)
			  leap=true;
			  else 
				  leap= false ;
		  }else
			  leap = true ;
		}
 		else 
			 leap = false ;
		if (leap == true )
         System.out.print(year + "  is leap year"); 
		else
			System.out.print("Not a leap year");
		}

}
