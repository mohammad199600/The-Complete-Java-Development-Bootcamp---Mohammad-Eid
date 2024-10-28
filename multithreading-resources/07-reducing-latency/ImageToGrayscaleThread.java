import java.awt.image.BufferedImage;
import java.awt.Color;

public class ImageToGrayscaleThread extends Thread {
    private BufferedImage image;
    int startY;
    int endY;

    public ImageToGrayscaleThread(BufferedImage image, int startY, int endY) {
        this.image = image;
        this.startY = startY;
        this.endY = endY;
    }
@Override
public void run() {
     for (int y = startY; y < endY; y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                int rgb = image.getRGB(x, y);
                Color color = new Color(rgb, true);
    
                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();
                
                // Compute the average of red, green, and blue (simple grayscale)
                int gray = (red + green + blue) / 3;
                
                // Create new grayscale color
                Color grayColor = new Color(gray, gray, gray, color.getAlpha());
                image.setRGB(x, y, grayColor.getRGB());
            }
        }
}

    
}
