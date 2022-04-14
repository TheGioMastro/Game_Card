/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

/**
 *
 * @author Michele Celozzi & interfaccia grafica Giorgio Mastrogiovanni
 */
public class MazzoCampo {
    
    //crea il gruppo in cui contenere i radiobutton(interfaccia grafica)
    protected ToggleGroup group_radiobutton_mazzocampo;
    
    //crea l'arraylist in cui inserirre i radiobutton
    protected ArrayList<RadioButton> ArrayList_radiobutton_mazzocampo;
    
    //array list mazzocampo
    protected ArrayList<Carta> MazzoCampo;
    
    //costruttori
    public MazzoCampo(){
        //interfaccia grafica
        group_radiobutton_mazzocampo = new ToggleGroup();
        ArrayList_radiobutton_mazzocampo = new ArrayList<RadioButton>(6);
        
        //PARTE TEMPORANEA(quando si avrà l'immagine di tavola vuota si dovrà cambiare il link)
        //IMAGE-----------------------------------------------------------------
        //get the path of the card file on your system
        Path relative1 = Paths.get("Immagini/void.jpg");//carta non presente
        Path absolute1 = relative1.toAbsolutePath();
        
        //convert the file path to string, save as a string and define the width and height
        String yugiohretro = absolute1.toString();
        try {
            FileInputStream is1 = new FileInputStream(yugiohretro);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Mazzo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Image image1 = new Image(yugiohretro, 100, 146, false, false);
        
        int i;
        
        
        
        
        //FINE PARTE TEMPORANEA
        MazzoCampo = new ArrayList<Carta>(6);
    }
    
    
    
    //metodi
    //      size()
    public int sizeArrayList_radiobutton_mazzocampo(){
        return ArrayList_radiobutton_mazzocampo.size();
        
    }
    //      get()
    public RadioButton get_ArrayList_radiobutton_mazzocampo(int i){
        return ArrayList_radiobutton_mazzocampo.get(i);
        
    }
    
    //Per spostare 
    //fatto
    public void SWAP_REMOVE(int indice_arry, Cimitero campo){
        group_radiobutton_mazzocampo.getToggles().remove(ArrayList_radiobutton_mazzocampo.get(indice_arry));
        campo.SWAP_ADD(MazzoCampo.get(indice_arry), ArrayList_radiobutton_mazzocampo.get(indice_arry));
        ArrayList_radiobutton_mazzocampo.remove(indice_arry);
        MazzoCampo.remove(indice_arry);
        
    }
    
    //fatto
    public void SWAP_ADD(Carta carta, RadioButton campo){
        
        MazzoCampo.add(carta);
        campo.setToggleGroup(group_radiobutton_mazzocampo);
        ArrayList_radiobutton_mazzocampo.add(campo);
        
    }
    
    public boolean Add(Carta c1){
        if(this.Size()>=6){
            return false;
        }else{
            MazzoCampo.add(c1);
            return true;
        }
    }
    
    //grandezza mazzoCampo
    public int Size(){
        return MazzoCampo.size();
    }
    
    //get
    public Carta Get(int i){
        return MazzoCampo.get(i);
    }
    
    public void Remove(int i){
        MazzoCampo.remove(i);
    }
}
