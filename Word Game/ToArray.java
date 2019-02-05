class ToArray {
	public char[] ToArray(String x){
		int count = 0;
		char[] array = new char[4];
		while( count < 4 ){
			array[count] = x.charAt(count);
			count++;
		}
		return array;
	}
}