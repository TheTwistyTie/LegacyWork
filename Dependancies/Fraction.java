import java.math.*;
public class Fraction{

	private int wholeNum = 0;
	private int numerator = 0;
	private int denominator = 1;

	public Fraction(int wholeNum, int numerator, int denominator){
		this.wholeNum = wholeNum;
		this.numerator = numerator;
		this.denominator = denominator;
		validityChecker();
	} 

	public Fraction(int numerator, int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
		validityChecker();
	}

	public Fraction(int wholeNum){
		this.wholeNum = wholeNum;
	}

	public Fraction(double decimal){
		wholeNum = (int) decimal;
		BigDecimal deci = new BigDecimal(Double.toString(decimal));
		deci = deci.subtract(BigDecimal.valueOf(wholeNum));
		denominator = deci.scale() * 10;
		numerator = deci.unscaledValue().intValue();
		simplify();
	}

	public Fraction(float decimal){
		wholeNum = (int) decimal;
		BigDecimal deci = new BigDecimal(Float.toString(decimal));
		deci = deci.subtract(BigDecimal.valueOf(wholeNum));
		denominator = deci.scale() * 10;
		numerator = deci.unscaledValue().intValue();
		simplify();
	}

	private void validityChecker(){
		if(denominator == 0){
			throw new FractionRuntimeException("The denominator cannot equal 0.");
		}
		if(denominator < 0){
			denominator *= -1;
			numerator *= -1;
			simplify();
		}
	}

	public void setWholeNumber(int x){
		wholeNum = x;
	}

	public int getWholeNumber(){
		return wholeNum;
	}

	public int getNumerator(){
		return numerator;
	}
	public int getDenominator(){
		return denominator;
	}

	public String toString(){
		String str = "";
		if(wholeNum != 0){
		str += wholeNum + " ";
		}
		if(numerator != 0){
			str += numerator + "/" + denominator;
		}
		if(wholeNum == 0 && numerator == 0){
			str = "0";
		}
		return  str;
	}

	public void simplify(){
		if(wholeNum < 0 && numerator > 0){
			wholeNum -= numerator/denominator;
		}
		else if(wholeNum > 0 && numerator < 0){
			wholeNum *= -1;
			wholeNum += (numerator/denominator);
		}
		else{
			wholeNum += numerator/denominator;
		}
		numerator = Math.abs(numerator%denominator);
		if(numerator == 0){
			denominator = 1;
		}
		int gcf = getGCF(numerator, denominator);
		numerator = numerator/gcf;
		denominator = denominator/gcf;
	}

	public int getGCF(int x, int y){
		if(x<y){
			for(int i = x; i > 0; i--){
				if(x%i == 0 && y%i == 0){
					return i;
				}
			}
			return 1;
		}
		else if(x==y){
			return x;
		}
		else{
			return getGCF(y, x);
		}
	}

	public Fraction add(Fraction augend){
		toImproperFraction();
		augend.toImproperFraction();
		int compNum = numerator*augend.getDenominator() + denominator*augend.getNumerator();
		int compDem = denominator * augend.getDenominator();
		Fraction sum = new Fraction(compNum, compDem);
		sum.simplify();
		return sum;
	}

	public Fraction add(int augend){
		 return add(new Fraction(augend));
	}

	public Fraction add(double augend){
		 return add(new Fraction(augend));
	}

	public Fraction add(float augend){
		 return add(new Fraction(augend));
	}

	public Fraction subtract(Fraction subtrahend){
		toImproperFraction();
		subtrahend.toImproperFraction();
		int compNum = numerator*subtrahend.getDenominator() - denominator*subtrahend.getNumerator();
		int compDem = denominator * subtrahend.getDenominator();
		Fraction difference = new Fraction(compNum, compDem);
		difference.simplify();
		return difference;
	}

	public Fraction subtract(int subtrahend){
		 return subtract(new Fraction(subtrahend));
	}

	public Fraction subtract(double subtrahend){
		 return subtract(new Fraction(subtrahend));
	}

	public Fraction subtract(float subtrahend){
		 return subtract(new Fraction(subtrahend));
	}

	public Fraction multiply(Fraction multiplicand){
		toImproperFraction();
		multiplicand.toImproperFraction();
		int compNum = numerator * multiplicand.getNumerator();
		int compDem = denominator * multiplicand.getDenominator();
		Fraction product = new Fraction(compNum, compDem);
		product.simplify();
		return product;
	}

	public Fraction multiply(int multiplicand){
		 return multiply(new Fraction(multiplicand));
	}

	public Fraction multiply(double multiplicand){
		 return multiply(new Fraction(multiplicand));
	}

	public Fraction multiply(float multiplicand){
		 return multiply(new Fraction(multiplicand));
	}

	public Fraction divide(Fraction divisor){
		toImproperFraction();
		divisor.toImproperFraction();
		int compNum = numerator * divisor.getDenominator();
		int compDem = denominator * divisor.getNumerator();
		Fraction quotient = new Fraction(compNum, compDem);
		quotient.simplify();
		return quotient;
	}

	public Fraction divide(int divisor){
		 return divide(new Fraction(divisor));
	}

	public Fraction divide(double divisor){
		 return divide(new Fraction(divisor));
	}

	public Fraction divide(float divisor){
		 return divide(new Fraction(divisor));
	}

	public void toImproperFraction(){
		numerator += (wholeNum * denominator);
		wholeNum = 0;
	}

	public double decimalValue(){
		double value = wholeNum;
		value += (numerator + 0.0)/denominator;
		return value;
	}

	public int compareTo(Fraction comparitor){
		simplify();
		comparitor.simplify();
		if(wholeNum < comparitor.getWholeNumber()){
			return -1;
		}
		else if(wholeNum > comparitor.getWholeNumber()){
			return 1;
		}
		else{
			int thisNum = numerator * comparitor.getDenominator();
			int compNum = denominator * comparitor.getNumerator();
			if(thisNum > compNum){
				return 1;
			}
			else if(thisNum < compNum){
				return -1;
			}
			else {
				return 0;
			}
		}
	}

	public int compareTo(int compare){
		simplify();
		if(wholeNum > compare){
			return 1;
		}
		else if(wholeNum < compare){
			return -1;
		}
		else{
			if(numerator != 0){
				return 1;
			}
			else{
				return 0;
			}
		}
	}

	public int compareTo(double compare){
		Fraction testMe = new Fraction(compare);
		return compareTo(testMe);
	}

	public int compareTo(float compare){
		Fraction testMe = new Fraction(compare);
		return compareTo(testMe);
	}

	public Fraction pow(int power){
		toImproperFraction();
		int newNum = (int)Math.pow(numerator, power);
		int newDem = (int)Math.pow(denominator, power);
		Fraction solution;
		if(power<0){
			solution = new Fraction(newDem, newNum);
		}
		else{
			solution = new Fraction(newNum, newDem);
		}
		solution.simplify();
		return solution;
	}

	public void abs(){
		if(wholeNum<0){
			wholeNum = Math.abs(wholeNum);
		}
		if(numerator<0){
			numerator = Math.abs(numerator);
		}
	}

	public void negate(){
		simplify();
		if(wholeNum != 0){
			wholeNum = wholeNum * -1;
		}
		else{
			numerator = numerator * -1;
		}
	}

	public boolean isNegative(){
		return (wholeNum<0 || numerator<0);
	}

}

