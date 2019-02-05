public class ClosestSquare{
	public static void main(String[] args){
	double x=0, test = 3120;
		while((x*x)<test){
			x++;
		}
		double temp = test - Math.pow(x, 2), temp2 = Math.abs(test - Math.pow((x+1), 2));
		if(temp < temp2){
			System.out.print(x);
		}
		else {
			System.out.print(x+1);
		}
	}
}