import java.util.Scanner;
import java.math.BigInteger;
import java.io.*;
public class Fibonacci {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long time1, time2;
		BigInteger input, n1 = BigInteger.valueOf(1), n2 = BigInteger.valueOf(1), n3=BigInteger.valueOf(1), c = BigInteger.valueOf(3);
		System.out.println("What value of the Fibonacci Sequence would you like to find?");
		input = scan.nextBigInteger();
		//Do value = new Do();
		time1 = System.currentTimeMillis();
		if(input.compareTo(BigInteger.valueOf(3)) >= 0){
			while(c.compareTo(input) <= 0){
				n3 = n1.add(n2);
				n1 = n2;
				n2 = n3;
				c = c.add(BigInteger.valueOf(1));
				System.out.println(c);
			}
		}
		//long output = value.getFibonacci(input);
		time2 = System.currentTimeMillis(); 
		BufferedWriter writer = null;
		try{
			File logFile = new File("output");

            // This will output the full path where the file will be written to...
            System.out.println(logFile.getCanonicalPath());

            writer = new BufferedWriter(new FileWriter(logFile));
            writer.write(n3.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the writer regardless of what happens...
                writer.close();
            } catch (Exception e) {
            }
        }
        if(time2 - time1 <= 1000){
			System.out.println("Computation took: " + (time2 - time1) + "Milliseconds.");
		}
		else {
			System.out.println("Computation took: " + (time2 - time1)/(double)1000 + "Seconds.");
		}
	}
}