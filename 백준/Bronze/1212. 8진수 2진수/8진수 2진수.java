import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();

		for (int i = 0; i < s.length(); i++) {
			int a = s.charAt(i) - '0';

			switch (a) {
			case 0:
				if(i==0) {
					sb.append("0");
					break;
				}
				sb.append("000");
				break;
			case 1:
				if(i==0) {
					sb.append("1");
					break;
				}
				sb.append("001");
				break;
			case 2:
				if(i==0) {
					sb.append("10");
					break;
				}
				sb.append("010");
				break;
			case 3:
				if(i==0) {
					sb.append("11");
					break;
				}
				sb.append("011");
				break;
			case 4:
				sb.append("100");
				break;
			case 5:
				sb.append("101");
				break;
			case 6:
				sb.append("110");
				break;
			case 7:
				sb.append("111");
				break;
			}

		}
		System.out.println(sb);
	}
}