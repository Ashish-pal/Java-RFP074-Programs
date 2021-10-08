package even_odd;

import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		a = sc.nextInt();
		
		if(a%2==0) {
			System.out.println("Number is Even number");
		}
		else
		{
			System.out.println("Number is Odd number");
		}
		
	}

}
