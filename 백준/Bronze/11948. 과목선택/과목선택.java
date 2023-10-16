import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ans = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<4;i++) {
			int a = Integer.parseInt(br.readLine());
			min = Math.min(a,min);
			sum+= a;
		}
		ans = sum - min;
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		min = Math.min(a, b);
		
		ans += a+b-min;
		System.out.println(ans);
	}
}