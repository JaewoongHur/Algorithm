import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[] arr = new int[6];
		for (int tc = 1; tc <= 3; tc++) {
			st = new StringTokenizer(br.readLine());

			for (int i = 0; i < 6; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int t = (arr[3]-arr[0])*3600+(arr[4]-arr[1])*60+(arr[5]-arr[2]);
			
			int h = t/3600;
			
			int m = (t%3600)/60;
			
			int s = t%60;
			
			System.out.println(h+" "+m+" "+s);
		}

	}
}