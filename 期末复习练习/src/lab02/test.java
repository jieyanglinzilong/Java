package lab02;

import java.util.*;

public class test<T> {
  
	public static void main(String[] args) {
		test2 a=new test2();
		a.test(20);
		System.out.println(a.mathod());
		
		
		
	}
	public static void test1(){
		Collection<String> c=new ArrayList<>();
		c.add("高");
		c.add("矮");
		c.remove("矮");
		System.out.println(c);
        System.out.println(c.size());
        Object []a=c.toArray();
        System.out.println(a);
        c.clear();
        System.out.println(c);
	}
	public static void test2(){
		Collection<String> c=new ArrayList<>();
		Collection<String> d=new ArrayList<>();
		c.add("高");
		c.add("矮");
		d.add("高");
		d.add("矮");
		System.out.println(d);
		System.out.println(c);
        System.out.println(c.size());
        System.out.println(d.size());
        c.addAll(d);
        c.removeAll(d);
        Object []a=c.toArray();
        System.out.println(a);
        System.out.println(d);
        System.out.println(c);
	}
	
	

}
