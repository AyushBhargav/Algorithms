package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {
	
	public static void topologicalSort(Graph graph) {
		ArrayList<Integer> tSort = new ArrayList<>();
		boolean[] visited = new boolean[graph.nodes+1];
		int[] incomingLink = new int[graph.nodes+1];
		for(int i = 1; i < graph.adjacencyList.length; i++)
			for(int vertex : graph.adjacencyList[i])
				incomingLink[vertex]++;
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1; i < graph.nodes+1; i++) {
			if(incomingLink[i] == 0) {
				queue.add(i);
				visited[i] = true;
			}
		}
		while(!queue.isEmpty()) {
			int u = queue.remove();
			tSort.add(u);
			for(int v : graph.adjacencyList[u]) {
				if(visited[v])
					continue;
				incomingLink[v]--; // Remove u from incoming links.
				if(incomingLink[v] == 0) {
					queue.add(v);
					visited[v] = true;
				}
			}
		}
		for(int vertex : tSort) {
			System.out.println(vertex);
		}
	}

	public static void main(String[] args) {
		Graph graph = new Graph(7, true);
		graph.addEdge(5, 2);
		graph.addEdge(5, 4);
		graph.addEdge(4, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 6);
		graph.addEdge(6, 7);
		topologicalSort(graph);
	}

}
