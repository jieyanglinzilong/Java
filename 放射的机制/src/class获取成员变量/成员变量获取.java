package class��ȡ��Ա����;





import com.sun.org.apache.bcel.internal.classfile.Field;

import ����Ļ���.person;

public class ��Ա������ȡ {

	public static void main(String[] args) {
		Class personclass=person.class;
		java.lang.reflect.Field[] fields=personclass.getFields();
		for(java.lang.reflect.Field field:fields){
			System.out.println(fields);
		}

	}

}
