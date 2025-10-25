import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		
		boolean[] pipe = new boolean[1001];
		
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) {
			int a = Integer.parseInt(st.nextToken());
			pipe[a] = true;
		}
		
		int cnt = 0;
		
		for(int i=1;i<=1000;i++) {
			if(pipe[i]) {
				cnt++;
				i+=l-1;
			}
		}
		
		System.out.println(cnt);
	}
}