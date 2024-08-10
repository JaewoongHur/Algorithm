import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int m = Integer.parseInt(br.readLine());

		String s = br.readLine();

		int n = Integer.parseInt(br.readLine());

		char[][] arr = new char[n][m];

		int x = 0;
		int y = 0;

		for (int i = 0; i < n; i++) {
			String a = br.readLine();
			for (int j = 0; j < m; j++) {
				arr[i][j] = a.charAt(j);

				if (s.charAt(j) == 'S') {
					if (arr[i][j] == 'P') {
						x += 2;
					} else if (arr[i][j] == 'S') {
						x++;
					}
				} else if (s.charAt(j) == 'P') {
					if (arr[i][j] == 'R') {
						x += 2;
					} else if (arr[i][j] == 'P') {
						x++;
					}
				} else if (s.charAt(j) == 'R') {
					if (arr[i][j] == 'S') {
						x += 2;
					} else if (arr[i][j] == 'R') {
						x++;
					}
				}
			}
		}

		for (int i = 0; i < m; i++) {
			int max = 0;

			int b = 0;
			for (int j = 0; j < n; j++) {
				if (arr[j][i] == 'S') {
					b++;
				} else if (arr[j][i] == 'P') {
					b += 2;
				}
			}
			
			max = Math.max(max, b);
			
			b = 0;
			
			for (int j = 0; j < n; j++) {
				if (arr[j][i] == 'P') {
					b++;
				} else if (arr[j][i] == 'R') {
					b += 2;
				}
			}
			
			max = Math.max(max, b);
			
			b = 0;
			
			for (int j = 0; j < n; j++) {
				if (arr[j][i] == 'R') {
					b++;
				} else if (arr[j][i] == 'S') {
					b += 2;
				}
			}
			
			max = Math.max(max, b);
			
			y += max;
		}

		System.out.println(x);
		System.out.println(y);

	}
}