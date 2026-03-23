import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=0;tc<T;tc++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			
			int[] a = new int[n];
			int[] b = new int[n];
			
			st = new StringTokenizer(br.readLine());			
			for(int i=0;i<n;i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<n;i++) {
				b[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			int sumA = 0;
			int sumB = 0;
			
			for(int i=0;i<l;i++) {
				sumA += a[i];
			}
			
			for(int i=n-1;i>n-1-l;i--) {
				sumB += b[i];
			}
			
			if(sumA > sumB) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
