package student;

public class rectangle {
	double hegith;
	double  width;
	int x,y;
	void point(int x,int y){
		this.x=x;
		this.y=y;
		
	}
	void set_area(double hegith,double  width){
		this.hegith=hegith;
		this.width=width;
	}
	double getarea(){
		return  hegith*width;
	}
	
	
	

}
