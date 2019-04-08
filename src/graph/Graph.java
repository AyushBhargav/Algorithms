package graph;

import java.util.ArrayList;

public class Graph {
	int nodes;
	boolean isDirected;
	ArrayList<Integer>[] adjacencyList;
	
	public Graph(int nodes, boolean isDirected) {
		this.nodes = nodes;
		this.isDirected = isDirected;
		// Initialize Nodes with array-list.
		adjacencyList = new ArrayList[nodes+1];
		for(int i = 1; i < adjacencyList.length; i++) 
			adjacencyList[i] = new ArrayList<>();
	}
	
	public void addEdge(int u, int v) {
		adjacencyList[u].add(v);
		if(!isDirected)
			adjacencyList[v].add(u);
	}
}
