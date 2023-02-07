import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int HH = sc.nextInt();
		int MM = sc.nextInt();
		sc.close();
		System.out.println((HH-9) * 60 + MM);
	}
}