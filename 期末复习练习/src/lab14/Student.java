package lab14;

public class Student {
	private int age;
	private String name;
	public Student(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	public int return_age(){
		return age;
	}
	public boolean isSameAge(int age){
		if(this.age==age){
			return true;
		}
		
		return false;

	
}
}