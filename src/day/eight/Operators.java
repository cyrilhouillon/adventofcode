package day.eight;

import java.util.HashMap;
import java.util.function.Function;
import java.util.function.Predicate;

public class Operators extends HashMap<String, Function<Integer, Function<Integer, Integer>>>{
	
	public static final Function<Integer, Function<Integer, Integer>> INC = (operande -> (value -> value + operande));
	public static final Function<Integer, Function<Integer, Integer>> DEC = (operande -> (value -> value - operande));

	public Operators() {
		super();
		put("inc", INC);
		put("dec", DEC);
	}

	
}
