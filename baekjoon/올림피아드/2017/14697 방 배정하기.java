import java.io.*;
import java.util.*;

public class Main {		
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());		
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int ans = 0;
		
		for(int i=0; i<=50; i++) {
			for(int j=0; j<=50; j++) {
				for(int k=0; k<=50; k++) {
					if((i*a)+(j*b)+(k*c) == n) {
						ans = 1;			
						break;
					}
				}
			}
		}
		
		System.out.println(ans);					
	}
}