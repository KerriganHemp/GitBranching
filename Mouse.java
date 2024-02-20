import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Mouse {
	private static final int BODY_LENGTH = 90;
	private static final int BODY_HEIGHT = 50;
	private static final int TAIL_LENGTH = 80;
	private static final int EYE_SIZE = 10;
	public void draw(Graphics g, int mouseX, int mouseY)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.gray);
		g2.fillOval(mouseX, mouseY, BODY_LENGTH, BODY_HEIGHT);
		int x = mouseX + BODY_LENGTH;
		int y = mouseY + BODY_HEIGHT/2;
		int x2 = x + TAIL_LENGTH;
		g2.drawLine(x, y, x2, y);
		// text appears below mouse body, +10 places below 
		// so it doesn't overlap the drawing
		g2.drawString("EEEK", mouseX, mouseY+BODY_HEIGHT+10);
		// add eye to mouse
		g2.setColor(Color.black);
		g2.fillOval(115, 210, EYE_SIZE, EYE_SIZE);
		
	}
}