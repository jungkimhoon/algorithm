import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main { 
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] d = new int[n];
		int max = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		d[0] = 1;
		
		
		for(int i=1; i<n; i++) { //새로 검증할 수
			d[i] = 1;
			for(int j=0; j<i; j++) {
				if(arr[j] < arr[i] && d[j] >= d[i]) { //d[j]가 가장 큰 것
					d[i] = d[j] + 1;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			if(d[i] > max)
				max = d[i];
		}
			
		System.out.println(max);
	
	}
}