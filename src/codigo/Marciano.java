package codigo;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Daniel Hebrero Núñez
 */
public class Marciano {

    public Image imagen1, imagen2 = null;
    public int x = 0;
    public int y = 0;
    private int vX = 1;

    public Marciano() {
        try {
            //imagen1 = ImageIO.read(getClass().getResource("/imagenes/marcianito1.png"));
            imagen1 = ImageIO.read(getClass().getResource("/imagenes/karela.png"));
            //imagen2 = ImageIO.read(getClass().getResource("/imagenes/marcianito2.png"));
            imagen2 = ImageIO.read(getClass().getResource("/imagenes/karelb.png"));
        } catch (IOException ex) {

        }
    }

    public void mueve(boolean direccionMarciano) {
        if (direccionMarciano) {
            if (x<VentanaJuego.ANCHOPANTALLA - imagen1.getWidth(null)){
                x += vX;
            }
        } 
        else {
            if (x > 0){
                x -= vX;
            }    
        } 
    }

//    public void setvX(int vX) {
//        this.vX = vX;
//    }
//
//    public int getvX() {
//        return vX;
//    }
}
