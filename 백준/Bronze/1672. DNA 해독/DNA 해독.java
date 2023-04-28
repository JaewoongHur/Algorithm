import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String s = br.readLine();

		char last = s.charAt(N-1);
		for (int i = N - 1; i >= 1; i--) {
			switch (s.charAt(i - 1)) {
			case 'A':
				switch(last) {
				case 'A':
					last = 'A';
					break;
				case 'G':
					last ='C';
					break;
				case 'C':
					last = 'A';
					break;
				case 'T':
					last = 'G';
					break;
				
				}

				break;
			case 'G':
				switch(last) {
				case 'A':
					last ='C';
					break;
				case 'G':
					last = 'G';
					break;
				case 'C':
					last = 'T';
					break;
				case 'T':
					last = 'A';
					break;
				
				}
				break;
			case 'C':
				switch(last) {
				case 'A':
					last = 'A';
					break;
				case 'G':
					last = 'T';
					break;
				case 'C':
					last ='C';
					break;
				case 'T':
					last = 'G';
					break;
				
				}
				break;
			case 'T':
				switch(last) {
				case 'A':
					last = 'G';
					break;
				case 'G':
					last = 'A';
					break;
				case 'C':
					last = 'G';
					break;
				case 'T':
					last = 'T';
					break;
				
				}
				break;

			}
		}
		System.out.println(last);
	}
}