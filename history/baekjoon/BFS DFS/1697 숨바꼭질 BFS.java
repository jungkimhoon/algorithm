
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		    
        int subin = sc.nextInt();
        int bro = sc.nextInt();
        int[] visited = new int[100001];
     
        Queue<Integer> q = new LinkedList<Integer>();
        
        q.add(subin);
        int count = 0;
        int n = subin;
        
        if(subin == bro) {
        	System.out.println(0);
        	System.exit(0);
        }
        
        while(!q.isEmpty()) {
        	n = q.poll();   
        	if(n == bro) break;
        	int[] range = {n-1, n+1, 2*n}; 
        	
        	for(int i=0; i<3; i++) {
        		if(range[i]>= 0 && range[i]<=100000) {
	     	        		
	        		if(visited[range[i]] == 0) {		        		
		        		q.add(range[i]);
		        		visited[range[i]] = visited[n] + 1; 
	        		}
        		}
        	}        	         	
        }
        
        System.out.println(visited[bro]);
	}
}
