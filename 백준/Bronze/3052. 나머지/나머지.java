import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer [] A = new Integer[10];
		for(int i=0; i<10; i++) {
			A[i] = sc.nextInt() % 42;
		}
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(A));
		
		System.out.println(set.size());
		sc.close();
	} 
}
