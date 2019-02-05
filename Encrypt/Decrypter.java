import java.math.BigInteger;
public class Decrypter{
	public Decrypter (String input, String key){
		String[] start = input.split("|");
		String[] letters = start[0].split(":");
		String[] wordLengths = start[1].split(":");
		String[] splitKey = key.split(":");
		BigInteger key1 = BigInteger.valueOf(0);
		BigInteger key2 = BigInteger.valueOf(0);
		BigInteger key3 = BigInteger.valueOf(0);
		BigInteger key4 = BigInteger.valueOf(0);
		BigInteger key5 = BigInteger.valueOf(0);
		key1 = key1.add(new BigInteger(splitKey[0]));
		key2 = key1.add(new BigInteger(splitKey[1]));
		key3 = key1.add(new BigInteger(splitKey[2]));
		key4 = key1.add(new BigInteger(splitKey[3]));
		key5 = key1.add(new BigInteger(splitKey[4]));
		int length = letters.length, counter = 0;
		BigInteger letter = new BigInteger("0");
		while(counter < length){
				letter = letter.add(new BigInteger(letters[counter]));
				System.out.println(length);
				System.out.println(letter);
				System.out.println(letters[counter]);
				letter = letter.divide(key5);
				letter = letter.divide(key4);
				letter = letter.divide(key3);
				letter = letter.divide(key2);
				letter = letter.divide(key1);
				System.out.println(letter);
				counter++;
				letter = BigInteger.valueOf(0);
		}
	}
}