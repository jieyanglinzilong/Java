package lab04;

public class Triangle {
	double x=0;
	double y=0;
	double z=0;
	Triangle(double x,double y,double z){
		this.x=x;
		this.y=y;
		this.z=z;
		
	}
	double surround(){
		return (x+y+z)/2;
	}
	double getera(){
		double p=(x+y+z)/2;
		return Math.sqrt(p*(p-x)*(p-y)*(p-z));
		
	}
}
