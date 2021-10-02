//Ques 1:Take 10 inputs from the user and store them in an array
import java.util.Scanner;

class Intprob1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of integer you want:");
		int n=sc.nextInt();
		int[] a1=new int[10];
		if (n>0 && n!=0)
		{
			 System.out.println("Enter the integer ");
		for (int i=0;i<n ;i++ )
		{
            a1[i]=sc.nextInt();
		}
       System.out.print("Array of the given inputs is:");

        for (int i=0;i<n ;i++ )
		{
            System.out.print(a1[i]+" ");
		}

	
       
	System.out.println();
 System.out.println("Enter number:");
int a2=sc.nextInt();
int count=0;
		for (int i=0;i<n ;i++ )
{
	if (a1[i]==a2)
     {
	
	count++;
    }
}
if (count>0)
{
System.out.println("it is present");
    
}
	
      else  {
		  System.out.println("it is not present");
	        
	  }	
	  	}
	
		else
 System.out.println("Invalid ");
	}
}
