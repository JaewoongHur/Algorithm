import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			boolean pass = false;
			
			if(Math.abs(c-a) == 2 && Math.abs(d-b)==1) {
				pass = true;
			}else if(Math.abs(c-a) == 1 && Math.abs(d-b) == 2) {
				pass = true;
			}
			
			if(pass) {
				System.out.println("Case " + i + ": YES");
			}else {
				System.out.println("Case " + i + ": NO");
			}
		}
	}
}