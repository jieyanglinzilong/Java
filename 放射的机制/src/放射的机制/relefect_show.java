package ����Ļ���;

public class relefect_show {
    
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     Class cls1=Class.forName("����Ļ���.person");//��ȡȫ����
     System.out.println(cls1);
     Class cls2=person.class;//�����ڴ�����
     System.out.println(cls2);
     person a=new person();
     Class p=a.getClass();//�����ڶ����ȡ�ֽ���
     System.out.println(p);
     System.out.println(p==cls2);
     System.out.println(cls1==cls2);
     System.out.println(p==cls1);
	}

}
