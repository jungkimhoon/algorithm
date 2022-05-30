import java.io.*;

public class Main {		
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] str = new String[n];
		
		for(int i=0; i<n; i++) {
			str[i] = br.readLine().trim();
			String[] splitStr = str[i].split(" ");
			String answer = "";
			for(int j=0; j<splitStr.length; j++) {
				answer += " " + splitStr[splitStr.length-j-1];
			}
			System.out.println("Case #"+(i+1)+":"+answer);
		}
	}
}