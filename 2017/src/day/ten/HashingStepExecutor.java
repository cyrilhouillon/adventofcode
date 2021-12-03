package day.ten;

import static java.util.Arrays.copyOf;

public class HashingStepExecutor {

	private SubListReverser subListReverser;
	private int[] list;
	private int cursor;
	private int skip;

	public HashingStepExecutor(int[] list, SubListReverser subListReverser) {
		this.subListReverser = subListReverser;
		this.list = list;
		cursor = 0;
		skip=0;
	}

	public void reverse(int length) {
		subListReverser.reverse(list, cursor, length);
		cursor+= length + skip;
		skip++;
	}
	
	public int[] getHashList() {
		return copyOf(list, list.length);
	}
}
