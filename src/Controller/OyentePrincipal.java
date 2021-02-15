
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
public class OyentePrincipal implements ActionListener{
    
    GUIPrincipal guiPrincipal;
    Principal p;
    JButton boton1, boton2, boton3;
    JTextArea jTextArea1;

    public OyentePrincipal(GUIPrincipal guiPrincipal, JButton boton1, JButton boton2, JButton boton3, JTextArea jTextArea1) {
        this.guiPrincipal = guiPrincipal;
        this.boton1 = boton1;
        this.boton2 = boton2;
        this.boton3 = boton3;
        this.jTextArea1 = jTextArea1;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object botonPresionado = ae.getSource();
        if(botonPresionado == boton1){
            p = new Principal();
            jTextArea1.setText(p.toString());
        }
        if(botonPresionado == boton2){
            System.exit(0);
        }
        if(botonPresionado == boton3){
            new GUIRecomendaciones().setVisible(true);
        }
    }
    
}
