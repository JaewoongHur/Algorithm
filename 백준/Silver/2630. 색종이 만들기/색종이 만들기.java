import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N, white, blue;
	static int[][] arr;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		white = 0;
		blue = 0;
		quadTree(0,0,N);
		System.out.println(white);
		System.out.println(blue);
	}
	
	private static void quadTree(int r, int c, int size) {
		
		if(checkPaper(r,c,size)) {
			if(arr[r][c] == 0) {
				white ++;
			}
			else {
				blue ++;
			}
			return;
		}
		
		int newSize = size/2;
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				quadTree(r+i*newSize,c+j*newSize,newSize);
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