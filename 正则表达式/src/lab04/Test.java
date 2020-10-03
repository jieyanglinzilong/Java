package lab04;

import java.awt.EventQueue;
import java.net.URL;
 
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
/**
 * Swing设置窗体背景图片
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
		// 初始化窗体
		frame = new JFrame("有背景图的窗体");
		frame.setBounds(100, 100, 350, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
 
		// 按钮1
		JButton btnNewButton_1 = new JButton("按钮1");
		btnNewButton_1.setBounds(10, 10, 93, 23);
		frame.getContentPane().add(btnNewButton_1);
 
		// 按钮2
		JButton btnNewButton = new JButton("按钮2");
		btnNewButton.setBounds(114, 10, 93, 23);
		frame.getContentPane().add(btnNewButton);
 
		// 设置背景
		JLabel lblBackground = new JLabel(); // 创建一个标签组件对象
		 // 获取背景图片路径
		ImageIcon icon = new ImageIcon(this.getClass().getResource("ballon.jpg"));// 创建背景图片对象
		lblBackground.setIcon(icon); // 设置标签组件要显示的图标
		lblBackground.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight()); // 设置组件的显示位置及大小
		frame.getContentPane().add(lblBackground); // 将组件添加到面板中
	}
 
}