package stringl;

public class Tv {
	double price;
	public void setprice(double m){
		price=m;
	}
	public String toString(){
		String oldStr=super.toString();
		return oldStr+" "+price;
	}

}
