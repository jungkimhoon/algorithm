import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {		
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
				
		for(int i=0; i<t; i++) {
			int num = Integer.parseInt(br.readLine());
			int[] arr = new int[num+2];
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 4;
			for(int j=3; j<num; j++) {
				arr[j] = arr[j-3] + arr[j-2] + arr[j-1];
			}
			System.out.println(arr[num-1]);
		}		
	}
}