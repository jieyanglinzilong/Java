package lab11;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class test extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("账号");
		label.setBounds(59, 64, 81, 21);
		contentPane.add(label);
		
		text1 = new JTextField();
		text1.setBounds(197, 61, 96, 27);
		contentPane.add(text1);
		text1.setColumns(10);
		
		JLabel label_1 = new JLabel("密码");
		label_1.setBounds(59, 125, 81, 21);
		contentPane.add(label_1);
		
		text2 = new JTextField();
		text2.setBounds(197, 122, 96, 27);
		contentPane.add(text2);
		text2.setColumns(10);
		
		JButton button = new JButton("登录");
		button.setBounds(91, 185, 123, 29);
		contentPane.add(button);
		button.addActionListener(this);
		text1.addActionListener(this);
		text2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String input1=text1.getText();
		String input2=text2.getText();
		if((input1.equals("admin")&&input2.equals("123456"))){
			JOptionPane.showConfirmDialog(this,"登陆成功"," 消息对话",JOptionPane.CLOSED_OPTION);
		}
		
	}

}
