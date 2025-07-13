import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String s = br.readLine();

		char[] arr = s.toCharArray();

		for (int i = 0; i < n; i++) {
			if (Character.isUpperCase(arr[i])) {
				arr[i] = Character.toLowerCase(arr[i]);
			}
		}

		int ans = 0;

		int pre = 0;
		int suf = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
				pre++;
			}

			if (arr[n - 1 - i] == 'a' || arr[n - 1 - i] == 'e' || arr[n - 1 - i] == 'i' || arr[n - 1 - i] == 'o'
					|| arr[n - 1 - i] == 'u') {
				suf++;
			}
			
			if(pre!=0 && pre == suf) {
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}
