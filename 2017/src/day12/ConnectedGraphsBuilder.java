package day12;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectedGraphsBuilder {

	public ConnectedGraphs buildConnectedGraphs(AdjacenceList list) {
		Map<String, String> coloredGraph = new HashMap<>();
		for (AdjacenceListLine line : list.list) {
			coloredGraph.put(line.head, line.head);
		}
	
		for (AdjacenceListLine line : list.list) {
			String color = coloredGraph.get(line.head);
			List<String> identicalColors = line.connected.stream()//
				.map(vertice -> coloredGraph.get(vertice))//
				.collect(toList());
			
			coloredGraph.replaceAll((v, c) -> identicalColors.contains(c) ? color : c);
		}
		
		Map<String, List<String>> inversedMap = new HashMap<>();
		coloredGraph.values().forEach(c -> inversedMap.put(c, new ArrayList<>()));
		
		coloredGraph.forEach((v, c) -> inversedMap.get(c).add(v) );
			
		return new ConnectedGraphs(new ArrayList<>(inversedMap.values()));
	}

}
