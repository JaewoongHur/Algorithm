import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		ArrayDeque<int[]> dq = new ArrayDeque<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int n = Integer.parseInt(br.readLine());
		st= new StringTokenizer(br.readLine());
		for(int i=1;i<=n;i++) {
			int a = Integer.parseInt(st.nextToken());
			dq.addLast(new int[] {a,i});
		}
		
		int[] p = dq.pollFirst();
		sb.append(p[1]).append(' ');
		int k = p[0];
		int[] a= new int[2];
		while(!dq.isEmpty()) {
			while(k>0) {
				a = dq.pollFirst();
				dq.addLast(a);
				k--;
				if(k==0) {
					sb.append(dq.pollLast()[1]).append(' ');
				}
			}
			while(k<0) {
				a = dq.pollLast();
				dq.addFirst(a);
				k++;
				if(k==0) {
					sb.append(dq.pollFirst()[1]).append(' ');
				}
			}
			k = a[0];			
		}
		System.out.println(sb);
	}
}