import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int n = str.length();

		int r = 0;

		for (int i = (int) Math.sqrt(n); i >= 1; i--) {
			if (n % i == 0) {
				int a = n / i;

				if (i <= a) {
					r = i;
					break;
				}
			}
		}
		
		int s = n / r;  
		
		char[][] arr = new char[r][s];
		
		int idx = 0;
		
		for(int i=0;i<s;i++) {
			for(int j=0;j<r;j++) {
				arr[j][i] = str.charAt(idx);
				idx++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<s;j++) {
				sb.append(arr[i][j]);
			}
		}
		
		System.out.println(sb);
		
	}
}