import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Bitmap {
    public BufferedImage image;

    public Bitmap(BufferedImage input) {
        this.image = input;
    }

    public void randomize() {
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                int red = (int)(Math.random() * 256);
                int green = (int)(Math.random() * 256);
                int blue = (int)(Math.random() * 256);
                int rando = (red << 16) + (green << 8) + blue;
                this.image.setRGB(w, h, rando);
            }
        }
    }

    public void rotate() {
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {

//                this.image.setRGB(w, h, );
            }
        }
    }

    public void mirrorHorizontal() {
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width / 2; w++) {
                int oppoW = width - w - 1;
                int currRGB = this.image.getRGB(w, h);
                int oppoRGB = this.image.getRGB(oppoW, h);
                this.image.setRGB(w, h, oppoRGB);
                this.image.setRGB(oppoW, h, currRGB);
            }
        }
    }

    public void grayscale() {
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                int rgb = this.image.getRGB(w, h);
                int red = (rgb >> 16) & 0x000000FF;
                int green = (rgb >> 8) & 0x000000FF;
                int blue = (rgb) & 0x000000FF;

                int gray = (red + green + blue) / 3;
                gray = (gray << 16) + (gray << 8) + gray;
                this.image.setRGB(w, h, gray);
            }
        }
    }

    public void deepfry() {
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                int rgb = this.image.getRGB(w, h);
                int red = (rgb >> 16 ) & 0x000000FF;
                int green = (rgb >> 8 ) & 0x000000FF;
                int blue = (rgb) & 0x000000FF;

                int fry = (red + green + blue) / 3;
                fry = (fry * 1_000_000) + (fry * 1_000) + fry;
                this.image.setRGB(w, h, fry);
            }
        }
    }

    public void output(String outputPath) {
        File output = new File(outputPath);
        try {
            ImageIO.write(this.image, "bmp", output);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
