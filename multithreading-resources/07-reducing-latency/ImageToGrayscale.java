import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class ImageToGrayscale {

    public static void main(String[] args) throws Exception {
        File inputFile = new File("beach.png"); // Input file
        File outputFile = new File("beach_grayscale.png"); // Output file

        try {
            BufferedImage image = ImageIO.read(inputFile);
            long startTime=System.currentTimeMillis();
            convertToGrayscale(image,4);
            long endTime=System.currentTimeMillis();
            long elapsedTime=endTime-startTime;
            System.out.println("Time: "+elapsedTime+" miliseconds");


            ImageIO.write(image, "png", outputFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    // private static void convertToGrayscaleConcurrently(BufferedImage image, int numberOfThreads) throws InterruptedException {


        
    // }


    private static void convertToGrayscale(BufferedImage image,int numberOfThreads) {
        int threadHight=image.getHeight()/numberOfThreads;
        ImageToGrayscaleThread[]threads=new ImageToGrayscaleThread[numberOfThreads];
        for (int i=0;i<numberOfThreads;i++){
            int startY=i*threadHight;
            int endY=startY+threadHight;
            threads[i]=new ImageToGrayscaleThread(image, startY, endY);
            threads[i].start();
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
       
    }
}
