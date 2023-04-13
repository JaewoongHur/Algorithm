import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int N;
	static int[][] arr;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		
		for(int i=0;i<N;i++) {
			String s = br.readLine();
			for(int j=0;j<N;j++) {
				arr[i][j] = s.charAt(j)-'0';				
			}			
		}
		QuadTree(0,0,N);
		System.out.println(sb);
		
	}
	private static void QuadTree(int x,int y, int size) {
		if(compress(x,y,size)) {
			sb.append(arr[x][y]);
			return;
		}
		
		int newSize = size/2;
		sb.append('(');
		
		QuadTree(x,y,newSize);
		QuadTree(x,y+newSize,newSize);
		QuadTree(x + newSize,y,newSize);
		QuadTree(x+newSize,y+newSize,newSize);
		
		sb.append(')');
	}
	
	private static boolean compress(int x, int y, int size) {
		int val = arr[x][y];
		
		for(int i=x;i<x+size;i++) {
			for(int j=y;j<y+size;j++) {
				if(val != arr[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	
}