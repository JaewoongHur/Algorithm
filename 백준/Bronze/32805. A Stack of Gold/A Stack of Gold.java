import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int m = Integer.parseInt(st.nextToken());

		int n = Integer.parseInt(st.nextToken());

		int e = (m - 29260 * n * (n + 1) / 2) / 110;
		
		System.out.println(e);
	}
}