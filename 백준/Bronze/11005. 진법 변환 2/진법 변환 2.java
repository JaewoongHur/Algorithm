import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		
		int num2 = num;
		int n = 0;
		while(num2 > 0) {		
			num2 /= B;
			n++;
		}
		num2 = num; 
		for(int i=0;i<n;i++) {
			int c = num2/(int) Math.pow(B,n-1-i);
			if(c>9) {
				sb.append((char)(c+55));
			}
			if(c<=9) {
				sb.append((char)(c+48));
			}
			num2 -= Math.pow(B, n-1-i)*c;
		}
		System.out.println(sb.toString());
	}
}