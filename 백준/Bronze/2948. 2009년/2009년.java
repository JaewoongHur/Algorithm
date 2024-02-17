import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int d = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		String[] day = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		int s = 2;
		
		
		int[] month = new int[] {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		
		for(int i=0;i<m;i++) {
			s += month[i];
		}
		
		s += d;
		
		System.out.println(day[s%7]);
	}
}