package Prog2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Prog2{

	public static void displayComponent(Frame frame){
		
		
		JButton btnRed = new JButton();
		btnRed.setBackground(Color.RED);
		btnRed.setPreferredSize(new Dimension(70, 90));
		
		JButton btnOrange = new JButton();
		btnOrange.setBackground(Color.ORANGE);
		btnOrange.setPreferredSize(new Dimension(70, 90));
		
		JButton btnGreen = new JButton();
		btnGreen.setBackground(Color.GREEN);
		btnGreen.setPreferredSize(new Dimension(70, 90));
		
		JButton btnBlue = new JButton();
		btnBlue.setBackground(Color.BLUE);
		btnBlue.setPreferredSize(new Dimension(70, 90));
		
		JButton btnYellow = new JButton();
		btnYellow.setBackground(Color.YELLOW);
		btnYellow.setPreferredSize(new Dimension(70, 90));
		
		JButton btnPink = new JButton();
		btnPink.setBackground(Color.PINK);
		btnPink.setPreferredSize(new Dimension(70, 90));
		
		JButton btnPurple = new JButton();
		btnPurple.setBackground(Color.DARK_GRAY);
		btnPurple.setPreferredSize(new Dimension(70, 90));
		
		frame.add(btnRed);
		frame.add(btnOrange);
		frame.add(btnGreen);
		frame.add(btnBlue);
		frame.add(btnYellow);
		frame.add(btnPink);
		frame.add(btnPurple);
		
		btnRed.addActionListener(evt->{
				JOptionPane.showMessageDialog(null, "Red signifies passion, vitality, enthusiasm and security");
			});
		btnOrange.addActionListener(evt->{
			JOptionPane.showMessageDialog(null, "Orange signifies passion, vitality, enthusiasm and security");
		});
		btnGreen.addActionListener(evt->{
			JOptionPane.showMessageDialog(null, "Green signifies passion, vitality, enthusiasm and security");
		});
		btnBlue.addActionListener(evt->{
			JOptionPane.showMessageDialog(null, "Blue signifies passion, vitality, enthusiasm and security");
		});
		btnYellow.addActionListener(evt->{
			JOptionPane.showMessageDialog(null, "Yellow signifies passion, vitality, enthusiasm and security");
		});
		btnPink.addActionListener(evt->{
			JOptionPane.showMessageDialog(null, "Pink signifies passion, vitality, enthusiasm and security");
		});
		btnPurple.addActionListener(evt->{
			JOptionPane.showMessageDialog(null, "Purpel signifies passion, vitality, enthusiasm and security");
		});
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		frame.setSize(600, 150);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	
		displayComponent(frame);
		frame.setVisible(true);

	}
	
	

}
