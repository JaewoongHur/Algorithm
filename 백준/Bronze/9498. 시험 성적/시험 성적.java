import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		if (s>=90 && s<=100) {
			System.out.println("A");
		}
		else if (s>=80 && s<=89) {
			System.out.println("B");
		}
		else if  (s>=70 && s<=79) {
			System.out.println("C");
		}
		else if (s>=60 && s<=69) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		sc.close();		
		}
	}

