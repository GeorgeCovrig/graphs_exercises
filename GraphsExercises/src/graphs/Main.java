package graphs;

public class Main {

	public static void main(String[] args) {
		//graph construction 
		Node node0 = new Node("0-Ionel");
		Node node1 = new Node("1-Mirel");
		Node node2 = new Node("2-Viorel");
		Node node3 = new Node("3-Vasile");
		Node node4 = new Node("4-Daniel");
		Node node5 = new Node("5-Viorica");
		
		Node[] neighboursNode0 = new Node[]{node1, node4, node5};
		node0.setNeighbours(neighboursNode0);
		
		Node[] neighboursNode1 = new Node[] {node3, node4};
		node1.setNeighbours(neighboursNode1);
		
		Node[] neighboursNode2 = new Node[] {node1};
		node2.setNeighbours(neighboursNode2);
		
		Node[] neighboursNode3 = new Node[] {node2, node4};
		node3.setNeighbours(neighboursNode3);
		
		Node[] neighboursNode4 = new Node[] {};
		node4.setNeighbours(neighboursNode4);
		
		Node[] neighboursNode5 = new Node[] {};
		node5.setNeighbours(neighboursNode5);
		
		Graph graph = new Graph(node0);
		
		graph.depthFirstSearch();
		
		System.out.println(System.lineSeparator());
		//find out if we have a route between two routes
		graph.resetHash();
		graph.depthFirstTranversal(node0);
		
		graph.breadthFirstSearch();
		
		System.out.println(graph.thereIsAPathBetweenNodes("0-Ionel", "1-Mirel"));
		System.out.println(graph.thereIsAPathBetweenNodes("0-Ionel", "4-Mirel"));

	}

}
