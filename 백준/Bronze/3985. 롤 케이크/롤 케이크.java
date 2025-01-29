import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int L = Integer.parseInt(br.readLine());

		int n = Integer.parseInt(br.readLine());
		
		boolean[] arr = new boolean[L+1];
		
		int expectedMax = 0;
		int expectedMaxNum = 0;
		int max = 0;
		int maxNum = 0;
		
		for(int i=1;i<=n;i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(expectedMax < b-a+1) {
				expectedMax = b-a+1;
				expectedMaxNum = i;
			}
			
			int c = 0;
			
			for(int j=a;j<=b;j++) {
				if(!arr[j]) {
					c++;
					arr[j] = true;
				}				
			}
			
			if(max < c) {
				max = c;
				maxNum = i;
			}
			
		}
		
		System.out.println(expectedMaxNum);
		System.out.println(maxNum);
	}
}