package class获取成员变量;





import com.sun.org.apache.bcel.internal.classfile.Field;

import 放射的机制.person;

public class 成员变量获取 {

	public static void main(String[] args) {
		Class personclass=person.class;
		java.lang.reflect.Field[] fields=personclass.getFields();
		for(java.lang.reflect.Field field:fields){
			System.out.println(fields);
		}

	}

}
