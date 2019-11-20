/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg8_2;

import java.util.Scanner;

/**
 *
 * @author DANIELCASTELAO\vmontestovar
 */
public class Periodico {
    private double artigo;
    private int ventas;
    Scanner sc=new Scanner(System.in);
    
    public Periodico(){
}
    public Periodico(double art, int vent){
        artigo=art;
        ventas=vent;
        
}
    public void setPrecio(Scanner sc){
        System.out.println("Precio do artigo");
        artigo=sc.nextFloat();
    }
    public void setVendidas(Scanner sc){
        System.out.println("Numero de unidades");
        ventas=sc.nextInt();
    }
    public double getPrecio(){
        return artigo;
    }
    public int getVendidas(){
        return ventas;
    }
    public double Operaciones(int cant,float cost){
       int descuento;
       float total=cant*cost;
        if(ventas<100)
        System.out.println("o prezo final sera"+artigo*ventas);
        else
        if(ventas<=200)
            if (cost>4000F)
                descuento=5;
            else descuento=2;
        }
        else {
            if (ventas>4000F)
                descuento=10;
            else descuento=8;
        }     

    
    
    
}
        
    
}
