package 字节流;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class lab02 implements ActionListener{
	JTextArea textArea;
	lab01 k;
	JMenuItem Exit;
	void setExit(JMenuItem Exit){
		this.Exit=Exit;
		
	}
	void set(lab01 k){
		
		this.k=k;
	}
	void set(JTextArea 
			textArea){
		this.textArea=textArea;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int n=-1;
	        String name=(String)e.getActionCommand();
	    	File f=new File("C:\\Users\\jh\\Desktop\\软工作业\\new.txt");
	        if("打开".equals(name)){
	        
	        	if(!f.exists()){
	        		try {
						f.createNewFile();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	        	}
	        	try {
	        		byte a[]=new byte [100];
					InputStream m=new FileInputStream(f);
				while((n=m.read(a,0,100))!=-1){
						String s=new String(a,0,n);
					textArea.append(s);}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        }
	        if("关闭".equals(name)){
	        	
	        }
	        
		
	}

}
