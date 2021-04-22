import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1991_S1_트리순회 {
	private static char[][] tree;
	private static int N;
	private static String preorder, inorder, postorder;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(bf.readLine());
		tree = new char[N][3];
		StringTokenizer st = null;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine());
			tree[i][0] = st.nextToken().charAt(0);
			tree[i][1] = st.nextToken().charAt(0);
			tree[i][2] = st.nextToken().charAt(0);
		}
		preorder = "";
		inorder = "";
		postorder = "";
		traversal(0);
		
		System.out.println(preorder);
		System.out.println(inorder);
		System.out.println(postorder);
	}

	private static void traversal(int depth) {
		if(depth == N) {
			return;
		}
		
		preorder += tree[depth][0];
		if(tree[depth][1] != '.') {
			for (int i = depth+1; i < N; i++) {
				if(tree[depth][1] == tree[i][0]) {
					traversal(i);
					break;
				}
			}
		}
		inorder += tree[depth][0];
		if(tree[depth][2] != '.') {
			for (int i = depth+1; i < N; i++) {
				if(tree[depth][2] == tree[i][0]) {
					traversal(i);
					break;
				}
			}
		}
		postorder += tree[depth][0];
	}
}
