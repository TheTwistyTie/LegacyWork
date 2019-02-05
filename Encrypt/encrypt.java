import java.util.Scanner;

class encrypt {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x, key;
		boolean pass = false;
		String input = " ",word = " ", finished = "_";
		while(pass == false){
			System.out.println("What would you like to encrypt? Use _ instead of a space.");
			input = scan.next().toLowerCase();
			if(input.contains("_")){
				pass = true;
			}
			else{
				System.out.println("Remember to use _ instead of a space.");
			}
		}
		System.out.println("What do you want the key to be? (int)");
		key = scan.nextInt();
		String[] words = input.split("_");
		String[] encrypted = new String[words.length];
		for(x=0; x<words.length; x++){
			word = words[x];
			encrypted[x] = getEncrypted(word, key);
		}
		for(x=0; x<encrypted.length; x++){
			finished = finished + encrypted[x] + "_";
		}
		System.out.println("The encrypted text is:");
		System.out.println(finished + "_");
	}
	public static String getEncrypted(String x, int key){
		Scanner scan = new Scanner(System.in);
		char y;
		String output = "_", letter = " ";
		int count = 0, position = 0, place= 0, keyed = 0;
		int length = x.length();
		while(count < length){
			place = length - position - 1;
			y = x.charAt(place);
			position++;
			count++;
			switch(y) {
				case 'a':
					keyed = 11 * key; //605
					letter = Integer.toString(keyed);
					break;
				case 'b':
					keyed = 12 * key;
					letter = Integer.toString(keyed);
					break;
				case 'c':
					keyed = 13 * key;
					letter = Integer.toString(keyed);
					break;
				case 'd':
					keyed = 14 * key;
					letter = Integer.toString(keyed);
					break;
				case 'e':
					keyed = 15 * key;
					letter = Integer.toString(keyed);
					break;
				case 'f':
					keyed = 16 * key;
					letter = Integer.toString(keyed);
					break;
				case 'g':
					keyed = 17 * key;
					letter = Integer.toString(keyed);
					break;
				case 'h':
					keyed = 18 * key;
					letter = Integer.toString(keyed);
					break;
				case 'i':
					keyed = 19 * key;
					letter = Integer.toString(keyed);
					break;
				case 'j':
					keyed = 21 * key;
					letter = Integer.toString(keyed);
					break;
				case 'k':
					keyed = 22 * key;
					letter = Integer.toString(keyed);
					break;
				case 'l':
					keyed = 23 * key;
					letter = Integer.toString(keyed);
					break;
				case 'm':
					keyed = 24 * key;
					letter = Integer.toString(keyed);
					break;
				case 'n':
					keyed = 25 * key;
					letter = Integer.toString(keyed);
					break;
				case 'o':
					keyed = 26 * key;
					letter = Integer.toString(keyed);
					break;
				case 'p':
					keyed = 27 * key;
					letter = Integer.toString(keyed);
					break;
				case 'q':
					keyed = 28 * key;
					letter = Integer.toString(keyed);
					break;
				case 'r':
					keyed = 29 * key;
					letter = Integer.toString(keyed);
					break;
				case 's':
					keyed = 31 * key;
					letter = Integer.toString(keyed);
					break;
				case 't':
					keyed = 32 * key;
					letter = Integer.toString(keyed);
					break;
				case 'u':
					keyed = 33 * key;
					letter = Integer.toString(keyed);
					break;
				case 'v':
					keyed = 34 * key;
					letter = Integer.toString(keyed);
					break;
				case 'w':
					keyed = 35 * key;
					letter = Integer.toString(keyed);
					break;
				case 'x':
					keyed = 36 * key;
					letter = Integer.toString(keyed);
					break;
				case 'y':
					keyed = 37 * key;
					letter = Integer.toString(keyed);
					break;
				case 'z':
					keyed = 38 * key;
					letter = Integer.toString(keyed);
					break;
				case '.':
					keyed = 39 * key;
					letter = Integer.toString(keyed);
					break;
				case ',':
					keyed = 41 * key;
					letter = Integer.toString(keyed);
				case '?':
					keyed = 42 * key;
					letter = Integer.toString(keyed);
				case '\'':
					keyed = 43 * key;
					letter = Integer.toString(keyed);
			}
			output = output + letter;
		}
		return output;
	}
}