import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int x = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		int min = Integer.MAX_VALUE;
		
		int ans = 0;
		
		
		for(int i=l;i<=r;i++) {
			int a = Math.abs(i-x);
			
			if(a<min) {
				min = a;
				ans = i;
			}
			
		}
		
		System.out.println(ans);

	}
}