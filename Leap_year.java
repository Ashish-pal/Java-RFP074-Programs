package leap_y;
import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year: ");
		year = sc.nextInt();
		if(year%100!=0)
		{
			if(year%4==0)
				System.out.println("This is Leap Year");
			else
				System.out.println("This is not a leap year");
		}
		else
		{
			if(year%400==0)
				System.out.println("This is Leap Year");
			else
				System.out.println("This is not a leap year");
		}
	}

}
