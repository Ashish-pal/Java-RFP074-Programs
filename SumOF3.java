package sumof_three;

import java.util.*;
public class SumOF3 {
	
	public static int sumoftriples(int a[], int length) {
		
		int i, j, k, count=0;
		for(i=0;i<length;i++)
		{
			for(j=i+1;j<length;j++)
			{
				for(k=j+1;k<length;k++)
				{
					if(a[i]+a[j]+a[k]==0)
					{
						System.out.println(a[i]+ " " + a[j]+ " " + a[k]);
						count++;
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter N integer input array numbers: ");
		 int n = sc.nextInt();
		 int arr[] = new int[n];
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.print("Enter "+(i+1)+" Value :");
				arr[i]=sc.nextInt();
		 }
		 
		 SumOF3 three = new SumOF3();
		 int sum = three.sumoftriples(arr, n);
		 System.out.println("Number of Distinct triplets: " +sum);
		
	}

}
