import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	static BigInteger[] arr;
	static BigInteger[] arr2;
	static String s;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger m = BigInteger.valueOf(Long.parseLong(st.nextToken()));
		BigInteger a = BigInteger.valueOf(Long.parseLong(st.nextToken()));
		BigInteger c = BigInteger.valueOf(Long.parseLong(st.nextToken()));
		BigInteger X0 = BigInteger.valueOf(Long.parseLong(st.nextToken()));
		BigInteger n = BigInteger.valueOf(Long.parseLong(st.nextToken()));
		BigInteger g = BigInteger.valueOf(Long.parseLong(st.nextToken()));

		X0 = X0.remainder(m);
		c = c.remainder(m);
		a = a.remainder(m);
		BigInteger Xn = new BigInteger("0");
		if (n == BigInteger.ONE) {
			Xn = (a.multiply(X0).add(c)).remainder(m);
			BigInteger result = Xn.remainder(g);
			System.out.println(result);
		} else if (n == BigInteger.valueOf(2)) {
			Xn = (a.multiply(X0).add(c)).remainder(m);
			Xn = (a.multiply(Xn).add(c)).remainder(m);
			BigInteger result = Xn.remainder(g);
			System.out.println(result);
		} else {
			long y = n.longValue()-1;
			s = Long.toBinaryString(y);
			int k = s.length();
			arr = new BigInteger[k];
			arr[0] = a.remainder(m);
			for (int i = 1; i < k; i++) {
				arr[i] = (arr[i - 1].remainder(m).multiply(arr[i - 1].remainder(m))).remainder(m);
			}

			arr2 = new BigInteger[k];
			arr2[0] = BigInteger.ONE;
			for (int i = 1; i < k; i++) {
				arr2[i] = ((BigInteger.valueOf(1).add(arr[i - 1])).remainder(m).multiply(arr2[i - 1].remainder(m))).remainder(m);
			}

			BigInteger Sn = new BigInteger("0");
			BigInteger an = new BigInteger("1");
			int cnt = 0;
			for (int i = 0; i < k; i++) {
				if (s.charAt(k - 1 - i) - '0' == 1) {
					an = (an.remainder(m).multiply(arr[i].remainder(m))).remainder(m);
					cnt++;
					if (cnt == 1) {
						Sn = (arr[i].remainder(m).add(arr2[i].remainder(m))).remainder(m);
					} else {
						Sn = (arr[i].multiply(Sn).remainder(m).add(arr2[i].remainder(m))).remainder(m);
					}
				} else {
					continue;
				}
			}
			Sn = (c.multiply(Sn)).remainder(m);
			an = (an.multiply(a)).remainder(m);
			an = an.multiply(X0).remainder(m);
			Xn = (an.add(Sn)).remainder(m);
			BigInteger result = Xn.remainder(g);
			System.out.println(result);
		}
	}
}