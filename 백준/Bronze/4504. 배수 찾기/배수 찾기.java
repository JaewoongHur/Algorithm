import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			s = br.readLine();
			if (s.equals("0")) {
				break;
			}

			int a = Integer.parseInt(s);
			
			if(a % n == 0) {
				sb.append(a).append(" is a multiple of ").append(n).append('.').append('\n');
			}else {
				sb.append(a).append(" is NOT a multiple of ").append(n).append('.').append('\n');
			}
		}
		System.out.println(sb);
	}
}