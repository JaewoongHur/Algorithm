import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());		
		
		int[][] arr = new int[N][3];
		
		int[][] dpmax = new int[N+1][3];
		int[][] dpmin = new int[N+1][3];
		
		for(int r=0;r<N;r++) {
			st = new StringTokenizer(br.readLine());
			for(int c=0;c<3;c++) {
				arr[r][c] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		for(int i=1;i<=N;i++) {
			dpmax[i][0] = Math.max(dpmax[i-1][0],dpmax[i-1][1])+arr[i-1][0];
			dpmax[i][1] = Math.max(dpmax[i-1][0],Math.max(dpmax[i-1][1],dpmax[i-1][2]))+arr[i-1][1];
			dpmax[i][2] = Math.max(dpmax[i-1][1],dpmax[i-1][2])+arr[i-1][2];
	
			dpmin[i][0] = Math.min(dpmin[i-1][0],dpmin[i-1][1])+arr[i-1][0];
			dpmin[i][1] = Math.min(dpmin[i-1][0],Math.min(dpmin[i-1][1],dpmin[i-1][2]))+arr[i-1][1];
			dpmin[i][2] = Math.min(dpmin[i-1][1],dpmin[i-1][2])+arr[i-1][2];
		}
		
		int max = Math.max(dpmax[N][0], Math.max(dpmax[N][1], dpmax[N][2]));
		int min = Math.min(dpmin[N][0], Math.min(dpmin[N][1], dpmin[N][2]));
		
		System.out.println(max +" "+min);
	}
}