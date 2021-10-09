package newton_sqrt;

import java.util.*;
public class NewtonSqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		
		double c = sc.nextDouble();
		double epsilon = 1e-15;
		double t = c; 
		
		while (Math.abs(t - c/t) > epsilon*t) {
	            t = (c/t + t) / 2;
	        }
		
		 System.out.println(t);
		sc.close(); 
	}

}
