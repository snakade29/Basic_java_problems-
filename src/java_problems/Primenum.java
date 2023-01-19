package java_problems;

public class Primenum {
	
	public void primenum(int num){
		{   int no =num ;
			int count =0 ;
			for ( int i =1 ; i <= no ; i++)
		{
			 if(no % i == 0)
			 {
				 count++;
			 }
			 
			 
		 }
	 
	 
	 
if (count==2)
{
	System.out.println("No. is  prime" + no );
}
else
{
	System.out.println("No. is not prime" + no );
}}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Primenum o = new Primenum();
		for(int i=20 ; i <= 70 ; i++)
		{
		o.primenum(i);
	
		
		}
		
		
		
	 
		
		}

}
