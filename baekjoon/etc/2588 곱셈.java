import java.io.*;
import java.util.*;

public class Main {		
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		String b = br.readLine();
		
		for(int i=0; i<b.length(); i++) {
			int num = b.charAt(b.length()-1-i) -'0';
			System.out.println(a * num);
		}
		
		System.out.println(a*Integer.parseInt(b));		
	}
}