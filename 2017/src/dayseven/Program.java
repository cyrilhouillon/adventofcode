package dayseven;

import java.util.List;

public class Program {
	
	private String name;
	private List<String> childrenNames;
	private int weight;
	
	public Program(String name, List<String> childrenNames, int weight) {
		this.name = name;
		this.childrenNames = childrenNames;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public List<String> getChildrenNames() {
		return childrenNames;
	}

	public int getWeight() {
		return weight;
	}

}
