import java.io.*;
import java.util.*;

public class Main {		
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
				
		int n = Integer.parseInt(br.readLine());
		boolean sw = true;
		int[][] belt = new int[n][2];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			belt[i][0] = Integer.parseInt(st.nextToken());
			belt[i][1] = Integer.parseInt(st.nextToken());
			if(Integer.parseInt(st.nextToken()) == 1) sw = !sw;			
		}
		
		int[] circulation = new int[n];
		circulation[0] = belt[0][0] * belt[0][1];
		
		for(int i=1; i<n; i++) {
			circulation[i] = circulation[i-1] / belt[i][0];
			circulation[i] = circulation[i] * belt[i][1];
		}
		
		if(sw) System.out.print("0 "+ circulation[circulation.length-1]);
		else System.out.print("1 "+circulation[circulation.length-1]);
	}
}