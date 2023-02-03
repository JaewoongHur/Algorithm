import java.io.*;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int[][] arr; 
		for(int i=1; i<=t; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			 arr = new int[N][N];
			 for(int j=0; j<N;j++) {
				 st = new StringTokenizer(br.readLine());
				 for(int k=0; k<N;k++) {
					  arr[j][k] = Integer.parseInt(st.nextToken());
				 }
			 }
			int cr = 0;
			for(int j=0;j<N;j++) {
				int sum = 0;
				for(int k=0;k<N;k++) {
					if(k+1<N && arr[j][k] == 0 && arr[j][k+1] == 1) {
						sum += arr[j][k];
						if(k+1 == N-1) {
							sum +=arr[j][k+1];
						}	
					}
					else if(k+1<N && arr[j][k] == 1 && arr[j][k+1] == 1 ) {
							sum += arr[j][k];
							if(k+1 == N-1) {
								sum +=arr[j][k+1];
								if(sum == K) {
									cr++;
								}
							}		
					}	
					else if(k+1<N && arr[j][k] == 1 && arr[j][k+1] == 0 ) {
						sum += arr[j][k];
						if(k+1 == N-1) {
							sum +=arr[j][k+1];
						}	
						if(sum == K) {
							cr++;
						}
						sum = 0;
			 	}
				}
			}
			
			int cc = 0;
			for(int k=0;k<N;k++) {
				int sum = 0 ;
				for(int j=0;j<N;j++) {
					if(j+1<N&& arr[j][k] == 0 && arr[j+1][k] == 1) {
						sum += arr[j][k];
						if(j+1 == N-1) {
							sum +=arr[j+1][k];
						}
					}
					else if(j+1<N&& arr[j][k] == 1 && arr[j+1][k] == 1 ) {
							sum += arr[j][k];
							if(j+1 == N-1) {
								sum +=arr[j+1][k];
								if(sum == K) {
									cc++;
								}
							}
							}	
					else if(j+1<N&& arr[j][k] == 1 && arr[j+1][k] == 0) {
						sum += arr[j][k];
						if(j+1 == N-1) {
							sum +=arr[j+1][k];
						}
						if(sum == K) {
							cc++;
						}
						sum = 0;
			 	}
				}
			}
			bw.write("#"+i+" "+(cr+cc));
			bw.newLine();
			bw.flush();
		}
		bw.close();		
	}
}