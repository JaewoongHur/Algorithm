import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int ans = 0;
		
		int n = Integer.parseInt(br.readLine());
		
		boolean[] visit = new boolean[101];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) {
			int a = Integer.parseInt(st.nextToken());
			
			if(!visit[a]) {
				visit[a] = true;
			}
			else {
				ans++;
			}
		}
		
		System.out.println(ans);
	
	}
}