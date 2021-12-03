package day12;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConnectedGraphsBuilderTest {

	private ConnectedGraphsBuilder builder = new ConnectedGraphsBuilder();
	
	@Test
	public void test() {
		AdjacenceList list = getAdjacenceList("0 <-> 0");

		ConnectedGraphs result = builder.buildConnectedGraphs(list);
		
		assertEquals(1, result.graphs.size());
		assertEquals(1, result.graphs.get(0).size());
		assertEquals("0", result.graphs.get(0).get(0));
	}

	@Test
	public void test2() {
		AdjacenceList list = getAdjacenceList("0 <-> 2\n" + 
				"1 <-> 1\n" + 
				"2 <-> 0, 3, 4\n" + 
				"3 <-> 2, 4\n" + 
				"4 <-> 2, 3, 6\n" + 
				"5 <-> 6\n" + 
				"6 <-> 4, 5");

		ConnectedGraphs result = builder.buildConnectedGraphs(list);
		
		assertEquals(2, result.graphs.size());
		assertEquals(1, result.graphs.get(0).size());
		assertEquals(6, result.graphs.get(1).size());
	}

	private AdjacenceList getAdjacenceList(String input) {
		return new AdjacenceListParser(new AdjacenceListLineParser()).parse(input);
	}

}
