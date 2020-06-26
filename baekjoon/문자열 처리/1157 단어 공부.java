import java.io.*;
import java.util.*;

public class Main {		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		String str = br.readLine().toUpperCase();
		for(int i=0; i<str.length(); i++) {
			if(map.get(str.charAt(i)) == null)
				map.put(str.charAt(i), 1);
			else map.put(str.charAt(i), map.get(str.charAt(i))+1);
		}
					
		int max = 0;
		int count = 0;
		
		for(Character i : map.keySet()) {
			if(max < map.get(i)) {
				max = map.get(i);
			}
		}
		
		char key = 0;
		for(Character i : map.keySet()) {
			if(max == map.get(i)) {
				key = i;
				count++;
			}
		}
		
		if(count > 1) System.out.println("?");
		else System.out.println(key);
	}	
}
