package fibonacc;

import java.util.*;
public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		int i,x,y,z,n;
		x=0;
		y=1;
		
		System.out.println("Enter the terms upto generate fibonacci series: ");
		
		n = sc.nextInt();
		
		for(i=1;i<n;i++)
		{
			z=x+y;
			System.out.println(z);
			x=y;
			y=z;
		}
	}

}
