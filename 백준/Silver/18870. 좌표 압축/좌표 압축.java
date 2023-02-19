import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] x = new int[N];
		int[] xSort = new int[N];
		for(int i=0;i<N;i++) {
			x[i] = xSort[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(xSort);
		
		HashMap<Integer,Integer> map = new HashMap<>();		
		int rank=0;
		for(int i=0;i<N;i++) {
			if(!map.containsKey(xSort[i])) {
				map.put(xSort[i], rank);
				rank++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int k : x) {
			int getRank = map.get(k);
			sb.append(getRank).append(' ');
		}
		System.out.println(sb);
	}
}