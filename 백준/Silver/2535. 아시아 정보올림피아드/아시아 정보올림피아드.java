import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		PriorityQueue<ArrayList<Integer>> pq = new PriorityQueue<>(new Comparator<ArrayList<Integer>>() {

			@Override
			public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
				return o2.get(2) - o1.get(2);
			}
		}); 
		
		for(int i=0; i<T; i++) {
			ArrayList<Integer> arr2 = new ArrayList<Integer>();
			arr2.add(sc.nextInt());
			arr2.add(sc.nextInt());
			arr2.add(sc.nextInt()); 
			pq.add(arr2);
		}
		
		ArrayList<Integer> gold = pq.poll();
		ArrayList<Integer> silver = pq.poll();
		ArrayList<Integer> bronze = pq.poll();
		if (gold.get(0) == silver.get(0)) {
			while (bronze.get(0) == gold.get(0)) 
				bronze = pq.poll();
		}
		
		System.out.println(gold.get(0)+" "+gold.get(1));
		System.out.println(silver.get(0)+" "+silver.get(1));
		System.out.println(bronze.get(0)+" "+bronze.get(1));
	
		
	}
}