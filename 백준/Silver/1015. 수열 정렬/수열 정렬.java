import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		int[] sort = new int[n];
		
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());
			arr[i] = sort[i] = a;
		}
		
		Arrays.sort(sort);
		
		boolean[] check = new boolean[n];
		
		int[] ans = new int[n];
		
		int idx = 0;
		
		for(int i=0;i<n;i++) {
			int a = sort[i];
			
			for(int j=0;j<n;j++) {
				if(!check[j] && arr[j] == a) {				
					check[j] = true;
					ans[j] = idx;
					
					idx++;
					
					break;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			sb.append(ans[i] + " ");
		}
		
		System.out.println(sb);
	}
}