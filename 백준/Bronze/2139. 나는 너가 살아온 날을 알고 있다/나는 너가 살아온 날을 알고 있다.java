import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String s;

		int[] arr = new int[13];
		for(int i=1;i<=7;i++) {
			if(i%2==0) {
				arr[i] = 30;
			}
			else {
				arr[i] = 31;
			}
		}
		for(int i=8;i<=12;i++) {
			if(i%2==0) {
				arr[i] = 31;
			}
			else {
				arr[i] = 30;
			}
		}

		while (true) {
			s = br.readLine();
			if (s.equals("0 0 0")) {
				break;
			}
			st = new StringTokenizer(s);

			int d = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

	
			arr[2] = Leap(y) ? 29 : 28;
			
			int ans = 0;
			
			for(int i=1;i<m;i++) {
				ans += arr[i];
			}
			ans += d;
			
			System.out.println(ans);
		}

	}

	static boolean Leap(int a) {
		return (a % 4 == 0 && a % 100 != 0) || a % 400 == 0;
	}
}