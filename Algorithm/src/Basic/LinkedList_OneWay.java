package Basic;
//취약한 링크리스트
class Node {
	int data;
	Node next = null;
	Node(int data) {
		this.data = data;
	}

	//노드 추가 
	void append(int data) {
		Node end = new Node(data);
		Node node = this;
		while(node.next!=null) {
			node = node.next;
		}
		node.next = end;
	}

	//노드 삭제 
	void delete(int data) {
		Node node = this;
		while(node.next!=null) {
			if(node.next.data == data) {
				node.next = node.next.next;
			}else {
				node = node.next;
			}
		}
	}

	//링크리스트 데이터 출력 
	void retrieve() {
		Node node = this;
		while(node.next!=null) {
			System.out.print(node.data + "->");
			node = node.next;
		}
		//마지막 데이터 출력
		System.out.println(node.data);
	}
}
public class LinkedList_OneWay {


	public static void main(String[] args) {
		Node head = new Node(1);
		head.append(2);
		head.append(3);
		head.append(4);
		head.retrieve();
		head.delete(2);
		head.delete(3);
		head.retrieve();
	}

}
