package day.ten;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HashTest {

	@Test
	void test() {
		Hash hash = new Hash(new ListProvider(5));
		
		int result = hash.hashOf(new int[]{3});
		assertEquals(2, result);

		result = hash.hashOf(new int[]{3, 4});
		assertEquals(12, result);

		result = hash.hashOf(new int[]{3, 4, 1});
		assertEquals(12, result);

		result = hash.hashOf(new int[]{3, 4, 1, 5});
		assertEquals(12, result);
	}

	
	@Test
	void testPuzzle() {
		int[] puzzleInput = new int[] {183,0,31,146,254,240,223,150,2,206,161,1,255,232,199,88};
		Hash hash = new Hash(new ListProvider(256));
		int result = hash.hashOf(puzzleInput);
		assertEquals(15990, result);

	}
}
