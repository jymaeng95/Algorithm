package SWEA.D3;

import java.util.Scanner;

public class Main_9778 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		int [] card = {2,3,4,5,6,7,8,9,10,10,10,10,11};
		int sum=0,max=21;
		int count=0;
		for(int i=1;i<=T;i++) {
			max=21;
			count=0;
			int N = sc.nextInt();
			for(int j=0;i<N;i++) {
				max-= sc.nextInt();
			}
			for(int j=0;j<card.length;j++) {
				if(max<card[j]) count++;
			}
			if(card.length-count > count) System.out.println("STOP");
			else System.out.println("GAZUA");
		}
		sc.close();
	}
}
