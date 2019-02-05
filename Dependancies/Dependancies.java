import java.util.Random;
import java.lang.Error;
import java.util.Arrays;
import java.math.*;
public class Dependancies implements Tools{
	public boolean errorOccured = false;
	public String whatIsError = null;

	public int randomNumber(int min, int max){
		Random rand = new Random();
		if(max > min){
			max = max - min;
			return rand.nextInt(max) + min + 1;
		}
		else {
			throw new Error("randomNumber: Max must be larger than Min");
		}
	}

	public String fractionHandler(String fractionA, String fractionB, int operation){
		String output = null;
		int[] fracA = fracFormater(fractionA);
		int[] fracB = fracFormater(fractionB);
		switch(operation){
			case 0:
				output = addFrac(fracA, fracB);
				break;
			case 1:
				output = subFrac(fracA, fracB);
				break;
			case 2:
				output = mulFrac(fracA, fracB);
				break;
			case 3:
				output = divFrac(fracA, fracB);
				break;
			default:
				throw new Error("fractionHandler: Inproper operation code.");
		}
		return output;
	}

	public String simplifyFraction(String fraction){
		return fracArrayFormater(simplifyer(fracFormater(fraction)));
	}

	public String toImproperFraction(String fraction){
		return fracArrayFormater(toImproperFrac(fracFormater(fraction)));
	}

	public int[] stringArrToIntArr(String[] unprocessed){
		int length = unprocessed.length;
		int[] processed = new int[length];
		for(int i = 0; i < length; i++){
			processed[i] = Integer.valueOf(unprocessed[i]);
		}
		return processed;
	}

	public boolean isNumber(String str){
		return str.matches("\\d+");
	}

	public double fractionToDecimal(String fraction){
		int[] frac = fracFormater(fraction);
		double decimal = (frac[1] + 0.0)/frac[2];
		return decimal;
	}

	public String decimalToFraction(double decimal){
		int[] fraction = new int[3];
		fraction[0] = (int)decimal;
		BigDecimal deci = new BigDecimal(Double.toString(decimal));
		deci = deci.subtract(BigDecimal.valueOf(fraction[0]));
		fraction[2] = deci.scale() * 10;
		fraction[1] = deci.unscaledValue().intValue();
		return fracArrayFormater(simplifyer(fraction));
	}

	private String addFrac(int[] fracA, int[] fracB){
		int[] completed = {0 , 0 , 0};
		completed[2] = fracA[2] * fracB[2];
		int numA = fracA[1] * fracB[2];
		int numB = fracB[1] * fracA[2];
		completed[1] = numA + numB;
		int[] simplified = simplifyer(completed);
		return fracArrayFormater(simplified);
	}

	private String subFrac(int[] fracA, int[] fracB){
		int[] completed = {0 , 0 , 0};
		completed[2] = fracA[2] * fracB[2];
		int numA = fracA[1] * fracB[2];
		int numB = fracB[1] * fracA[2];
		completed[1] = numA - numB;
		int[] simplified = simplifyer(completed);
		return fracArrayFormater(simplified);
	}

	private String mulFrac(int[] fracA, int[] fracB){
		int[] completed = {0 , 0 , 0};
		completed[1] = fracA[1] * fracB[1];
		completed[2] = fracA[2] * fracB[2];
		int[] simplified = simplifyer(completed);
		return fracArrayFormater(simplified);
	}

	private String divFrac(int[] fracA, int[] fracB){
		int temp = fracB[1];
		fracB[1] = fracB[2];
		fracB[2] = temp;
		return mulFrac(fracA, fracB);
	}

	private int[] simplifyer(int[] fraction){
		int[] output = {0 , 0 , 0};
		output[0] = (fraction[1]/fraction[2]) + fraction[0];
		int num = fraction[1]%fraction[2];
		if(output[0]<0){
			num = Math.abs(num);
		}
		if(num != 0){
			int gcf = greatestCommonFactor(num, fraction[2]);
			output[1] = num/gcf;
			output[2] = fraction[2]/gcf;
		}
		return output;
	}

	private int greatestCommonFactor(int num, int denom){
		for(int i = num; i>0; i--){
			if(num%i == 0 && denom%i == 0){
				return i;
			}
		}
		return 1;
	}

	private int[] fracFormater(String fraction){
		String[] stringArray = {"0" , "0", "1"};
		String[] frac;
		if(!fraction.contains("/")){
			if(isNumber(fraction)){
				stringArray[1] = fraction;
			}
			else{
				throw new Error("fracFormater: Fraction contains non-numeraric character. \"" + fraction + "\"");
			}
		}
		else
		{
			if(fraction.contains(" ")){
				frac = fraction.split("\\s+");
				stringArray[0] = frac[0];
				String tempStr = frac[1];
				String[] tempArr = tempStr.split("/");
				stringArray[1] = tempArr[0];
				stringArray[2] = tempArr[1];
			}
			else{
				String[] temp = fraction.split("/");
				stringArray[1] = temp[0];
				stringArray[2] = temp[1];
			}
		}
		int[] intArray = stringArrToIntArr(stringArray);
		int[] improperFraction = toImproperFrac(intArray);
		return improperFraction;
	}

	private int[] toImproperFrac(int [] input){
		int newNumerator = (input[0] * input[2]);
		if(newNumerator < 0){
			newNumerator = newNumerator - input[1];
		}
		else{
			newNumerator = newNumerator + input[1];
		}
		int[] output = {0, newNumerator, input[2]};
		return output;
	}

	private String fracArrayFormater(int[] unformated){
		String output = "";
		if(unformated[0] != 0){
			output = output + unformated[0] + " ";
		}
		if(unformated[1] != 0){
			output = output + unformated[1] + "/" + unformated[2];
		}
		else if(unformated[0] == 0 && unformated[1] == 0){
			output = "0";
		}
		return output;
	}
}

