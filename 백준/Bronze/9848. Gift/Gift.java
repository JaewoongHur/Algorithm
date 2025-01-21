import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		
		int ans = 0;
		
		int prev = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n-1;i++) {
			int a = Integer.parseInt(br.readLine());
			
			if(prev - a >= k) {
				ans++;
			}
			
			prev = a;
		}
		System.out.println(ans);
	}
}