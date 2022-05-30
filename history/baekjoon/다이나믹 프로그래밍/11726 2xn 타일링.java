import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {		
	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] d = new int[n];
		d[0] = 1;
		
		if(n>1) {
			d[1] = 2;
			for(int i=2; i<n; i++) {
				d[i] = (d[i-1] + d[i-2])%10007;
			}
		}
		
		System.out.println(d[n-1]);
		
	}
}
