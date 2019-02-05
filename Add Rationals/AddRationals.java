/* A program that uses Rational class
 * Suggested exercises:
 * - Add a method to read a rational number from user input.
 * - In class Rational add a method to generate a random rational number.
 * - In class Rational add methods to subtract, multiply and divide
 *   rationals numbers and use them in the main method.
 * - In class Rational add a method that returns the floating point value of a rational number.
 * - Read three rational numbers and compute their average as a rational number.
 * - In class Rational add a method to find the minimum/maximum of the two rational numbers.
*/

import java.util.Scanner;
import java.util.Random;

class AddRationals {

  public static void main (String[] args)
  {
      String div;
      Scanner scan = new Scanner(System.in);
      Random rand = new Random();
      int a[];
      int b[];
      int d, n, count=0, u, max=0, min=0, sumN=1, sumD=1, aveD=0, aveN=0, Agcf=1, gcf=1;
      System.out.print("How many rationals would you like to generate?: ");
      u = scan.nextInt();
      a = new int[u];
      b = new int[u];
      double t=0.0, l=0.0, s=0.0, dSum=0.0;

      for(count = 0; count < u; count++){
        d = rand.nextInt(7) + 2;
        n = rand.nextInt(d) + 1;
        while(n == d){
            n = rand.nextInt(d) + 1;
        }
        a[count] = n;
        b[count] = d;
        System.out.println(a[count] + "/" + b[count]);
      }

      for(count = 0; count < u; count++){

        l = a[0]/(double)b[0];
        s = a[0]/(double)b[0];
        t = a[count]/(double)b[count];
        if(l<=t){
            l = t;
            max = count;
        }
        else{
            //boobs
        }

        if(s>=t){
            s = t;
            min = count;
        }
        else{
            //boobs
        }
      }
      /* Rational p = new Rational(a,d); // p points to a new instance of Rational
      Rational q = new Rational(n,d); // q points to a new instance of Rational

      Rational r = p.sum(q); // no need of new here, sum returns a new Ratonal object
             */
      System.out.println("The max is: " + a[max] + "/" + b[max] + " (" + l + ")");
      System.out.println("The smallest is: " + a[min] + "/" + b[min] + " (" + s + ")");
      //System.out.println(p + " + " + q + " = " + r);
      //r.reduce();
      // System.out.println("Reduced sum is: " + r);
      sumN = a[0];
      sumD = b[0];
      dSum = a[0]/(double)b[0];
      for(count = 1; count < u; count++){
        dSum = dSum + a[count]/(double)b[count];
        sumN = (sumN * b[count]) + (a[count] * sumD);
        sumD = (sumD * b[count]);
      }
      aveD = sumD*u;
      aveN = sumN;
      for(count = 1; count < sumD; count++){
        if(sumN%count == 0 && sumD%count == 0){
            if(count >= gcf){
                gcf = count;
                }
            }
        }
        if(aveD>aveN){
            for(count = 1; count < aveD; count++){
                if(sumN%count == 0 && aveD%count == 0){
                    if(count >= Agcf){
                        Agcf = count;
                    }
                }
            }
        }
        else{
            for(count = 1; count < aveN; count++){
                if(sumN%count == 0 && aveD%count == 0){
                    if(count >= Agcf){
                        Agcf = count;
                    }
                }
            }
        }
        aveN = sumN/Agcf;
        aveD = aveD/Agcf;
      sumN = (sumN/gcf);
      sumD = sumD/gcf;

      System.out.println("The sum is: " + sumN + "/" + sumD + " (" + dSum + ")");
      System.out.println("The average is: " + aveN + "/" + aveD + " (" + dSum/(double)u + ")" );
  }

}
