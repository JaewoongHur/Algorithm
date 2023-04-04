import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		int[] S = new int[N];
		
		int sum = 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
			S[i] = sum;
		}
		int max = Integer.MIN_VALUE;
		for(int i=0;i<N;i++) {
			if(i==0) {
				max =Math.max(S[K-1],max);
			}
			if(i>=1 && i+K<N) {
			max = Math.max(S[i+K]-S[i],max);
			}
		}
		System.out.println(max);
		
		
		
	}
}