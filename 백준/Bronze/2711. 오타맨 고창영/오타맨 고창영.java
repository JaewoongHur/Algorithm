import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			String[] s = br.readLine().split(" ");
			
			int a = Integer.parseInt(s[0]);
			
			String b = s[1];			
			
			for(int j=0;j<b.length();j++) {
				if(j==a-1) {
					continue;
				}
				sb.append(b.charAt(j));
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}