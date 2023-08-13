import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node {
	int num;
	Node left;
	Node right;

	Node(int num, Node left, Node right) {
		this.num = num;
		this.left = left;
		this.right = right;
	}
}

public class Main {
	static int cnt, idx,a;
	static int[] arr;
	static Node first;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		arr = new int[10001];
		idx = 0;
		while (true) {
			s = br.readLine();
			if (s == null || s.equals("")) {
				break;
			}
			arr[idx] = Integer.parseInt(s);
			idx++;
		}
		first = new Node(arr[0], null, null);
		cnt = 0;
		insertNode(first, 1000001);
		dfs(first);
		System.out.println(sb);
	}

	static void dfs(Node node) {
		if (node == null)
			return;
		dfs(node.left);
		dfs(node.right);
		sb.append(node.num).append('\n');
	}

	static void insertNode(Node tmp, int parent) {
		cnt++;
		if (idx == cnt) {
			return;
		}
		a = arr[cnt];

		if (tmp.left == null && tmp.num > a) {
			tmp.left = new Node(a, null, null);
			insertNode(tmp.left, tmp.num);
		}

		if (tmp.right == null && tmp.num < a && parent > a) {
			tmp.right = new Node(a, null, null);
			insertNode(tmp.right, parent);
		}
	}
}