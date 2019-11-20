/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg8_3;

import java.util.Scanner;

/**
 *
 * @author DANIELCASTELAO\vmontestovar
 */
public class Calendario {
    
    Scanner teclado=new Scanner (System.in);
    
    public Calendario(){
    }
    public String calculo (){
        System.out.println("Escrime un número correspondiete a un mes:");
        int mes=teclado.nextInt();
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
            return ("El mes tiene 30 dias");
        else if (mes == 2)
            return ("El mes tiene 28 dias");
        else return ("El mes tiene 31 dias");
    }
    
}
    

