package Jungol;
import java.util.Scanner;

public class Main_1814 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int[] arr = new int[t];
		int count=0;
		for(int i=0;i<arr.length;i++) {
			arr[i] =scan.nextInt();
		}
		for(int i=1;i<t;i++) {
			int tmp = arr[i];
			for(int j=i;j>0;j--) {
				if(tmp<arr[j-1]) {
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
