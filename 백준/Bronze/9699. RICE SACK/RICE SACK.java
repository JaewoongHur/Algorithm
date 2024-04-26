import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= n; tc++) {
			st = new StringTokenizer(br.readLine());

			int[] arr = new int[5];
			
			for(int i=0;i<5;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			sb.append("Case #").append(tc).append(": ").append(arr[4]).append('\n');
		}

		System.out.println(sb);
	}
}