package lab08;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JTextField;
import javax.swing.JButton;

public class test extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;
	JButton button = new JButton("登录");
	JButton button_1 = new JButton("注册");
	sql asql=new sql();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
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
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,876, 1240);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		 text2 = new JTextField();
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\Html\\照片\\壁纸\\AE037DA1D51E1A3B67107295FC1D1B22.jpg"));
		label.setBounds(-15, -16, 876, 1240);
		layeredPane.add(label);
		
		JPanel panel = new JPanel();
		layeredPane.setLayer(panel, 4);
		panel.setOpaque(false);
		panel.setBounds(74, 472, 270, 201);
		layeredPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("账号");
		label_1.setBounds(15, 75, 81, 21);
		panel.add(label_1);
		
		text1 = new JTextField();
		text1.setBounds(111, 72, 110, 27);
		panel.add(text1);
		text1.setColumns(10);
		
		JLabel label_2 = new JLabel("密码");
		label_2.setBounds(15, 122, 81, 21);
		panel.add(label_2);
		
		text2.setColumns(10);
		text2.setBounds(111, 114, 110, 27);
		panel.add(text2);
		
		
		button.setBounds(25, 157, 87, 29);
		button.addActionListener(this);
		panel.add(button);
		text1.addActionListener(this);
		text2.addActionListener(this);
		
		button_1.setBounds(145, 156, 93, 29);
		button_1.addActionListener(this);
		panel.add(button_1);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String name=(String)arg0.getActionCommand();
		if("登录".equals(name)){
		String textinput1=text1.getText().trim();
		String textinput2=text2.getText().trim();
		Connection dbConn=asql.login(textinput1,textinput2);
		if(dbConn!=null){
			JOptionPane.showConfirmDialog(this,"登录成功","消息对话",JOptionPane.YES_NO_CANCEL_OPTION);
			this.setVisible(false);
			test1 frame1=new test1(textinput1,textinput2,dbConn);
			frame1.setVisible(true);
			
		}
		else{
			JOptionPane.showConfirmDialog(this,"登陆失败","消息对话",JOptionPane.YES_NO_CANCEL_OPTION);
		}
		
		}
        if("注册".equals(name)){
        	String textinput1=text1.getText().trim();
    		String textinput2=text2.getText().trim();
		}
		// TODO Auto-generated method stub
		
	}
}
