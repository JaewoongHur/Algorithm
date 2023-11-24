import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		long[] arr = new long[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}

		Arrays.sort(arr);

		int s = 0;
		int e = n-1;
		long min = Math.abs(arr[s] + arr[e]);
		
		int ms = 0;
		int me = n-1;

		while (s<e) {
			long sum = arr[s] + arr[e];
			if(min > Math.abs(sum)) {
				ms = s;
				me = e;
				min = Math.abs(sum);
			}
			
			if(sum > 0 ) {
				e--;
			}
			else if(sum<0) {
				s++;
			}
			else {
				break;
			}
			
		}
		System.out.println(arr[ms] + " " + arr[me]);
	}
}