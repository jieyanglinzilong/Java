package lab04;

import java.awt.EventQueue;
import java.net.URL;
 
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
/**
 * Swing���ô��屳��ͼƬ
 * 
 * @author pan_junbiao
 *
 */
public class Test
{
 
	private JFrame frame;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Test window = new Test();
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
 
	/**
	 * Create the application.
	 */
	public Test()
	{
		initialize();
	}
 
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		// ��ʼ������
		frame = new JFrame("�б���ͼ�Ĵ���");
		frame.setBounds(100, 100, 350, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
 
		// ��ť1
		JButton btnNewButton_1 = new JButton("��ť1");
		btnNewButton_1.setBounds(10, 10, 93, 23);
		frame.getContentPane().add(btnNewButton_1);
 
		// ��ť2
		JButton btnNewButton = new JButton("��ť2");
		btnNewButton.setBounds(114, 10, 93, 23);
		frame.getContentPane().add(btnNewButton);
 
		// ���ñ���
		JLabel lblBackground = new JLabel(); // ����һ����ǩ�������
		 // ��ȡ����ͼƬ·��
		ImageIcon icon = new ImageIcon(this.getClass().getResource("ballon.jpg"));// ��������ͼƬ����
		lblBackground.setIcon(icon); // ���ñ�ǩ���Ҫ��ʾ��ͼ��
		lblBackground.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight()); // �����������ʾλ�ü���С
		frame.getContentPane().add(lblBackground); // �������ӵ������
	}
 
}