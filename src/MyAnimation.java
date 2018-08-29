import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyAnimation {
	JFrame frame;
	DrawPanel drawPanel;

	//private int oneX = 200; // Starting X coordinate
	//private int oneY = 200; // Starting Y coordinate
	
	Color Silver = new Color (192,192,192);
	Color Road = new Color (105,105,105);
	Color Ocean = new Color(29,162,216);
	Color Sun = new Color(253, 184, 19);
	Color Sky = new Color(255,140,0);
	Image image;
	
	boolean up = false;
	boolean down = true;
	boolean left = false;
	boolean right = true;

	public static void main(String[] args) {
		new MyAnimation().go();
	}

	private void go() {
		frame = new JFrame("Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new DrawPanel();
    	frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
    	frame.setVisible(true);
    	frame.setResizable(false);
    	frame.setSize(1000, 600);
    	frame.setLocation(375, 55);
}

	class DrawPanel extends JPanel {
	/**
	 * 
	 */
		private static final long serialVersionUID = -3030379568821478211L;
	
		public void paintComponent(Graphics g) {
        //Inside Color
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, 1000, 600);
		//Sky
			g.setColor(Sky);
			g.fillRect(0, 0, 1000, 400);
			g.drawRect(0, 0, 1000, 400);
		//Sun
	  		g.setColor(Sun);
	  		g.fillOval(300,190, 200, 200);
	  		g.drawOval(300,190,200,200);
		//Ocean
	  		g.setColor(Ocean);
	  		g.fillRect(0, 340, 1000, 200);
	  		g.drawRect(0, 340, 1000, 200);
	  		g.setColor(Sun);
	  		g.fillOval(300, 350, 200, 40);
	  		g.drawOval(300, 350, 200, 40);
	  		//g.setColor(Color.black);
	  		//g.drawOval(300, 320, 200, 50);
		//Guard Rail
			//Pillars
			g.setColor(Silver);
	  		g.fillRect(10, 495, 10, 45);
	  		g.fillRect(50, 495, 10, 45);
	  		g.fillRect(100, 495, 10, 45);
	  		g.fillRect(150, 495, 10, 45);
	  		g.fillRect(200, 495, 10, 45);
	  		g.fillRect(250, 495, 10, 45);
	  		g.fillRect(300, 495, 10, 45);
	  		g.fillRect(350, 495, 10, 45);
	  		g.fillRect(400, 495, 10, 45);
	  		g.fillRect(450, 495, 10, 45);
	  		g.fillRect(500, 495, 10, 45);
	  		g.fillRect(550, 495, 10, 45);
	  		g.fillRect(600, 495, 10, 45);
	  		g.fillRect(650, 495, 10, 45);
	  		g.fillRect(700, 495, 10, 45);
	  		g.fillRect(750, 495, 10, 45);
	  		g.fillRect(800, 495, 10, 45);
	  		g.fillRect(850, 495, 10, 45);
	  		g.fillRect(900, 495, 10, 45);
	  		g.fillRect(950, 495, 10, 45);
	  		//Main
	  		g.setColor(Silver);
	  		g.fillRect(0, 500, 1000, 20);
	  		g.setColor(Color.black);
	  		//Mid
	  		g.drawRect(0, 500, 1000, 20);
	  		g.setColor(Color.gray);
	  		g.drawRect(0,510,1000,1);
	  	//Road
	  		g.setColor(Road);
	  		g.fillRect(0, 540,1000,35);
	  		g.drawRect(0, 540,1000,35);
	  	
	  	//Car
	  		ImageIcon i = new ImageIcon("image/Subie.png");
	  		image = i.getImage();	  		
	  		g.drawImage(image, 300, 380, null);
	  	
		}
	}
}


	
