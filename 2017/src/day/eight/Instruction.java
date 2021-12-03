package day.eight;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class Instruction {

	public String registerName;
	public Function<Integer, Integer> operation;
	public Predicate<Map<String, Integer>> condition;
	
	public Instruction(String registerName, Function<Integer, Integer> operation, Predicate<Map<String, Integer>> condition) {
		this.registerName = registerName;
		this.operation = operation;
		this.condition = condition;
	}

}
