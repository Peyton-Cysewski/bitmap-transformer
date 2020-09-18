import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Bitmap {
    public BufferedImage image;

    public Bitmap(BufferedImage input) {
        this.image = input;
    }

    public void multiplyHue() {
        ColorModel colorModel = this.image.getColorModel();
    }



}
