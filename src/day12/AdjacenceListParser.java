package day12;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.Stream;

public class AdjacenceListParser {

	private AdjacenceListLineParser adjacenceListLineParser;

	public AdjacenceListParser(AdjacenceListLineParser adjacenceListLineParser) {
		this.adjacenceListLineParser = adjacenceListLineParser;
	}

	public AdjacenceList parse(String input) {
		List<AdjacenceListLine> list = Stream.of(input.split("\n"))//
			.map(adjacenceListLineParser::parse)//
			.collect(toList());
		
		return new AdjacenceList(list);
	}

}
