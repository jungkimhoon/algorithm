import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String rb = br.readLine();
		char[] arr = new char[rb.length()];
		
		for(int i=0; i<rb.length(); i++) {
			arr[i] = rb.charAt(i);
		}
		
		int min = 0;
		int count = 0;
		boolean flag = false;
		
		for(int i=0; i<rb.length(); i++) {
			if(arr[i] =='B') flag = true;
			if(arr[i] == 'R' && flag) count++;
		}
		
		flag = false;
		min = count;
		count = 0;
		
		for(int i=rb.length()-1; i>=0; i--) {
			if(arr[i] == 'B') flag = true;
			if(flag && arr[i] == 'R') count++;
 		}
	
		min = Math.min(min, count);
		flag = false;
		count = 0;
		
		for(int i=0; i<rb.length(); i++) {
			if(arr[i] =='R') flag = true;
			if(arr[i] == 'B' && flag) count++;
		}
		
		min = Math.min(min, count);
		flag = false;
		count = 0;
		
		for(int i=rb.length()-1; i>=0; i--) {
			if(arr[i] == 'R') flag = true;
			if(flag && arr[i] == 'B') count++;
 		}
		
		System.out.println(Math.min(min, count));
		
	}
}