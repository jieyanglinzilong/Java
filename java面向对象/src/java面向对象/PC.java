package java面向对象;

public class PC {
	Harddisk a;
	CPU cpu;
	void setCPU(CPU C){
		cpu=C;
		
	}
	public Harddisk getA() {
		return a;
	}
	public void sethardisk(Harddisk a) {
		this.a = a;
	}
	void show(){
		System.out.println("cpu���ٶ���"+cpu.speed+"Ӳ�̵�����"+a.amount);
	}
	

}
