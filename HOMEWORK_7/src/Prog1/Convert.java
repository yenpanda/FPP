package Prog1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Convert {
	public static void main(String []args){
		JFrame frame = new JFrame();
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		displayComponent(panel);
		frame.setVisible(true);
	}
	public static void displayComponent(JPanel panel){
		
		panel.setLayout(null);
		
		JLabel labelMile = new JLabel("Mile:");
		labelMile.setBounds(3, 20, 50, 25);
		panel.add(labelMile);
		
		JTextField tfMile = new JTextField();
		tfMile.setBounds(70, 20, 150, 25);
		panel.add(tfMile);
		
		JLabel labelPound = new JLabel("Pound:");
		labelPound.setBounds(3, 50, 50, 25);
		panel.add(labelPound);
		
		JTextField tfPound = new JTextField();
		tfPound.setBounds(70, 50, 150, 25);
		panel.add(tfPound);
		
		JLabel labelGa = new JLabel("Gallon:");
		labelGa.setBounds(3, 80, 50, 25);
		panel.add(labelGa);
		
		JTextField tfGallon = new JTextField();
		tfGallon.setBounds(70, 80, 150, 25);
		panel.add(tfGallon);
		
		JLabel labelFah = new JLabel("Fahrenheit:");
		labelFah.setBounds(3, 110, 70, 25);
		panel.add(labelFah);
		
		JTextField tfFah = new JTextField();
		tfFah.setBounds(70, 110, 150, 25);
		panel.add(tfFah);
		
		JLabel labelKilo = new JLabel("Kilometer:");
		labelKilo.setBounds(250, 20, 90, 25);
		panel.add(labelKilo);
		
		JTextField tfKilo = new JTextField();
		tfKilo.setBounds(350, 20, 150, 25);
		panel.add(tfKilo);
		
		JLabel labelKilom = new JLabel("Kilogram:");
		labelKilom.setBounds(250, 50, 90, 25);
		panel.add(labelKilom);
		
		JTextField tfKilog = new JTextField();
		tfKilog.setBounds(350, 50, 150, 25);
		panel.add(tfKilog);
		
		JLabel labelLit = new JLabel("Liters:");
		labelLit.setBounds(250, 80, 50, 25);
		panel.add(labelLit);
		
		JTextField tfLit = new JTextField();
		tfLit.setBounds(350, 80, 150, 25);
		panel.add(tfLit);
		
		JLabel labelCen = new JLabel("Centrigrate:");
		labelCen.setBounds(250, 110, 90, 25);
		panel.add(labelCen);
		
		JTextField tfCen = new JTextField();
		tfCen.setBounds(350, 110, 150, 25);
		panel.add(tfCen);
		
		JButton btnconvert = new JButton("Convert");
		btnconvert.setBounds(230,180,90,50);
		panel.add(btnconvert);
		
		btnconvert.addActionListener(evt->{
			double mi = Double.parseDouble(tfMile.getText())*1.609;
			double po = Double.parseDouble(tfPound.getText())*0.28;
			double ga = Double.parseDouble(tfGallon.getText())*3.785;
			double fa = Double.parseDouble(tfFah.getText())*-17.22;
			
			tfKilo.setText(String.valueOf(mi));
			tfKilog.setText(String.valueOf(po));
			tfLit.setText(String.valueOf(ga));
			tfCen.setText(String.valueOf(fa));
		});
	}
	
	
}
