import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Map<Integer,String> map = new HashMap<>();
		Map<String,Integer> map2 = new HashMap<>();
		
		for(int i=1;i<=N;i++) {
			String s = br.readLine();
			map.put(i,s);
			map2.put(s, i);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<M;i++) {
			String s = br.readLine();
			if(map2.get(s)!=null) {
				sb.append(map2.get(s)+"\n");
				}
			else {
				sb.append(map.get(Integer.parseInt(s))+"\n");
			}
		}
		System.out.println(sb);
	}
}