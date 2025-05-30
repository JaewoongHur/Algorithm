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
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a*a + b*b==c*c || b*b + c*c==a*a || c*c + a*a == b*b) {
				System.out.println("Case #" + tc +": YES");
			}else {
				System.out.println("Case #" + tc +": NO");
			}
		}
	}
}