package lab02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class policelisten implements ActionListener, ItemListener {
	private JTextField text2;
	private JTextField text1;
	JButton button;
	JTextArea show;
	JComboBox comboBox ;
	String number1=new String();
	double number2;
	double number3;
	
	public void setText2(JTextField text2) {
		this.text2 = text2;
	}
	public void setBOX(JComboBox comboBox ) {
		this.comboBox = comboBox;
	}

	public void setText1(JTextField text1) {
		this.text1 = text1;
	}

	public void setButton(JButton button) {
		this.button = button;
	}
	public void setshow(JTextArea show) {
		this.show = show;
	}

	public void itemStateChanged(ItemEvent arg0) {
	  number1=comboBox.getSelectedItem().toString();
	   
		
		
		// TODO Auto-generated method stub

	}

	public void actionPerformed(ActionEvent arg0) {
		 //String a1=text1.getText().trim();
		 //String b=text2.getText().trim();
		 double number2=Double.parseDouble(text1.getText());
		 double number3=Double.parseDouble(text2.getText());
			try{double a=0;
			if(number1.equals("*")){
				 a=number3*number2;
			
				
			}
			if(number1.equals("+")){
				a=number3+number2;
				
				
			}
			if(number1.equals("-")){
				a=number2-number3;
				
				
			}
			if(number1.equals("/")){
				a=number2/number3;
				
				
			}
			show.append(number2+" "+number1+" "+number3+" = "+a+"\n");
			
		
		}catch(Exception e){
			e.printStackTrace();
			
		}// TODO Auto-generated method stub

	}
	

	}
