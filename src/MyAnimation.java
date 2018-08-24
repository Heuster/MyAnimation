import java.awt.* ;
import java.applet.Applet ;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyAnimation {
	JFrame frame;
	DrawPanel drawPanel;

	private int oneX = 200; // Starting X coordinate
	private int oneY = 200; // Starting Y coordinate
	
	Color SKYBLUE= new Color (135, 206, 235);
	
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
    	frame.setSize(700, 500);
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
			g.fillRect(0, 0, 700, 500);
		//Back Tire
			g.setColor ( Color.black ) ;
	  		g.fillOval ( 70, 360, 50, 50 ) ;
	        g.setColor ( Color.white ) ;
	  		g.fillOval ( 80, 370, 30, 30 ) ;
	  	//Front Tire
	  		g.setColor ( Color.black ) ;
	  		g.fillOval ( 300, 360, 50, 50 ) ;
	        g.setColor ( Color.white ) ;
	  		g.fillOval ( 310, 370, 30, 30 ) ;
	    //Body
	  		g.setColor (SKYBLUE);
	  		g.fillRect(70, 100, 300, 80);
	  		
		}
	}
}


	
