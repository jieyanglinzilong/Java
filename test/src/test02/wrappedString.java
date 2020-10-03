package test02;

import java.util.*;

public class wrappedString {
	private String s;
	public wrappedString(String s){
		this.s=s;
	}
	
	
	
	
	
	public static void main(String args[]){
		HashSet <Object> hs=new HashSet <Object>();
		wrappedString a=new wrappedString("aardvark");
		wrappedString b=new wrappedString("aardvark");
		String s1=new String("aardvark");
		String s2=new String("aardvark");
		hs.add(a);
		hs.add(b);
		hs.add(s1);
		hs.add(s2);
		System.out.println(hs.size());
		
		
	}

}
class a{
	private String s;
	public a(String s){
		this.s=s;
	}
}
