import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int k = Integer.parseInt(br.readLine());

		String s = br.readLine();

		int[][] arr = new int[5][3];

		arr[n][m] = 1;

		for (int i = 0; i < k; i++) {
			if (s.charAt(i) == 'A') {
				int tmp = arr[3][1];
				arr[3][1] = arr[1][1];
				arr[1][1] = tmp;
				
				tmp = arr[3][2];
				arr[3][2] = arr[1][2];
				arr[1][2] = tmp;
				
				tmp = arr[4][1];
				arr[4][1] = arr[2][1];
				arr[2][1] = tmp;
				
				tmp = arr[4][2];
				arr[4][2] = arr[2][2];
				arr[2][2] = tmp;
				
			} else if (s.charAt(i) == 'B') {
				int tmp = arr[1][1];
				arr[1][1] = arr[2][2];
				arr[2][2] = tmp;
				
				tmp = arr[1][2];
				arr[1][2] = arr[2][1];
				arr[2][1] = tmp;
				
				tmp = arr[3][1];
				arr[3][1] = arr[4][2];
				arr[4][2] = tmp;
				
				tmp = arr[3][2];
				arr[3][2] = arr[4][1];
				arr[4][1] = tmp;
				
			} else if (s.charAt(i) == 'C') {
				int tmp = arr[1][1];
				arr[1][1] = arr[4][2];
				arr[4][2] = tmp;
				
				tmp = arr[1][2];
				arr[1][2] = arr[4][1];
				arr[4][1] = tmp;
				
				tmp = arr[2][1];
				arr[2][1] = arr[3][2];
				arr[3][2] = tmp;
				
				tmp = arr[2][2];
				arr[2][2] = arr[3][1];
				arr[3][1] = tmp;
				
			} else {
				int tmp = arr[1][1];
				arr[1][1] = arr[2][1];
				arr[2][1] = arr[3][1];
				arr[3][1] = arr[4][1];
				arr[4][1] = arr[4][2];
				arr[4][2] = arr[3][2];
				arr[3][2] = arr[2][2];
				arr[2][2] = arr[1][2];
				arr[1][2] = tmp;
			}

		}
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=2;j++) {
				if(arr[i][j] == 1) {
					System.out.println(i + " " + j);
				}
			}
		}
	}
}