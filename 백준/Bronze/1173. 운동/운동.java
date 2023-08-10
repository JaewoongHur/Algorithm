import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		int x = m;
		int t =0;
		int cnt =0;
		
		boolean possible = true;
		if(x+T>M && x-R<m) {
			possible = false;
		}
		
		if(possible) {
		while(cnt<N) {
			if(x+T>M) {
				t++;
				x-=R;
				if(x<m) {
					x=m;
				}
			}
			else {
				t++;
				cnt++;
				x+=T;
			}
		}
		System.out.println(t);
		}
		else {
			System.out.println(-1);
		}
			
	}
}