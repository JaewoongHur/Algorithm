import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int[] arr = new int[6];

		arr[0] = 100 * a + 10 * b + c;
		arr[1] = 100 * a + 10 * c + b;
		arr[2] = 100 * b + 10 * a + c;
		arr[3] = 100 * b + 10 * c + a;
		arr[4] = 100 * c + 10 * a + b;
		arr[5] = 100 * c + 10 * b + a;
		
		Arrays.sort(arr);

		int d = Integer.parseInt(br.readLine());
		
		for(int i=0;i<6;i++) {
			if(d==arr[i]) {
				System.out.println(i+1);
				break;
			}
		}
	}
}