package java面向对象;

public class tset {

	public static void main(String[] args) {
       PC a=new PC();
       Harddisk b=new Harddisk(200);
       CPU cpu=new CPU(2000);
       a.sethardisk(b);
       a.setCPU(cpu);
       a.show();
       
       

	}


}
