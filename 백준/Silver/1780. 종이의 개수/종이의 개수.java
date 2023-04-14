import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N, cnt0, cnt1, cntminus1;
	static int[][] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		arr= new int[N][N];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());				
			}			
		}
		cnt0=0;
		cnt1=0;
		cntminus1=0;
		
		nineTree(0,0,N);
		System.out.println(cntminus1);
		System.out.println(cnt0);
		System.out.print(cnt1);
		
	}
	
	private static void nineTree(int r, int c, int size) {
		
		if(checkPaper(r,c,size)) {
			 if(arr[r][c] == 0) {
				 cnt0 ++;
			 }
			 else if(arr[r][c] == 1) {
				 cnt1 ++;
			 }
			 else {
				 cntminus1 ++;
			 }
			 return;
		}
		
		int newSize = size/3;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				nineTree(r+i*newSize,c+j*newSize,newSize);
			}
		}
		
		
	}

	private static boolean checkPaper(int r, int c, int size) {
		int val = arr[r][c];
		
		for(int i=r;i<r+size;i++) {
			for(int j=c;j<c+size;j++) {
				if(arr[i][j] != val) {				
					return false;
				}
			}
		}
		return true;
	}
	
	
}