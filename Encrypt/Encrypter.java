import java.util.Random;
import java.math.BigInteger;
public class Encrypter {
	String coded, key = "", start, output="";
	int nKey;
	public Encrypter(String x){
		start = x;
		key = getKey();
		String[] splitKey = key.split(":");
		coded = code(start, key);
		output = "The encrypted message is: " + coded + "\n" + "The key is: " + key;
		System.out.println(output);
	}
	public String getKey(){
		int c, temp;
		Random rand = new Random();
		for(c = 0; c < 5; c++){
			nKey = rand.nextInt(9999) + 1;
			if(c!= 4){
				key = key + nKey + ":";
			}
			else{
				key = key + nKey;
			}
		}
		return key;
	}
	public String code(String input, String key){
		String[] words = input.split("_");
		String[] keys = key.split(":");
		String word = "", finished = "", keyed = "", concat = "", stemp = "", wordcount = "";
		int length = words.length;
		int wLength = 0, counter = 0, numLeng = 0, counter2 = 0, c = 0, wordLength = 0;
		char letter;
		BigInteger lets = BigInteger.valueOf(0), numKey = BigInteger.valueOf(0);
		while(length > 0){
			word = words[counter];
			counter++;
			wLength = word.length();
			while(wLength > 0){
				letter = word.charAt(wLength - 1);
				switch(letter) {
					case 'a':
						keyed = "11";
						break;
					case 'b':
						keyed = "12";
						break;
					case 'c':
						keyed = "13";
						break;
					case 'd':
						keyed = "14";
						break;
					case 'e':
						keyed = "15";
						break;
					case 'f':
						keyed = "16";
						break;
					case 'g':
						keyed = "17";
						break;
					case 'h':
						keyed = "18";
						break;
					case 'i':
						keyed = "19";
						break;
					case 'j':
						keyed = "21";
						break;
					case 'k':
						keyed = "22";
						break;
					case 'l':
						keyed = "23";
						break;
					case 'm':
						keyed = "24";
						break;
					case 'n':
						keyed = "25";
						break;
					case 'o':
						keyed = "26";
						break;
					case 'p':
						keyed = "27";
						break;
					case 'q':
						keyed = "28";
						break;
					case 'r':
						keyed = "29";
						break;
					case 's':
						keyed = "31";
						break;
					case 't':
						keyed = "32";
						break;
					case 'u':
						keyed = "33";
						break;
					case 'v':
						keyed = "34";
						break;
					case 'w':
						keyed = "35";
						break;
					case 'x':
						keyed = "36";
						break;
					case 'y':
						keyed = "37";
						break;
					case 'z':
						keyed = "38";
						break;
					case '.':
						keyed = "39";
						break;
					case ',':
						keyed = "41";
						break;
					case '?':
						keyed = "42";
						break;
					case '\'':
						keyed = "43";
						break;
				}
				concat = concat + keyed + ":";
				wLength--;
			}
			length--;
			wordLength = word.length();
			wordcount = wordcount + wordLength + ":";
		}
		String[] numbered = concat.split(":");
		numLeng = numbered.length;
		while(counter2 < numLeng){
			stemp = numbered[counter2];
			lets = lets.add(new BigInteger(stemp));
			for(c=0;c<5;c++){
				numKey = numKey.add(new BigInteger(keys[c]));
				lets = lets.multiply(numKey);
			}
			finished = finished + lets + ":";
			counter2++;
		}
		finished = finished + "| " + wordcount;
		return finished;
	}
}