package daytwo;

import java.util.List;

public class MinMaxDifference implements LineChecksumComputer {

	@Override
	public int lineChecksum(List<Integer> numbersList) {
		return maxOf(numbersList) - minOf(numbersList);
	}

	private int minOf(List<Integer> numbersList) {
		return numbersList.stream().sorted((a, b) -> a > b ? 1 : -1).findFirst().orElse(0);
	}

	private int maxOf(List<Integer> numbersList) {
		return numbersList.stream().sorted((a, b) -> a > b ? -1 : 1).findFirst().orElse(0);
	}

}
