package Groom.Level3;

import java.util.Scanner;

public class BigLocation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		String[] arr = Integer.toString(t).split("");
		int max=0;
		int mul=1;
		
		for(int i=arr.length-1;i>=1;i--) {
			mul=1;
			for(int j=0;j<arr.length;j++) {
				mul *= Integer.parseInt(arr[j]);
			}
			if(max<mul)
				max = mul;
			t -= (Integer.parseInt(arr[i])+1) * Math.pow(10, arr.length-1-i);
			arr = Integer.toString(t).split("");
		}
		mul =1;
		for(int i=0;i<arr.length;i++) {
			mul *= Integer.parseInt(arr[i]);
		}
		if(max<mul)
			max = mul;
		System.out.println(max);
	}
}
