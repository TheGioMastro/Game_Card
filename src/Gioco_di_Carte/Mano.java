/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.image.Image;
/**
 *
 * @author Alessandro Generali & interfaccia grafica Giorgio Mastrogiovanni
 */
public class Mano {
    protected ArrayList<Carta> gestione;
    
    //Parte imterfaccia grafica
    //crea l'arraylist in cui inserirre i radiobutton
    protected ArrayList<MyButton> ArrayList_radiobutton_mano;
    
    
    
    //Costruttori
    public Mano(){
        gestione=new ArrayList<>();      
        
        //PARTE INTERFACCIA GRAFICA
        ArrayList_radiobutton_mano = new ArrayList<>();//max 8
        
        
        //PARTE TEMPORANEA(quando si avrà l'immagine di tavola vuota si dovrà cambiare il link)
        //IMAGE-----------------------------------------------------------------
        //get the path of the card file on your system
        Path relative1 = Paths.get("Cards/void.jpg");//carta non presente
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
        
    }
    
    
    
    //metodi
    public int sizeGestione(){
        return gestione.size();
        
    }
    
    public int sizeArrayList_radiobutton_mano(){
        return ArrayList_radiobutton_mano.size();
        
    }
    
    public MyButton get_ArrayList_radiobutton_mano(int i){
        return ArrayList_radiobutton_mano.get(i);
        
    }
    
    //Per scambiare due radiobutton si effettua la chiamata a SWAP_REMOVE dalla classe da cui togliere l'immagine e si passa l'oggetto ac ui dare la card
    
    //fatto
    public void SWAP_REMOVE(int indice_arry, MazzoCampo campo){
        campo.SWAP_ADD(gestione.get(indice_arry), ArrayList_radiobutton_mano.get(indice_arry));
        ArrayList_radiobutton_mano.remove(indice_arry);
        gestione.remove(indice_arry);
        
    }
    //fatto
    public void SWAP_REMOVE(int indice_arry, Cimitero campo){
        campo.SWAP_ADD(gestione.get(indice_arry), ArrayList_radiobutton_mano.get(indice_arry));
        ArrayList_radiobutton_mano.remove(indice_arry);
        gestione.remove(indice_arry);
        
    }
    
    //fatto
    public void SWAP_ADD(Carta carta, MyButton campo){
        
        gestione.add(carta);
        ArrayList_radiobutton_mano.add(campo);
        
        
    }


    
    public boolean Add(Carta carte){
        if(gestione.size()<8){
            gestione.add(carte);
            return true;
        }
        else
            return false;
       
    }
    
    public Carta getCarta(int i){
        return gestione.get(i);
    }

    public ArrayList<Carta> getGestione() {
        return gestione;
    }

    public ArrayList<MyButton> getArrayList_radiobutton_mano() {
        return ArrayList_radiobutton_mano;
    }
    
    
    
    public void Remove(int i){
        gestione.remove(i);
                  
    }
    
    
    
}
