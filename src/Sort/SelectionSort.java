package Sort;
import java.util.Scanner;
public class SelectionSort 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n= sc.nextInt();
		int A[]= new int[n];
		System.out.println("Enter elements of array: ");
		for(int i=0;i<n;i++)
		{
			A[i]= sc.nextInt();
		}

	      for (int i = 0 ;i< n-1; i++){
	         int max = i;

	         for (int j = i+1; j<n; j++)
	         {
	            if (A[j] > A[max])
	            {
	            max = j;
	            }
	         }
	         int t = A[max];
	         A[max] = A[i];
	         A[i] = t;
	      }
		System.out.println("Sorted array: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(A[i]);
		}
}
}
