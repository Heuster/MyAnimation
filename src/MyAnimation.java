import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyAnimation {
	JFrame frame;
	DrawPanel drawPanel;

	private int sunX = 300; // Starting X coordinate
	private int sunY = 190; // Starting Y coordinate
	private int carX = 300; // Starting Car X
	private int carY = 380;	// Starting Car Y
	private int roadX = 500;
	private int roadY = 540;
	private int road2X = 0;
	private int road2Y = 540;
	private int counter = 0; 
	
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
    	moveSun();
    	moveRoad();
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
	  		g.fillOval(sunX,sunY, 200, 200);
	  		g.drawOval(sunX,sunY, 200,200);
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
	  		g.fillRect(60, 495, 10, 45);
	  		g.fillRect(110, 495, 10, 45);
	  		g.fillRect(160, 495, 10, 45);
	  		g.fillRect(210, 495, 10, 45);
	  		g.fillRect(260, 495, 10, 45);
	  		g.fillRect(310, 495, 10, 45);
	  		g.fillRect(360, 495, 10, 45);
	  		g.fillRect(410, 495, 10, 45);
	  		g.fillRect(460, 495, 10, 45);
	  		g.fillRect(510, 495, 10, 45);
	  		g.fillRect(560, 495, 10, 45);
	  		g.fillRect(610, 495, 10, 45);
	  		g.fillRect(660, 495, 10, 45);
	  		g.fillRect(710, 495, 10, 45);
	  		g.fillRect(760, 495, 10, 45);
	  		g.fillRect(810, 495, 10, 45);
	  		g.fillRect(860, 495, 10, 45);
	  		g.fillRect(910, 495, 10, 45);
	  		g.fillRect(960, 495, 10, 45);
	  		//Main
	  		g.setColor(Silver);
	  		g.fillRect(0, 500, 1000, 20);
	  		g.setColor(Color.black);
	  		g.drawRect(0, 500, 1000, 20);
	  		//Mid
	  		g.setColor(Color.gray);
	  		g.drawRect(0,510,1000,1);
	  	//Road1
	  		g.setColor(Color.black);
	  		g.fillRect(roadX, roadY,500,35);
	  		g.drawRect(roadX, roadY,500,35);
	  	//Road2
	  		g.setColor(Road);
	  		g.fillRect(road2X, road2Y,500,35);
	  		g.drawRect(road2X, road2Y,500,35);
	  	//Clouds
	  		//g.setColor(Color.black);
	  		//g.drawOval(0, 0, 200, 30);
	  	//Car
	  		ImageIcon i = new ImageIcon("image/Subie.png");
	  		image = i.getImage();	  		
	  		g.drawImage(image, carX, carY, null);
	  	
		}
	}
	//make sun move 1-2 pixels per car x + 5
	private void moveSun() {
		while (true) {
			if(sunX >= 0);{
                right = true;
                left = false;
			}
			if (sunY >=0);{
				up = true;
				down = false;
			}
			if(right){
				sunX++;
			}
			try{
                Thread.sleep(120);//speed 
            } catch (Exception exc){}
            frame.repaint();
		}
	}
	private void moveRoad() {
		while(true) {
			if(roadX >= 0) {
				right = false;
				left = true;	
			}
			if(left){
				roadX--;
			}
			if(roadX == 0){
				counter++;
				road2X = 500;
				road2X--;
			}
			try{
                Thread.sleep(50);//speed 
            } catch (Exception exc){}
            frame.repaint();
		}
	}
}



	
