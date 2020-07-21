package Groom.Level3;

import java.io.IOException;
import java.util.Scanner;

class Tree {
	class Node {
		int data;
		Node left;
		Node right;
		Node (int arr){
			this.data = arr;
		}
	}
	Node root;
	public void makeTree(int[] arr) {
		root = makeNodeRecursive(0,arr,arr.length-1);
				
	}
	public Node makeNodeRecursive(int start, int[] arr, int end) {
		if(start>end) return null;
		int mid = (start + end) / 2;
		Node node = new Node(arr[mid]);
		node.left = makeNodeRecursive(start, arr, mid-1);
		node.right = makeNodeRecursive(mid+1, arr, end);
		return node;
	}
	public int searchData(Node node, int data, int start, int end) {
		int mid = (start + end) / 2;
		if(data > node.data) {
			if(node.right == null) {
				return -1;
			}
			return searchData(node.right,data,mid+1,end);
		}else if (data < node.data) {
			if(node.left == null) {
				return -1;
			}
			return searchData(node.left, data,start,mid-1);
		}else {
			return mid;
		}
		
	}
}

public class BinarySearch {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int[] arr = new int[t];
		for(int i=0;i<t;i++) {
			arr[i] = scan.nextInt();
		}
		Tree tree = new Tree();
		tree.makeTree(arr);
		int find = scan.nextInt();
		int index = tree.searchData(tree.root, find,0,arr.length);
		if(index < 0) {
			System.out.println("X");
		}else {
			System.out.println(index);
		}
	}
}
