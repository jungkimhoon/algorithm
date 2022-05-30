import java.io.*;
import java.util.*;

public class Main {		
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
			int allMember = Integer.parseInt(br.readLine());
			int[] member = new int[allMember+1];
			
			for(int j=0; j<allMember; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				member[x] = y;
			}
			
			int cnt = 1;
			int standard = member[1];
			for(int j=2; j<=allMember; j++) {
				if(standard > member[j]) {
					cnt++;
					standard = member[j];
				}
			}
			System.out.println(cnt);			
		}		
	}
}