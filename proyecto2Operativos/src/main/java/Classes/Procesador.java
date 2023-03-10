/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import com.mycompany.proyecto2operativos.Proyecto2Operativos;

/**
 *
 * @author Andy
 */
public class Procesador {
    int ci = 27;
    Proceso serieA;
    Proceso serieB;
    
    public Procesador(Proceso serieA,Proceso serieB){
        this.serieA= serieA;
        this.serieB=serieB;
    }
    
    public void Desicion(){
        float numero = (float) Math.random();
        float numero2 = (float) Math.random();
        if (numero<0.4){
            if(numero2<0.50){
                System.out.print("se selecciono"+ serieA.getElement());
            }
            else{
                System.out.print("se selecciono"+ serieB.getElement());
            }
        }
        else if(numero<0.67 && numero >=0.4){
            int priA=serieA.getPrioridad();
            int priB=serieB.getPrioridad();
            this.encolar(serieA, priA);
            this.encolar(serieB, priB);
        }
        else{
            Proyecto2Operativos.refuerzo.insert(serieA);
            Proyecto2Operativos.refuerzo.insert(serieB);
        }
        
    }
    public void encolar(Proceso serie,int priority){
        if (priority==1){
            Proyecto2Operativos.nivel1.insert(serie);
        }
        else if(priority==2){
            Proyecto2Operativos.nivel2.insert(serie);
        }
        else{
            Proyecto2Operativos.nivel3.insert(serie);
        }
    }
}
