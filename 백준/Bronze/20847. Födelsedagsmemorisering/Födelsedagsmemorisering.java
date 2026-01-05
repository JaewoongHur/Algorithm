import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		String[][] s = new String[n][3];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			s[i][0] = st.nextToken();
			s[i][1] = st.nextToken();
			s[i][2] = st.nextToken();
		}

		HashSet<String> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			set.add(s[i][2]);
		}

		int m = set.size();
		System.out.println(m);

		String[] ans = new String[m];
		
		int idx = 0;
		
		for(String a : set) {
			int max = -1;
			String b = "";
			for(int i=0;i<n;i++) {
				if(a.equals(s[i][2])) {
					if(max < Integer.parseInt(s[i][1])) {
						max = Integer.parseInt(s[i][1]);
						b = s[i][0];
					}
				}
			}
			ans[idx] = b;
			idx++;
		}
		
		Arrays.sort(ans);

		for (int i = 0; i < m; i++) {
			System.out.println(ans[i]);
		}
	}
}
