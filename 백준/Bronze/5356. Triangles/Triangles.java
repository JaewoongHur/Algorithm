import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			st = new StringTokenizer(s);
			
			int a = Integer.parseInt(st.nextToken());
			
			char b = st.nextToken().charAt(0);
			
			for(int j=1;j<=a;j++) {
				char c = (char) ((b-'A'+j-1)%26 + 'A');
				for(int k=0;k<j;k++) {
					sb.append(c);
				}				
				sb.append('\n');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}