import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		int[] sum = new int[num];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<num; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(i == j) continue;
				sum[i] += Math.abs(arr[i] - arr[j]);
			}
		}
		
		int min = Integer.MAX_VALUE;
		for(int i=0; i<num; i++) {
			min = Math.min(min, sum[i]);
		}		
		
		for(int i=0; i<num; i++) {
			if(sum[i] == min) {
				System.out.println(arr[i]);
				break;
			}
		}
	}
}
