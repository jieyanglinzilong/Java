package ½Ó¿Ú;

public class test {

	public static void main(String[] args) {
		Simulator a=new Simulator();
		a.Dog=new dog();
	    a.Cat=new cat();
		a.Cat.cry();
		a.Dog.playsound();
	}

}
interface animal{
	void cry();
	void playsound();
	
}
class dog implements animal{
	public void cry(){
		System.out.println("¹·ÔÚ¿Þ");
		
	}
	public void playsound(){
		System.out.println("ÍôÍô");
		
	}
	
}
class cat implements animal{
	public void cry(){
		System.out.println("Ã¨ÔÚ¿Þ");
		
	}
	public void playsound(){
		System.out.println("ß÷ß÷");
		
	}
	
}
class Simulator{
	cat Cat;
	dog Dog;
	
	
}
