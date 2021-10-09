package vending_machine;


import java.util.*;
public class NoteMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1000,500,100,50,10,5,2,1};
		int money, totalNotes=0,count=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Money: ");
		
		money = sc.nextInt();
		
		int copy=money; 
		
		
		for(int i=0;i<8;i++) 
		{
			// counting number of notes.
			count=money/arr[i]; 
			if(count!=0) {
				System.out.println(arr[i]+"   " +count+ "  "+arr[i]*count);
			}
			totalNotes=totalNotes+count; 
			money=money%arr[i]; 
		}
		System.out.println("TOTAL= " +copy); 
		System.out.println("Minimum Number of Notes required= " +totalNotes);
		sc.close();
	}

}
