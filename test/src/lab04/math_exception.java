package lab04;

public class math_exception extends Exception {
	math_exception(){
		System.out.println("����С��0");
	}
	math_exception(double x,double y,double z){
		System.out.println("������������x,y,z������ֵС�ڵ����ߣ�����");
	}

}
