package coupan_number;

import java.util.*;

public class CoupanNumber {

	int[] couponArray;	//	array to store numbers which has already occurred
	int  pos = 0;	//	position to which the new generated number is to add
	int randomCount = 0;	//	keeps number of trials required
	public static void main(String[] args){
		
		CoupanNumber couponNumbers = new CoupanNumber();	//	class object
		
		couponNumbers.start();
		
	}
	
	/** Asks user input **/
	void start() {
		Scanner sc = new Scanner(System.in);	//	to get user input
		System.out.print("Enter Number of Coupons: ");
		int couponCount = sc.nextInt();
		sc.close();
		
		//initialising array
		couponArray = new int[couponCount];
		
		random(couponCount);
	}

	/** generates random number and adds to the array **/
	void random(int couponCount){
		randomCount++;
		Random random = new Random();
		int randomInteger = random.nextInt(couponCount) + 1;
		if(isPresent(randomInteger))
			random(couponCount);
		else{
			couponArray[pos] = randomInteger;
			pos++;
			if(pos == couponCount){
				System.out.println("Number of trials required: " + randomCount);
				return;
			}
			random(couponCount);
		}
	}

	/** checks if the generated number has occurred before **/
	boolean isPresent(int n){
		for(int i =0; i < couponArray.length; i++){
			if(couponArray[i] == n)
				return true;
		}
		return false;
	}
}