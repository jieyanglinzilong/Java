package lab15;

public class TestString{
  public void stringReplace (String text) {
    text = text.replace('j' , 'i'); 
    System.out.println(text);
    text=text+"C";
    
  }
  public void bufferReplace (StringBuffer text) {
    text.setCharAt(0,'i');
    text = text.append("C"); 
  }
  public void change(char ch[]){
    ch[0]= 'Y';
  }
  public static void main(String args[]){
    String str1="java";
    StringBuffer str2=new StringBuffer("java");
    char ch[]={'j','a','v','a'}; 
   TestString t=new TestString();  
    t.change(ch);
    t.stringReplace (str1);   
    t.bufferReplace (str2); 
    str1+="c";
    System.out.println(str1);  
    System.out.println(str2.toString());                               
    System.out.println (new String(ch));                               
  }
}