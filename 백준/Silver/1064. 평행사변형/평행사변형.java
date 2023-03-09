import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		double xa = Double.parseDouble(st.nextToken());
		double ya = Double.parseDouble(st.nextToken());
		double xb = Double.parseDouble(st.nextToken());
		double yb = Double.parseDouble(st.nextToken());
		double xc = Double.parseDouble(st.nextToken());
		double yc = Double.parseDouble(st.nextToken());

		double x1 = xa + xb - xc;
		double y1 = ya + yb - yc;
		double x2 = xa + xc - xb;
		double y2 = ya + yc - yb;

		double cx1 = Math.sqrt(Math.pow(xa - xc, 2) + Math.pow(ya - yc, 2));
		double cn1 = Math.sqrt(Math.pow(xa - x1, 2) + Math.pow(ya - y1, 2));
		double cx2 = Math.sqrt(Math.pow(xa - xb, 2) + Math.pow(ya - yb, 2));
		double cn2 = Math.sqrt(Math.pow(xa - x2, 2) + Math.pow(ya - y2, 2));

		double c1 = 2 * (cx1 + cn1);
		double c2 = 2 * (cx2 + cn2);
		double c3 = 2 * (cx1 + cx2);

		double max = Math.max(c1, Math.max(c2, c3));
		double min = Math.min(c1, Math.min(c2, c3));
		double ans = max - min;

		if (xa == xb && xb==xc) {
			ans = -1;
		} else if (xb - xa != 0 && xc - xb != 0 && (yb - ya) / (xb - xa) == (yc - yb) / (xc - xb)) {
			ans = -1;
		}
		System.out.println(ans);
	}
}