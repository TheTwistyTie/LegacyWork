import java.util.*;
import java.io.*;
public class Loader {
	public void Load(){

	}
	public HashMap<Integer, Integer> loadFour() throws IOException {
		int infoNum = 0;
		String infoChar = "";
		Map<Integer,Integer> wordMap = new HashMap<Integer, Integer>();
		Scanner infoScan = new Scanner(new File("\\four\\info.txt"));
		infoNum = infoScan.nextInt();
		Scanner docScan = new Scanner(new File("\\four\\" + infoNum + "\\" + infoNum + "_Line.txt"));
		for(int c =0; c < 26; c++){
			infoChar = infoScan.next();
			System.out.println("\tLoading words that start with " + infoChar + "...");
			infoNum = infoScan.nextInt();
			for(int c2 = 0; c2 < infoNum; c2++){
				wordMap<c, c2> = docScan.next();
			}
		}
	}
}