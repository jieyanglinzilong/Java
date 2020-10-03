package 二叉树的重建2;



class node{
	node left;
	node rigth;
	char value;
	node(char value){
		left=null;
		rigth=null;
		this.value=value;
	}
}

public class  二叉树的重建 {

	public static void main(String[] args) {
		final int TREELEN = 6;
		char[] pre = { 'a', 'b', 'd', 'c', 'e', 'f' };
		char[] in = { 'd', 'b', 'a', 'e', 'c', 'f' };
		
		new RebuildTree().rebuild(pre, in, TREELEN,  null);

	}

}
