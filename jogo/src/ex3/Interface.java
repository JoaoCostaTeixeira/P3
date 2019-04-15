package ex3;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.accessibility.Accessible;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.filechooser.FileNameExtensionFilter;

import galo.engine;

public class Interface extends JFrame{

	private static final long serialVersionUID = 1L;
	public String x;
	private Button open, close;
	private engine eng;
	
	
	public Interface(byte[] pixels, int w, int h){
	
		JFrame content = new JFrame("chose");
		content.setSize(600, 400);
		
		PanelImage ima = new PanelImage(pixels, w, h);
		
		open = new Button("open");	
		
		
		close = new Button("close");
	
		content.setContentPane(ima);
		
		
		
		
		
		content.setVisible(true);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


