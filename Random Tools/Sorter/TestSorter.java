import java.util.Arrays;

public class TestSorter{
	public static void main(String[] args){
		Integer[] testerArray = {23,53,12,64,12,53,1};
		Sorter sort = new Sorter();
		testerArray = sort.Sorter(testerArray, -1);
		System.out.println(Arrays.toString(testerArray));
	}
}