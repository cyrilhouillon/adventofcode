package daythree;

import static org.junit.jupiter.api.Assertions.*;

class FromCarthesianTest {

	@org.junit.jupiter.api.Test
	void findIndexOnSquare1() {
		int x=0;
		int y=0;
		
		int index = fromCartesian(x, y);
		
		assertEquals(1, index);
	}

	@org.junit.jupiter.api.Test
	void findIndexOnSquare2() {
		
		assertEquals(2, fromCartesian(1, 0));
		assertEquals(3, fromCartesian(1, 1));
		assertEquals(4, fromCartesian(0, 1));
		assertEquals(5, fromCartesian(-1, 1));
		assertEquals(6, fromCartesian(-1, 0));
		assertEquals(7, fromCartesian(-1, -1));
		assertEquals(8, fromCartesian(0, -1));
		assertEquals(9, fromCartesian(1, -1));
	}

	private int fromCartesian(int x, int y) {
		return 1;
	}

}
