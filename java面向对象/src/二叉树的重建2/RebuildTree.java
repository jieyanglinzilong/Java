package 二叉树的重建2;

public class RebuildTree {
	public static final int TREELEN = 6;

	public void rebuild(char[] pre, char[] in, int tREELEN2, node root) {
		if((pre.length==0)||(in.length==0)||(tREELEN2==0)){
			return ;
		}
		System.out.println("��ǰ�ڵ���"+pre[0]);
		node temp=new node(pre[0]);
		
		if(root==null){
			root=temp;
		}
		int j=0;
		int i = 0;
		while(i<in.length){
			if(pre[0]!=in[i])
				i++;
			
			else{
				break;}
			
		}
		int left=i;
		System.out.println(i);
		System.out.println("�������ĸ���"+left);
		int rigth=in.length-left-1;
		System.out.println("�������ĸ���"+rigth);
		if(left>0){
		for(int j1=0;j1<pre.length-1;j1++)
			pre[j1]=pre[j1+1];
		System.out.print("������");
		char []leftoder=new char[left];
		for(int k=0;k<left;k++){
			leftoder[k]=in[k];
			System.out.print(leftoder[k]+"\t");
		}
		rebuild(pre,leftoder,left,root.left);}
		if(rigth>0){
			
		for(int j2=0;j2<pre.length-1;j2++)
		   	pre[j2]=pre[j2+1];
		char []rightoder=new char[rigth];
		for(int b=0;b<rigth;b++){
			rightoder[b]=in[b+left+1];
			System.out.print(rightoder[b]+"\t");
		}
		rebuild(pre,rightoder,rigth,root.rigth);
			
			
			
			
			
			
			
		
		}
		
		
		
		
	}
}
