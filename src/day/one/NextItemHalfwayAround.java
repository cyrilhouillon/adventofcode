package day.one;

public class NextItemHalfwayAround implements NextItemFinder {

	@Override
	public char getNextItem(char[] array, int i) {
		return array[(i + (array.length/2)) % array.length];
	}

}
