package 使用泛型的接口;

public class Generic_interfece {
  public static void main(String args[]){
	  Generic_interfaces_user a=new Generic_interfaces_user();
	  a.method01("创建对象");
	  Generic_interafce01<Integer> b=new Generic_interafce01();
	  b.method01(21);
	  Generic_interafce01<Double> c=new Generic_interafce01();
	  c.method01(12.5);
  }
	

}
