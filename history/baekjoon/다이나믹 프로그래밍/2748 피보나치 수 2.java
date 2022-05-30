import java.util.*;
import java.io.*;

public class Main {		
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long[] arr = new long[91];
		arr[1] = 1;
		for(int i=2; i<=90; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}						
		
		int n = Integer.parseInt(br.readLine());
		System.out.println(arr[n]);
	}
}