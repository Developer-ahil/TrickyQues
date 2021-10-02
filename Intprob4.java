//Ques 5: Write a program to check if elements of an array are same or not it read from front or back.

import java.util.Scanner;

class Intprob4 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		if (n>0 && n!=0)
		{
			int[] a=new int[n];
		System.out.println("Enter elements in an array");
		for (int i=0;i<n ;i++ )
		{
			a[i]=sc.nextInt();
		}
       
	   int count=0;
	   for (int i=0;i<n ;i++ )
	   {
		   if (a[i]==a[n-i-1])
		   {
			   count++;
		   }
	   }
		
      if (count==n)
      {
		System.out.println("All the elements are same ");  
      }
	  else
System.out.println("All the elements are not same ");
	  }
	
		else
 System.out.println("Invalid ");
       

	}
}
