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
    public ArrayList<Carta> MazzoCampo;
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
        
        //popola tutto l'arraylist con gli elementi
        for(i=0; i<6; i++){
            //aggiunta dello stile a tutti i radiobutton
            ArrayList_radiobutton_mazzocampo.add(i, new RadioButton());
            ArrayList_radiobutton_mazzocampo.get(i).setToggleGroup(group_radiobutton_mazzocampo);
            ArrayList_radiobutton_mazzocampo.get(i).setPadding(new Insets(5));
            ArrayList_radiobutton_mazzocampo.get(i).setGraphic(new ImageView(image1));
            ArrayList_radiobutton_mazzocampo.get(i).getStyleClass().remove("radio-button");
            ArrayList_radiobutton_mazzocampo.get(i).getStyleClass().add("toggle-button");
            ArrayList_radiobutton_mazzocampo.get(i).setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            ArrayList_radiobutton_mazzocampo.get(i).setBorder(Border.EMPTY);
        }
        
        
        //FINE PARTE TEMPORANEA
        MazzoCampo = new ArrayList<Carta>(15);
    }
    
    
    
    //metodi
    public int sizeArrayList_radiobutton_mazzocampo(){
        return ArrayList_radiobutton_mazzocampo.size();
        
    }
    
    public RadioButton get_ArrayList_radiobutton_mazzocampo(int i){
        return ArrayList_radiobutton_mazzocampo.get(i);
        
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
    
    //Per scambiare due radiobutton si effettua la chiamata a SWAP_REMOVE dalla classe da cui togliere l'immagine e si passa l'oggetto ac ui dare la card
    
    public void SWAP_REMOVE(int indice_arry, Mano mano){
        
        RadioButton appoggio = new RadioButton();
        appoggio = ArrayList_radiobutton_mazzocampo.get(indice_arry);
        
        ArrayList_radiobutton_mazzocampo.set(indice_arry, mano.SWAP_ADD(indice_arry, appoggio));
        
    }
    
    public void SWAP_REMOVE(int indice_arry, Cimitero campo){
        
        RadioButton appoggio = new RadioButton();
        appoggio = ArrayList_radiobutton_mazzocampo.get(indice_arry);
        
        ArrayList_radiobutton_mazzocampo.set(indice_arry, campo.SWAP_ADD(indice_arry, appoggio));
        
    }
    
    public RadioButton SWAP_ADD(int indice_arry, RadioButton campo){
        
        RadioButton appoggio = new RadioButton();
        appoggio = ArrayList_radiobutton_mazzocampo.get(indice_arry);
        
        ArrayList_radiobutton_mazzocampo.set(indice_arry, campo);
        
        return appoggio;
        
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
    
    public void add(Personaggio C){
        
        if(Mazzo.Size>15){
            System.out.print("Error");
        }else{
            
        MazzoCampo.add(C);
    
        }
    }
    public void add(Magia C){
        
        if(Mazzo.Size>15){
            System.out.print("Error");
        }else{
            
        MazzoCampo.add(C);
    
        }
    }
    
    //grandezza mazzoCampo
    public int Size(){
        return MazzoCampo.size;
    }
    //get
    public Personaggio Get(int i){
        return MazzoCampo.get(i);
    }
    
     public Magia Get(int i){
        return MazzoCampo.get(i);
    }
    
}
