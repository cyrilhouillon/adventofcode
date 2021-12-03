package day.eight;

import java.util.HashMap;
import java.util.function.Function;
import java.util.function.Predicate;

public class Comparators extends HashMap<String, Function<Integer, Predicate<Integer>>>{
	
	public static final Function<Integer, Predicate<Integer>> EQUALS = (compareTo -> (value -> value.equals(compareTo)));
	public static final Function<Integer, Predicate<Integer>> DIFFERENT = (compareTo -> (value -> !value.equals(compareTo)));
	public static final Function<Integer, Predicate<Integer>> GREATER = (compareTo -> (value -> value > compareTo));
	public static final Function<Integer, Predicate<Integer>> GREATER_OR_EQUALS = (compareTo -> (value -> value >= compareTo));
	public static final Function<Integer, Predicate<Integer>> LESS = (compareTo -> (value -> value < compareTo));
	public static final Function<Integer, Predicate<Integer>> LESS_OR_EQUALS = (compareTo -> (value -> value <= compareTo));

	public Comparators() {
		super();
		put("==", EQUALS);
		put("!=", DIFFERENT);
		put(">", GREATER);
		put(">=", GREATER_OR_EQUALS);
		put("<", LESS);
		put("<=", LESS_OR_EQUALS);
	}

	
}
