/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto2operativos;

import Classes.Formulas;
import Classes.ListaEnlazada;
import Classes.Proceso;

/**
 *
 * @author Andy
 */
public class Proyecto2Operativos {
    
    public static ListaEnlazada nivel1 = new ListaEnlazada();
    public static ListaEnlazada nivel2 = new ListaEnlazada();
    public static ListaEnlazada nivel3 = new ListaEnlazada();
    public static ListaEnlazada refuerzo = new ListaEnlazada();
    
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        
             
             
        
        
        Formulas f =new Formulas();
        Proceso pro1= new Proceso(f.idUnico(), 90);
        Proceso pro2= new Proceso(f.idUnico(),70 );
        Proceso pro3= new Proceso(f.idUnico(),80 );
        
       
        lista.insert(pro1);
        lista.insert(pro2);
        lista.insert(pro3);
        Proceso el=lista.extract();
        System.out.print(el.getElement() +"+"+ el.getDuracion());
        System.out.print("\n");
        Proceso el2=lista.extract();
        System.out.print(el2.getElement()+"+"+ el2.getDuracion());
        System.out.print("\n");
        Proceso el3=lista.extract();
        System.out.print(el3.getElement()+"+"+ el3.getDuracion());
        System.out.print("\n");
                    
        
        
        
    }
}
