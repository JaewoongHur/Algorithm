import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] ds = new int[n];
		for(int i=0;i<n;i++) {
			ds[i] = Integer.parseInt(st.nextToken());
		}
		int k = 0;
		for(int i=0;i<n;i++) {
			if(ds[i]==0) {
				k++;
			}			
		}
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		
		int m = Integer.parseInt(br.readLine());
		
		int[] tmp = new int[m];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<m;i++) {
			tmp[i] = Integer.parseInt(st.nextToken());
		}
		
		if(k==0) {
			for(int i=0;i<m;i++) {
				sb.append(tmp[i]).append(' ');
			}
		}
		else { 
			int l = 0;
			for(int i=n-1;i>=0;i--) {
				if(ds[i]==0 && l<m) {
					sb.append(arr[i]).append(' ');
					l++;
				}
			}
			for(int i=0;i<m-l;i++) {
				sb.append(tmp[i]).append(' ');
			}
	
		}
		System.out.println(sb);		
	}
}