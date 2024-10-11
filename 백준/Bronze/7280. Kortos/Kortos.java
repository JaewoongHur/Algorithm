import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		boolean[][] arr = new boolean[4][14];
		
		for (int tc = 1; tc <= 51; tc++) {
			st = new StringTokenizer(br.readLine());

			String a = st.nextToken();

			int b = Integer.parseInt(st.nextToken());
			
			if(a.equals("B")) {
				arr[0][b] = true;
			}else if(a.equals("K")) {
				arr[1][b] = true;
			}else if(a.equals("S")){
				arr[2][b] = true;
			}else {
				arr[3][b] = true;
			}
		}
		
		for(int i=0;i<4;i++) {
			for(int j=1;j<=13;j++) {
				if(!arr[i][j]) {
					if(i == 0) {
						System.out.println("B " + j);
					}else if(i==1) {
						System.out.println("K " + j);
					}else if(i==2) {
						System.out.println("S " + j);
					}else {
						System.out.println("V " + j);
					}
				}
			}
		}
	}
}