import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = n; i >= 2; i--) {
			sb.append(i).append(" bottles of beer on the wall, ").append(i).append(" bottles of beer.\n");
			if (i == 2) {
				sb.append("Take one down and pass it around, ").append(i - 1).append(" bottle of beer on the wall.\n\n");
			} else {
				sb.append("Take one down and pass it around, ").append(i - 1).append(" bottles of beer on the wall.\n\n");
			}
		}

		sb.append("1 bottle of beer on the wall, 1 bottle of beer.\n");
		sb.append("Take one down and pass it around, no more bottles of beer on the wall.\n\n");

		sb.append("No more bottles of beer on the wall, no more bottles of beer.\n");
		if (n == 1) {
			sb.append("Go to the store and buy some more, ").append(n).append(" bottle of beer on the wall.");
		} else {
			sb.append("Go to the store and buy some more, ").append(n).append(" bottles of beer on the wall.");
		}
		System.out.println(sb);
	}
}