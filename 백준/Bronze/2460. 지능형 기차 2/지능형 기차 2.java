import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		int max=0;
		int sum = 0;
		for(int i=0;i<10;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sum+=b;
			
			if(sum>10000) {
				sum = 10000;
			}
			sum -=a;
			max = Math.max(sum,max);
		}
		System.out.println(max);		
	}
}