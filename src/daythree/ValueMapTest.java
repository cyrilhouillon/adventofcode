package daythree;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

class ValueMapTest {

	@Test
	void test1() {
		int index = 1;
		
		int value = getValue(index);
		
		assertEquals(1, value);
	}

	@Test
	void test2() {
		int index = 2;
		
		int value = getValue(index);
		
		assertEquals(1, value);
	}

	@Test
	void test9() {
		int index = 9;
		
		int value = getValue(index);
		
		assertEquals(25, value);
	}

	@Test
	void testPuzzle() {
		int index = 200;
		
		try {
			int value = getValue(index);
		} catch (Exception e) {
			assertEquals("295229 is larger than 289326", e.getMessage());
			return;
		}
		
		assertFalse(true);
	}

	private int getValue(int index) {
		Map<Coord, Integer> grid = new HashMap<>();
		
		int current = 1;
		Coord coord = new Coord(0, 0);
		grid.put(coord, 1);

		while(current != index) {
			current++;
			coord = coord.nextMove();
			
			int value = sumAround(coord, grid);
			if(value> 289326) {
				throw new RuntimeException(value + " is larger than 289326");
			}
			grid.put(coord, value);
		}
		
		return grid.get(coord);
	}

	private int sumAround(Coord coord, Map<Coord, Integer> grid) {
		List<Coord> neighbours = coord.neighbours();
		
		return neighbours.stream()//	
			.map(c -> grid.getOrDefault(c, 0))
			.collect(Collectors.summingInt(Integer::intValue));
	}

}
