public class Do{
	public long getFibonacci(long x){
		if(x==1 || x==2){
			return 1;
		}
		else{
			long y = getFibonacci(x-1) + getFibonacci(x-2);
			return y;
		}
	}
}