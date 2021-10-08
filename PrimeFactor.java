package prime_factor;

import java.util.*;
public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j, n, Prime;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to get it's prime factors: ");
		
		n = sc.nextInt();
		
		System.out.println("Prime Factors: ");
		
		for(i=2;i<=n;i++) {
			if(n%i==0) {
				Prime = 1;
				for(j=2;j<=i/2;j++) {
					if(i%j==0) {
						Prime = 0;
					}
				}
				if(Prime==1) {
					System.out.println(i);
				}
			}
		}
	}

}
