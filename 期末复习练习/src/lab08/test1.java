package lab08;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class test1 extends JFrame implements ActionListener {
	Connection dbConn;
	Statement sql;
	ResultSet rs;
	private JPanel contentPane;
    String name;
    String password;
    JTextArea textArea;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public test1( String name,String password,Connection dbConn) {
		this.name=name;
		this.password=password;
		this.dbConn=dbConn;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("人事管理");
		menuBar.add(menu);
		
		JMenuItem people_infromation = new JMenuItem("人员薪酬记录");
		menu.add(people_infromation);
		people_infromation.addActionListener(this);
		JMenuItem pepole_slary = new JMenuItem("人员信息");
		menu.add(pepole_slary);
		pepole_slary.addActionListener(this);
		JMenu goods_information = new JMenu("商品信息");
		menuBar.add(goods_information);
		goods_information.addActionListener(this);
		JMenu customer = new JMenu("客户信息");
		menuBar.add(customer);
		
		JMenuItem menuItem = new JMenuItem("客户记录查询");
		customer.add(menuItem);
		menuItem.addActionListener(this);
		customer.addActionListener(this);
		JMenu suplyment = new JMenu("供应商");
		menuBar.add(suplyment);
		suplyment.addActionListener(this);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		 textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name=(String)e.getActionCommand();
		if("客户记录查询".equals(name)){
			String s="select*from 客户表";
			try {
				sql=dbConn.createStatement();
				
				rs=sql.executeQuery(s);
				while(rs.next()){
					String id=rs.getString(1);
					String name1=rs.getString(2);
					String area=rs.getString(3);
					float sum=rs.getFloat(4);
					textArea.append(id+" "+name1+" "+area+" "+sum+"\n");
				}
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			       
			  
			
		}
        if("人员信息".equals(name)){
        	 
        	 textArea.append("你好");
		}
        if("商品信息".equals(name)){
        	 textArea.append("你好");
		}
        if("人事薪酬记录".equals(name)){
        	 textArea.append("你好");
		}
        if("供应商".equals(name)){
        	 textArea.append("你好");
		}
		
		
		
		
	}

}
