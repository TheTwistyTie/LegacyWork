public class Decrypter{
	public String decrypt(String username, String password){
		int key = getKey(password);
		System.out.println(key);
		return null;
	}
	public int getKey(String x){
		int key;
		char start, end;
		int length = x.length();
		start = x.toLowerCase().charAt(0);
		end = x.charAt(length - 1);
		return length + charToNumber(start) * charToNumber(end);
	}
	public int charToNumber(char letter){
		int keyed = 0;
		switch(letter) {
			case '0':
				keyed = 1;
				break;
			case '1':
				keyed = 2;
				break;
			case '2':
				keyed = 3;
				break;
			case '3':
				keyed = 4;
				break;
			case '4':
				keyed = 5;
				break;
			case '5':
				keyed = 6;
				break;
			case '6':
				keyed = 7;
				break;
			case '7':
				keyed = 8;
				break;
			case '8':
				keyed = 9;
				break;
			case '9':
				keyed = 10;
				break;
			case 'a':
				keyed = 11;
				break;
			case 'b':
				keyed = 12;
				break;
			case 'c':
				keyed = 13;
				break;
			case 'd':
				keyed = 14;
				break;
			case 'e':
				keyed = 15;
				break;
			case 'f':
				keyed = 16;
				break;
			case 'g':
				keyed = 17;
				break;
			case 'h':
				keyed = 18;
				break;
			case 'i':
				keyed = 19;
				break;
			case 'j':
				keyed = 21;
				break;
			case 'k':
				keyed = 22;
				break;
			case 'l':
				keyed = 23;
				break;
			case 'm':
				keyed = 24;
				break;
			case 'n':
				keyed = 25;
				break;
			case 'o':
				keyed = 26;
				break;
			case 'p':
				keyed = 27;
				break;
			case 'q':
				keyed = 28;
				break;
			case 'r':
				keyed = 29;
				break;
			case 's':
				keyed = 31;
				break;
			case 't':
				keyed = 32;
				break;
			case 'u':
				keyed = 33;
				break;
			case 'v':
				keyed = 34;
				break;
			case 'w':
				keyed = 35;
				break;
			case 'x':
				keyed = 36;
				break;
			case 'y':
				keyed = 37;
				break;
			case 'z':
				keyed = 38;
				break;
			case '.':
				keyed = 39;
				break;
			case ',':
				keyed = 41;
						break;
			case '?':
				keyed = 42;
				break;
			case '\'':
				keyed = 43;
				break;
			case '!':
				keyed = 44;
				break;
			case '@':
				keyed = 45;
				break;
			case '#':
				keyed = 46;
				break;
			case '$':
				keyed = 47;
				break;
			case '%':
				keyed = 48;
				break;
			case '^':
				keyed = 49;
				break;
			default:
				System.out.println(letter + " is not an accepted character.");
				break;
		}
		return keyed;
	}
	public char numberToChar(int number){
		char keyed = ' ';
		switch(number) {
			case 1:
				keyed = '0';
				break;
			case 2:
				keyed = '1';
				break;
			case 3:
				keyed = '2';
				break;
			case 4:
				keyed = '3';
				break;
			case 5:
				keyed = '4';
				break;
			case 6:
				keyed = '5';
				break;
			case 7:
				keyed = '6';
				break;
			case 8:
				keyed = '7';
				break;
			case 9:
				keyed = '8';
				break;
			case 10:
				keyed = '9';
				break;
			case 11:
				keyed = 'a';
				break;
			case 12:
				keyed = 'b';
				break;
			case 13:
				keyed = 'c';
				break;
			case 14:
				keyed = 'd';
				break;
			case 15:
				keyed = 'e';
				break;
			case 16:
				keyed = 'f';
				break;
			case 17:
				keyed = 'g';
				break;
			case 18:
				keyed = 'h';
				break;
			case 19:
				keyed = 'i';
				break;
			case 21:
				keyed = 'j';
				break;
			case 22:
				keyed = 'k';
				break;
			case 23:
				keyed = 'l';
				break;
			case 24:
				keyed = 'm';
				break;
			case 25:
				keyed = 'n';
				break;
			case 26:
				keyed = 'o';
				break;
			case 27:
				keyed = 'p';
				break;
			case 28:
				keyed = 'q';
				break;
			case 29:
				keyed = 'r';
				break;
			case 31:
				keyed = 's';
				break;
			case 32:
				keyed = 't';
				break;
			case 33:
				keyed = 'u';
				break;
			case 34:
				keyed = 'v';
				break;
			case 35:
				keyed = 'w';
				break;
			case 36:
				keyed = 'x';
				break;
			case 37:
				keyed = 'y';
				break;
			case 38:
				keyed = 'z';
				break;
			case 39:
				keyed = '.';
				break;
			case 41:
				keyed = ',';
				break;
			case 42:
				keyed = '?';
				break;
			case 43:
				keyed = '\'';
				break;
			case 44:
				keyed = '!';
				break;
			case 45:
				keyed = '@';
				break;
			case 46:
				keyed = '#';
				break;
			case 47:
				keyed = '$';
				break;
			case 48:
				keyed = '%';
				break;
			case 49:
				keyed = '^';
				break;
			default:
				keyed = '~';
				break;
		}
		return keyed;
	}
}