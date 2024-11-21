import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < T; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			String s = br.readLine();
			
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='b') {
					n--;
				}else {
					n++;
				}
				
				if(n==0) {
					break;
				}
			}
			
			System.out.println("Data Set " + (tc+1) + ":");
			System.out.println(n);	
			System.out.println();
		}
	}
}