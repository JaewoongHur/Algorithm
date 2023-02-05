import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long T = sc.nextLong();
		for (int i = 0; i < T; i++) {
			long lt = sc.nextLong();
			long wt = sc.nextLong();
			long le = sc.nextLong();
			long we = sc.nextLong();

			if (lt * wt > le * we) {
				System.out.println("TelecomParisTech");
			} else if (lt * wt < le * we) {
				System.out.println("Eurecom");
			} else {
				System.out.println("Tie");
			}
		}
		sc.close();
	}
}
