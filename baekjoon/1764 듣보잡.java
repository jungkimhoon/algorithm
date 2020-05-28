import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[] n1 = new String[n];
		String[] m1 = new String[m];
		HashSet<String> set = new HashSet<String>();
		List<String> list = new ArrayList<String>();
		int cnt = 0;
		
		
		for(int i=0; i<n; i++) {
			n1[i] = sc.next();
			set.add(n1[i]);
		}
		
		for(int i=0; i<m; i++) {
			m1[i] = sc.next();
			if(set.contains(m1[i])) {
				list.add(m1[i]);
				cnt++;
			}
		}
		
		Collections.sort(list);
		System.out.println(cnt);
		for(String s : list) {
			System.out.println(s);
		}			
	}
}
