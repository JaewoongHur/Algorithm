import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		s = br.readLine();
		int n = s.length();
		
		int num = 0;
		for(int i=0;i<n;i++) {
			if(s.charAt(i)-'0'<=9) {
				num += (s.charAt(i)-'0') * (int) Math.pow(16, n-1-i);
			}
			else {
				num += (s.charAt(i)-'A'+10) * (int) Math.pow(16, n-1-i);
			}
		}
		System.out.println(num);
	}

}