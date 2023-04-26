import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int tmp = N;
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine(), ",");
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < K; i++) {
			for (int j = 0; j < N - 1; j++) {
				arr[j] = arr[j + 1] - arr[j];
			}
			N--;
		}
		
		System.out.print(arr[0]);
		for(int i=1;i<tmp-K;i++) {
			System.out.print(","+arr[i]);
		}

	}
}