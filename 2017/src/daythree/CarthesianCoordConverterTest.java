package daythree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarthesianCoordConverterTest {
	
	private CarthesianCoordConverter carthesianCoordConverter = new CarthesianCoordConverter();

	@Test
	void cartesianOf1() {
		int index = 1;

		Coord coords = carthesianCoordConverter.toCartesian(index);

		assertEquals(0, coords.x);
		assertEquals(0, coords.y);
	}

	@Test
	void cartesianOf9() {
		int index = 9;

		Coord coords = carthesianCoordConverter.toCartesian(index);

		assertEquals(1, coords.x);
		assertEquals(-1, coords.y);
	}

	@Test
	void cartesianOf25() {
		int index = 25;

		Coord coords = carthesianCoordConverter.toCartesian(index);

		assertEquals(2, coords.x);
		assertEquals(-2, coords.y);
	}
	
	@Test
	void cartesianOfSquare1() {
		Coord coords = carthesianCoordConverter.toCartesian(2);
		assertEquals(1, coords.x);
		assertEquals(0, coords.y);
		
		coords = carthesianCoordConverter.toCartesian(3);
		assertEquals(1, coords.x);
		assertEquals(1, coords.y);
		
		coords = carthesianCoordConverter.toCartesian(4);
		assertEquals(0, coords.x);
		assertEquals(1, coords.y);
		
		coords = carthesianCoordConverter.toCartesian(5);
		assertEquals(-1, coords.x);
		assertEquals(1, coords.y);
		
		coords = carthesianCoordConverter.toCartesian(6);
		assertEquals(-1, coords.x);
		assertEquals(0, coords.y);
		
		coords = carthesianCoordConverter.toCartesian(7);
		assertEquals(-1, coords.x);
		assertEquals(-1, coords.y);
		
		coords = carthesianCoordConverter.toCartesian(8);
		assertEquals(0, coords.x);
		assertEquals(-1, coords.y);
		
		coords = carthesianCoordConverter.toCartesian(9);
		assertEquals(1, coords.x);
		assertEquals(-1, coords.y);
	}

}
