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
		
		boolean[] check = new boolean[15001];
		
		for(int i=0;i<n;i++) {
			int a = Integer.parseInt(st.nextToken());
			
			if(!check[a]) {
				check[a] = true;
			}
		}
		
		int ans = 0;
		
		for(int i=1;i<=15000;i++) {
			if(!check[i]) {
				ans++;
			}
		}
		
		System.out.println(ans);
		
	}
}