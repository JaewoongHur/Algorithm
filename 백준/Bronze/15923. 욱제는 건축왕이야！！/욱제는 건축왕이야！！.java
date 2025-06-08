import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		int sa = Integer.parseInt(st.nextToken());
		int sb = Integer.parseInt(st.nextToken());
		
		int ans = 0;
		
		int pa = sa;
		int pb = sb;
		
		for(int i=0;i<n-1;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			ans += Math.max(Math.abs(pa-a), Math.abs(pb-b));
			
			pa = a; pb = b;
		}
		
		ans += Math.max(Math.abs(pa-sa), Math.abs(pb-sb));
		
		System.out.println(ans);
	}
}