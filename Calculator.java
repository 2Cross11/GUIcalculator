import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private JButton bt8;

	double firstNum;
	double secondNum;
	String oper;
	double answer;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100,278,380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(28, 28, 156,50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btback = new JButton("<");
		btback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backspace=null;
				if(textField.getText().length()>0) {
					StringBuilder sb=new StringBuilder(textField.getText());
					sb.deleteCharAt(textField.getText().length()-1);
					backspace=sb.toString();
					textField.setText(backspace);
				}
			}
		});
		btback.setBounds(184,28,50,50);
		frame.getContentPane().add(btback);
		
		JButton bt7 = new JButton("7");
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Display=textField.getText()+bt7.getText();
				textField.setText(Display);
			}
		});
		bt7.setBounds(28, 80, 50, 50);
		frame.getContentPane().add(bt7);
		
		bt8 = new JButton("8");
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Display=textField.getText()+bt8.getText();
				textField.setText(Display);
			}
		});
		bt8.setBounds(80, 80, 50, 50);
		frame.getContentPane().add(bt8);
		
		JButton bt9 = new JButton("9");
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Display=textField.getText()+bt9.getText();
				textField.setText(Display);
			}
		});
		bt9.setBounds(132, 80, 50, 50);
		frame.getContentPane().add(bt9);
		
		JButton btclear = new JButton("C");
		btclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btclear.setBounds(184, 80, 50, 50);
		frame.getContentPane().add(btclear);
		
		JButton bt4 = new JButton("4");
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Display=textField.getText()+bt4.getText();
				textField.setText(Display);
			}
		});
		bt4.setBounds(28, 132, 50, 50);
		frame.getContentPane().add(bt4);
		
		JButton bt5 = new JButton("5");
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Display=textField.getText()+bt5.getText();
				textField.setText(Display);
			}
		});
		bt5.setBounds(80, 132, 50, 50);
		frame.getContentPane().add(bt5);
		
		JButton bt6 = new JButton("6");
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Display=textField.getText()+bt6.getText();
				textField.setText(Display);
			}
		});
		bt6.setBounds(132, 132, 50, 50);
		frame.getContentPane().add(bt6);
		
		JButton btplus = new JButton("+");
		btplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstNum=Double.parseDouble(textField.getText());
				textField.setText("");
				oper="+";
			}
		});
		btplus.setBounds(184, 132, 50, 50);
		frame.getContentPane().add(btplus);
		
		JButton bt1 = new JButton("1");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Display=textField.getText()+bt1.getText();
				textField.setText(Display);
			}
			
		});
		bt1.setBounds(28, 184, 50, 50);
		frame.getContentPane().add(bt1);
		
		JButton bt2 = new JButton("2");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Display=textField.getText()+bt2.getText();
				textField.setText(Display);
			}
		});
		bt2.setBounds(80, 184, 50, 50);
		frame.getContentPane().add(bt2);
		
		JButton bt3 = new JButton("3");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Display=textField.getText()+bt3.getText();
				textField.setText(Display);
			}
		});
		bt3.setBounds(132, 184, 50, 50);
		frame.getContentPane().add(bt3);
		
		JButton btminus = new JButton("-");
		btminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstNum=Double.parseDouble(textField.getText());
				textField.setText("");
				oper="-";
			}
		});
		btminus.setBounds(184, 184, 50, 50);
		frame.getContentPane().add(btminus);
		
		JButton btmulti = new JButton("*");
		btmulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstNum=Double.parseDouble(textField.getText());
				textField.setText("");
				oper="*";
			}
		});
		btmulti.setBounds(28, 236, 50, 50);
		frame.getContentPane().add(btmulti);
		
		JButton bt0 = new JButton("0");
		bt0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Display=textField.getText()+bt0.getText();
				textField.setText(Display);
			}
		});
		bt0.setBounds(80, 236, 50, 50);
		frame.getContentPane().add(bt0);
		
		JButton btdiv = new JButton("/");
		btdiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstNum=Double.parseDouble(textField.getText());
				textField.setText("");
				oper="/";
			}
		});
		btdiv.setBounds(132, 236, 50, 50);
		frame.getContentPane().add(btdiv);
		
		JButton bteq = new JButton("=");
		bteq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				secondNum=Double.parseDouble(textField.getText());
				if(oper=="+") {
					answer=firstNum+secondNum;
				}
				else if(oper=="-") {
					answer=firstNum-secondNum;
				}
				else if(oper=="*") {
					answer=firstNum*secondNum;
				}
				else if(oper=="/") {
					answer=firstNum/secondNum;
				}
				String result=String.format("%.2f",answer);
				textField.setText(result);
			}
		});
		bteq.setBounds(184, 236, 50, 50);
		frame.getContentPane().add(bteq);
	}
}
