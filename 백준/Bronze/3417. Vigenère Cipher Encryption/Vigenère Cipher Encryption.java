import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			s = br.readLine();

			if (s.equals("0")) {
				break;
			}

			String a = br.readLine();

			int[] k = new int[s.length()];
			
			int n = s.length();
			
			for (int i = 0; i < n; i++) {
				k[i] = s.charAt(i) - 'A' + 1;
			}
			
			for(int i=0;i<a.length();i++) {
				int t = a.charAt(i)-'A';
				
				char b = (char)((k[i%n] + t) %26 +'A'); 
				sb.append(b);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}