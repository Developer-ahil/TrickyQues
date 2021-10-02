//Ques 1:Take 10 inputs from the user and store them in an array and print them on the screen?

import java.util.Scanner;

class Intprob 
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

		}
	
		else
 System.out.println("Invalid ");
       

	}
}

