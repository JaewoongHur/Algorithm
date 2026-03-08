import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("-1")) break;
			
			st = new StringTokenizer(s);
			
			int n = st.countTokens()-1;
			
			int[] arr = new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			st.nextToken();
			
			Arrays.sort(arr);
			
			int cnt = 0;
			
			for(int i=0;i<n-1;i++) {
				for(int j=i+1;j<n;j++) {
					if(arr[j] == 2*arr[i]) {
						cnt++;
						continue;
					}
				}
			}
			System.out.println(cnt);
		}
	}
}
