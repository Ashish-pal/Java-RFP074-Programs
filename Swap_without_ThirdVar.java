package swap2numbers;

import java.util.*;
public class Swap_without_ThirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two number: ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Value before swap: " +a +" " +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Value after swap: " +a +" " +b);
	}

}
