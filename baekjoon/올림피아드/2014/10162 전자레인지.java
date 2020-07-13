import java.io.*;
import java.util.*;

public class Main {		
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		int a = t/300;
		t = t%300;
	
		int b = t/60;
		t = t%60;
		
		int c = t/10;
		t = t%10;
		
		if(t != 0) System.out.println("-1");
		else System.out.println(a+" "+b+" "+c);				
	}
}