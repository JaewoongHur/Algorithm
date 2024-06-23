import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		System.out.println("n e");
		System.out.println("- -----------");

		double[] arr = new double[10];
		arr[0] = 1;
		for (int i = 1; i <= 9; i++) {
			arr[i] = arr[i - 1] * i;
		}
		System.out.println("0 1");
		System.out.println("1 2");
		System.out.println("2 2.5");
		
		double d = 0;
		for (int i = 0; i < 10; i++) {
			d += 1 / arr[i];
			if (i >= 3) {
				System.out.printf(i + " %.9f\n",d);
			}
		}
	}
}