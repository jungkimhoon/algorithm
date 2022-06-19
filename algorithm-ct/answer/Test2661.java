package answer;

import java.util.*;
import java.io.*;

public class Test2661 {	
	static int[] arr;
	static boolean[] visited;
	static int n;
	static String result;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		visited = new boolean[n];
		dfs();
	}

	private static void dfs() {
		if(result.length() == n) {
			System.out.println(result);
			return;
		}

		for(int i=1; i<=3; i++) {
			result += i;
			if (isFineSequence()) {
				dfs();
			}
		}
	}

	private static boolean isFineSequence() {
		int length = result.length() / 2;

		for(int i=1; i<=length; i++) {
			String a = result.substring(length - i, length);
			String b = result.substring(length - i - i, length - i)

			if(a.equals(b)) {
				return false;
			}
		}
		return true;
	}
}

