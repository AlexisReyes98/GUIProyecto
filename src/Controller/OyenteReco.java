
package Controller;

import View.*;
import Model.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author giova
 */
public class OyenteReco implements ActionListener{
    
    public GUIRecomendaciones guiRecomnendaciones;
    Recomendaciones r;
    JButton boton1, boton2, boton3;
    JTextArea jTextArea1;

    public OyenteReco(GUIRecomendaciones guiRecomnendaciones, JButton boton1, JButton boton2, JButton boton3, JTextArea jTextArea1) {
        this.guiRecomnendaciones = guiRecomnendaciones;
        this.boton1 = boton1;
        this.boton2 = boton2;
        this.boton3 = boton3;
        this.jTextArea1 = jTextArea1;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object botonPresionado = ae.getSource();
        if(botonPresionado == boton1){
            
        }
        if(botonPresionado == boton2){
            r = new Recomendaciones();
            jTextArea1.setText(r.toString());
        }
        if(botonPresionado == boton3){
            guiRecomnendaciones.setVisible(false);
        }
    }
    
}
