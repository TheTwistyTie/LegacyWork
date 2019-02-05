import java.io.*;
/**
 * Testing Class containing the main method in order to test the Packages Class
 * 
 * @author (Alexander Keith) 
 * @version (1/26)
 */
public class TestPackages
{
    public static void main(String[] args)throws IOException{
        Packages test = new Packages();
        System.out.println("ALL PACKETS \n" + test.toString());
        System.out.println("ALL HEAVY PACKETS");
        test.displayHeavyPackages();
        System.out.println();
        System.out.println("ALL IN-STATE PACKETS");
        test.displayInStatePackages();
        System.out.println();
        System.out.println("The packet that is the heaviest is: \n" + test.MaxWeightPacket());
        System.out.print("The average weight of all packets is: ");
        test.displayAverageWeight();
        System.out.println();
        System.out.println("LOCAL PACKETS");
        test.displayLocalPackets();
        System.out.println();
        System.out.println("NONLOCAL PACKETS");
        test.displayNonLocalPackets();
    }
}
