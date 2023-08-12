import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int N, M,b;
	static int[] cnt, res, arr;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		cnt = new int[10001];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++) {
			int a = Integer.parseInt(st.nextToken());
			cnt[a]++;
		}
		b = 0;
		for(int i=0;i<10001;i++) {
			if(cnt[i]!=0) {
				b++;
			}
		}
		
		arr = new int[b];
		res = new int[M];
		int idx =0;
		for(int i=0;i<10001;i++) {
			if(cnt[i] != 0) {
				arr[idx++] = i;
			}
		}
		dfs(0);
		System.out.println(sb);
	}
	static void dfs(int idx) {
		if(idx==M) {
			for(int i=0;i<M;i++) {
				sb.append(res[i] + " ");
			}
			sb.append('\n');
			return;
		}
		for(int i=0;i<b;i++) {
			if(cnt[arr[i]]==0) {
				continue;
			}
			else {
				cnt[arr[i]]--;
				res[idx] = arr[i];
				dfs(idx+1);
				cnt[arr[i]]++;
			}
		}
	}
}