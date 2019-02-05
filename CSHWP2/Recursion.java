public class Recursion{
	public void Recursion(){

	}
	public double doThis(int num){
		if(num == 1){
			return 1;
		}
		else{
			return (1.0/num) + doThis(num - 1);
		}
	}
	public int nFac(int n){
		if(n==0){
			return 1;
		}
		else{
			return nFac(n-1)*n;
		}
	}
	public double aToTheN(double a, int n){
		if(n==0){
			return 1;
		}
		else{
			return (a * aToTheN(a, n-1));
		}
	}
	public double power2(double a, int n){
		if(n==0){
			return 1;
		}
		else if(n%2==0){
			return power2(a, n/2) * power2(a, n/2);
		}
		else{
			return a*power2(a, n/2) * power2(a, n/2);
		}
	}
	public double power3(double a, int n){
		if(n==0){
			return 1;
		}
		else{
			double temp = power2(a, n/2);
			if(n%2==0){
				return temp*temp;
			}
			else{
				return a*temp*temp;
			}
		}
	}
	public void print_Hello_N_times(int n){
		if(n == 1){
			System.out.println("Hello");
		}
		else{
			System.out.println("Hello");
			print_Hello_N_times(n-1);
		}
	}
	public void printArray(int[] list, int n){
		if (n>0){
			printArray(list, n-1);
			System.out.print("	" + list[n-1]);
		}
	}
}