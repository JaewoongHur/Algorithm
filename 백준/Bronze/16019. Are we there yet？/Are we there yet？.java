import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int[][] arr = new int[5][5];
		
		int[] d = new int[4];
		
		for(int i=0;i<4;i++) {
			d[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				arr[i][j] = arr[i][j-1] + d[j-1];
			}
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				arr[i][j] = arr[j][i];
			}
		}

		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
