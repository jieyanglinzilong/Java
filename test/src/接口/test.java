package �ӿ�;

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
		System.out.println("���ڿ�");
		
	}
	public void playsound(){
		System.out.println("����");
		
	}
	
}
class cat implements animal{
	public void cry(){
		System.out.println("è�ڿ�");
		
	}
	public void playsound(){
		System.out.println("����");
		
	}
	
}
class Simulator{
	cat Cat;
	dog Dog;
	
	
}
