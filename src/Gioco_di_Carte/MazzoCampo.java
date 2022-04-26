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
import javafx.scene.image.Image;

/**
 *
 * @author Michele Celozzi & interfaccia grafica Giorgio Mastrogiovanni
 */
public class MazzoCampo {
    
    
    //crea l'arraylist in cui inserirre i radiobutton
    protected ArrayList<MyButton> ArrayList_radiobutton_mazzocampo;
    
    //array list mazzocampo
    protected ArrayList<Carta> MazzoCampo;
    
    //costruttori
    public MazzoCampo(){
        //interfaccia grafica
        ArrayList_radiobutton_mazzocampo = new ArrayList<MyButton>();//max 6
        
        //PARTE TEMPORANEA(quando si avrà l'immagine di tavola vuota si dovrà cambiare il link)
        //IMAGE-----------------------------------------------------------------
        //get the path of the card file on your system
        Path relative1 = Paths.get("Carte/void.jpg");//carta non presente
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
    public MyButton get_ArrayList_radiobutton_mazzocampo(int i){
        return ArrayList_radiobutton_mazzocampo.get(i);
        
    }
    public ArrayList<MyButton> get_ArrayList_radiobutton_mazzocampo(){
        return ArrayList_radiobutton_mazzocampo;
        
    }
    
    //Per spostare 
    //fatto
    public void SWAP_REMOVE(int indice_arry, Cimitero campo){
        campo.SWAP_ADD(MazzoCampo.get(indice_arry), ArrayList_radiobutton_mazzocampo.get(indice_arry));
        ArrayList_radiobutton_mazzocampo.remove(indice_arry);
        MazzoCampo.remove(indice_arry);
        
    }
    
    //fatto
    public void SWAP_ADD(Carta carta, MyButton campo){
        
        MazzoCampo.add(carta);
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
