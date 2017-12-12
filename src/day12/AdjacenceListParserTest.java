package day12;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdjacenceListParserTest {

	private AdjacenceListParser parser = new AdjacenceListParser(new AdjacenceListLineParser());
	
	@Test
	public void test() {
		String input = "0 <-> 2\n" + 
				"1 <-> 1\n" + 
				"2 <-> 0, 3, 4\n" + 
				"3 <-> 2, 4\n" + 
				"4 <-> 2, 3, 6\n" + 
				"5 <-> 6\n" + 
				"6 <-> 4, 5";
		
		AdjacenceList result = parser.parse(input);
		
		assertEquals(7,result.getVertices().size());
	}

}
