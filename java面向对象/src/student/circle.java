package student;
public class circle {
	double radius=0;
	void set_area(double radius){
		this.radius=radius;
	}
	double getarea(){
		return Math.PI*radius*radius;
	}
	int x,y;
	void point(int x,int y){
		this.x=x;
		this.y=y;
		
	}
	

}
