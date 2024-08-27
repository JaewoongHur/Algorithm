import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int tc = 0; tc < T; tc++) {
			String s = br.readLine();
			BigInteger a = new BigInteger(s);
			while (true) {
				if (a.compareTo(BigInteger.valueOf(100)) < 0) {
					if (a.compareTo(BigInteger.ZERO) > 0) {
						sb.append(a).append('\n');
					}

					if (a.remainder(BigInteger.valueOf(11)).compareTo(BigInteger.ZERO) == 0) {
						sb.append("The number ").append(s).append(" is divisible by 11.").append("\n\n");
					} else {
						sb.append("The number ").append(s).append(" is not divisible by 11.").append("\n\n");
					}
					break;
				}

				sb.append(a).append('\n');

				BigInteger b = a.remainder(new BigInteger("10"));

				a = a.divide(BigInteger.valueOf(10)).subtract(b);
			}
		}
		System.out.println(sb);
	}
}