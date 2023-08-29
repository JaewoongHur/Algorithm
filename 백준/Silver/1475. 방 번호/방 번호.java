import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int l = s.length();
		int n = Integer.parseInt(s);
		
		int[] cnt = new int[10];
		
		for(int i=0;i<l;i++) {
			int a = s.charAt(i)-'0';
			cnt[a]++;
		}
		
		int max = 0;
		for(int i=0;i<10;i++) {
			if(i==6 || i==9) {
				continue;
			}
			max = Math.max(max, cnt[i]);
		}
		int k = cnt[6] + cnt[9];
		if(k%2 == 0) {
			k = k/2;
		}
		else {
			k = k/2+1;
		}
		max = Math.max(max, k);
		System.out.println(max);
		
	}

}