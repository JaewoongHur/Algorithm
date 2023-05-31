import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static int[] tmp;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String s;
		
		while((s=br.readLine())!=null) {
			if(s.equals("0")) {
				break;
			}
			st = new StringTokenizer(s);
			
			int k = Integer.parseInt(st.nextToken());
			
			arr = new int[k];
			tmp = new int[6];
			for(int i=0;i<k;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			combi(k,0,0);
			sb.append('\n');
		}
		
		System.out.println(sb);		
	}
	
	private static void combi(int n, int start, int idx) {
		if(idx==6) {
			for(int i=0;i<6;i++) {
				sb.append(tmp[i]+" ");
			}
			sb.append('\n');
			return;
		}
		for(int i=start;i<n;i++) {
			tmp[idx] = arr[i];
			combi(n,i+1,idx+1);
		}
		
	}
	
	
}