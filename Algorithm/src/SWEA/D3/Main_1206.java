package SWEA.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1206 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int CASE = 10;
		int c=0;
		while(CASE>c) {			
			int left=0,right= 0;
			int T = Integer.parseInt(br.readLine());
			String[] s_case= br.readLine().split(" ");
			int[] height = new int[T];
			int count = 0;
			for(int i=0;i<height.length;i++) {
				height[i] = Integer.parseInt(s_case[i]);
			}
			for(int i=2;i<height.length-2;i++) {
				if(height[i] <= height[i+1]) {
					left = height[i];
					right = height[i+2];
				}else {
					if(height[i-2] >= height[i-1]) left = height[i-2];
					else left = height[i-1];
					
					if(height[i+1] >= height[i+2]) right = height[i+1];
					else right = height[i+2];
					
					if(height[i] >left && height[i] > right) {
						if(left>= right) count += height[i]-left;
						else count += height[i]-right;
					}
				}
//				System.out.println("i:"+i+ "="+count +" left="+left+" right="+right);
			}
			c++;
			System.out.println("#"+c+" "+count);
		}
		br.close();
	}

}
