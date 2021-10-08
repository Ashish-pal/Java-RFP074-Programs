package flipcoin_percentages;
import java.util.*;

public class FlipC {

	public static void main(String arg[]) {
		// TODO Auto-generated method stub
		int heads = 0;
        int tails = 0;
        int counter = 1;
        double randNum = 0.0;
        int headpercent = 0;
        int tailspercent = 0;
        Scanner sc = new Scanner(System.in);
         
        System.out.println("How many times do you want to flip your coin?: ");
        int flips = sc.nextInt();
         
        while(counter <= flips)
        {
            randNum = Math.random();
            System.out.print(counter + "\t" + randNum);
             
            if(randNum < .5)
            {
                heads++;
                System.out.println("\t heads");
            }
            else
            {
                tails++;
                System.out.println("\t tails");
               }
            counter++;      
        }
        System.out.println();
        System.out.println("Number of Heads = " + heads);
        System.out.println("Number of Tails = " + tails);
        
        headpercent = heads*100/flips;
        tailspercent = 100 - headpercent;
        
        System.out.println("Head Percentages = " +headpercent);
        System.out.println("Tails Percentages = " +tailspercent);
 
	}

}
