import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=1;tc<=T;tc++) {
			br.readLine();
			st= new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int[] S = new int[N];
			int[] B = new int[M];
			
			st= new StringTokenizer(br.readLine());
			for(int i=0;i<N;i++) {
				S[i] = Integer.parseInt(st.nextToken());
			}
			st= new StringTokenizer(br.readLine());
			for(int i=0;i<M;i++) {
				B[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(S);
			Arrays.sort(B);
			
			int idx1 = 0;
			int idx2 = 0;
			
			while(idx1<N && idx2<M) {
				if(S[idx1]<B[idx2]) {
					idx1++;
				}
				else if(S[idx1]==B[idx2]) {
					idx2++;
				}
				else {
					idx2++;
				}
			}
			if(idx1==N&&idx2!=M) {
				System.out.println("B");
			}
			else if(idx1!=N&&idx2==M) {
				System.out.println("S");
			}
			else {
				System.out.println("C");
			}
			
		}
		
	}
}