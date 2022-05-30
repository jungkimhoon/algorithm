import java.util.*;
import java.io.*;

public class Main {	

	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		boolean[][] cow = new boolean[11][2];
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			cow[num1][num2] = true;			
			if(cow[num1][0] && cow[num1][1]) {
				count++;
				if(num2 == 1) cow[num1][0] = false;
				if(num2 == 0) cow[num1][1] = false;
			}
		}		
		System.out.println(count);		
	}
}