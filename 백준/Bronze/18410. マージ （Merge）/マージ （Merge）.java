import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Queue<Integer> A = new LinkedList<>();
		Queue<Integer> B = new LinkedList<>();
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) {
			int a = Integer.parseInt(st.nextToken());
			A.add(a);
		}
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<m;i++) {
			int b = Integer.parseInt(st.nextToken());
			B.add(b);
		}
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			if(!A.isEmpty() && !B.isEmpty()) {
				if(A.peek()<=B.peek()) {
					sb.append(A.poll()).append('\n');
				}else {
					sb.append(B.poll()).append('\n');
				}
			}else if(!A.isEmpty()&&B.isEmpty()) {
				sb.append(A.poll()).append('\n');
			}else if(A.isEmpty()&&!B.isEmpty()) {
				sb.append(B.poll()).append('\n');
			}else {
				break;
			}
		}
		
		System.out.println(sb);
	}
}
