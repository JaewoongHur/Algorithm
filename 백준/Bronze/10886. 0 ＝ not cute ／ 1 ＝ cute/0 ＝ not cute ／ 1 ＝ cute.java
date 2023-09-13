import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i=0;i<n;i++) {
			int a = Integer.parseInt(br.readLine());
			if(a==0) {
				cnt++;
			}
		}
		
		if(cnt>n-cnt) {
			System.out.println("Junhee is not cute!");
		}
		else if(cnt<n-cnt) {
			System.out.println("Junhee is cute!");
		}
		
	}
}