import java.util.*;
import java.io.*;
public class Scripts {
	Scanner scan;
	Random rand = new Random();
	private String[] buffer;
	private int length;
	ArrayList<String[]> dic = new ArrayList<String[]>();
	int turnCount = 1;
	public void dicCreator() throws IOException {
		Scanner infoScan = new Scanner(new File("four\\info.txt"));
		int numberOfTotalWords = infoScan.nextInt();
		int numberOfWordsPerLetter;
		char currentLetter;
		for(int c = 0; c < 26; c++){
			currentLetter = infoScan.next().charAt(0);
			numberOfWordsPerLetter = infoScan.nextInt();
			dic.add((loadFour(currentLetter, numberOfWordsPerLetter, numberOfTotalWords)));
		}
	}
	public String[] loadFour(char letter, int wordCountPerLetter, int wordCountTotal) throws IOException {
		scan = new Scanner(new File("four\\"+ wordCountTotal + "\\" + letter + ".txt"));
		buffer = new String[wordCountPerLetter];
		for(int c = 0; c < wordCountPerLetter; c++){
			buffer[c] = scan.next();
		}
		return buffer;
	}
	public ArrayList<String[]> getDictionary(){
		return dic;
	}
	public String[] getLetterArray(char a){
		return dic.get(charToInt(a));
	}
	public String[] getLetterArray(int a){
		return dic.get(a);
	}
	public String setComputerWord(){
		int num = rand.nextInt(26);
		buffer = dic.get(num);
		length = buffer.length;
		num = rand.nextInt(length);
		return buffer[num]; 
	}
	public int similarityCount(String a, String b){
		int count = 0;
		for(int x = 0; x < a.length(); x++){
			for(int y = 0; y < b.length(); y++){
				if(a.charAt(x) == b.charAt(y)){
					count++;
				}
			}
		}
		return count;
	}
	public boolean noRepeatLetters(String x){
		boolean test = true;
		length = x.length();
		for(int c = 0; c < length; c++){
			for(int c2 = c + 1; c2 < length; c2++){
				if(x.charAt(c)==x.charAt(c2)){
					test = false;
				}
			}
		}
		return test;
	}
	public boolean isWord(String x){
		char first = x.charAt(0);
		buffer = getLetterArray(first);
		int location = stringArraySearcher(x, buffer);
		if(location != -1){
			return true;
		}
		else {
			return false;
		}
	}
	public int stringArraySearcher(String testing, String[] words){
		int start = 0;
		int end = words.length - 1;
		int mid;
		while(start<=end){
			mid = (start+end)/2;
			if(testing.compareTo(words[mid]) == 0){
				return mid;
			}
			else if(testing.compareTo(words[mid]) < 0){
				end = mid - 1;
			}
			else{
				start = mid + 1;
			}
		}
		return -1;
	}
	public int playerSelect(){
		if(turnCount%2 == 0){
			return 1;
		}
		else {
			return 0;
		}
	}
	public String setUserWord(){
		scan = new Scanner(System.in);
		System.out.print("What is your secret word?\t");
		String userWord = scan.next().trim().toLowerCase();
		if(isWord(userWord) == true){
			return userWord;
		}
		else {
			System.out.println("That word is not in our dictionary.");
			return setUserWord();
		}
	}
	public int charToInt(char a){
		int val;
		switch(a){
			case 'a':
				val = 0;
				break;
			case 'b':
				val = 1;
				break;
			case 'c':
				val = 2;
				break;
			case 'd':
				val = 3;
				break;
			case 'e':
				val = 4;
				break;
			case 'f':
				val = 5;
				break;
			case 'g':
				val = 6;
				break;
			case 'h':
				val = 7;
				break;
			case 'i':
				val = 8;
				break;
			case 'j':
				val = 9;
				break;
			case 'k':
				val = 10;
				break;
			case 'l':
				val = 11;
				break;
			case 'm':
				val = 12;
				break;
			case 'n':
				val = 13;
				break;
			case 'o':
				val = 14;
				break;
			case 'p':
				val = 15;
				break;
			case 'q':
				val = 16;
				break;
			case 'r':
				val = 17;
				break;
			case 's':
				val = 18;
				break;
			case 't':
				val = 19;
				break;
			case 'u':
				val = 20;
				break;
			case 'v':
				val = 21;
				break;
			case 'w':
				val = 22;
				break;
			case 'x':
				val = 23;
				break;
			case 'y':
				val = 24;
				break;
			case 'z':
				val = 25;
				break;
			default:
				val = -1;
				break;
		}
		return val;
	}
	public char intToChar(int a){
		char val;
		switch(a){
			case 0:
				val = 'a';
				break;
			case 1:
				val = 'b';
				break;
			case 2:
				val = 'c';
				break;
			case 3:
				val = 'd';
				break;
			case 4:
				val = 'e';
				break;
			case 5:
				val = 'f';
				break;
			case 6:
				val = 'g';
				break;
			case 7:
				val = 'h';
				break;
			case 8:
				val = 'i';
				break;
			case 9:
				val = 'j';
				break;
			case 10:
				val = 'k';
				break;
			case 11:
				val = 'l';
				break;
			case 12:
				val = 'm';
				break;
			case 13:
				val = 'n';
				break;
			case 14:
				val = 'o';
				break;
			case 15:
				val = 'p';
				break;
			case 16:
				val = 'q';
				break;
			case 17:
				val = 'r';
				break;
			case 18:
				val = 's';
				break;
			case 19:
				val = 't';
				break;
			case 20:
				val = 'u';
				break;
			case 21:
				val = 'v';
				break;
			case 22:
				val = 'w';
				break;
			case 23:
				val = 'x';
				break;
			case 24:
				val = 'y';
				break;
			case 25:
				val = 'z';
				break;
			default:
				val = '0';
				break;
		}
		return val;
	}
}