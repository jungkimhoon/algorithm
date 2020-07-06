import java.util.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		List<Integer> list = new ArrayList<Integer>();
		
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		int sum = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=1; i<num; i++) {
			if(arr[i] - arr[i-1] > 0) sum += arr[i] - arr[i-1];
			else {
				list.add(sum);
				sum = 0;
			}
		}
		
		Collections.sort(list);
		sum = Math.max(list.get(list.size()-1), sum);
		System.out.println(sum);		
	}
}