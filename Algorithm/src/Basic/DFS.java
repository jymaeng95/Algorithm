package Basic;
import java.util.TreeSet;

class Graph {
	class Node{
		int data;
		LinkedList<Node> adjacent;
		boolean marked;
		Node(int data) {
			this.data = data;
			this.marked = false;
			adjacent = new LinkedList<Node>();
		}
	}
}

public class DFS {

	public static void main(String[] args) {
		
	}

}
