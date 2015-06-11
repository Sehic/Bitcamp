package ba.bitcamp.hajrudin.more.on.program.design;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class VjezbeTask1 {

	public static void main(String[] args) {
			DrawWindow w = new DrawWindow();
			BufferedImage img = new BufferedImage(1200, 800,
			BufferedImage.TYPE_INT_ARGB);
			draw(img);
			draw(img);
			w.setImage(img);
		}

		public static void draw(BufferedImage img) {
			
			Graphics g = img.getGraphics();
			
			
				
			
		}

	}


