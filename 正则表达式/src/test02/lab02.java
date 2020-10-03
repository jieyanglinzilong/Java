package test02;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class ImagePanel extends JPanel {

    private int weight;
    private int height;
    private String imagePath;

    public ImagePanel(int weight,int height,String imagePath){
        this.weight = weight;
        this.height = height;
        this.imagePath = imagePath;
        this.setPreferredSize(new Dimension(this.weight,this.height));
    }


    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/img/" + imagePath));
        imageIcon.setImage(imageIcon.getImage().getScaledInstance(this.weight,this.height,Image.SCALE_FAST));
        g.drawImage(imageIcon.getImage(),0,0,null);
    }
}


public class lab02 extends JFrame {
	private Container container;
    private JPanel allPanel;
	private JPanel contentPane;
	private JTextField textField;
	ImageIcon imageIcon = new ImageIcon(this.getClass().getResource(
            "D:/Html/’’∆¨/abm.jpg"));
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lab02 frame = new lab02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void init(){
        ImagePanel imagePanel = new ImagePanel(400,400,"bg.png");
        setContentPane(imagePanel);
        container = new Container();
        container = getContentPane();
        allPanel = new JPanel();
        allPanel.setBackground(null);
        allPanel.setOpaque(false);
        allPanel.setPreferredSize(new Dimension(400,400));
        JLabel  label = new JLabel("WEHRL");
        allPanel.add(label);
        container.add(allPanel);
    }


	/**
	 * Create the frame.
	 */
	public lab02() {
		init();
        setSize(400,400);
        setLocationRelativeTo(null);
        setTitle("≤‚ ‘jframe");
        setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnB = new JRadioButton("B \u50BB\u903C");
		rdbtnB.setBackground(Color.YELLOW);
		rdbtnB.setBounds(180, 111, 177, 29);
		contentPane.add(rdbtnB);
		
		JRadioButton rdbtnC = new JRadioButton("C \u4E8C\u54C8");
		rdbtnC.setBackground(Color.PINK);
		rdbtnC.setBounds(180, 161, 177, 29);
		contentPane.add(rdbtnC);
		
		JRadioButton rdbtnA = new JRadioButton("A  \u4EBA");
		rdbtnA.setBackground(Color.BLUE);
		rdbtnA.setBounds(180, 75, 177, 29);
		contentPane.add(rdbtnA);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setText("\u8463\u8F89\u5C5E\u4E8E\uFF1F");
		textField.setBounds(106, 26, 96, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		Panel panel = new Panel();
		panel.setBounds(53, 111, 10, 10);
		contentPane.add(panel);
		
		Button button = new Button("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(151, 196, 105, 30);
		contentPane.add(button);
	}
}
