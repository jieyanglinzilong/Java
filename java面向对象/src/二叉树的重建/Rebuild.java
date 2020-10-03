package 二叉树的重建;
 

class Node {
	Node left;
	Node right;
	char chValue;
 
	Node(char chValue) {
		left = null;
		right = null;
		this.chValue = chValue;
	}
}
 
public class Rebuild {
	public static final int TREELEN = 6; // ���Ľڵ���
 
	void rebuild(char[] preOrder, char[] inOrder, int treeLen, Node root) {
		if (preOrder == null || inOrder == null) { // ǰ��������л������������Ϊ��
			return;
		}
		Node temp = new Node(preOrder[0]);// ��ȡǰ��������еĵ�һ���ڵ�
		System.out.println("��ǰ�ڵ㣺" + preOrder[0]);
		if (root == null) { // ������ڵ�Ϊ�գ���ѵ�ǰ�ڵ㸴�Ƹ����ڵ�
			root = temp;
		}
 
		if (treeLen == 1) {
			return;
		}
 
		int i = 0;
 
		while (i < inOrder.length) { // ��inOrder���ҵ���preOrder[0]��ȵĽڵ�
			if (preOrder[0] != inOrder[i]) {
				i++;
			} else {
				break;
			}
		}
		
        System.out.println("��ͬ�Ľڵ�"+i);
		int leftLen = i;
		System.out.println("����������:" + leftLen);
		int rightLen = inOrder.length - leftLen - 1;
		System.out.println("����������:" + rightLen);
 
		if (leftLen > 0) {
			for (int j = 0; j < preOrder.length - 1; j++) {
				preOrder[j] = preOrder[j + 1];
			}
			char[] leftOrder = new char[leftLen];
			System.out.print("������:");
			for (int j = 0; j < leftLen; j++) {
				leftOrder[j] = inOrder[j];
				System.out.print(leftOrder[j] + "\t");
			}
			System.out.println();
			rebuild(preOrder, leftOrder, leftLen, root.left);
		}
		if (rightLen > 0) {
			for (int j = 0; j < preOrder.length - 1; j++) {
				preOrder[j] = preOrder[j + 1];
			}
			char[] rightOrder = new char[rightLen];
			System.out.print("������:");
			for (int j = 0; j < rightLen; j++) {
				rightOrder[j] = inOrder[j + leftLen + 1];
				System.out.print(rightOrder[j] + "\t");
			}
			System.out.println();
			rebuild(preOrder, rightOrder, rightLen, root.right);
		}
	}
 
	public static void main(String[] args) {
		char[] pre = { 'a', 'b', 'd', 'c', 'e', 'f' };
		char[] in = { 'd', 'b', 'a', 'e', 'c', 'f' };
		new Rebuild().rebuild(pre, in,TREELEN , null);
	}
 
}
