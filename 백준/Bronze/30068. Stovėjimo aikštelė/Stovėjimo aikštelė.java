import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			int t = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			
			if(!map.containsKey(a)) {
				map.put(a, t);
			}else {
				System.out.println(a + " " + (t-map.get(a)));
			}
		}
	}
}
