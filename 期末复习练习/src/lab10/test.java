package lab10;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int w=0,or=0,l=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("输入内容 :");

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

		System.out.println("以字母w开头的单词数:"+w+",单词中含“or”字符串的单词数:"+or+",长度为3的单词数"+l);

		}

}
