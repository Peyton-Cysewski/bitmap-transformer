/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class AppTest {
    @Test public void testCanReadBitmapFile() throws IOException {
        BufferedImage file = ImageIO.read(new File("src/main/resources/mario.bmp"));
//        Bitmap bitmap = new Bitmap(file);
//        assertNotNull("bitmap is not null", bitmap);
    }
}
