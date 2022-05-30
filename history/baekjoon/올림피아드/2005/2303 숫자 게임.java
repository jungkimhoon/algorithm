import java.io.*;
import java.util.*;

public class Main {		
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][5];
		int[] sum = new int[n];
		
		for(int i=0; i<n; i++) {
			
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
			
			for(int j=0; j<3; j++) {
				for(int k=j+1; k<4; k++) {
					for(int l=k+1; l<5; l++) {
						sum[i] = Math.max(sum[i], (arr[i][j] + arr[i][k] + arr[i][l])%10);
					}
				}
			}
		}
		int max = 0;
		int num = 0;
		for(int i : sum) {
			max = Math.max(max, i);
		}
		
		for(int i=0; i<n; i++) {
			if(sum[i] == max) num = i+1;
		}		
		
		System.out.println(num);
	}
}