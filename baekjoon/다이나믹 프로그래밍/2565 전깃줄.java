import java.util.*;
import java.io.*;

public class Main {	
	final static int MAXWIRE = 500;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int a[] = new int[MAXWIRE];
		int d[] = new int[MAXWIRE];
		int n = Integer.parseInt(br.readLine());
		int max = 0;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			a[Integer.parseInt(st.nextToken())-1] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<MAXWIRE; i++) {
			if(a[i] == 0) continue;
			d[i] = 1;
			for(int j=0; j<i; j++) {
				if(a[i] > a[j] && d[i] <= d[j]) {
					d[i] = d[j] + 1;
				}
				max = Math.max(d[i], max);
			}			
		}
		System.out.println(n - max);
	}	
}