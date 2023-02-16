import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
		int T = Integer.parseInt(br.readLine());
		for(int i=1;i<=T;i++) {
			int N = Integer.parseInt(br.readLine());
			int[][] A = new int[N][N];
			for(int j=0;j<N;j++) {
				String s = br.readLine();
				for(int k=0;k<N;k++) {
					if(s.charAt(k)=='.') {
						A[j][k] =0;
					}
					else {
						A[j][k] = 1;
					}	
				}
			}
			int cnt = 0;
			omok: for(int j=0;j<N;j++) {
				for(int k=0;k<N;k++) {
					if(A[j][k] == 1) {
						if(k+4<N && A[j][k+1] ==1 && A[j][k+2] ==1 && A[j][k+3] ==1&& A[j][k+4] ==1) {
							cnt++;
							break omok;
						}
						else if(j+4<N && A[j+1][k] ==1 && A[j+2][k] ==1 && A[j+3][k] ==1 && A[j+4][k] ==1) {
							cnt++;
							break omok;
						}
						else if(j-4>=0 && k+4<N && A[j-1][k+1] ==1&& A[j-2][k+2] ==1 && A[j-3][k+3] ==1 && A[j-4][k+4] ==1) {
							cnt++;
							break omok;
						}
						else if(j+4<N && k+4<N && A[j+1][k+1] ==1&& A[j+2][k+2] ==1 && A[j+3][k+3] ==1 && A[j+4][k+4] ==1) {
							cnt++;
							break omok;
						}	
					}
				}
			}
			if(cnt==0) {
			bw.write("#"+i+" NO");
			}
			else {
				bw.write("#"+i+" YES");
			}
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}