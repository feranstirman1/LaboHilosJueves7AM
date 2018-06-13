/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guardado.threads;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author uca
 */
public class Verificacion extends Thread {
    private JButton inicio, reinicio;
    private JLabel verificacion[];

    public Verificacion(JButton inicio, JButton reinicio, JLabel canguro, JLabel colibri, JLabel dragon) {
        this.inicio = inicio;
        this.reinicio = reinicio;
        this.verificacion = new JLabel[]{canguro, colibri, dragon};
    } 
    
    @Override
    public void run()
    {
        System.out.println("Hago algo");
     while((verificacion[0].getX() != 515) || (verificacion[2].getX() != 515) || (verificacion[1].getX() != 515))
     {
         System.out.println("Hago algo * 2");
        if((verificacion[0].getX() == 510) && (verificacion[2].getX() == 510) && (verificacion[1].getX() == 510) ){
            reinicio.setVisible(true);
            System.out.println("Hago algo *3");
            return;
        }
        try {
            sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       
     }   
    }

 
}
