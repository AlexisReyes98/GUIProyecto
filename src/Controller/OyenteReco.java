
package Controller;

import View.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author giova
 */
public class OyenteReco implements ActionListener{
    
    public GUIRecomendaciones guiRecomnendaciones;
    JButton boton1, boton2, boton3;    

    public OyenteReco(GUIRecomendaciones guiRecomnendaciones, JButton boton1, JButton boton2, JButton boton3) {
        this.guiRecomnendaciones = guiRecomnendaciones;
        this.boton1 = boton1;
        this.boton2 = boton2;
        this.boton3 = boton3;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object botonPresionado = ae.getSource();
        if(botonPresionado == boton1){
            
        }
        if(botonPresionado == boton2){
            
        }
        if(botonPresionado == boton3){
            guiRecomnendaciones.setVisible(false);
        }
    }
    
}
