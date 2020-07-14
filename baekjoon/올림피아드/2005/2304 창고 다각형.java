import java.io.*;
import java.util.*;

public class Main {		
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		int maxX = 0;
		int maxY = 0;
		int[] arr = new int[1001];
		
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			maxY = Math.max(maxY, y);
			if(maxY == y) maxX = x;
			arr[x] = y;
		}
		int sum = 0;
		int currVal = 0;
		for(int i=1; i<maxX; i++) {
			if(arr[i] > currVal) currVal = arr[i];
			sum += currVal;
		}
		
		currVal = 0;
		for(int i=1000; i>maxX; i--) {
			if(arr[i] > currVal ) currVal = arr[i];
			sum += currVal;
		}
		
		sum += maxY;
		System.out.println(sum);
	}
}