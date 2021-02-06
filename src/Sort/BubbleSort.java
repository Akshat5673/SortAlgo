package Sort;
import java.util.*;
public class BubbleSort
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n= sc.nextInt();
		int t=0;
		int A[]= new int[n];
		System.out.println("Enter elements of array: ");
		for(int i=0;i<n;i++)
		{
			A[i]= sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(A[j+1]>A[j])
				{
				t=A[j];
				A[j]=A[j+1];
				A[j+1]=t;
				}
			}
		}
		System.out.println("Sorted array: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(A[i]);
		}	
	}
}
