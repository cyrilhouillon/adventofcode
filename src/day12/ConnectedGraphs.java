package day12;

import java.util.Collections;
import java.util.List;

public class ConnectedGraphs {
	
	public final List<List<String>> graphs;

	public ConnectedGraphs(List<List<String>> graphs) {
		this.graphs = graphs;
	}
	
	public List<String> getGraphContaining(String vertice){
		return graphs.stream()//
			.filter(g -> g.contains(vertice))//
			.findFirst()//
			.orElse(Collections.emptyList());
	}

}
