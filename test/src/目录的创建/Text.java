package Ŀ¼�Ĵ���; //your package
 
import java.io.File;
import java.io.IOException;
 
public class Text {
	public static void main(String[] args) {
		String path ="D:\\�ĵ�\\�����"; //�������ļ�Ŀ¼
		File f = new File(path); 
		if(!f.exists()){
			f.mkdirs(); //����Ŀ¼
		}
		String fileName = "abc.txt"; //�ļ���������
		File file = new File(path,fileName);
		if(!file.exists()){ //surround with try/catch
			try { 
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
 
}
