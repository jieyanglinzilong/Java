package lab06;

public class String_mothed {

	public static void main(String[] args) {
		String a=new String("hello");
		String  b =a.substring(1, 3);
		System.out.println(b+" "+a);
		String c=String.valueOf("我是董辉的爸爸");
		System.out.println(b+" "+a+" "+c);
		char[] d=new char[20];
		a.getChars(1, 3, d, 0);
		for(int i=0;i<=1;i++){
			System.out.println(d[i]);
		}
		// TODO Auto-generated method stub

	}

}
