import java.io.*;
import java.util.*;

public class Main {		
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int students = Integer.parseInt(st.nextToken());
			int apple = Integer.parseInt(st.nextToken());
			
			while(true) {
				if(apple >= students)
					apple = apple - students;
				else break;
			}
			
			sum += apple;
		}
		System.out.println(sum);
		
	}
}