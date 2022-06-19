package answer;

import java.util.*;
import java.io.*;

public class Test14889 {	
	static int[][] arr;
	static boolean[] check;
	static int num;		
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		num = Integer.parseInt(br.readLine());
		arr = new int[num][num];
		check = new boolean[num];
		
		for(int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<num; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());				
			}
		}
		
		backTracking(0, 0);
		System.out.println(min);
	}

	static void backTracking(int start, int depth) {
		if(depth == num/2) {
			min = Math.min(min, teamWork());
			return;
		}
		
		for(int i=start; i<num; i++) {
			if(!check[i]) {
				check[i] = true;
				backTracking(i+1, depth+1);
				check[i] = false;
			}
		}		
	}

	static int teamWork() {
		int sumA = 0;
		int sumB = 0;
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) { 		
				
				if(check[i] && check[j]) 
					sumA += arr[i][j];					
					
				if(!check[i] && !check[j])
					sumB += arr[i][j];				
			}
		}
		
		return Math.abs(sumA-sumB);
	}
}

