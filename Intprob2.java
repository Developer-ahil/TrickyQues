//Ques 3: Take 20 integers from user and put them in array and print the following;
          // Number of positive numbers
		  // Number of negative numbers
		  // Number of odd numbers
		  // Number of even numbers
		  // Number of 0s
import java.util.Scanner;

class Intprob2 
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

System.out.print("Number of positive numbers:");
int count=0;
for (int i=0;i<n ;i++ )
{
	if (a1[i]>0)
	{
		count++;
	}
}
System.out.print(count);
System.out.println();

System.out.print("Number of negative numbers:");
int ncount=0;
for (int i=0;i<n ;i++ )
{
	if (a1[i]<0)
	{
		ncount++;
	}
}
System.out.print(ncount);
System.out.println();



System.out.print("Number of 0s :");
int zcount=0;
for (int i=0;i<n ;i++)
{
	if (a1[i]==0)
	{
		zcount++;
	}
}
System.out.print(zcount);

System.out.println();

int ecount=0;
int ocount=0;
for (int i=0;i<n ;i++)
{
	if (a1[i]%2==0 &&a1[i]!=0)
	{
		ecount++;
	}

	else
		ocount++;
}
System.out.print("Number of even numbers :"+ ecount);
System.out.println();
System.out.print("Number of odd numbers :"+ocount +" ");


		}
	
		else
 System.out.println("Invalid ");
       

  }
}
