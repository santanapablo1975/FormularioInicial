/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularioinicial;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author Pc12
 */
public class FormularioInicial extends JFrame {  //aca metemos la herencia

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //clase que tenga herencia de java form
        
        ///ahora tipo protected!!! la clase java form, los botones y todo eso!
        
        JFrame form=new JFrame(); // crear el formulario
        form.setSize(200, 200);   //formulario tamaño inicial
        
        //crear panel
        
        JPanel panel = new JPanel();
        
        //añadir imagenes
        for (int i = 10; i < 15; i++) {
            JLabel imagen = new JLabel(new ImageIcon("C:\\Users\\Pc12\\Pictures\\Base de imagenes\\Captura.PNG"));
            panel.add(imagen);
            
        }
        
        //anadir panel al formulario
        form.add(panel);
        //visible fromulario
        form.setVisible(true);
        
        
        
//        
//        
//        //añadir boton
//        JButton boton = new JButton();
//        
//        //asignar text al boton
//        boton.setText("clickme");
//        boton.setAlignmentX(50);
//        boton.setAlignmentY(500);
////        boton.setBounds(100,100,2000,1200); 
//        
//        //meter el boton al panel
//        panel.add(boton);
//        
//        //meter el panel en el formulario
//        form.add(panel);
//        
//        //visible fromulario
//        form.setVisible(true);
        
        
        
        
        
        
        
        
        
    }
    
}
