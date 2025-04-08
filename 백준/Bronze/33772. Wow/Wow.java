import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		char[][] map = new char[2][n];

		for (int i = 0; i < 2; i++) {
			String s = br.readLine();

			for (int j = 0; j < n; j++) {
				map[i][j] = s.charAt(j);
			}
		}
		
		StringBuilder sb = new StringBuilder();
			
		int a = 0;
		
		for (int i = 0; i < n; i++) {
			if (map[0][i] == '\\') {
				a++;
			} else if (map[0][i] == '.' && map[1][i] == '.') {
				if(a==1) {
					sb.append('v');
				}else if(a==2) {
					sb.append('w');
				}
				a = 0;
			}
		}
		
		if(a==1) {
			sb.append('v');
		}else if( a== 2) {
			sb.append('w');
		}
		
		System.out.println(sb);
	}
}