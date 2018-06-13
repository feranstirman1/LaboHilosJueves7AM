package com.guardado.threads;

import javax.swing.*;

public class AnimalThread extends Thread {
    private String nombre;
    private int limite;
    private JLabel animal;
    private int x;
    private int y;

    public AnimalThread(){}

    public AnimalThread(String nombre, int x, int y, int limite, JLabel animal) {
        this.nombre = nombre;
        this.x = x;
        this.y= y;
        this.limite = limite;
        this.animal = animal;

        
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    

    @Override
    public void run()
    {
        
        if(this.x<=this.limite){
            for (int i=x ; i<=this.limite ; i+=10)
            {
                System.out.println(this.nombre + " avanza");
                this.animal.setLocation(i,y);
                try {
                    if(this.nombre == "colibri"){
                        sleep(150);
                    }
                    else{
                        sleep(100);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(this.nombre + " a llegado a la meta");
        }else{
            for (int i=this.x ; i>=this.limite ; i-=10)
            {
                System.out.println(this.nombre + " regresa");
                this.animal.setLocation(i,y);
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(this.nombre + " a regresado a la salida");

        }
        yield();
    }
}
