package day.ten;

public class SubListReverser {

	public void reverse(int[] list, int cursor, int length){
		int[] temp = new int[length];
		for(int i = 0; i < length; i++) {
			temp[length - i - 1] = list[(cursor+i)%list.length];
		}
		
		for (int i = 0; i < length; i++) {
			list[(cursor+i)%list.length] = temp[i];
		}
	}

}
