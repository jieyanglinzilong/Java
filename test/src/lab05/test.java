package lab05;

import java.util.Scanner;
public class test {
public static void main(String[] args) {
int w=0,or=0,l=0;
Scanner scan=new Scanner(System.in);
System.out.println("�������� :");

String str=scan.nextLine();
String st[]=str.split(" ");

for(int i=0;i<st.length;i++){
	if(st[i].startsWith("w")){
		w++;
	
		
}
	if(st[i].contains("or")){
		or++;
	}
	if(st[i].length()==3){
		l++;
	}
}

System.out.println("����ĸw��ͷ�ĵ�����:"+w+",�����к���or���ַ����ĵ�����:"+or+",����Ϊ3�ĵ�����"+l);

}
}
//we are young we are wake we are pain but we never give up