package day.eight;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComparatorTest {

	@Test
	void compare_0_equals_0_is_true() {
		int input = 0;
		int valueToCompare = 0;
		
		boolean result = Comparators.EQUALS.apply(valueToCompare).test(input);
		
		assertTrue(result);
	}

	@Test
	void compare_0_equals_1_is_false() {
		int input = 0;
		int valueToCompare = 1;
		
		boolean result = Comparators.EQUALS.apply(valueToCompare).test(input);
		
		assertFalse(result);
	}

}
