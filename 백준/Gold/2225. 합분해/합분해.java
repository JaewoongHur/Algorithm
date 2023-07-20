import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		long[][] arr = new long[201][201];
		
		for(int i=0;i<201;i++) {
			arr[0][i] = 1;
			arr[i][1] = 1;
			arr[i][2] = i+1;
		}

		for(int i=3;i<201;i++) {
			for(int j=1;j<201;j++) {
				for(int k=0;k<=j;k++) {
					arr[j][i] += arr[k][i-1] % 1000000000; 
					arr[j][i] %= 1000000000;
				}
			}			
		}
		System.out.println(arr[(int)N][K]);		
	}
}