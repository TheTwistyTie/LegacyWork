public class Harmonics{
	public static void main(String[] args){
		double fin = 0.0;
		Recursion rec = new Recursion();
		fin = rec.power3(2, 5);
		System.out.println(fin);
		fin = rec.power3(2, 6);
		System.out.println(fin);
		rec.print_Hello_N_times(5);
		int[] list = new int[5];
		list[0]= 1;
		list[1]= 2;
		list[2]= 3;
		list[3]= 4;
		list[4]= 5;
		rec.printArray(list, 5);
	}
}