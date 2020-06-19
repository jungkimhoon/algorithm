import java.util.HashMap;
import java.util.Scanner;

public class Main {		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		
		for(int i=0; i<test; i++) {
			int n = sc.nextInt();
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			
			for(int j=0; j<n; j++) {
				String name = sc.next();
				String cloth = sc.next();
				
				if(map.get(cloth) == null) {
					map.put(cloth, 1);
				}else map.put(cloth, map.get(cloth)+1);
			}
			
			int result = 1;
			for(String k : map.keySet()) {
				result *= map.get(k)+1;
			}					
			
			System.out.println(result-1);
		}
	}
}
