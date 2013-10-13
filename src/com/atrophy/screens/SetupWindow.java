package com.atrophy.screens;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.game.main.DesktopLauncher;
import com.io.ReadWriter;

public class SetupWindow extends JFrame {

	private JButton windowed, start;
	private JComboBox<String> resolution;
	private boolean windowedMode;
	private int[] resolutionMode;
	
	
	private final int[] DIMENSIONS = {340,150};

	public SetupWindow(){
		
		windowedMode = true;
		resolutionMode = new int[2];
		resolutionMode[0] = 1280;
		resolutionMode[1] = 720;
		
		// sets up window properties
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(DIMENSIONS[0], DIMENSIONS[1]);
		this.setResizable(false);
		
		// Centralise setup window on current display device
		this.setLocation((int)(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x - DIMENSIONS[0] * 0.5)
						,(int)(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y - DIMENSIONS[1] * 0.5));
		
		// Set window logo to watoydo logo
		this.setTitle("Atrophy Setup");
		
		Image watLogo = null;
		ImageIcon atrophyIcon = null;
		
		try{
			watLogo = ImageIO.read(ReadWriter.getResourceAsInputStream("images/watoydo/watoydoLogo.jpg"));
		}
		catch(IOException ioexcept){
			ioexcept.printStackTrace();
			System.err.println("watoydo window logo not found mods folder likely out of place, terminating");
			System.exit(-1);
		}
		this.setIconImage(watLogo);
		
		
		
		windowed = new JButton("Windowed: True");
		resolution = new JComboBox<>();
		start = new JButton("Start Atrophy");
		
		Container content = this.getContentPane();
		
		BorderLayout grid = new BorderLayout();
		
		content.setLayout(grid);
		
		JPanel buttonsContainer = new JPanel();
		
		content.add(buttonsContainer, BorderLayout.WEST);
		
		content.add(new JLabel(atrophyIcon));
		
		content.setBackground(Color.white);
		
		GridLayout buttonsLayout = new GridLayout(4,1);
		
		buttonsContainer.setLayout(buttonsLayout);
		
		buttonsContainer.add(windowed);

		buttonsContainer.add(resolution);
		
		buttonsContainer.add(start);
		
		resolution.addItem("1280 720");
		resolution.addItem("1280 800");
		resolution.addItem("1366 768");
		resolution.addItem("1600 900");
		resolution.addItem("1920 1080");
		resolution.setSelectedIndex(0);
		
		// Listeners
		windowed.addActionListener(new ChangeWindowed());
		resolution.addActionListener(new ChangeResolution());
		start.addActionListener(new StartGame());
		
		buttonsContainer.setVisible(true);
		this.setVisible(true);
	}
	
	
	private class ChangeWindowed implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			windowedMode = !windowedMode;
			
			if(windowedMode){
				windowed.setText("Windowed: True ");
			}
			else{
				windowed.setText("Windowed: False");
			}
		}
	}
	
	private class ChangeResolution implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			switch((String)resolution.getSelectedItem()){
				case "1280 720":
					resolutionMode = new int[]{1280,720};
				break;
				case "1280 800":
					resolutionMode = new int[]{1280,800};
				break;
				case "1366 768":
					resolutionMode = new int[]{1366,768};
				break;
				case "1600 900":
					resolutionMode = new int[]{1600,900};
				break;
				case "1920 1080":
					resolutionMode = new int[]{1920,1080};
				break;
			}
		}
		
	}
	
	// Happens when start is pressed, applies the graphical settings where needed
	private class StartGame implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			DesktopLauncher.loadGame(SetupWindow.this.resolutionMode[0], SetupWindow.this.resolutionMode[1], windowedMode);
			setVisible(false);
		}
	}
	
}
