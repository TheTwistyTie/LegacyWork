import java.util.Scanner;
import java.math.BigInteger;
class decrypt{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String input, finished = " ", temp = " ";
		int numWords, x;
		BigInteger key;
		System.out.println("What would you like to decrypt");
		input = scan.next();
		System.out.println("What is the key?");
		key = scan.nextBigInteger();
		if(input.contains("__")){
			String[] words = input.split("__");
			numWords = words.length - 1;
			for(x = 1; x<=numWords; x++){
				finished = finished + getFinished(words[x], key);
			}
		}
		else{
			finished = getFinished(input, key);
		}
		System.out.println(finished);
	}
	public static String getFinished(String x, BigInteger y){
		BigInteger word = new BigInteger(x);
		word = word.divide(y);
		String sWord = "" + word;
		String letter= " ", let, finished = " ";
		sWord = sWord.replace("0", "");
		String[] letters = sWord.split("(?<=\\G..)");
		int numletters = letters.length, c;
		for(c = (numletters - 1); c>=0; c--){
			let = letters[c];
			switch(let) {
				case "11":
					letter = "a";
					break;
				case "12":
					letter = "b";
					break;
				case "13":
					letter = "c";
					break;
				case "14":
					letter = "d";
					break;
				case "15":
					letter = "e";
					break;
				case "16":
					letter = "f";
					break;
				case "17":
					letter = "g";
					break;
				case "18":
					letter = "h";
					break;
				case "19":
					letter = "i";
					break;
				case "21":
					letter = "j";
					break;
				case "22":
					letter = "k";
					break;
				case "23":
					letter = "l";
					break;
				case "24":
					letter = "m";
					break;
				case "25":
					letter = "n";
					break;
				case "26":
					letter = "o";
					break;
				case "27":
					letter = "p";
					break;
				case "28":
					letter = "q";
					break;
				case "29":
					letter = "r";
					break;
				case "31":
					letter = "s";
					break;
				case "32":
					letter = "t";
					break;
				case "33":
					letter = "u";
					break;
				case "34":
					letter = "v";
					break;
				case "35":
					letter = "w";
					break;
				case "36":
					letter = "x";
					break;
				case "37":
					letter = "y";
					break;
				case "38":
					letter = "z";
					break;
				case "39":
					letter = ".";
					break;
				case "41":
					letter = ",";
					break;
				case "42":
					letter = "?";
					break;
				case "43":
					letter = "\'";
					break;
			}
			finished = finished + letter;
		}
		return finished;
	}
}