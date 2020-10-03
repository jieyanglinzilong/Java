package lab02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javafx.scene.control.ComboBox;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class mywin extends JFrame {

	private JPanel contentPane;
	private JTextField text2;
	private JTextField text1;
	JTextArea show = new JTextArea();
	JButton button = new JButton("\u786E\u5B9A");
	JComboBox comboBox = new JComboBox();
	policelisten a=new policelisten();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mywin frame = new mywin();
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
	public mywin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		text1 = new JTextField();
		panel.add(text1);
		text1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u8FD0\u7B97", "+", "-", "*", "/"}));
		panel.add(comboBox);
		
		text2 = new JTextField();
		panel.add(text2);
		text2.setColumns(10);
		
		
		panel.add(button);
		
		
		contentPane.add(show, BorderLayout.CENTER);
		a.setBOX(comboBox);
		a.setButton(button);
		a.setshow(show);
		a.setText1(text1);
		a.setText2(text2);
		button.addActionListener(a);
		comboBox.addItemListener(a);
	  
	}

}
