import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0;i<n;i++) {
			int a = Integer.parseInt(br.readLine());
			set.add(a);
		}
		
		System.out.println(Math.min(set.size(), k));
		
	}
}