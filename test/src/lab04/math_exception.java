package lab04;

public class math_exception extends Exception {
	math_exception(){
		System.out.println("数字小于0");
	}
	math_exception(double x,double y,double z){
		System.out.println("三角形中三边x,y,z中两个值小于第三边，错误");
	}

}
