import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		st= new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int t = Integer.parseInt(br.readLine());
		
		int x2 = (x+t) %(2*w);
		if(x2>w) {
			x2 = 2*w - x2;
		}
		int y2 = (y+t) %(2*h);
		if(y2>h) {
			y2 = 2*h - y2;
		}
		System.out.println(x2+" "+y2);
	}
}