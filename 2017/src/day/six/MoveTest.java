package day.six;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class MoveTest {

	@Test
	public void stringRepresentationTest() {
		int[] banks = {0, 2, 7, 0};
		MemoryBanks mb= new MemoryBanks(banks);
		
		String stringRepresentation = mb.toString();
		
		assertEquals("[0, 2, 7, 0]", stringRepresentation);
	}


	@Test
	public void testReallocate1() {
		int[] banks = {0, 2, 7, 0};
		MemoryBanks mb= new MemoryBanks(banks);
		
		mb.reallocate();
		
		assertEquals("[2, 4, 1, 2]", mb.toString());
	}

	@Test
	public void testReallocate2() {
		int[] banks = {2, 4, 1, 2};
		MemoryBanks mb= new MemoryBanks(banks);
		
		mb.reallocate();
		
		assertEquals("[3, 1, 2, 3]", mb.toString());
	}

	@Test
	public void testReallocate3() {
		int[] banks = {3, 1, 2, 3};
		MemoryBanks mb= new MemoryBanks(banks);
		
		mb.reallocate();
		
		assertEquals("[0, 2, 3, 4]", mb.toString());
	}

	@Test
	public void testReallocate4() {
		int[] banks = {0, 2, 3, 4};
		MemoryBanks mb= new MemoryBanks(banks);
		
		mb.reallocate();
		
		assertEquals("[1, 3, 4, 1]", mb.toString());
	}

	@Test
	public void testReallocate5() {
		int[] banks = {1, 3, 4, 1};
		MemoryBanks mb= new MemoryBanks(banks);
		
		mb.reallocate();
		
		assertEquals("[2, 4, 1, 2]", mb.toString());
	}

	@Test
	public void testCountReallocations() {
		int[] banks = {0, 2, 7, 0};
		MemoryBanks mb= new MemoryBanks(banks);
		
		int cycles = countCycles(mb);
		
		assertEquals("[2, 4, 1, 2]", mb.toString());
		assertEquals(5, cycles);
	}


	@Test
	public void testCountPuzzleReallocations() {
		int[] banks = {2,8,8,5,4,2,3,1,5,5,1,2,15,13,5,14};
		MemoryBanks mb= new MemoryBanks(banks);
		
		int cycles = countCycles(mb);
		
		assertEquals(3156, cycles);
	}

	@Test
	public void testCountReallocationsAndCycle() {
		int[] banks = {0, 2, 7, 0};
		MemoryBanks mb= new MemoryBanks(banks);
		
		int cycles = countCycles(mb);
		int newCyles = countCycles(mb);
		
		assertEquals("[2, 4, 1, 2]", mb.toString());
		assertEquals(5, cycles);
		assertEquals(4, newCyles);
	}

	@Test
	public void testCountPuzzleReallocationsAndCycle() {
		int[] banks = {2,8,8,5,4,2,3,1,5,5,1,2,15,13,5,14};
		MemoryBanks mb= new MemoryBanks(banks);
		
		int cycles = countCycles(mb);
		int newCyles = countCycles(mb);

		assertEquals(3156, cycles);
		assertEquals(1610, newCyles);
	}


	private int countCycles(MemoryBanks mb) {
		int cycles = 0;
		Set<String> alreadySeenConfigurations = new HashSet<>();
		do{
			alreadySeenConfigurations.add(mb.toString());
			cycles++;
			mb.reallocate();
		}while(!alreadySeenConfigurations.contains(mb.toString()));
		return cycles;
	}

}
