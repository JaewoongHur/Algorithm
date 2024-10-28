import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= n; tc++) {
			String s = br.readLine();

			int a = 0;

			for (int i = 0; i < s.length(); i++) {
				a += s.charAt(i) - '0';
			}
			
			int b = Integer.parseInt(s.substring(10,13));
			b *=10;
			
			a += b;
			
			if(a<1000) {
				a+=1000;
				System.out.println(a);
			}else if(a >= 10000) {
				String t = String.valueOf(a);
				t = t.substring(1,5);
				System.out.println(t);
			}else {
				System.out.println(a);
			}
		}
	}
}