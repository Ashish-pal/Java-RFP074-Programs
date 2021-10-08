package largest3numbers;

import java.util.*;
public class LargestAmong3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, big;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a>b) {
			if(a>c) 
				big = a;
			else
				big = c;
		}
		else {
			if(b>c)
				big = b;
			else
				big = c;
		}
		System.out.println("Biggest number is " +big);
	}

}
