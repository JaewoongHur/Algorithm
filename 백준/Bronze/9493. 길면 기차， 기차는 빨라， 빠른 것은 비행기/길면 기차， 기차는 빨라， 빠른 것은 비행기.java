import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;
		
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			s = br.readLine();

			if (s.equals("0 0 0")) {
				break;
			}

			st = new StringTokenizer(s);

			double m = Double.parseDouble(st.nextToken());
			double a = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());

			int d = (int) Math.round(m * (1 / a - 1 / b) * 3600);

			int hour = d / 3600;

			int minute = (d - hour * 3600) / 60;

			int second = d - hour * 3600 - minute * 60;
			
			sb.append(hour + ":");
			
			if(minute<10) {
				sb.append("0"+minute +":");
			}else {
				sb.append(minute+":");
			}
			
			if(second<10) {
				sb.append("0"+second);
			}else {
				sb.append(second);
			}
			
			sb.append("\n");
		}
		System.out.println(sb);
	}
}