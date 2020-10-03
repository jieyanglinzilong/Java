package java树的重建;

import java.util.Scanner;

public class 重建二叉树 {
	//定义根结点
	private Tree root;
	//构造方法
	public 重建二叉树() {
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
		//从中序遍历里找到根结点所在的位置
		int rootIndex = findIndexInArray(inOrder, rootData, instart, inend);
		//offSet代表中序遍历中，左子树最后一个元素的下标
		int offSet = rootIndex - instart - 1;
		//递归构建左子树
		Tree left = initTree(preOrder, prestart+1, prestart+1+offSet, inOrder, instart, instart+offSet);
		//递归构建右子树
		Tree right = initTree(preOrder, prestart+offSet+2, preend, inOrder, rootIndex+1, inend);
		tree.left = left;
		tree.right = right;
		return tree;
	}		
	 //找到x在数组中的下标
	public int findIndexInArray(String[] a, String x, int begin, int end) {
		for(int i=begin;i<=end;i++) {
			if(a[i].equals(x)) {
				return i;
			}
		}
		return -1;
	}
	
	//后序遍历排序
	public void postOrder(Tree root) {
		if(root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
	}

	public static void main(String[] args) {
		重建二叉树 tree = new 重建二叉树();
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
