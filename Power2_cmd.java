package power2_cmd;

public class Power2_cmd {

	public static void main(String arg[]) {
		// TODO Auto-generated method stub
		int result = 1;
	
		int basenum = Integer.parseInt(arg[0]);
		System.out.println("Enter base number: " +basenum);
		int power = Integer.parseInt(arg[1]);
		System.out.println("Enter the power less then 31: " +power);
		
		if (power>=31)
		{
			System.out.println("Overflow Power value error");
			System.exit(0);
		}
		else
		
			while(power !=0)
			{
				result *= basenum;
				--power;
			}
		System.out.println("Power: " +result);
	}

}
