package Baekjoon;
import java.util.Scanner;
import java.util.Stack;

public class Main_13555 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int t = scan.nextInt();
		int[] seq = new int[length];
		int count=0;
		for(int i=0;i<length;i++) {
			seq[i] = scan.nextInt();
		}
		Stack<Integer> stack  = new Stack<Integer>();
		for(int i=0;i<=length-t;i++) {
			stack.push(seq[i]);
			count+=search(i,i+1,seq,stack);
		}
		System.out.println(count);
	}
	public static int search(int first,int next,int[] seq,Stack<Integer> stack) {
		if(stack.size() == 3) {
			int count=0;
			count++;
			stack.clear();
			return count;
		}
		if(next==seq.length-1) return 0;
		if(seq[first] <seq[next]) {
			stack.push(seq[next]);
			return search(next,next+1, seq,stack);
		}
		return search(next,next+1,seq,stack);
	}
	
}
