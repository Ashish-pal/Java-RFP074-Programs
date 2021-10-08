package stopwatch;

import java.util.*;

public class StopWatch {

	public static void main(String[] args) {

		StopWatch stopwatch = new StopWatch();
		stopwatch.calculateTime();
			
	}

	void calculateTime(){
		Scanner sc = new Scanner(System.in);	
		long time1 = 0, time2 = 0;	//variables to store times of clicks
		
		System.out.println("Press the \"Enter\" the key twice two measure the time difference between them: take some time after pressing first Enter key to calculate time difference: ");
		
		String input = sc.nextLine();	
		
		if(input.isEmpty()) {	//	enter key pressed
			time1	= System.currentTimeMillis();
		}
		
		input = sc.nextLine();
		if(input.isEmpty()) {	
			time2	= System.currentTimeMillis();
		}
		
		sc.close();
		System.out.println("Diffrence between two clicks is: " + ((int)(time2 - time1) / 1000) + " seconds.");
	}
}