import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		int prev = Integer.parseInt(st.nextToken());
		
		int ans = 0;
		
		for(int i=0;i<n-1;i++) {
			int a = Integer.parseInt(st.nextToken());
			if(prev < a) ans++;
			prev = a;
		}
		System.out.println(ans);
	}
}