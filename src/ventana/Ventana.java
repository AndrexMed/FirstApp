/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventana;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author giova
 */
public class Ventana extends JFrame {

    public Ventana() {
        setSize(500, 500); //Establecemos tamaño de la ventana    
        setTitle("Mi primer App");
        //setLocation(250,100); //Establecemos la posicion inicial de la ventana
        //setBounds(250,100,500,500); //Englobamos size y location.
        setLocationRelativeTo(null); // Establecemos la ventana en el centro de la pantalla.
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //this.getContentPane().setBackground(Color.CYAN); // Establecemos color de fondo
    }
    private void iniciarComponentes(){
        JPanel panel = new JPanel(); // Creacion del panel
        panel.setBackground(Color.CYAN); // Color del panel
        panel.setLayout(null); // Desactivamos el diseño por defecto
        this.getContentPane().add(panel); //Agregamos el panel a la ventana
        
        JLabel etiqueta = new JLabel(); // Creamos la etiqueta
        etiqueta.setText("Mi Primer Aplicacion");
        etiqueta.setBounds(170, 10, 150, 30);
        etiqueta.setForeground(Color.red);; // Agregamos color ala letra
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.green);// Autorizamos poder cambiar color de fondo de la etiqueta
        panel.add(etiqueta);
    }
}
