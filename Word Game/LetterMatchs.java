class LetterMatches {
	public int matches(String played, String testing){
		ToArray toArray = new ToArray();
		char[] playedArray = toArray.ToArray(played);
		char[] testingArray = toArray.ToArray(testing);
		int c1 = 0, c2 = 0, same = 0;
		while(c1 < 4){
			while(c2 < 4){
				if(playedArray[c1] == testingArray[c2]){
					same++;
				}
				c2++;
			}
			c2 = 0;
			c1++;
		}
		return same;
	}
}