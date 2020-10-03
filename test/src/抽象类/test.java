package ³éÏóÀà;



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
		System.out.println("¹·ÔÚ¿Ş");
		
	}
	 void playsound(){
		System.out.println("ÍôÍô");
		
	}
	
}
class cat extends animal{
	 void cry(){
		System.out.println("Ã¨ÔÚ¿Ş");
		
	}
	 void playsound(){
		System.out.println("ß÷ß÷");
		
	}
	
}
class Simulator{
	cat Cat;
	dog Dog;
	
	
}
