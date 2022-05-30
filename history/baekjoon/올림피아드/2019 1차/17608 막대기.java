import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = arr[n-1];
		int count = 1;
		
		for(int i=n-2; i>=0; i--) {
			if(arr[i] > max) {
				max = arr[i];
				count++;
			}
		}
		System.out.println(count);
		
	}
}
