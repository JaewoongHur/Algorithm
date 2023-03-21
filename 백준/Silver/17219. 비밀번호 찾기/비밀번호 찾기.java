import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] s= br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);
		Map<String, String> map = new HashMap<>();
		for(int i=0;i<N;i++) {
			s = br.readLine().split(" ");
			map.put(s[0], s[1]);
		}
		for(int i=0;i<M;i++) {
			String key = br.readLine();
			sb.append(map.get(key)).append("\n");
		}
		System.out.println(sb);
	}
}