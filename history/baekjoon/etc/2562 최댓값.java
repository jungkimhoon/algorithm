import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int max = Integer.MIN_VALUE;
		int x = 0;
		int location = 0;
		
		for(int i=1; i<=9; i++) {
			x = Integer.parseInt(br.readLine());
			if(max < x) {
				location = i;
				max = x;
			}
		}
		
		System.out.println(max);
		System.out.println(location);
	}
}