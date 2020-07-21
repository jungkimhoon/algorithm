
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int num = 0;
		int count = 0;
		while(true) {
			num++;
			String str = num+"";
			
			if(str.contains("666")) count++;			
			if(count == n) break;				
		}
		
		System.out.println(num);		
	}
}