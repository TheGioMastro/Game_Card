/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;

import java.util.ArrayList;

/**
 *
 * @author Michele Celozzi
 */
public class Cimitero {
    
    //crea l'arraylist in cui inserirre i radiobutton(interfaccia grafica)
    protected ArrayList<MyButton> ArrayList_radiobutton_cimitero;
    protected ArrayList<Carta> Cimitero;
    
    
    //costruttori
    public Cimitero(){
        //parte interfaccia grafica
        ArrayList_radiobutton_cimitero = new ArrayList<MyButton>(15);
        Cimitero = new ArrayList<Carta>(15);
    }
    
    
    //metodi
    public int SizeArrayList_radiobutton_cimitero(){
        return ArrayList_radiobutton_cimitero.size();
        
    }
    
    //Per scambiare due radiobutton si effettua la chiamata a SWAP_REMOVE dalla classe da cui togliere l'immagine e si passa l'oggetto ac ui dare la card
    
    //fatto
    public void SWAP_REMOVE(int indice_arry, Mano mano){
        
        mano.SWAP_ADD(Cimitero.get(indice_arry), ArrayList_radiobutton_cimitero.get(indice_arry));
        ArrayList_radiobutton_cimitero.remove(indice_arry);
        Cimitero.remove(indice_arry);
        
    }
    
    //fatto
    public void SWAP_REMOVE(int indice_arry, MazzoCampo campo){
        
        campo.SWAP_ADD(Cimitero.get(indice_arry), ArrayList_radiobutton_cimitero.get(indice_arry));
        
        ArrayList_radiobutton_cimitero.remove(indice_arry);
        Cimitero.remove(indice_arry);
        
    }
    
    //fatto
    public void SWAP_ADD(Carta carta, MyButton campo){
        
        Cimitero.add(carta);
        ArrayList_radiobutton_cimitero.add(campo);
        
    }
    
    public boolean Add(MyButton radiobutton){
        
        //aggiungo il radio button all'arraylist
        if(this.SizeArrayList_radiobutton_cimitero()<15){
            ArrayList_radiobutton_cimitero.add(radiobutton);
            return true;
            
        }else{
            return false;
            
        }
        
    }
    
    public boolean Remove(MyButton radiobutton){
        //elimino l'elemento dall'arraylist dei radio button
        if(ArrayList_radiobutton_cimitero.indexOf(radiobutton) != -1){
            ArrayList_radiobutton_cimitero.remove(ArrayList_radiobutton_cimitero.indexOf(radiobutton));
            return true;
        }else{
            return false;
        }
    }
    
    public void Add(Carta C1){
        
        if(this.Size()>15){
        }else{
            Cimitero.add(C1);
        }
    }
    
    //grandezza Cimitero
    public int Size(){
        return Cimitero.size();
    }
    
    public int Size_button(){
        return ArrayList_radiobutton_cimitero.size();
    }
    
    //get
    public Carta Get(int i){
        return Cimitero.get(i);
    }
    
    public void Remove(int i){
        Cimitero.remove(i);
    }

    public ArrayList<MyButton> getArrayList_radiobutton_cimitero() {
        return ArrayList_radiobutton_cimitero;
    }
    
    public MyButton get_indice_ArrayList_radiobutton_cimitero(int i){
        return ArrayList_radiobutton_cimitero.get(i);
    }

    public ArrayList<Carta> getCimitero() {
        return Cimitero;
    }
    
    
}
