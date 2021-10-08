package array2d;

import java.util.*;
public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = new int[3][3];
		int i,j;
		Scanner dd = new Scanner(System.in);
		
		System.out.println("Enter Array Matrix numbers: ");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
			a[i][j] = dd.nextInt();
			}
		}
			
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) 
				System.out.print(a[i][j] + " ");
				System.out.println();
		}
	}

}
