import java.io.*;
import java.lang.*;
public class PossibleLetters {
	public char[] importLetters() {
		char[] possLetts = new char[26];
		try (BufferedReader br = new BufferedReader(new FileReader("possibleLetters.txt"))) {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    String everything = sb.toString().trim();
		    String[] arr = everything.split("-");
		    int c = 0;
		    int s = arr.length;
		    while(c < s){
		    	possLetts[c] = arr[c].charAt(0);
		    	c++;
		    }
		    while(c >= s && c > 26){
		    	possLetts[c] = '\u0000';
		    	c++;
		    }
		}	catch (FileNotFoundException fnfe) {
			System.out.println("404 Error");
		}	catch(IOException e){
 			System.out.println("IO Error");
		}
		return possLetts;
	}
	public char[] removeLetter(char a, char[] old){
		int c = 0;
		while(old[c] != a && c < 26){
			c++;
		}
		old[c] = '\u0000';
		
		char[] sorted = old;
		return sorted;
	}
}