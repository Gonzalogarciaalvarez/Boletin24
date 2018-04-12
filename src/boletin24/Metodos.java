/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin24;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ggarciaalvarez
 */
public class Metodos extends JFrame implements ActionListener {
    Graphics g;
    JFrame marco;
    JPanel panel;
    JButton dibujar, limpiar;
    JTextField txt;
    
    public Metodos(){
        marco = new JFrame("Boletin 24");
        panel = new JPanel();
        dibujar = new JButton("Dibuja");
        limpiar = new JButton("Limpia");
        txt = new JTextField(String.valueOf(0), 20);

        marco.setSize(700,200);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        dibujar.addActionListener(this);
        limpiar.addActionListener(this);
        panel.add(txt);
        panel.add(dibujar);
        panel.add(limpiar);
        marco.add(panel);
        marco.setVisible(true);
    }
    public void paint(Graphics g) {
        int x = 0;
        int y = 100;
        for (int i = 0; i < Integer.parseInt(txt.getText()); i++) {

            x = x+23;
            g.setColor(Color.RED);
            g.drawOval(x,y, 20, 20);
}
    }
    

    public void actionPerformed(ActionEvent e) {

        Object boton = e.getSource();

        if (boton.equals(dibujar)) {

            paint(panel.getGraphics());

        } else if (boton.equals(limpiar)) {
            txt.setText(null);
            
            panel.repaint();
        }

}
}
