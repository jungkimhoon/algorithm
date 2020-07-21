import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int count = 0;
			
			int floor = 0;
			int room = 0;
			
			for(int j=1; j<=w; j++) {
				for(int k=1; k<=h; k++) {
					count++;
					if(count == n) {
						room = j;
						floor = k;
						break;
					}					
				}
			}
			
			if(room<10)
				System.out.println(floor+"0"+room);
			else System.out.println(floor+""+room);			
		}		
	}
}