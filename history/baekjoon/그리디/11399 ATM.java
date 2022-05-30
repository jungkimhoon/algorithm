import java.util.*;
import java.io.*;

public class Main {		
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		int sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<num; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		
		Arrays.sort(arr);
		sum += arr[0];
		for(int i=1; i<num ;i++) {
			arr[i] += arr[i-1];
			sum += arr[i];
		}		
		
		System.out.println(sum);
	}
}