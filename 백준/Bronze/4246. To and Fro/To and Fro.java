import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s;

		while (true) {
			s = br.readLine().trim();

			if (s.equals("0")) {
				break;
			}

			int m = Integer.parseInt(s);

			s = br.readLine().trim();

			int k = s.length();

			int n = k / m;
			
			char[][] arr = new char[n][m];
			
			int a = 0;
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if((a/m) % 2 == 0) {
						arr[i][j] = s.charAt(a);
					}else {
						arr[i][m-j-1] = s.charAt(a);
					}
					a++;
				}
			}
			
			StringBuilder sb = new StringBuilder();
			
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					sb.append(arr[j][i]);
				}
			}
			System.out.println(sb);
		}
	}
}