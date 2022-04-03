/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;
import java.util.*;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
/**
 *
 * @author 
 */
public class Mano {
    protected int misura;
    protected ArrayList<Carta> gestione;
    
    //crea il gruppo in cui contenere i radiobutton(interfaccia grafica)
    protected ToggleGroup group_radiobutton_mano;
    //crea l'arraylist in cui inserirre i radiobutton
    protected ArrayList<RadioButton> ArrayList_radiobutton_mano;
    
    
    //Costruttori
    public Mano(){
        gestione=new <Carta>ArrayList();      
        
        //PARTE INTERFACCIA GRAFICA
        group_radiobutton_mano = new ToggleGroup();
        ArrayList_radiobutton_mano = new ArrayList<RadioButton>(8);
        
    }
    
    
    
    //metodi
    public int sizeGestione(){
        return gestione.size();
        
    }
    
    public int sizeArrayList_radiobutton_mano(){
        return ArrayList_radiobutton_mano.size();
        
    }
    
    
    public boolean add(RadioButton radiobutton){
        
        //rimuove da un gruppo un radiobutton(interfaccia grafica)
        radiobutton.setToggleGroup(group_radiobutton_mano);
        
        //aggiungo il radio button all'arraylist
        if(this.sizeArrayList_radiobutton_mano()<8){
            ArrayList_radiobutton_mano.add(radiobutton);
            return true;
            
        }else{
            return false;
            
        }
        
    }
    
    public boolean remove(RadioButton radiobutton){
        
        //rimuove da un gruppo un radiobutton(interfaccia grafica)
        group_radiobutton_mano.getToggles().remove(radiobutton);
        
        //elimino l'elemento dall'arraylist dei radio button
        if(ArrayList_radiobutton_mano.indexOf(radiobutton) != -1){
            ArrayList_radiobutton_mano.remove(ArrayList_radiobutton_mano.indexOf(radiobutton));
            return true;
            
        }else{
            return false;
            
        }
        
        
    }
    
    
}
