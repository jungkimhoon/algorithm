import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		
		int i=0;
		int count = 0;
		while(true) {
			i++;
			String str = i+"";
			
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) == '0') continue;
				if((str.charAt(j)-'0') % 3 == 0) {
					count++;
				}
			}	 			
			if(i == num) break;
		}		
		bw.write(count+"\n");
		bw.flush();
		bw.close();
	}
}
