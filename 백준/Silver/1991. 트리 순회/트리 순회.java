import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static class Node {
		char alpha;
		Node left;
		Node right;

		Node(char alpha, Node left, Node right) {
			this.alpha = alpha;
			this.left = left;
			this.right = right;
		}
	}

	static StringBuilder sb = new StringBuilder();
	static Node head = new Node('A', null, null);

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			char root = st.nextToken().charAt(0);
			char left = st.nextToken().charAt(0);
			char right = st.nextToken().charAt(0);
			
			insertNode(head,root,left,right);
		}
		preOrder(head);
		sb.append('\n');
		inOrder(head);
		sb.append('\n');
		postOrder(head);
		System.out.println(sb);
	}

	static void insertNode(Node tmp, char root, char left, char right) {
		if (tmp.alpha == root) {
			tmp.left = (left == '.' ? null : new Node(left, null, null));
			tmp.right = (right == '.' ? null : new Node(right, null, null));
		} else {
			if(tmp.left != null) {
				insertNode(tmp.left,root,left,right);
			}
			if(tmp.right != null) {
				insertNode(tmp.right,root,left,right);
			}
		}
	}
	
	static void preOrder(Node node) {
		if(node ==  null) return;
		sb.append(node.alpha);
		preOrder(node.left);
		preOrder(node.right);		
	}
	static void inOrder(Node node) {
		if(node == null ) return;
		inOrder(node.left);
		sb.append(node.alpha);
		inOrder(node.right);
	}
	static void postOrder(Node node) {
		if(node == null) return;
		postOrder(node.left);
		postOrder(node.right);
		sb.append(node.alpha);
	}
}