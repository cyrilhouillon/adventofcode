package day.ten;

import java.util.stream.IntStream;

public class ListProvider {

	private final int length;

	public ListProvider(int length) {
		this.length = length;
	}


	public int[] getNew() {
		return IntStream.range(0, length).toArray();
	}
}
