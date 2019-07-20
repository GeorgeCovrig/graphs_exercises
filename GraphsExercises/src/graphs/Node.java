package graphs;

public class Node {
	
	public String name;
	public Node[] neighbors;
	
	public Node(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Node[] getNeighbors() {
		return neighbors;
	}
	
	public void setNeighbours(Node[] neighbours) {
		this.neighbors = neighbours;
	}

}

