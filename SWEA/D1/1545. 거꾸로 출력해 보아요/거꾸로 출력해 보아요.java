import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0;i<N+1;i++) {
			System.out.print(N-i+" ");
		}
		sc.close();
	}
}