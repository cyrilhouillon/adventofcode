package daytwo;

import java.util.List;
import java.util.stream.Stream;

public class DivisibilityFinder implements LineChecksumComputer {

	@Override
	public int lineChecksum(List<Integer> numbersList) {
		return numbersList.stream()//
			.flatMap(i -> divisions(i, numbersList))//
			.filter(div -> div.isEvenlyDivisible())//
			.filter(div -> div.result() != 1)//
			.map(Division::result)//
			.findFirst()//
			.orElse(0);
	}

	private Stream<Division> divisions(Integer i, List<Integer> numbersList) {
		return numbersList.stream().map(j -> new Division(i, j));
	}


}
