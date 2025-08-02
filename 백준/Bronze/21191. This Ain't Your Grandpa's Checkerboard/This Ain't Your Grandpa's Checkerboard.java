import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		char[][] arr = new char[n][n];

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < n; j++) {
				arr[i][j] = s.charAt(j);
			}
		}

		boolean pass = true;

		out: for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 2; j++) {
				if (n >= 3) {
					if (arr[i][j] == arr[i][j + 1] && arr[i][j + 1] == arr[i][j + 2]) {
						if (arr[i][j] == 'W' || arr[i][j] == 'B') {
							pass = false;
							break out;
						}
					}
				}
			}
		}

		out: for (int i = 0; i < n; i++) {
			if (!pass) {
				break;
			}
			for (int j = 0; j < n - 2; j++) {
				if (n >= 3) {
					if (arr[j][i] == arr[j + 1][i] && arr[j + 1][i] == arr[j + 2][i]) {
						if (arr[j][i] == 'W' || arr[j][i] == 'B') {
							pass = false;
							break out;
						}
					}
				}
			}
		}

		out: for (int i = 0; i < n; i++) {
			if(!pass) {
				break;
			}
			int nw = 0;
			int nb = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 'W') {
					nw++;
				} else {
					nb++;
				}
			}
			
			if(nw != nb) {
				pass = false;
				break out;
			}
		}
		
		out: for (int i = 0; i < n; i++) {
			if(!pass) {
				break;
			}
			int nw = 0;
			int nb = 0;
			for (int j = 0; j < n; j++) {
				if (arr[j][i] == 'W') {
					nw++;
				} else {
					nb++;
				}
			}
			
			if(nw != nb) {
				pass = false;
				break out;
			}
		}
		
		if(pass) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}