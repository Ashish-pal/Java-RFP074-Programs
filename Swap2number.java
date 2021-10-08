package swap2numbers;

import java.util.*;
public class Swap2number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, t;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two number: ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Value before swap: " +a +" " +b);
		
		t = a;
		a = b;
		b = t;
		
		System.out.println("Value after swap: " +a +" " +b);
		
	}

}
