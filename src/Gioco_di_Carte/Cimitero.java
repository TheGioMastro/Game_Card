/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;

import java.util.ArrayList;
import javafx.scene.control.RadioButton;

/**
 *
 * @author Michele Celozzi
 */
public class Cimitero {
    
    //crea l'arraylist in cui inserirre i radiobutton(interfaccia grafica)
    protected ArrayList<RadioButton> ArrayList_radiobutton_cimitero;
    public ArrayList<Carta> Cimitero;
    
    
    //costruttori
    public Cimitero(){
        //parte interfaccia grafica
        ArrayList_radiobutton_cimitero = new ArrayList<RadioButton>(15);
        Cimitero = new ArrayList<Carta>(15);
    }
    
    
    //metodi
    public int SizeArrayList_radiobutton_cimitero(){
        return ArrayList_radiobutton_cimitero.size();
        
    }
    
    //Per scambiare due radiobutton si effettua la chiamata a SWAP_REMOVE dalla classe da cui togliere l'immagine e si passa l'oggetto ac ui dare la card
    
    public void SWAP_REMOVE(int indice_arry, Mano mano){
        
        RadioButton appoggio = new RadioButton();
        appoggio = ArrayList_radiobutton_cimitero.get(indice_arry);
        
        ArrayList_radiobutton_cimitero.set(indice_arry, mano.SWAP_ADD(indice_arry, appoggio));
        
    }
    
    public void SWAP_REMOVE(int indice_arry, MazzoCampo campo){
        
        RadioButton appoggio = new RadioButton();
        appoggio = ArrayList_radiobutton_cimitero.get(indice_arry);
        
        ArrayList_radiobutton_cimitero.set(indice_arry, campo.SWAP_ADD(indice_arry, appoggio));
        
    }
    
    public RadioButton SWAP_ADD(int indice_arry, RadioButton campo){
        
        RadioButton appoggio = new RadioButton();
        appoggio = ArrayList_radiobutton_cimitero.get(indice_arry);
        
        ArrayList_radiobutton_cimitero.set(indice_arry, campo);
        
        return appoggio;
        
    }
    
    public boolean Add(RadioButton radiobutton){
        
        //aggiungo il radio button all'arraylist
        if(this.SizeArrayList_radiobutton_cimitero()<15){
            ArrayList_radiobutton_cimitero.add(radiobutton);
            return true;
            
        }else{
            return false;
            
        }
        
    }
    
    public boolean Remove(RadioButton radiobutton){
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
            System.out.print("Error");
        }else{
            Cimitero.add(C1);
        }
    }
    
    //grandezza Cimitero
    public int Size(){
        return Cimitero.size();
    }
    
    //get
    public Carta Get(int i){
        return Cimitero.get(i);
    }
    
    public void Remove(int i){
        Cimitero.remove(i);
    }
}
