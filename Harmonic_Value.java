package harmonic_value;

import java.util.*;
public class Harmonic_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		double i, s = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number for harmonic value: ");
		n = sc.nextInt();
		
		if(n==0) {
			System.out.println("Entered Value is 0, Value error, Please enter correct Value");
			System.exit(0);
		}
		else {
		for(i=1; i<=n;i++)
		{
			s = s + 1/i;
		}
		}
		System.out.println("Harmonic Value: " +s);
	}

}
