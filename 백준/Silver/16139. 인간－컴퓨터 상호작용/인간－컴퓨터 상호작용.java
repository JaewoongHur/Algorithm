import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		int m = s.length();
		int[] arr = new int[m];
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			st= new StringTokenizer(br.readLine());
			char alpha = st.nextToken().charAt(0);
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			
			int sum = 0;
			for(int j=0;j<m;j++) {
				if(s.charAt(j)==alpha) {
					sum++;					
				}			
				arr[j] = sum;
			}
			if(l==0) {
				sb.append(arr[r]).append("\n");
			}
			else {
			sb.append(arr[r]-arr[l-1]).append("\n");
			}
		}
		System.out.println(sb);	
	}
}