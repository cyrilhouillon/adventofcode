package day.eight;

import static java.util.Collections.singletonMap;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ParserTest {

	private Comparators comparators = new Comparators();
	private Operators operators = new Operators();
	private Parser parser = new Parser(comparators, operators);

	@Test
	void test() {
		String instructionLine = "b inc 5 if a > 1";
		
		Instruction instruction = parser.parse(instructionLine);
		
		assertEquals("b", instruction.registerName);
		assertEquals(5, instruction.operation.apply(0).intValue());
		assertEquals(true, instruction.condition.test(singletonMap("a", 2)));
		assertEquals(false, instruction.condition.test(singletonMap("a", 1)));
	}

}
