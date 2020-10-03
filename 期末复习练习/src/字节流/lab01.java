package 字节流;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import java.awt.GridBagLayout;
import java.awt.FlowLayout;

import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;
import java.awt.Toolkit;

public class lab01 extends JFrame implements ActionListener ,MenuListener{

	private JPanel contentPane;
    lab02 a;
    static lab01 frame;
    JTextArea textArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new lab01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public lab01() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\jh\\Desktop\\软工作业\\logo1.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("文件");
		menuBar.add(menu);
		
		JMenuItem _newfile = new JMenuItem("新建");
		menu.add(_newfile);
		
		JMenuItem open = new JMenuItem("打开");
		menu.add(open);
		
		JMenuItem Exit = new JMenuItem("关闭");
	
		menu.add(Exit);
		
		JMenu menu_1 = new JMenu("格式");
		menuBar.add(menu_1);
		
		JMenuItem color = new JMenuItem("修改颜色");
		menu_1.add(color);
		
		JMenuItem clear = new JMenuItem("清除内容");
		menu_1.add(clear);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		 textArea = new JTextArea();
		textArea.setColumns(8);
		textArea.setRows(10);
		scrollPane.setViewportView(textArea);
		a=new lab02();
        Exit.addActionListener(this);
		open.addActionListener(this);
		//Exit.addActionListener(a);
		a.set(textArea);
		a.setExit(Exit);
		
		JMenuItem saveas = new JMenuItem("另存为");
		menu.add(saveas);
		saveas.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 JFileChooser jfc=new JFileChooser();
		String name=(String)e.getActionCommand();
		File file=new File("无标题.txt");
		if("关闭".equals(name)){
			int n=JOptionPane.showConfirmDialog(this,"是否关闭","消息对话",JOptionPane.YES_NO_CANCEL_OPTION);
			if(n==JOptionPane.YES_OPTION){
				System.exit(0);
			}
        	
        }
		
		if("打开".equals(name)){
			 
			  
			   if(file!=null) jfc.setSelectedFile(file);
			   int returnval=jfc.showOpenDialog(frame);
			  
			   if(returnval==JFileChooser.APPROVE_OPTION)
				  file=jfc.getSelectedFile();
				   try {
					frame.setTitle(file.getName()+"-- 我的记事本--");
					FileReader in=new FileReader (file);
					int len=(int)file.length();
					char []buffer=new char[len];
					in.read(buffer,0,len);
					in.close();
					textArea.setText(new String(buffer));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				   
		}
		if("另存为".equals(name)){
			  int returnval=jfc.showOpenDialog(frame);
			  
			   if(returnval==JFileChooser.APPROVE_OPTION)
				  file=jfc.getSelectedFile();
			   try{
				   FileOutputStream out=new FileOutputStream(file);
				   byte a[]=textArea.getText().getBytes();
				   out.write(a);
				   out.close();
			   }catch(Exception  e1){
				   e1.printStackTrace();
			   }
			
		}
			   //if(file!=null)
		}

	@Override
	public void menuCanceled(MenuEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menuDeselected(MenuEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menuSelected(MenuEvent arg0) {
		// TODO Auto-generated method stub
		
	}
		 
		
		
		
	}


