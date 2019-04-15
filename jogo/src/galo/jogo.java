package galo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class jogo extends JFrame {
	
	private static final long serialVersionUID = 1L;
	public String x;
	private JToggleButton [] b = new  JToggleButton [9];
	private engine eng;
	
	public jogo(String x){
		super("Jogo do galo");
		
		eng = new engine(x);
		
		this.x=x;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		
		Container content = getContentPane();
		content.setLayout(new GridLayout(3, 3));
	
		for (int i=0; i<9; i++){
			b[i] = new JToggleButton("");	
			b[i].setFont(new Font("BOLD", Font.BOLD, 55));
			content.add(b[i]);
		}
		
		b[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				b[0].setText(eng.getJogada());
				eng.set(0, eng.getJogada());
				eng.turn();
				winner();
				b[0].setEnabled(false);
				
		}
	});
		
		b[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b[1].setText(eng.getJogada());
				eng.set(1, eng.getJogada());
				eng.turn();
				winner();
				b[1].setEnabled(false);
		}
	});
		
		b[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b[2].setText(eng.getJogada());
				eng.set(2, eng.getJogada());
				eng.turn();
				winner();
				b[2].setEnabled(false);
		}
	});
		
		b[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b[3].setText(eng.getJogada());
				eng.set(3, eng.getJogada());
				eng.turn();
				winner();
				b[3].setEnabled(false);
		}
	});
		
		b[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b[4].setText(eng.getJogada());
				eng.set(4, eng.getJogada());
				eng.turn();
				winner();
				b[4].setEnabled(false);
		}
	});

		b[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b[5].setText(eng.getJogada());
				eng.set(5, eng.getJogada());
				eng.turn();
				winner();
				b[5].setEnabled(false);
		}
	});
		
		b[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b[6].setText(eng.getJogada());
				eng.set(6, eng.getJogada());
				eng.turn();
				winner();
				b[6].setEnabled(false);
		}
	});
		
		
		b[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b[7].setText(eng.getJogada());
				eng.set(7, eng.getJogada());
				eng.turn();
				winner();
				b[7].setEnabled(false);
		}
	});
		
		
		b[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b[8].setText(eng.getJogada());
				eng.set(8, eng.getJogada());
				eng.turn();
				winner();
				b[8].setEnabled(false);
		}
	});
		
		setVisible(true);
		
		
	}
	
	public void winner(){
		if(!eng.check_winner().equals("N")){
			String t="";
			if(eng.check_winner().equals("E")){
				 t = "Sem vencedor";
				
			}else{
				t = "vencedor é: " + eng.check_winner();
				
			}
			JOptionPane.showMessageDialog(getContentPane(), t);
			System.exit(1);
		}
	}
}
