package 泛型;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class odject {

	public static void main(String[] args) {
		show02();
	}


private static void show02(){
	ArrayList<String> list=new ArrayList<String>();
	list.add("abc");
    Iterator<String> it=list.iterator();
    while(it.hasNext()){
    String s=it.next();
    System.out.println(s+"->"+s.length());
    	
    	
    }
	
	
	
	
	
	
	
}}