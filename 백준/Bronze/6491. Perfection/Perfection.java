import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			
			if(a == 0) break;
			
			int sum = 0;
			int k = 1;

			while (k < a) {
				if (a % k == 0) {
					sum += k;
				}

				k++;
			}

			if (sum > a) {
				System.out.println(a + " ABUNDANT");
			} else if (sum == a) {
				System.out.println(a + " PERFECT");
			} else {
				System.out.println(a + " DEFICIENT");
			}
		}
	}
}