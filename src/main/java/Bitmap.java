import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;

public class Bitmap {
    public BufferedImage image;

    public Bitmap(BufferedImage input) {
        this.image = input;
    }

    public void multiplyHue() {
        ColorModel colorModel = this.image.getColorModel();
//        colorModel.
    }

//    public void stuff() {
//        ColorModel colorModel = this.image.getColorModel();
//        WritableRaster writableRaster = this.image.getRaster();
//
//
//
//
//
////        colorModel = new ColorModel();
//        this.image = new BufferedImage(colorModel, writableRaster, true, null);
//    }

    public void deepfry() {
//        BufferedImage newFile = this.image;
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
//                this.image.setRGB(w, h, 0);
                int rgb = this.image.getRGB(w, h);
                int red = (rgb >> 16 ) & 0x000000FF;
                int green = (rgb >> 8 ) & 0x000000FF;
                int blue = (rgb) & 0x000000FF;

                int gray = (red + green + blue) / 3;
                gray = (gray * 1_000_000) + (gray * 1_000) + gray;
                this.image.setRGB(w, h, gray); // 255_255_255 150_150_150
            }
        }
//        this.image = newFile;
    }

    public void output(String outputPath) {
        File output = new File(outputPath);
        try {
            ImageIO.write(this.image, "bmp", output);
        } catch (Exception e) {

        }
    }

}
