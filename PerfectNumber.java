package perfect_number;

import java.util.*;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number, remainder, sum = 0, i;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		
		number = sc.nextInt();
		
		for(i=1;i<=(number-1);i++) {
			remainder = number%i;
			
			if(remainder == 0) 
			{
				sum = sum + i;
			}
		}
		
		if(sum == number) 
			System.out.println("Entered number is perfect number");
		else
			System.out.println("It is not a perfect number");
		
	}

}
