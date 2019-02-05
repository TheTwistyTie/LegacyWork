import java.util.Random;
import java.io.*;
public class GetWord{
	public int newPick(int x){
		Random rand = new Random();
		int word = rand.nextInt(x);
		return word;
	}
	public String newWord(int x){
		String word = null;
		try (BufferedReader br = new BufferedReader(new FileReader("dictionary.txt"))) {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    String everything = sb.toString().trim();
		    String[] words = everything.split("\n");
		    word = words[x];
		}	catch (FileNotFoundException fnfe) {
				System.out.println("404 Error");
		}	catch(IOException e){
	  			System.out.println("IO Error");
		}
			return word;
	}
	public String getWord(int x){
		int num = newPick(x);
		String word = newWord(num);
		return word;
	}
}