package algorithm;

import java.util.Scanner;

public class Main {	
	static boolean[] visited;
	static int[][] com;
	static int count;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int connect = sc.nextInt();
		
		com = new int[num][num];
		visited = new boolean[num];
		
		for(int i=0; i<connect; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			com[n1-1][n2-1] = com[n2-1][n1-1] = 1;
		}
		
		dfs(0, num);
		System.out.println(count);
		
	}
	
	public static void dfs(int i, int num) {
		if(!visited[i])
			visited[i] = true;
					
			for(int j=0; j<num; j++) {
				if(com[i][j] == 1 & !visited[j]) {
					count++;
					dfs(j, num);
				}				
			}
	}
	
}