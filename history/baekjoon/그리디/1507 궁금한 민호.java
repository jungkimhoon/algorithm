import java.util.Scanner;

public class Main { 
		
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] city = new int[n][n];
		int[][] newCity = new int[n][n];
		
		for(int i=0; i<city.length; i++) {
			for(int j=0; j<city.length; j++) {
				city[i][j] = newCity[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<city.length; i++) {
			for(int j=0; j<city.length; j++) {
				for(int k=0; k<city.length; k++){
					if(i==j || j==k || k==i) continue;
					
					if(city[i][j] == city[i][k] + city[k][j]) {최소경로 == 거쳐가는길일떄
						newCity[i][j] = 0;						
					}else if(city[i][j] > city[i][k] + city[k][j]) { //최소경로보다 거쳐가는게 빠르면 -1
						System.out.println("-1");
						return;
					}
				}
			}
		}
		
		int result = 0;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(newCity[i][j] != 0)
				result += newCity[i][j];
			}			
		}
		
		System.out.println(result);
		
	}
}