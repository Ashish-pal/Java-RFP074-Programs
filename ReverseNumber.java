package reverse_number;

import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, rem = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		
		num = sc.nextInt();
		
		while(num!=0) {
			
			rem = rem*10;
			rem = rem + num%10;
			num = num/10;
		}
		
		System.out.println("Reverse Number: " +rem);
	}

}
