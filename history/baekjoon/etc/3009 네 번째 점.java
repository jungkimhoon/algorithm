import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] x = new int[1001];
		int[] y = new int[1001];
		
		for(int i=0; i<3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x[Integer.parseInt(st.nextToken())]++;
			y[Integer.parseInt(st.nextToken())]++;			
		} 
		
		for(int i=0; i<1001; i++) {						
			if(x[i] == 1) System.out.print(i+" ");
		}
		
		for(int i=0; i<1001; i++) {								
			if(y[i] == 1) System.out.print(i);
		}
	}
}