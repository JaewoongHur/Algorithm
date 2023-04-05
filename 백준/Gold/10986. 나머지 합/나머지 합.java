import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] S = new int[N+1];
		long[] cnt = new long[M];
		st = new StringTokenizer(br.readLine());
		int sum = 0;
		cnt[0]++;
		for(int i = 0; i<N;i++) {
			sum += Integer.parseInt(st.nextToken()) % M;
			S[i+1] = sum % M;

			cnt[S[i+1]]++;
		}
		long ans = 0;
		for(int i=0;i<M;i++) {
			if(cnt[i]>1) {
			ans+=(cnt[i])*(cnt[i]-1)/2;
			}
		}
		System.out.println(ans);
	}	
}