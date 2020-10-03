package java�����ؽ�;

import java.util.Scanner;

public class �ؽ������� {
	//��������
	private Tree root;
	//���췽��
	public �ؽ�������() {
		root = null;
	}
	
	public void initTree(String[] preOrder, String[] inOrder) {
		this.root = this.initTree(preOrder, 0, preOrder.length-1, inOrder, 0, inOrder.length-1);
	}
	
	public Tree initTree(String[] preOrder, int prestart, int preend, String[] inOrder, int instart, int inend) {
		if(prestart > preend || instart > inend) {
			return null;
		}
		String rootData = preOrder[prestart];
		Tree tree = new Tree(rootData);
		//������������ҵ���������ڵ�λ��
		int rootIndex = findIndexInArray(inOrder, rootData, instart, inend);
		//offSet������������У����������һ��Ԫ�ص��±�
		int offSet = rootIndex - instart - 1;
		//�ݹ鹹��������
		Tree left = initTree(preOrder, prestart+1, prestart+1+offSet, inOrder, instart, instart+offSet);
		//�ݹ鹹��������
		Tree right = initTree(preOrder, prestart+offSet+2, preend, inOrder, rootIndex+1, inend);
		tree.left = left;
		tree.right = right;
		return tree;
	}		
	 //�ҵ�x�������е��±�
	public int findIndexInArray(String[] a, String x, int begin, int end) {
		for(int i=begin;i<=end;i++) {
			if(a[i].equals(x)) {
				return i;
			}
		}
		return -1;
	}
	
	//�����������
	public void postOrder(Tree root) {
		if(root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
	}

	public static void main(String[] args) {
		�ؽ������� tree = new �ؽ�������();
		Scanner s = new Scanner(System.in);	
		String str = s.nextLine();
		String[] strs = str.split("\\s+");
		String preOrderStr = strs[0];
		String [] preOrder = new String[preOrderStr.length()];
		String inOrderStr = strs[1];
		String [] inOrder = new String[inOrderStr.length()];
		for(int i = 0;i < preOrderStr.length();i++) {
			preOrder[i] = preOrderStr.substring(i, i+1);
			inOrder[i] = inOrderStr.substring(i, i+1);
		}
		tree.initTree(preOrder, inOrder);
		tree.postOrder(tree.root);
	}
}
