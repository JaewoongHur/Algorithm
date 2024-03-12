import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
				String s = br.readLine();
				sb.append(Character.toUpperCase(s.charAt(0)));
				sb.append(s.substring(1, s.length()));
				sb.append(' ');				

			sb.append('\n');
		}

		System.out.println(sb);

	}
}