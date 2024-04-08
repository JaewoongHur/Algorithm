import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();

		int a = 1;

		while (a <= 100) {

			for (int i = 2; i < a; i++) {
				for (int j = i; j < a; j++) {
					for (int k = j; k < a; k++) {
						if (i * i * i + j * j * j + k * k * k == a * a * a) {
							sb.append("Cube = ").append(a).append(", Triple = (").append(i).append(',').append(j)
									.append(',').append(k).append(')').append('\n');
						}
					}
				}
			}
			a++;
		}
		System.out.println(sb);
	}
}