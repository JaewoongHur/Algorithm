import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		double rh = Double.parseDouble(st.nextToken());
		double rv = Integer.parseInt(st.nextToken());
		double sh = Integer.parseInt(st.nextToken());
		double sv = Integer.parseInt(st.nextToken());

		int n = Integer.parseInt(br.readLine());

		int cost = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			double a = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());
			double c = Double.parseDouble(st.nextToken());
			double d = Double.parseDouble(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			
			int ha = (int) Math.ceil(rh/a);
			int vb = (int) Math.ceil(rv/b);
			int hc = (int) Math.ceil(sh/c);
			int vd = (int) Math.ceil(sv/d);
			
			int x = Math.max(ha, hc);
			int y = Math.max(vb, vd);
			
			cost = Math.min(cost, p*x*y);
			
			int hb = (int) Math.ceil(rh/b);
			int va = (int) Math.ceil(rv/a);
			int hd = (int) Math.ceil(sh/d);
			int vc = (int) Math.ceil(sv/c);
			
			x = Math.max(hb, hd);
			y = Math.max(va, vc);
			
			cost = Math.min(cost, p*x*y);
		}
		System.out.println(cost);
	}
}