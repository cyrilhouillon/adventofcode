package day.eight;

import java.util.HashMap;
import java.util.Map;

public class Registers {
	
	private Map<String, Integer> registers = new HashMap<>();
	private int max = 0;

	public void executeInstruction(Instruction instruction) {
		if(instruction.condition.test(registers)) {
			registers.computeIfPresent(instruction.registerName, (n, oldValue) -> instruction.operation.apply(oldValue));
			registers.computeIfAbsent(instruction.registerName, (n) -> instruction.operation.apply(0));
			
			if(registers.getOrDefault(instruction.registerName, 0) > max) {
				max = registers.getOrDefault(instruction.registerName, 0);
			}
		}
	}
	
	public int getLargestValue() {
		return registers.values().stream().mapToInt(Integer::intValue).max().orElse(0);
	}

	public int getLargestValueEver() {
		return max ;
	}
}
