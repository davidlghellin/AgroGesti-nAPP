package gui;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

/**
 *
 * @author  David López González
 */
public class FondoDesktop implements Border
{

    /**
     * Variable deonde almacenaremos la imagen del fondo 
     */
    private BufferedImage back;

    public FondoDesktop()
    {
        try
        {
            URL imagePath = new URL(getClass().getResource("/recursos/minimalista01.jpg").toString());   ////Ruta a la imágen
            back = ImageIO.read(imagePath);
        } catch (Exception ex)
        {
        }
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height)
    {
        g.drawImage(back, (x + (width - back.getWidth()) / 2), (y + (height - back.getHeight()) / 2), null);
    }

    @Override
    public Insets getBorderInsets(Component c)
    {
        return new Insets(0, 0, 0, 0);
    }

    @Override
    public boolean isBorderOpaque()
    {
        return false;
    }

}
