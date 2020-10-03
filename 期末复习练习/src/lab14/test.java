package lab14;

public class test {

	public static void main(String[] args) {
		Student a=new Student("李大牛",20);
		Student b=new Student("赵铁柱",18);
		boolean n=b.isSameAge(a.return_age());// TODO Auto-generated method stub
        if(n==true){
        	System.out.println("两个人一样的年龄");
        }else{
        	System.out.println("两个人的年龄不一样");
        }
	}
	

}
