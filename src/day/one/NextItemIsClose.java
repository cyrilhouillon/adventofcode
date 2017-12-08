package day.one;

public class NextItemIsClose implements NextItemFinder {

	@Override
	public char getNextItem(char[] array, int i) {
		return i == (array.length-1) ? array[0] : array[i+1];
	}

}
