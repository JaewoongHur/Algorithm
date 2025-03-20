import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st= new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int ans = 0;
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			HashSet<String> set = new HashSet<String>();
			
			for(int j=0;j<m;j++) {
				String a = st.nextToken();
				set.add(a);
			}
			
			ans += m - set.size();			
		}
		
		System.out.println(ans);
	}
}