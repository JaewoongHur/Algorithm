import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		int[] cnt = new int[10001];
		
		for(int i=0;i<n;i++) {
			int a = Integer.parseInt(br.readLine());
			cnt[a]++;			
		}
		
		int max = 0;
		
		for(int i=0;i<10001;i++) {
			if(cnt[i] > max ) {
				max = cnt[i];
			}
		}
		
		for(int i=0;i<10001;i++) {
			if(cnt[i] == max) {
				System.out.println(i);
				break;
			}
		}
	}
}