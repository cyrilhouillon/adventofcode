package day.ten;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseTest {
	
	SubListReverser reverser = new SubListReverser();

	@Test
	void test() {
		int[] list = new ListProvider(5).getNew();
		
		reverser.reverse(list, 0, 3);
		assertArrayEquals(new int[]{2,1,0,3,4}, list);
		
		reverser.reverse(list, 3, 4);
		assertArrayEquals(new int[]{4,3,0,1,2}, list);
		
		reverser.reverse(list, 3, 1);
		assertArrayEquals(new int[]{4,3,0,1,2}, list);
		
		reverser.reverse(list, 1, 5);
		assertArrayEquals(new int[]{3,4,2,1,0}, list);
		
	}
}
