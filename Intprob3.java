//Ques 4:Take 10 i9nteger inputs from user and store them in an array. Now,copy all the elements in reverse order.

import java.util.Scanner;


class Intprob3 
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
	System.out.println();
	System.out.print("Reverse array of the given inputs is:");
		for (int i=n-1;i>=0;i-- )
		{
            System.out.print(a1[i]+" ");
		}
		System.out.println();

		}
	
		else
 System.out.println("Invalid ");
       

	}
}
