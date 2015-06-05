import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class Task5 {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();

		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();

		drawRectangles(6, 5, g);
		w.setImage(img);

	}

	public static void drawRectangles(int n, int m, Graphics g) {
		g.setColor(Color.BLACK);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				g.drawRect(i * 50, j * 50, 50, 50);
			}
		}

	}

}
