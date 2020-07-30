
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * We call this class to load our spreadsheet
 * 
 * MAKE SURE YOU RIGHT CLICK ON YOUR PROJECT AND GO TO PROPERTIES
 * THEN JAVA BUILD PATH > cLASSPATH > ADD CLASS FOLDER > RES
 * @author Kevin
 *
 */
public class BufferedImageLoader {

	BufferedImage image;
	
	public BufferedImage loadImage(String path) {
		try {
			image = ImageIO.read(getClass().getResource(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return image;
	}
	
}