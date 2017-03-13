package Prog1;


import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.*;

import javax.swing.*;

public class Swing{
	public static void main(String []args){
		JFrame frame = new JFrame();
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		displayComponent(panel);
		frame.setVisible(true);
	}
	public static void displayComponent(JPanel panel){
		
		panel.setLayout(null);
		
		JButton btnCount = new JButton("Count Letters");
		btnCount.setBounds(10, 20, 150, 25);
		panel.add(btnCount);
		
		JButton btnReverse = new JButton("Reverse Letters");
		btnReverse.setBounds(10, 50, 150, 25);
		panel.add(btnReverse);
		
		JButton btnRemove = new JButton("Remove Duplicates");
		btnRemove.setBounds(10, 80, 150, 25);
		panel.add(btnRemove);
		
		
		JLabel labelInput = new JLabel("Input");
		labelInput.setBounds(170, 20, 80, 25);
		panel.add(labelInput);
		
		JTextField tfInput = new JTextField();
		tfInput.setBounds(170, 40, 80, 25);
		panel.add(tfInput);
		
		JLabel labelOutput = new JLabel("Output");
		labelOutput.setBounds(170, 60, 80, 25);
		panel.add(labelOutput);
		
		JTextField tfOutput = new JTextField();
		tfOutput.setBounds(170, 80, 80, 25);
		panel.add(tfOutput);
		
		
		//@Override
		btnCount.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String a = tfInput.getText();
				String out = String.valueOf(a.length());
				tfOutput.setText(out);
				System.out.println(a.length());		
			}
			
		});
		btnReverse.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String a = tfInput.getText();
				String result = "";
				for(int i = a.length() -1; i >=0 ; i--){
					result += a.substring(i,i+1);
				}
				tfOutput.setText(result);
			}
			
		});
		
		btnRemove.addActionListener(evt->{
			String input = tfInput.getText();
			String update = ""+ input.charAt(0);
			for(int i= 0; i < input.length() ; i++)
		    {
		    	int j = 0;
		    	for( ; j < update.length(); j++)
		    	{
		    		if(input.charAt(i) == update.charAt(j))
		    			break;
		    	}
		    	if(j == update.length() ){
		    		update += input.charAt(i);
		    	}
		    }	
			tfOutput.setText(update);
			System.out.println(update);
			
		});
	}
	
}
