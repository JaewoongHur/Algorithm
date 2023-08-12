import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
	static int N,M;
	static int[] arr, tmp, num;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N= Integer.parseInt(st.nextToken());
		M= Integer.parseInt(st.nextToken());
		
		num = new int[N];
		tmp = new int[M];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0;i<N;i++) {
			set.add(num[i]);
		}
		
		int n = set.size();
		arr = new int[n];
		
		Iterator<Integer> it = set.iterator();
		int index = 0;
		while(it.hasNext()) {
			arr[index] = it.next();
			index++;
		}
		Arrays.sort(arr);
		
		dfs(0,0,n);
		System.out.println(sb);
	}
	static void dfs(int k, int idx,int n) {
		if(idx==M) {
			for(int i=0;i<M;i++) {
				sb.append(tmp[i]+" ");
			}
			sb.append('\n');
			return;
		}
		for(int i=k;i<n;i++) {
			tmp[idx] = arr[i];
			dfs(i,idx+1,n);
		}
	}
	
}