public interface Tools{
	//returns a random number between the specified range
	public int randomNumber(int min, int max);

	//Handles math operations between two fractions
	//Format example: "3/2", "1 1/2", "1/2", "-1 1/2", "-1/2", "12"
	//Operation code key:
	//0 = add
	//1 = subtract
	//2 = multiply
	//3 = divide
	public String fractionHandler(String fractionA, String fractionB, int operation);

	//Converts mixed numbers to improper fractions
	//Format example: "1 1/2", "-1 1/2"
	public String toImproperFraction(String fraction);

	//Simplifies fractions to mixed numbers
	//Format example: "3/2", "1 1/2", "1/2", "-1 1/2", "-1/2"
	public String simplifyFraction(String fraction);

	//takes a string array of any length and converts it to an int array of the same length
	public int[] stringArrToIntArr(String[] unprocessed);

	//Checks a string to see if it only contains an interger value
	public boolean isNumber(String str);

	//Converts a fraction to a decimal
	//Format example: "3/2", "1 1/2", "1/2", "-1 1/2", "-1/2", "12"
	public double fractionToDecimal(String fraction);

	//Converts a decimal to a simplified fraction
	//Format example: "8.2", "0.1", "-5.6"
	public String decimalToFraction(double decimal);

}