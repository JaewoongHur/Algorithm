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

			double m = Double.parseDouble(st.nextToken());
			double a = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());

			int d = (int) Math.round(m * (1 / a - 1 / b) * 3600);

			int hour = d / 3600;

			int minute = (d - hour * 3600) / 60;

			int second = d - hour * 3600 - minute * 60;
			
			System.out.print(hour + ":");
			
			if(minute<10) {
				System.out.print("0"+minute +":");
			}else {
				System.out.print(minute+":");
			}
			
			if(second<10) {
				System.out.print("0"+second);
			}else {
				System.out.print(second);
			}
			
			System.out.println();
		}

	}
}