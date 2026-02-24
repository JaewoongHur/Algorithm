import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = 1;
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) break;
			
			String[] arr = new String[n];
			int idx = 0;
			
			while(idx<n) {
				st = new StringTokenizer(br.readLine());
				while(st.hasMoreTokens()&&idx<n) {
					arr[idx++] = st.nextToken();
				}
			}
			
			String[] sorted = arr.clone();
			Arrays.sort(sorted);
			
			Map<String,Integer> pos = new HashMap<>();
			for(int i=0;i<n;i++) {
				pos.put(sorted[i], i);
			}
			
			int cost = 0;
			
			for(int i=0;i<n;i++) {
				cost += Math.abs(i - pos.get(arr[i]));
			}
			
			System.out.println("Site " + T + ": " + cost);
			T++;
		}
	}
}
