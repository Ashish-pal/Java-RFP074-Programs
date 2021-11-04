package prime_number;

import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, count=0, i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		
		num = sc.nextInt();
		
		sc.close();
		
		for(i=2;i<num;i++) {
			if(num%i==0)
				count++;
		}
		
		if(count!=0)
			System.out.println("Not a Prime number");
		else
			System.out.println("Prime number");
		
	}

}
