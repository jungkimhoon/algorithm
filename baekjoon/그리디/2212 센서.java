import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {		
	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
			
		int n = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int[] m = new int[n-1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<n-1; i++) {
			m[i] = arr[i+1] - arr[i];
		}
		
		Arrays.sort(m);
		
		int sum = 0;
		for(int i=0; i<n-k; i++) {
			sum += m[i];
		}
		
		System.out.println(sum);
	}
}