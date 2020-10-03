package 含有泛型的方法;

public class Genericmethod {

	public static void main(String[] args) {
		Genericmethod_user a=new Genericmethod_user();
		a.method01(23);
		a.method02("静态方法不建议创建对象使用");
		//静态方法可通过类名.方法名使用
		Genericmethod_user.method02("直接调用静态方法");
		Genericmethod_user.method02("你好");
	}

}
