import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int max = 0;
		int num = 0;
		for(int i=1;i<=5;i++) {
			int s = 0;
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<4;j++) {
				s+= Integer.parseInt(st.nextToken());
			}
			if(max<s) {
				num = i;
				max = s;
			}
		}
		System.out.println(num +" " + max);
	}
}