import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			String s = br.readLine();
			
			int[] num = new int[10];
			
			for(int j=0;j<s.length();j++) {
				num[s.charAt(j)-'0']++;
			}
			
			int cnt = 0;
			
			for(int j=0;j<10;j++) {
				if(num[j]>0) {
					cnt++;
				}
			}			
			System.out.println(cnt);
		}
	
	}
}