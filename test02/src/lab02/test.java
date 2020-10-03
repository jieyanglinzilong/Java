package lab02;
class teacher extends person{
    
    
	teacher(String name, int age, double slary,int worktime) {
		super(name, age, slary,worktime);
		
		;// TODO 自动生成的构造函数存根
	}
	void setbonus(){
		if(worktime>50){
		this.bonus=slary*0.1;}
		else{
			this.bonus=slary*0.08;
		}
	}

}
class Contract extends person{

	
	Contract(String name, int age, double slary, int worktime) {
		super(name, age, slary, worktime);
		// TODO 自动生成的构造函数存根
	}

	void setbonus(){
		if(worktime>5){
		this.bonus=slary*0.1;}
		else{
			this.bonus=slary*0.08;
		}
	}


}
class Temporary extends person{

	
	Temporary(String name, int age, double slary, int worktime) {
		super(name, age, slary, worktime);
		// TODO 自动生成的构造函数存根
	}

	void setbonus(){
		if(worktime>50){
		this.bonus=slary*0.1;}
		else{
			this.bonus=slary*0.08;
		}
	}


}
class person{
	String name;
	int age;
	double slary;
	int  worktime;
	double bonus;
	person(String name,int age,double slary,int worktime){
		this.age=age;
		this.name=name;
		this.worktime=worktime;
		this.slary=slary;
		
	}
	void show(){
		System.out.println(name+" 年龄是"+age+" 工资是"+slary+" 奖金是"+bonus+" 收入是"+(slary+bonus)+ " 工作时间是 "+worktime);
	}
	
}



public class test {

	public static void main(String[] args) {
		teacher a=new teacher("张笑笑",25,3000,200);
		Contract b=new Contract("张宇",30,3500,5);
		Temporary c=new Temporary("李鑫",28,2800,8);
		a.setbonus();b.setbonus();c.setbonus();
		a.show();
		b.show();
		c.show();
		
		

	}

}


