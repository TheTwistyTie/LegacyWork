public class NestedFractions{
	int wholeNumber = 0;
	Fraction top;
	Fraction bottom;
	public NestedFractions(int wholeNumber, Fraction top, Fraction bottom){
		this.wholeNumber = wholeNumber;
		this.top = top;
		this.bottom = bottom;
		simplify();
	}

	public NestedFractions(Fraction top, Fraction bottom){
		this.top = top;
		this.bottom = bottom;
		simplify();
	}

	public void simplify(){
		top.toImproperFraction();
		bottom.toImproperFraction();
		Fraction solution = top.divideFraction(bottom);
		solution.simplify();
		wholeNumber *= solution.getWholeNumber();
		solution.setWholeNumber(0);
		top = solution;
		bottom = new Fraction(1);
	}

	public String toString(){
		String str = "";
		simplify();
		if(wholeNumber != 0){
			str += wholeNumber + " ";
		}
		if(top.getNumerator() != 0){
			str += "(" + top + ") / (" + bottom + ")";
		}
		return str;
	}
}