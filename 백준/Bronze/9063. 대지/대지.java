import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int xmax = -10000;
		int xmin = 10000;
		int ymax = -10000;
		int ymin = 10000;
		for (int i = 0; i < n; i++) {
			String[] s = br.readLine().split(" ");
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);
			if(x>xmax) {
				xmax = x;
			}
			if(x<xmin) {
				xmin = x;
			}
			if(y>ymax) {
				ymax= y;
			}
			if(y<ymin) {
				ymin = y;
			}
		}
		System.out.println((ymax-ymin)*(xmax-xmin));
	}
}