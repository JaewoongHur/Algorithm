import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int x = Integer.parseInt(br.readLine());
		
		int start = 0;
		int end = 1;
		int cnt = 0;
		
		while(start<n-1) {
			while(end<n && arr[start]+arr[end]<=x) {
				if(arr[start]+arr[end] == x) {
					cnt++;
				}
				end++;
				
			}
			start++;
			end = start+1;
		}
		System.out.println(cnt);
	}
}