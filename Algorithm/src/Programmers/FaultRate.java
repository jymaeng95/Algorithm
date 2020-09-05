package Programmers;

import java.util.Scanner;

public class FaultRate {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		double[] result = new double[N];
		int[] rs = new int[N];
		int i=0;
		int people = stages.length;
		
		while(i<N){
			rs[i] = i+1;
			if(people == 0)
				break;
			int count = 0;
			for(int j=0;j< stages.length;j++){
				if(i+1 == stages[j]){
					count++;
				}
			}
			if(count == 0 ){
				result[i] = 0 ;
			}else {
				result[i] = (double) count/(double) people;
				people -= count;
			}
			i++;
		}
		for(int j=0;j<result.length-1;j++) {
			for(int k=1;k<result.length;k++) {
				if(result[j] > result[k]) {
					int temp = rs[j];
					rs[j] = rs[k];
					rs[k] = temp;
				}
			}
		}
		
		for(int test : rs) System.out.println(test);
	}
}
