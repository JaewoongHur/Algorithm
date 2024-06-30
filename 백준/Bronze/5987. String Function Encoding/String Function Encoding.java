import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for(int tc=0;tc<T;tc++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m= Integer.parseInt(st.nextToken());
			
			String s = st.nextToken();
			
			for(int i=0;i<m;i++) {
				String ns = s.substring(n,s.length());
				StringBuilder sb = new StringBuilder();
				sb.append(ns).append(s);
				s = sb.toString();				
			}
			System.out.println(s);
		}
	}
}