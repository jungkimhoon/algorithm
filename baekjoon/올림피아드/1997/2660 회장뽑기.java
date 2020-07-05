import java.util.*;
import java.io.*;

public class Main {	

	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		int[][] member = new int[n+1][n+1];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				member[i][j] = 100000;
			}
		}
		while(true) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());			
			if(num1 == -1 && num2 == -1) break;			
			member[num1][num2] = member[num2][num1] = 1;
			
		}
		
		for(int i=1; i<=n; i++) {
			member[i][i] = 1;
			for(int j=1; j<=n; j++) {
				for(int k=1; k<=n; k++) {
					if(member[j][k] > member[j][i] + member[i][k])
						member[j][k] = member[j][i] + member[i][k];
				}
			}
		}
		
		int max[] = new int[n+1];
		int min = Integer.MAX_VALUE;
		for(int i=1; i<=n; i++) {
			for(int j=1 ;j<=n; j++) {
				max[i] = Math.max(member[i][j], max[i]);
			}
			min = Math.min(max[i], min);
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=n; i++) {
			if(min == max[i]) {
				list.add(i);
			}
		}
		
		System.out.println(min+" "+list.size());
		for(int i : list) {
			System.out.print(i + " ");
		}
	}
}