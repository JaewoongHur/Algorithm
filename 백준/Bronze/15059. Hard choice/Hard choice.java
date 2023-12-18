import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int z = Integer.parseInt(st.nextToken());
		
		
		int ans1 = x-a; int ans2 = y-b; int ans3 = z-c;
		
		if(ans1<0) {
			ans1 = 0;
		}
		
		if(ans2<0) {
			ans2 = 0;
		}
		
		if(ans3 <0 ) {
			ans3 = 0;
		}
		
		System.out.println(ans1 + ans2 + ans3);
		
	}
}