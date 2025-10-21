import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int t = Integer.parseInt(st.nextToken());
			
			HashMap<Long,Integer> map = new HashMap<>();
			
			for(int j=0;j<t;j++) {
				long a = Long.parseLong(st.nextToken());
				map.put(a, map.getOrDefault(a, 0)+1);
			}
			
			long key = 0;
			boolean pass = false;
			
			for(Map.Entry<Long, Integer> entry: map.entrySet()) {
				if(entry.getValue()>t/2) {
					key = entry.getKey();
					pass = true;
					break;
				}
			}
			
			if(pass) {
				System.out.println(key);
			}else {
				System.out.println("SYJKGW");
			}
		}
	}
}