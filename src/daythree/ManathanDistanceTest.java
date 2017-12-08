package daythree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ManathanDistanceTest {
	
	private CarthesianCoordConverter converter = new CarthesianCoordConverter();
	private ManathanDistance manathanDistance = new ManathanDistance(converter);

	@Test
	void test1() {
		int index = 1;

		int distance = manathanDistance.fromCenter(index);
		
		assertEquals(0, distance);
	}

	@Test
	void test12() {
		int index = 12;

		int distance = manathanDistance.fromCenter(index);
		
		assertEquals(3, distance);
	}

	@Test
	void test23() {
		int index = 23;

		int distance = manathanDistance.fromCenter(index);
		
		assertEquals(2, distance);
	}

	@Test
	void test1024() {
		int index = 1024;

		int distance = manathanDistance.fromCenter(index);
		
		assertEquals(31, distance);
	}

	@Test
	void testPuzzle() {
		int index = 289326;

		int distance = manathanDistance.fromCenter(index);
		
		assertEquals(419, distance);
	}

}
