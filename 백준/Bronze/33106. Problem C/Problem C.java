import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String s = br.readLine();

			StringBuilder sb = new StringBuilder();

			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == 'c') {
					if (j < s.length() - 1) {
						if(s.charAt(j+1)=='e'||s.charAt(j+1)=='i'||s.charAt(j+1)=='y') {
							sb.append('s');
						}else if(s.charAt(j+1)=='h'){
							sb.append('c');
						}else {
							sb.append('k');
						}
					} else {
						sb.append('k');
					}
				}else if(j>=1 && s.charAt(j)=='h') {
					if(s.charAt(j-1)=='c') {
						continue;
					}else {
						sb.append(s.charAt(j));
					}
				}else {
					sb.append(s.charAt(j));
				}

			}
			System.out.println(sb);
		}
	}
}
