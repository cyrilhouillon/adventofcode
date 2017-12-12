package day12;
import static org.junit.Assert.*;

import org.junit.Test;

public class AdjacenceListLineTest {

	private AdjacenceListLineParser parser = new AdjacenceListLineParser();
	
	@Test
	public void test() {
		String input = "0 <-> 2";
		
		AdjacenceListLine result = parser.parse(input);
		
		assertEquals("0", result.head);
		assertTrue(result.connected.contains("2"));
	}

	@Test
	public void test2() {
		String input = "1 <-> 1";
		
		AdjacenceListLine result = parser.parse(input);
		
		assertEquals("1", result.head);
		assertTrue(result.connected.contains("1"));
	}

	@Test
	public void test3() {
		String input = "2 <-> 0, 3, 4";
		
		AdjacenceListLine result = parser.parse(input);
		
		assertEquals("2", result.head);
		assertTrue(result.connected.contains("0"));
		assertTrue(result.connected.contains("3"));
		assertTrue(result.connected.contains("4"));
	}

}
