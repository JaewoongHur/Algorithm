import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			char x = sc.next().charAt(0);
			int ASCII_Code = (int)x;  
			System.out.println(ASCII_Code);
			sc.close();
	}
}
