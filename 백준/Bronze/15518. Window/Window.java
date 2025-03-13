import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());

		boolean[] covered = new boolean[n * w];

		st = new StringTokenizer(br.readLine());

		for (int i = 1; i <= n; i++) {
			int a = Integer.parseInt(st.nextToken());

			int s = w * (i - 1);
			int e = w * i;

			if (i % 2 == 0) {
				s -= a;
				e -= a;
			}else {
				s += a;
				e += a;
			}
			
			for(int j=s;j<e;j++) {
				if(covered[j])continue;
				covered[j] = true;
			}
		}
		
		int blank = 0;
		for(int i=0;i<n*w;i++) {
			if(!covered[i]) {
				blank++;
			}
		}
		System.out.println(blank*h);
	}
}