import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		
		for(int tc=0;tc<T;tc++) {

			int[][] arr = new int[2][5];
			
			for(int i=0;i<2;i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0;j<5;j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			boolean pass = false;
			
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					if(i == j) continue;
					
					if(arr[0][i] == arr[1][j]) {
						pass = true;
						break;
					}
				}
			}
			
			if(pass) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}

	}
}
