import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] s = br.readLine().split(" ");

		int[] x = new int[81];
		int[] y = new int[81];

		String a = s[0];
		String b = s[1];

		for (int i = 0; i < a.length(); i++) {
			x[80 - i] = a.charAt(a.length() - 1 - i) - '0';
		}

		for (int i = 0; i < b.length(); i++) {
			y[80 - i] = b.charAt(b.length() - 1 - i) - '0';
		}

		for (int i = 0; i < 81; i++) {
			x[i] += y[i];
		}
		for (int i = 80; i >= 0; i--) {
			if (x[i] == 2) {
				x[i] = 0;
				x[i - 1]++;
			} else if (x[i] == 3) {
				x[i] = 1;
				x[i - 1]++;
			}

		}
		
		boolean start =false;
		for(int i=0;i<81;i++) {
			if(!start) {
				if(x[i] == 1) {
					start= true;
					sb.append('1');
				}
			}
			else {
				sb.append((char)(x[i]+'0'));
			}
		}
		
		boolean findone = false;
		for(int i=0;i<81;i++) {
			if(x[i] == 1) {
				findone = true;
				break;
			}
		}
		if(!findone) {
			sb.append('0');
		}
		
		System.out.println(sb.toString());
	}
}