import java.io.*;
import java.util.StringTokenizer;

public class Main {	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		boolean[] arr = new boolean[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = false;
		}
		
		for(int i=0; i<b; i++) {
			arr[Integer.parseInt(br.readLine())-1] = true;
		}
		
		int sw = 0;
		int sum = Integer.MAX_VALUE;
		
		
		if(n == b) System.out.println(n);
		else {
			while(true) {
				int count = 0;
				for(int i=0+sw; i<k+sw; i++) {
					if(arr[i]) count++;
				}			
				sum = Math.min(sum, count);
				if(sw == n-k) break;
				sw++;
			}		
			System.out.println(sum);
		}
	}
}