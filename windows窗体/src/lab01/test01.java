package lab01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.KeyStroke;

import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLayeredPane;
import java.awt.FlowLayout;

public class test01 extends JFrame {
	/**
	 * @wbp.nonvisual location=55,20
	 */
	private final Label 文本文档 = new Label("New label");
	private JFrame frame;
	JTextArea book = new JTextArea();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test01 frame = new test01();
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
	public test01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 900);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u83DC\u5355");
		menuBar.add(menu);
		
		JMenuItem Java = new JMenuItem("java",new ImageIcon("logo1.jpg"));
		Java.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				book.setText("java大法好");
			}
		});
		Java.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				book.setText("java大法好");
				
				
			}
		});
		Java.setAccelerator(KeyStroke.getKeyStroke("B"));
		menu.add(Java);
		
		JMenuItem C = new JMenuItem("c#",new ImageIcon("logo2.jpg"));
		C.setAccelerator(KeyStroke.getKeyStroke('A'));
		menu.add(C);
		
		JMenu menu_1 = new JMenu("\u5BFC\u822A");
		menuBar.add(menu_1);
		
		JMenu menu_2 = new JMenu("\u7528\u6237\u767B\u5F55");
		menuBar.add(menu_2);
		
		JMenu menu_3 = new JMenu("\u4FE1\u606F\u4FDD\u5B58");
		menuBar.add(menu_3);
		
		JMenu menu_4 = new JMenu("\u6253\u5F00\u6587\u4EF6");
		menuBar.add(menu_4);
		
		JMenu menu_5 = new JMenu("\u7528\u6237\u4E2D\u5FC3");
		menuBar.add(menu_5);
		
		JLayeredPane layeredPane = new JLayeredPane();
		getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Html\\\u7167\u7247\\\u58C1\u7EB8\\20171129134549_UTx4Y.png"));
		lblNewLabel.setBounds(0, 0, 700, 900);
		layeredPane.add(lblNewLabel);
		
	}
}
