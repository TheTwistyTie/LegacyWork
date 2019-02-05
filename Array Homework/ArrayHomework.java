import java.util.Scanner;
public class ArrayHomework {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double[] phValues = new double[100];
		double sum = 0, average = 0, outlier = 0;
		boolean stop = false, outlierB = false;
		int counter = 0, counter2 = 0, amountEntered = 0;
		System.out.println("Enter PH Sample: (-1 to stop)");
		while(counter<100){
			phValues[counter] = scan.nextDouble();
			if(phValues[counter] == -1){
				counter = 100;
				amountEntered--;
			}
			counter++;
			amountEntered++;
		}
		counter = 0;
		while(!stop && phValues[0] != -1){
			while(counter < 100){
				if(phValues[counter] != -1){
					sum = sum + phValues[counter];
				}
				counter++;
				if(phValues[counter] == -1){
					counter = 100;
				}
			}
			if(outlierB){
				sum = sum - outlier;
				amountEntered--;
				stop = true;
				System.out.println("The most distant value is: " + outlier);
			}
			average = sum/amountEntered;
			if(!outlierB) {
				while (counter2 < 100){
					if(phValues[counter2] != -1 && counter2 == 0){
						outlier = phValues[0];
					}
					if(Math.abs(outlier - average) < Math.abs(phValues[counter2] - average) && phValues[counter2] != -1){
						outlier = phValues[counter2];
					}
					if(phValues[counter2 + 1] == -1){
						counter2 = 100;
					}
					counter2++;
				}
				outlierB = true;
			}
			System.out.println("The average is: " + average);
		}
	}
}