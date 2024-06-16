import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		boolean[] check = new boolean[1001];
		
		int[] arr = new int[m];
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++) {
				arr[j] += Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0;i<m;i++) {
			check[arr[i]] = true;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1000;i>0;i--) {
			if(!check[i]) continue;			
			for(int j=0;j<m;j++) {
				if(arr[j] == i) {
					sb.append(j+1).append(' ');
				}
			}
		}
		System.out.println(sb);
	}
}