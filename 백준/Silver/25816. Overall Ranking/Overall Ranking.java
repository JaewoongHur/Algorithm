import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] s = new String[n];
		
		HashMap<String, Integer> score = new HashMap<>(); 
		HashMap<String, Integer> num = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			s[i] = br.readLine();
			score.put(s[i], score.getOrDefault(s[i], 0)+i+1);
			num.put(s[i], num.getOrDefault(s[i], 0)+1);
		}
		
		List<String> list = new ArrayList<>(score.keySet());
		
		list.sort((a,b)->{
			long avgA = (long) (score.get(a)*num.get(b));
			long avgB = (long) (score.get(b)*num.get(a));
			return Long.compare(avgA, avgB);
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(String k : list) {
			sb.append(k).append('\n');
		}
		System.out.println(sb);
	}
}