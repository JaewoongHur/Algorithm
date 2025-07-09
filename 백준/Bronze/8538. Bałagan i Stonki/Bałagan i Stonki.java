import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		HashSet<String> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			String s = br.readLine();

			StringBuilder sb = new StringBuilder();

			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);

				if (c == '-') {
					continue;
				}

				if(Character.isUpperCase(c)) {
					c = Character.toLowerCase(c);
				}
				
				sb.append(c);
			}
			
			set.add(sb.toString());
		}
		
		System.out.println(set.size());
	}
}
