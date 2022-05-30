
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
		static int[][] matrix;
		static Queue<Integer> queue = new LinkedList<>();
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tmp;
		matrix = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(matrix[i][j] == 1) {
					queue.add(j);
				}
			}
			while(!queue.isEmpty()) {
				tmp = queue.poll();
				BFS(i, tmp);
			}			
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
		}	
	}
	
	public static void BFS(int i, int tmp) {
		matrix[i][tmp] = 1;
		for(int j=0; j<matrix[0].length; j++) {
			if(matrix[tmp][j] == 1 && matrix[i][j] != 1) {
				queue.add(j);
			}
		}
	}
}
