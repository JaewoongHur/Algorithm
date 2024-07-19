import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String s;

		while (true) {
			s = br.readLine();

			if (s.equals("0 0 0")) {
				break;
			}

			st = new StringTokenizer(s);

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());

			int area = (n - 7) * (m - 7);
			
			// 이 영역에서 1의 개수만 세면 됨.
			
			if(area % 2 == 0) {
				System.out.println(area/2);
			}else {
				System.out.println(area/2 + k);
				// 오른쪽 가장자리 제외하면 짝수 개 블럭이므로 절반이 흰색일 것이므로 area/2임.
			}
		}
	}
}