/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;

import java.util.ArrayList;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author Michele Celozzi & interfaccia grafica Giorgio Mastrogiovanni
 */
public class MazzoCampo {
    
    //crea il gruppo in cui contenere i radiobutton(interfaccia grafica)
    protected ToggleGroup group_radiobutton_mazzocampo;
    //crea l'arraylist in cui inserirre i radiobutton
    protected ArrayList<RadioButton> ArrayList_radiobutton_mazzocampo;
    
    
    //costruttori
    public MazzoCampo(){
        //interfaccia grafica
        group_radiobutton_mazzocampo = new ToggleGroup();
        ArrayList_radiobutton_mazzocampo = new ArrayList<RadioButton>(6);
        
    }
    
    
    
    //metodi
    public int sizeArrayList_radiobutton_mazzocampo(){
        return ArrayList_radiobutton_mazzocampo.size();
        
    }
    
    public boolean add(RadioButton radiobutton){
        
        //rimuove da un gruppo un radiobutton(interfaccia grafica)
        radiobutton.setToggleGroup(group_radiobutton_mazzocampo);
        
        //aggiungo il radio button all'arraylist
        if(this.sizeArrayList_radiobutton_mazzocampo()<6){
            ArrayList_radiobutton_mazzocampo.add(radiobutton);
            return true;
            
        }else{
            return false;
            
        }
        
    }
    
    public boolean remove(RadioButton radiobutton){
        
        //rimuove da un gruppo un radiobutton(interfaccia grafica)
        group_radiobutton_mazzocampo.getToggles().remove(radiobutton);
        
        //elimino l'elemento dall'arraylist dei radio button
        if(ArrayList_radiobutton_mazzocampo.indexOf(radiobutton) != -1){
            ArrayList_radiobutton_mazzocampo.remove(ArrayList_radiobutton_mazzocampo.indexOf(radiobutton));
            return true;
            
        }else{
            return false;
            
        }
        
        
    }
    
}
