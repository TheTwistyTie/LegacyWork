public class TestSearch{
	public static void main(String[] args){
		int[] strings = {1, 2, 3, 4, 5, 6, 7};
	BinarySearch search = new BinarySearch();
	int compResult = search.BinarySearch(strings, 5, -1);
	System.out.println(compResult);
	}
}