package day.eight;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
	
	private Comparators comparators = new Comparators();
	private Operators operators = new Operators();

	public Parser(Comparators comparators, Operators operators) {
		this.comparators = comparators;
		this.operators = operators;
	}

	public Instruction parse(String instructionLine) {
		String regex = "^([a-z]*) (inc|dec) (-?\\d*) if ([a-z]*) (>|<|>=|<=|==|!=) (-?\\d*)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(instructionLine);
        matcher.find();
        
        String registerName = matcher.group(1);
        
        String operator = matcher.group(2);
        String operationValue = matcher.group(3);
        Function<Integer, Integer> operation = operators.get(operator).apply(Integer.valueOf(operationValue));
        
        String conditionRegister = matcher.group(4);
        String comparator = matcher.group(5);
        String comparatorValue = matcher.group(6);
        Predicate<Integer> predicate = comparators.get(comparator).apply(Integer.valueOf(comparatorValue));
        Predicate<Map<String, Integer>> condition = (registers -> predicate.test(registers.getOrDefault(conditionRegister, 0)));
        
        return new Instruction(registerName, operation, condition);
	}


}
