
package power2;

import java.util.Scanner;

public class Power2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int base, power;
		double result = 1.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base number: ");
		base = sc.nextInt();
		System.out.println("Enter power: ");
		power = sc.nextInt();
		
		while(power!=0) {
			
			result *= base;
			
			--power;
		}
		
		System.out.println("Power Result: " +result);
	}

}
