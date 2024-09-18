import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		int[] check = new int[10];

		for (int i = 0; i < 4; i++) {
			check[s.charAt(i) - '0']++;
		}

		int n = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < n; tc++) {
			String t = br.readLine();

			int[] arr = new int[10];
			
			for(int i=0;i<10;i++) {
				arr[i] = check[i];
			}
			
			int a = 0;

			for (int i = 0; i < 4; i++) {
				if(arr[t.charAt(i)-'0']>0) {
					a++;
					arr[t.charAt(i)-'0']--;
				}
			}
			
			int b = 0;
			
			for(int i=0;i<4;i++) {
				if(s.charAt(i)==t.charAt(i)) {
					b++;
				}
			}
			System.out.println(a + " " + b);
		}
	}
}