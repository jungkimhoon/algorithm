import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			double d = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
			double r = r1+r2;
			if(x1 == x2 && y1 == y2 && r1 == r2) 
				System.out.println(-1);
			else if(x1==x2 && y1==y2 && r1 != r2)
				System.out.println(0);
			else if(d > r)
				System.out.println(0);
			else if(d < Math.abs(r1-r2))
				System.out.println(0);
			else if(d == r)
				System.out.println(1);
			else if(d == Math.abs(r1-r2))
				System.out.println(1);
			else if(d < r)
				System.out.println(2);		 
		}
	}
}