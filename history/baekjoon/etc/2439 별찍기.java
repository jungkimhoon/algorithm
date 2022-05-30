import java.io.*;
import java.util.*;

public class Main {		
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=n; i++) {
			for(int j=n-i; j>0; j--) {
				bw.write(" ");
			}			
			
			for(int j=0; j<i; j++) {
				bw.write("*");
			}
			
			bw.write("\n");
		}
		bw.flush();
		bw.close();		
	}
}