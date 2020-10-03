package 哈夫曼树;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
 
public class HuffmanTree {
 
	public static class Node<E>{
		private E data;
		private Node lChild;
		private Node rchild;
		private float weight;
		
		public Node(E data,float weight){
			this.data=data;
			this.weight=weight;
			lChild=null;
			rchild=null;
		}
		
		public String toString(){
			String s="[data:"+data.toString()+",weight"+weight+"]";
			return s; 
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <E> Node createTree(List<Node> l){
		List<Node> list=new ArrayList<>();
		list.addAll(l);
		while(list.size()>1){
			quickSort(list);
			for(Node node:list)
				System.out.print(node.data+""+(int)node.weight+" ");
			System.out.println();
			Node lChild=list.get(list.size()-1);
			Node rChild=list.get(list.size()-2);
			Node parent=new Node("@", lChild.weight+rChild.weight);
			parent.lChild=lChild;
			parent.rchild=rChild;
			list.remove(list.size()-1); //注意这里都是减去1
			list.remove(list.size()-1);
			list.add(parent);
		}
		return list.get(0);
	}
	/***************快排**************/
	public static void quickSort(List<Node> list){
		sort(list,0,list.size()-1);
	}
	
	public static void sort(List<Node> list,int l,int r){
		if(l<r){
			int random=(int)(Math.random()*(r-l+1)+l);
			swap(list, l, random);
			int i=l,j=r+1;
			float value=list.get(l).weight;
			while(true){                 //	千万不能写成i<j，因为j已经+1了
				while(i<r&&list.get(++i).weight>value);
				while(j>l&&list.get(--j).weight<value);
				if(i>=j)
					break;
				swap(list, i, j);
			}
			swap(list, l, j);
			sort(list, l, j-1);
			sort(list, j+1, r);
		}
	}
	
	public static void swap(List<Node> list,int l,int r){
		Node tempNode=list.get(l);
		list.set(l, list.get(r));
		list.set(r, tempNode);
	}
	
    public static void inOrder(Node root){
    	if(root==null)
    		return;
    	inOrder(root.lChild);
        System.out.print(root.toString()+"  ");
    	inOrder(root.rchild);
    }
    
    public static void main(String []args){
    	List<HuffmanTree.Node> list=new LinkedList<>();
    	list.add(new Node("A", 20));
    	list.add(new Node("B", 13));
    	list.add(new Node("C", 5));
    	list.add(new Node("D", 2));
    	list.add(new Node("E", 10));
    	list.add(new Node("F", 7));
    	list.add(new Node("G", 26));
    	list.add(new Node("H", 3));
    	list.add(new Node("I", 2));
    	
    	HuffmanTree.inOrder(HuffmanTree.createTree(list));
    }
	
}