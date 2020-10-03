package lab01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test01 {
	public String a="123";
	String b="abcdef1239854145as5285";
	String k="88546720441";
	public void test(){
		String b= this.a.replace(a, "abc");
		System.out.println(b);
	}
	public void test01(){
		String d=this.b.replaceAll("[0-9]", "a");
				System.out.println(d);
	}
	public void test02(){
		String regx="^[1][3|5|7][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]$";
		String reg="^[1][3|5|7][0-9]{9}$";//[^1]表示不能取一
		System.out.println(Pattern.compile(regx).matcher(k).find());
		System.out.println(Pattern.compile(reg).matcher(k).find());
	}
	public void test03(){
		String a="..";
		String b="1q23ac";
		System.out.println(Pattern.compile(a).matcher(b).matches());
	}
	public void test04(){
		//贪婪模式
		String a="gdmncfghijikomglmi";
		String b="g.*g";
		Pattern p=Pattern.compile(b);
		Matcher d=p.matcher(a);
		while(d.find()){
			System.out.println(d.start());
			System.out.println(d.end());
			System.out.println(d.group());
			
		}
	}
	public void test05(){
		//懒汉模式
		String a="gdmncfghigjikomglmi";
		String b="g.*?g";
		Pattern p=Pattern.compile(b);
		Matcher d=p.matcher(a);
		while(d.find()){
			System.out.println(d.start());
			System.out.println(d.end());
			System.out.println(d.group());
			
		}
	}
	public void test06(){
		String b="[0-9]+";
		String m="123";
		System.out.println(Pattern.compile(b).matcher(a).matches());
	}
	public void test07(){
		//只能输入数字
		String b="\\d{10,11}";
		String m="123456789011";
		System.out.println(Pattern.compile(b).matcher(a).matches());
	}
	


	public static void main(String[] args) {
		test01 a=new test01();
		//a.test();
		a.test();
		a.test01();
		a.test02();
		a.test03();
		a.test04();
		a.test05();
		Pattern b=Pattern.compile("[0-9]");
		Matcher j=b.matcher(a.b);
		System.out.println(j.replaceAll("a"));// TODO Auto-generated method stub
        a.test06();
        a.test07();
	}

}
