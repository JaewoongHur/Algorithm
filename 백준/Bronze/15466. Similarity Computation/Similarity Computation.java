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
			int m = Integer.parseInt(st.nextToken());
			
			HashSet<Integer> set = new HashSet<>();
			
			st = new StringTokenizer(br.readLine());
			
			for(int i=0;i<n;i++) {
				int k = Integer.parseInt(st.nextToken());
				set.add(k);
			}
			
			st = new StringTokenizer(br.readLine());
			
			for(int i=0;i<m;i++) {
				int k = Integer.parseInt(st.nextToken());
				set.add(k);
			}
			
			int union = set.size();
			int intersection = n + m - union;
			
			if(2*intersection > union) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}
}
