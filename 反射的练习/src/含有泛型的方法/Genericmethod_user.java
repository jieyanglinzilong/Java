package 含有泛型的方法;

public class Genericmethod_user {

	public <M>void method01(M m){
		System.out.println(m);
	}
	public static <S>void method02(S s){
		System.out.println(s);
	}
	
}
