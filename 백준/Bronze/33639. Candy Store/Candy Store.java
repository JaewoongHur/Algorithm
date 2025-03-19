import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());

		String[] s = new String[n];

		for (int i = 0; i < n; i++) {
			s[i] = br.readLine();
		}

		for (int i = 0; i < q; i++) {
			String query = br.readLine();
			int cnt = 0;
			int idx = 0;
			for(int j=0;j<n;j++) {
				st = new StringTokenizer(s[j]);
				
				if(st.nextToken().charAt(0)==query.charAt(0) && st.nextToken().charAt(0)==query.charAt(1)) {
					idx = j;
					cnt++;
				}
			}
            
			if(cnt>1) {
				System.out.println("ambiguous");
			}else if(cnt==1) {
				System.out.println(s[idx]);
			}else {
				System.out.println("nobody");
			}
            
		}
	}
}