package lab02;
class teacher extends person{
    
    
	teacher(String name, int age, double slary,int worktime) {
		super(name, age, slary,worktime);
		
		;// TODO �Զ����ɵĹ��캯�����
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
		// TODO �Զ����ɵĹ��캯�����
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
		// TODO �Զ����ɵĹ��캯�����
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
		System.out.println(name+" ������"+age+" ������"+slary+" ������"+bonus+" ������"+(slary+bonus)+ " ����ʱ���� "+worktime);
	}
	
}



public class test {

	public static void main(String[] args) {
		teacher a=new teacher("��ЦЦ",25,3000,200);
		Contract b=new Contract("����",30,3500,5);
		Temporary c=new Temporary("����",28,2800,8);
		a.setbonus();b.setbonus();c.setbonus();
		a.show();
		b.show();
		c.show();
		
		

	}

}


