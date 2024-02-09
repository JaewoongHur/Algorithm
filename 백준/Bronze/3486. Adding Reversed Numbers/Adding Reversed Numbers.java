import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int tc=1;tc<=n;tc++) {
			st = new StringTokenizer(br.readLine());
			StringBuilder sb1 = new StringBuilder();
			StringBuilder sb2 = new StringBuilder();
			sb1.append(st.nextToken());
			sb2.append(st.nextToken());
			
			sb1 = sb1.reverse();
			sb2 = sb2.reverse();
			
			int x  = Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());
			
			String s = String.valueOf(x);
			StringBuilder sb = new StringBuilder();
			sb.append(s);
			sb = sb.reverse();
			
			System.out.println(Integer.parseInt(sb.toString()));
		}
	}
}