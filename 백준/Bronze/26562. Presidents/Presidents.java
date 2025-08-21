import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("Franklin",100);
		map.put("Grant", 50);
		map.put("Jackson",20);
		map.put("Hamilton", 10);
		map.put("Lincoln", 5);
		map.put("Washington", 1);
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int m = st.countTokens();
			
			int cost = 0;
			
			for(int j=0;j<m;j++) {
				cost += map.get(st.nextToken());
			}
			System.out.println("$" + cost);
		}		
	}
}