package 放射的机制;

public class relefect_show {
    
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     Class cls1=Class.forName("放射的机制.person");//获取全类名
     System.out.println(cls1);
     Class cls2=person.class;//多用于穿参数
     System.out.println(cls2);
     person a=new person();
     Class p=a.getClass();//多用于对象获取字节码
     System.out.println(p);
     System.out.println(p==cls2);
     System.out.println(cls1==cls2);
     System.out.println(p==cls1);
	}

}
