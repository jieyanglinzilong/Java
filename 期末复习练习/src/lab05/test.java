package lab05;

public class test {

	public static void main(String[] args) {
		String b="欢迎大家访问http://www.xiaojiang.cn了解情况";
		String a="(http://|www)\56?\\w+\56{1}\\w+\56{1}\\p{Alpha}+";
		b=b.replaceAll(a,"*****");
		System.out.println(b);

	}

}
