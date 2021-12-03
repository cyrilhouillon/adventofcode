package day12;

import static java.util.stream.Collectors.toList;

import java.util.List;

public class AdjacenceList {

	public final List<AdjacenceListLine> list;

	public AdjacenceList(List<AdjacenceListLine> list) {
		this.list = list;
	}

	public List<String> getVertices() {
		return list.stream()//
				.map(line -> line.head)
				.collect(toList());
	}

}
