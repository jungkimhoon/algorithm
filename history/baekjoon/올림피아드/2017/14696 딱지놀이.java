import java.io.*;
import java.util.*;

public class Main {		
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			Integer[] arrX = new Integer[x];
			for(int j=0; j<x; j++) {
				arrX[j] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			
			int y = Integer.parseInt(st.nextToken());
			Integer[] arrY = new Integer[y];
			for(int j=0; j<y; j++) {
				arrY[j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arrX, Comparator.reverseOrder());
			Arrays.sort(arrY, Comparator.reverseOrder());
			
			int min = Math.min(arrX.length, arrY.length);
			boolean flag = false;
			for(int j=0; j<min; j++) {
				if(arrX[j] > arrY[j]) {
					System.out.println("A");
					flag = true;
					break;
				}else if(arrX[j] < arrY[j]) {
					System.out.println("B");
					flag = true;
					break;
				}				
			}
			
			if(!flag) {
				if(arrX.length > arrY.length) System.out.println("A");
				else if(arrX.length < arrY.length) System.out.println("B");
				else System.out.println("D");
			}
		}		
	}
}