import java.util.*;
import java.io.*;

public class Main {	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		int[] dpU = new int[num];
		int[] dpD = new int[num];
		int[] dp = new int[num];
		int max = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dpU[0] = 1;
		for(int i=0; i<num; i++) {
			dpU[i] = 1;
			for(int j=0; j<i; j++) {
				if(arr[i] > arr[j] && dpU[i] <= dpU[j])
					dpU[i] = dpU[j] + 1;
			}
		}
		
		dpD[0] = 1;
		for(int i=num-1; i>=0; i--) {
			dpD[i] = 1;
			for(int j=num-1; j>i; j--) {
				if(arr[i] > arr[j] && dpD[i] <= dpD[j])
					dpD[i] = dpD[j] + 1;
			}
		}
		
		for(int i=0; i<num; i++) {
			max = Math.max(max, dpU[i]+dpD[i]);
		}	
		
		System.out.println(max - 1);		
	}	
}