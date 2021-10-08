package temprature_conv;

import java.util.*;
public class TempratureConver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double cel, far;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temprature in celsius: ");
		
		cel = sc.nextDouble();
		
		far = (cel * 9 / 5) + 32;
		
		System.out.println("Your temprature in Fahrenheit: " +far);
		
		cel = (5.0/9) * (far - 32);
		
		System.out.println("Your temprature in celsius: " +cel);
		
		sc.close();
	}

}
