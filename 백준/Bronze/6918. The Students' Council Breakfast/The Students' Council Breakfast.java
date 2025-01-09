import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		int p = Integer.parseInt(br.readLine());

		int min = Integer.MAX_VALUE;

		int com = 0;

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i <= p / a; i++) {
			for (int j = 0; j <= p / b; j++) {
				for (int k = 0; k <= p / c; k++) {
					for (int l = 0; l <= p / d; l++) {
						if (i * a + j * b + k * c + l * d == p) {
							com++;
							sb.append("# of PINK is ").append(i).append(" # of GREEN is ").append(j)
									.append(" # of RED is ").append(k).append(" # of ORANGE is ").append(l)
									.append("\n");

							min = Math.min(i + j + k + l, min);
						}
					}
				}
			}
		}
		
		sb.append("Total combinations is ").append(com).append(".\n");
		sb.append("Minimum number of tickets to print is ").append(min).append(".");
		
		System.out.println(sb);
	}
}