import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		boolean[] check = new boolean[1001];
		
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			check[arr[i]] = true;
		}
		
		st = new StringTokenizer(br.readLine());
		
		int m = st.countTokens();
		
		for(int i=0;i<m;i++) {
			int a = Integer.parseInt(st.nextToken());
			check[a] = false;
		}
		
		for(int i=1;i<1001;i++) {
			if(check[i]) {
				System.out.println(i);
				break;
			}
		}
	}
}
