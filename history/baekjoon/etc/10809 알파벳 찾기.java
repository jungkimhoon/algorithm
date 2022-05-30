import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int[] c = new int[26];
		boolean[] flag = new boolean[26];
		String str = br.readLine();
		
		for(int i=0; i<str.length(); i++) {
			if(!flag[str.charAt(i)-'a']) {
				flag[str.charAt(i)-'a'] = true;
				c[str.charAt(i) -'a'] = i;
			}
		}
		
		for(int i=0; i<26; i++) {
			if(flag[i]) System.out.print(c[i]+ " ");
			else System.out.print("-1"+" ");
		}
	}
}