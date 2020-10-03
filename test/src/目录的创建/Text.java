package 目录的创建; //your package
 
import java.io.File;
import java.io.IOException;
 
public class Text {
	public static void main(String[] args) {
		String path ="D:\\文档\\组策略"; //所创建文件目录
		File f = new File(path); 
		if(!f.exists()){
			f.mkdirs(); //创建目录
		}
		String fileName = "abc.txt"; //文件名及类型
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
