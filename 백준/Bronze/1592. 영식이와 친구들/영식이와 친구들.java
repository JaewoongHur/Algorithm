import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());

		int[] arr = new int[n + 1];

		int ans = 0;

		int idx = 1;
		arr[1] = 1;
		
		while (arr[idx] < m) {
			if (arr[idx] % 2 == 1) {
				idx = (idx + l) % n;
				if (idx == 0) {
					idx = n;
				}
			} else {
					idx = (idx - l) % n;
					if (idx == 0) {
						idx = n;
					}
					else if(idx < 0){
						idx+=n;
					}
				}
			++arr[idx];
			++ans;
		}
		System.out.println(ans);
	}
}