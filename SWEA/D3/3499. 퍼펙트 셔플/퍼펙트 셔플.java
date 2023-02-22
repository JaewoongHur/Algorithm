import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		int T= Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {
			int N = Integer.parseInt(br.readLine());
			int a = (N+1)/2;
			int b = N-a;
			st = new StringTokenizer(br.readLine());
			String[] A = new String[a];
			String[] B = new String[b];
			for(int i=0;i<a;i++) {
				A[i] = st.nextToken();
			}
			for(int j=0;j<b;j++) {
				B[j] = st.nextToken();
			}
			StringBuilder sb = new StringBuilder();
			
			for(int i=0;i<b;i++) {
				sb.append(A[i]+" ");
				sb.append(B[i]+" ");
			}
			if(a>b) {
				sb.append(A[a-1]);
			}
			System.out.print("#"+t+" ");
			System.out.print(sb);
			System.out.println();
		}
	}
}