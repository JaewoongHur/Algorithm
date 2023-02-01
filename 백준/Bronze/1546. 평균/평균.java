import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++) {		
			A[i] = sc.nextInt();
	}
		double avg = 0;
		double sum = 0;
		for(int x : A) {
			sum += x;
		}
		
		Arrays.sort(A);
		int M = A[N-1];
		avg = (sum/N)/M*100;
		System.out.println(avg);
		sc.close();
		
	}
}
