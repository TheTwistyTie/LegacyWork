import java.io.*;
public class Cracker {
	
	public static void main(String[] args){
		try (BufferedReader br = new BufferedReader(new FileReader("key.txt"))) {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    String everything = sb.toString();
		    int length = everything.length(), counter = 0, aCount = 0, bCount = 0, cCount = 0, xCount = 0, yCount = 0, zCount = 0;
		    char test;
		    while (counter < length){
		    	test = everything.toLowerCase().charAt(counter);
		    	if(test == 'a'){
		    		aCount++;
		    	}
		    	else if(test == 'b'){
		    		bCount++;
		    	}
		    	else if(test == 'c'){
		    		cCount++;
		    	}
		    	else if(test == 'x'){
		    		xCount++;
		    	}
		    	else if(test == 'y'){
		    		yCount++;
		    	}
		    	else if(test == 'z'){
		    		zCount++;
		    	}
		    	else {
		    		System.out.println("The character " + test + " is not a valid character in this key");
		    		break;
		    	}
		    	counter++;
		    }
		    int sum = (aCount * 1) + (bCount * 3) + (cCount * 5) + (xCount * -1) + (yCount * -7) + (zCount * -1);
		    System.out.println("The key is: " + sum);
		}	catch (FileNotFoundException fnfe) {
			System.out.println("File Not Found.");
		}	catch(IOException e){
  			System.out.println("IOException");
		}
	}
}