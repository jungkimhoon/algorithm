
import java.util.ArrayList;
import java.util.Scanner;

public class Main { 
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int port = sc.nextInt();
		int[] connection = new int[port];
		
		for(int i=0; i<port; i++) {
			connection[i] = sc.nextInt();
		}
		
		ArrayList<Integer> c = new ArrayList<Integer>();
	
		c.add(connection[0]);
		
		for(int i=1 ; i<port; i++) {
			if(connection[i] > c.get(c.size()-1)) {
				c.add(connection[i]);
			} else {
				int j=0;
				for(j=0; j<c.size(); j++) {
					if(connection[i] > c.get(j))
						continue;
					else
						break;
					
				}
				
				c.remove(j);
				c.add(j,connection[i]);
			}		
			
		}
		
		System.out.println(c.size());		
	
	}
}