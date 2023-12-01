import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		for(int tc=1;tc<=T;tc++) {
			String s = br.readLine();
			String ans = "";
			int n = Integer.parseInt(br.readLine());
			int min = Integer.MAX_VALUE;
			for(int i=0;i<n;i++) {
				StringBuilder p = new StringBuilder(s);
				String w = br.readLine();
				int cnt = 0;
				for(int j=0;j<w.length();j++) {
					if(p.charAt(j)==w.charAt(j)) continue;
					cnt++;				
				}
				
				if(cnt<min) {
					min = cnt;
					ans = w;
				}
			}
			System.out.println(ans);
		}
	}
}