import java.util.Scanner;

public class Main {
	static int cnt;
	static int cnt2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n+1];
		cnt=0;
		MenOfPassion(A, n);
		System.out.println(cnt);
		System.out.println(cnt/n);
		sc.close();
	}
	public static int MenOfPassion(int[] A, int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			cnt++;
			sum += A[i];
		}
		return sum;
	}
}