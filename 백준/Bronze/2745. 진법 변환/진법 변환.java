import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		String str = s[0];
		int B = Integer.parseInt(s[1]);
		int n = str.length();
		int num = 0;
		for(int i=0;i<n;i++) {
			char c = str.charAt(i);
			if(c-48>9) {
				c -= 55;
			}
			else {
				c-= 48;
			}
			
			num+=c*Math.pow(B,n-i-1);		
		}
		System.out.println(num);
	}
}