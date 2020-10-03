package lab04;

import java.util.Scanner;

public class shwo_formation {
	Triangle a;
	
	Scanner scanner=new Scanner(System.in);
	shwo_formation(double x,double y,double z){
	try{if(x<0||y<0||z<0){
		throw new math_exception();
	}
	if((x+y)<z||(y+z)<x||(x+z)<y){
		throw new math_exception(x,y,z);
	}a=new Triangle(x, y, z);
	
	}catch(Exception e){
		e.printStackTrace();
		
	}
}
	void show(){
		System.out.println("三角形的边长为"+a.x+" "+a.y+" "+a.z+" 面积为  "+a.getera()+" 周长为"+a.surround());
	}
}
