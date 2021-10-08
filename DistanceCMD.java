package distanceCmd;

public class DistanceCMD {

	public static void main(String arg[]) {
		// TODO Auto-generated method stub

		int x1 = Integer.parseInt(arg[0]);
		System.out.println("Enter x1 value: " +x1);
		int x2 = Integer.parseInt(arg[1]);
		System.out.println("Enter x2 value " +x2);
		int y1 = Integer.parseInt(arg[2]);
		System.out.println("Enter y1 value: " +y1);
		int y2 = Integer.parseInt(arg[3]);
		System.out.println("Enter y2 value " +y2);
		
		//int x = Integer.parseInt(arg[4]);
		// int y = Integer.parseInt(arg[5]);
		int x, y; 
		double distance;
		x = x2 - x1;
		y = y2 - y1;
		
		distance = Math.sqrt(x*x + y*y);
		System.out.println("Distance= " +distance);
	}

}
