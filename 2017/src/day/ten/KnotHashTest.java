package day.ten;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KnotHashTest {

	private String puzzleInput = "183,0,31,146,254,240,223,150,2,206,161,1,255,232,199,88";
		
	KnotHash hash = new KnotHash();
	@Test
	void test() {
		assertEquals("a2582a3a0e66e6e86e3812dcb672a272", hash.hashOf(""));
		assertEquals("33efeb34ea91902bb2f59c9920caa6cd", hash.hashOf("AoC 2017"));
		assertEquals("3efbe78a8d82f29979031a4aa0b16a9d", hash.hashOf("1,2,3"));
		assertEquals("63960835bcdc130f0b66d7ff4f6a5a8e", hash.hashOf("1,2,4"));
		
		assertEquals("90adb097dd55dea8305c900372258ac6", hash.hashOf(puzzleInput));
	}

}
