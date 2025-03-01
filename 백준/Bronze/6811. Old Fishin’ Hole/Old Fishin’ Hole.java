import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int s = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		int way = 0;

		for (int i = 0; i <= s / c; i++) {
			for (int j = 0; j <= s / b; j++) {
				for (int k = 0; k <= s / a; k++) {
					if (i + j + k == 0)
						continue;
					if (i * c + j * b + k * a <= s) {
						way++;
						sb.append(k).append(" Brown Trout, ").append(j).append(" Northern Pike, ").append(i)
								.append(" Yellow Pickerel").append('\n');
					}
				}
			}
		}

		sb.append("Number of ways to catch fish: ").append(way);

		System.out.println(sb);

	}
}