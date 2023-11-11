import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] s;
		
		for(int i=0;i<n;i++) {
			s = br.readLine().split("-");
			int a = 0;
			for(int j=0;j<s[0].length();j++) {
				a+= (s[0].charAt(j)-'A') * (int)Math.pow(26,s[0].length()-j-1);
			}
			if(Math.abs(a-Integer.parseInt(s[1]))<=100) {
				System.out.println("nice");
			}
			else {
				System.out.println("not nice");
			}
		}
	}
}