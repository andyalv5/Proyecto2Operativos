/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Andy
 */
public class ListaEnlazada {
    public Proceso pFirst;
    public Proceso pLast;
    
     public void DestroyList(){
        this.pFirst = null;
        this.pLast = null;
       
    }
     
    public boolean IsEmpty(){
        return pFirst == null;
    }
    
    public void insert(Proceso newP){
        if(this.IsEmpty()){
            this.pFirst= newP;
            this.pLast=newP;
        }
        else{
            this.pLast.setpNext(newP);
            this.pLast=newP;
        }
    }
    
    public Proceso extract(){
        if(!this.IsEmpty()){
            Proceso temp = this.pFirst;
            this.pFirst= this.pFirst.getpNext();
            return temp;
        }
        return null;
    }
    
}
