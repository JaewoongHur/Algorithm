import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());		

		for (int tc = 0;tc<n;tc++) {
			
			String a = br.readLine();
			st = new StringTokenizer(br.readLine());
			
			double x1 = Double.parseDouble(st.nextToken());
			double y1 = Double.parseDouble(st.nextToken());
			double z1 = Double.parseDouble(st.nextToken());
			
			String b = br.readLine();
			st = new StringTokenizer(br.readLine());
			
			double x2 = Double.parseDouble(st.nextToken());
			double y2 = Double.parseDouble(st.nextToken());
			double z2 = Double.parseDouble(st.nextToken());
			
			double d = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2) + (z1-z2)*(z1-z2));
			
			sb.append(a).append(" to ").append(b).append(": ").append(String.format("%.2f", d)).append('\n');
		}

		System.out.println(sb);
	}
}