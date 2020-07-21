import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] tri = new int[3];
			tri[0] = Integer.parseInt(st.nextToken());
			tri[1] = Integer.parseInt(st.nextToken());
			tri[2] = Integer.parseInt(st.nextToken());
			if(tri[0] == 0 && tri[1] == 0 && tri[2] == 0) break;
			
			Arrays.sort(tri);
			if(Math.pow(tri[0],2)+Math.pow(tri[1],2) == Math.pow(tri[2], 2))
				System.out.println("right");
			else System.out.println("wrong");			
		}
	}
}