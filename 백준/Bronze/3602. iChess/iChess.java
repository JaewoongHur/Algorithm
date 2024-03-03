import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int b = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		int max = 0;
		
		for(int i=1;i*i<=b+w;i++) {
			int x = i*i/2;
			int y = i*i-x;
			
			if((b>=x && w>=y)|| (b>=y && w>=x)) {
				max = i;
			}
		}
		
		if(max == 0) {
			System.out.println("Impossible");
		}else {
			System.out.println(max);
		}
	}
}