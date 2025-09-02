import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		List<Stack<Integer>> deck = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			deck.add(new Stack<>());
		}
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) {
			int a = Integer.parseInt(st.nextToken());
			deck.get(i).push(a);
		}
		
		int num = n;
		
		while(true) {
			for(int i=num-2;i>=0;i--) {
				if(deck.get(i).size()==1 && deck.get(i).peek()>=deck.get(i+1).peek()) {
					deck.get(i+1).push(deck.get(i).pop());
					deck.remove(i);
				}
			}
			
			if(num == deck.size()) {
				break;
			}
			
			num = deck.size();
		}
		
		System.out.println(deck.size());
	}
}