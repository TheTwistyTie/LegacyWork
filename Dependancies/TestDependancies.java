public class TestDependancies {
	public static void main(String[] args) {
		Fraction fracA = new Fraction(5, 12, 48);
		Fraction fracB = new Fraction(6, 12, 21);
		Fraction fracC = fracA.multiply(fracB);
		System.out.println(fracC);
		Fraction fracD = fracC.pow(2);
		fracD.simplify();
		System.out.println(fracD);
		Fraction fracE = fracD.subtract(1000);
		System.out.println(fracE);
	}
}


//System.out.println();