import java.math.BigInteger;
import java.io.*;
public class Encrypter{
	public String decrypt(String username, String password){
		int key = getKey(password), length = 0, counter = 0;
		String testPassword= "";
		try (BufferedReader br = new BufferedReader(new FileReader("userdata\\" + username + ".txt"))) {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    String everything = sb.toString().trim();
			BigInteger encryptedPassword = new BigInteger(everything);
			encryptedPassword = encryptedPassword.divide(BigInteger.valueOf(key));
			String[] split = encryptedPassword.toString().split("(?<=\\G..)");
			length = split.length;
			while(counter < length){
				testPassword = testPassword + numberToChar(Integer.parseInt(split[counter]));
				counter++;
			}
			return testPassword;
		}	catch (FileNotFoundException fnfe) {
			System.out.println("404 Error");
		}	catch(IOException e){
  			System.out.println("IO Error");
		}
		return null;
	}
	public String encrypt(String password){
		int key = getKey(password), length = password.length(), c = 0;
		String step1 = "", finished = "";
		while(c<length){
			step1 = step1 + charToNumber(password.charAt(c));
			c++;
		}
		BigInteger step2 = new BigInteger(step1);
		BigInteger bKey = new BigInteger(Integer.toString(key));
		finished = finished + step2.multiply(bKey);
		return finished;
	}
	public int getKey(String x){
		int key;
		char start, end;
		int length = x.length();
		start = x.charAt(0);
		end = x.charAt(length - 1);
		return length + charToNumber(start) * charToNumber(end);
	}
	public int charToNumber(char letter){
		int keyed = 0;
		switch(letter) {
			case '0':
				keyed = 51;
				break;
			case '1':
				keyed = 52;
				break;
			case '2':
				keyed = 53;
				break;
			case '3':
				keyed = 54;
				break;
			case '4':
				keyed = 55;
				break;
			case '5':
				keyed = 56;
				break;
			case '6':
				keyed = 57;
				break;
			case '7':
				keyed = 58;
				break;
			case '8':
				keyed = 59;
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
			case 'A':
				keyed = 61;
				break;
			case 'B':
				keyed = 62;
				break;
			case 'C':
				keyed = 63;
				break;
			case 'D':
				keyed = 64;
				break;
			case 'E':
				keyed = 65;
				break;
			case 'F':
				keyed = 66;
				break;
			case 'G':
				keyed = 67;
				break;
			case 'H':
				keyed = 68;
				break;
			case 'I':
				keyed = 69;
				break;
			case 'J':
				keyed = 71;
				break;
			case 'K':
				keyed = 72;
				break;
			case 'L':
				keyed = 73;
				break;
			case 'M':
				keyed = 74;
				break;
			case 'N':
				keyed = 75;
				break;
			case 'O':
				keyed = 76;
				break;
			case 'P':
				keyed = 77;
				break;
			case 'Q':
				keyed = 78;
				break;
			case 'R':
				keyed = 79;
				break;
			case 'S':
				keyed = 81;
				break;
			case 'T':
				keyed = 82;
				break;
			case 'U':
				keyed = 83;
				break;
			case 'V':
				keyed = 84;
				break;
			case 'W':
				keyed = 85;
				break;
			case 'X':
				keyed = 86;
				break;
			case 'Y':
				keyed = 87;
				break;
			case 'Z':
				keyed = 88;
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
			case 51:
				keyed = '0';
				break;
			case 52:
				keyed = '1';
				break;
			case 53:
				keyed = '2';
				break;
			case 54:
				keyed = '3';
				break;
			case 55:
				keyed = '4';
				break;
			case 56:
				keyed = '5';
				break;
			case 57:
				keyed = '6';
				break;
			case 58:
				keyed = '7';
				break;
			case 59:
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
			case 61:
				keyed = 'A';
				break;
			case 62:
				keyed = 'B';
				break;
			case 63:
				keyed = 'C';
				break;
			case 64:
				keyed = 'D';
				break;
			case 65:
				keyed = 'E';
				break;
			case 66:
				keyed = 'F';
				break;
			case 67:
				keyed = 'G';
				break;
			case 68:
				keyed = 'H';
				break;
			case 69:
				keyed = 'I';
				break;
			case 71:
				keyed = 'J';
				break;
			case 72:
				keyed = 'K';
				break;
			case 73:
				keyed = 'L';
				break;
			case 74:
				keyed = 'M';
				break;
			case 75:
				keyed = 'N';
				break;
			case 76:
				keyed = 'O';
				break;
			case 77:
				keyed = 'P';
				break;
			case 78:
				keyed = 'Q';
				break;
			case 79:
				keyed = 'R';
				break;
			case 81:
				keyed = 'S';
				break;
			case 82:
				keyed = 'T';
				break;
			case 83:
				keyed = 'U';
				break;
			case 84:
				keyed = 'V';
				break;
			case 85:
				keyed = 'W';
				break;
			case 86:
				keyed = 'X';
				break;
			case 87:
				keyed = 'Y';
				break;
			case 88:
				keyed = 'Z';
				break;
			default:
				keyed = '~';
				break;
		}
		return keyed;
	}
}