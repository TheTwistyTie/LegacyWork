//Alexander Keith
//CS 151
//Assignment 6
import java.util.Scanner;
public class Cents{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int c = 0 , q, d, n, p;
		while(c>=0){
			System.out.print("Enter the amount of cents (1 - 100, -1 to end): ");
			c = scan.nextInt();
			System.out.println();
			if(c>0){
				q = c/25;
				c = c%25;
				d = c/10;
				c = c%10;
				n = c/5;
				c = c%5;
				p = c/1;
				System.out.println("Exact change is:"); 
				if(q!=0)
					System.out.println(q + " Quarters");
				if(d!=0)
					System.out.println(d + " Dimes");
				if(n!=0)
					System.out.println(n + " Nickels");
				if(p!=0)
					System.out.println(p + " Pennies");
				}
			else
				System.out.println("Bye!");
			}
		}
	}