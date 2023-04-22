import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		int n = s.length();

		if (n == 1) {
			System.out.println("NO");
		} else {
			boolean check = false;
			int multi1 = 1;
			
			for (int i = 0; i < n; i++) {
				int tmp = s.charAt(i) - '0';
				multi1 *= tmp;
				int multi2 = 1;
				for(int j=i+1;j<n;j++) {
					int tmp2 = s.charAt(j)-'0';
					multi2 *= tmp2;
				}
				if(multi1 == multi2) {
					check = true;
				}
				
			}
			if (check) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

	}
}