public class BinarySearch{
	
	public <T extends Comparable<T>> int BinarySearch(T[] list, T target, int returnPoint){
		return BinarySearch(list, target, 0, list.length, returnPoint);
	}

	public <T extends Comparable<T>> int BinarySearch(T[] list, T target){
		return BinarySearch(list, target, 0, list.length - 1, 0);
	}

	public <T extends Comparable<T>> int BinarySearch(T[] list, T target, int first, int last, int returnPoint){
		if(first <= last){
			int mid = (first + last)/2;
			int compResult = target.compareTo(list[mid]);
			if(compResult < 0){
				return BinarySearch(list, target, first, mid-1, returnPoint);
			}
			else if(compResult > 0){
				return BinarySearch(list, target, mid+1, last, returnPoint);
			}
			else{
				return mid;
			}
		}
		if(returnPoint < 0){
			return last;
		}
		else if(returnPoint > 0){
			return first;
		}
		else{
			return -1;
		}
	}
}

//System.out.println();