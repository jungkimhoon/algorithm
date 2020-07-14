import java.io.*;
import java.util.*;

public class Main {		
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
				
		int num = Integer.parseInt(br.readLine());
		int[][] map = new int[103][103];
		int[] count = new int[103];
		
		for(int i=1; i<=num; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int width = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());
			
			for(int j=x; j<x+width; j++) {
				for(int k=y; k<y+height; k++) {
					map[j][k] = i;
				}
			}			
		}
		
		
		for(int i=0; i<=100; i++) {
			for(int j=0; j<=100; j++) {
				count[map[i][j]]++;
			}
		}
		
		for(int j=1; j<=num; j++) {
			System.out.println(count[j]);
		}
	} 
}