import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		double[] arr = new double[n];
		double max = 0;
		double sum = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, arr[i]);
		 
		}
		
		for(int i=0; i<n; i++) {
			arr[i] = arr[i] / max * 100;
			sum += arr[i];
		}
		
		System.out.println(sum/(double)n);		
	}
}