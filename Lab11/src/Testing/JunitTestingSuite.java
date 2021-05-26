package Testing;

public class JunitTestingSuite {
	
	 public boolean issOdd(int num)
	   { 
		if(num % 2 == 0)
		   {
				   System.out.println(num + " is a not odd Number");
			 return false;
		   }else
			   System.out.println(num + " is a odd Number");
		    return true;
	   }
	
	 
	 public boolean issEven(int num)
	   { 
		if(num % 2 == 0)
		   {
				   System.out.println(num + " is a even Number");
			 return true;
		   }else
			   System.out.println(num + " is not a even Number");
		    return false;
	   }
	
	 public boolean Prime(int num) {
			int temp;
			boolean isPrime=true;
			for(int i=2;i<=num/2;i++)
			{
		           temp=num%i;
			   if(temp==0)
			   {
			      isPrime=false;
			      break;
			   }
			}
				if(isPrime)
			   System.out.println(num + " is a Prime Number");
			else
			   System.out.println(num + " is not a Prime Number");
			return isPrime; 
			}	
	 
	 
	 public int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }    
}
