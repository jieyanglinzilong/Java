package ������;



public class test {

	public static void main(String[] args) {
		Simulator a=new Simulator();
		a.Dog=new dog();
	    a.Cat=new cat();
		a.Cat.cry();
		a.Dog.playsound();
	}

}
abstract class animal{
	abstract void cry();
	abstract  void playsound();
	
}
class dog extends animal{
	 void cry(){
		System.out.println("���ڿ�");
		
	}
	 void playsound(){
		System.out.println("����");
		
	}
	
}
class cat extends animal{
	 void cry(){
		System.out.println("è�ڿ�");
		
	}
	 void playsound(){
		System.out.println("����");
		
	}
	
}
class Simulator{
	cat Cat;
	dog Dog;
	
	
}
