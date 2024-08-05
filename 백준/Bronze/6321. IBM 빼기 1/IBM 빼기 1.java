import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for(int tc=1;tc<=n;tc++) {
			String s = br.readLine();
			
			StringBuilder sb = new StringBuilder();
			
			for(int i=0;i<s.length();i++) {
				char a = s.charAt(i);
				
				a = (char)((a-'A'+1)%26 + 'A');
				sb.append(a);
			}
			System.out.println("String #" + tc);
			System.out.println(sb.toString());
			System.out.println();
		}
	}
}