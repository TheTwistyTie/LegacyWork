import java.util.ArrayList;

public class Sorter{

	public <T extends Comparable<T>> T[] Sorter(T[] list){
		return Sorter(list, 1);
	}
	public <T extends Comparable<T>> T[] Sorter(T[] list, int order){
		ArrayList<T> storedItems = new ArrayList<T>(list.length);
		for(T item: list){
			storedItems.add(item);
		}
		if(order > 0){
			list = sortAscending(list, storedItems);
		}
		else {
			list = sortDescending(list, storedItems);
		}
		return list;
	}

	private <T extends Comparable<T>> T[] sortAscending(T[] list, ArrayList<T> storedItems){
		int index = 0;
		while(index < list.length){
			T smallest = storedItems.get(0);
			int smallestPosition = 0;
			for(int i = 1; i < storedItems.size(); i++){
				if(smallest.compareTo(storedItems.get(i)) > 0){
					smallest = storedItems.get(i);
					smallestPosition = i;
				}
			}
			storedItems.remove(smallestPosition);
			list[index] = smallest;
			index++;
		}
		return list;
	}

	private <T extends Comparable<T>> T[] sortDescending(T[] list, ArrayList<T> storedItems){
		int index = 0;
		while(index < list.length){
			T smallest = storedItems.get(0);
			int smallestPosition = 0;
			for(int i = 1; i < storedItems.size(); i++){
				if(smallest.compareTo(storedItems.get(i)) < 0){
					smallest = storedItems.get(i);
					smallestPosition = i;
				}
			}
			storedItems.remove(smallestPosition);
			list[index] = smallest;
			index++;
		}
		return list;
	}

}