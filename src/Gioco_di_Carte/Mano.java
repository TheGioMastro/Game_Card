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
 * @author Alessandro Genrali & interfaccia grafica Giorgio Mastrogiovanni
 */
public class Mano {
    protected ArrayList<Carta> gestione;
    
    //Parte imterfaccia grafica
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
        for(i=0; i<8; i++){
            //aggiunta dello stile a tutti i radiobutton
            ArrayList_radiobutton_mano.add(i, new RadioButton());
            ArrayList_radiobutton_mano.get(i).setToggleGroup(group_radiobutton_mano);
            ArrayList_radiobutton_mano.get(i).setPadding(new Insets(5));
            ArrayList_radiobutton_mano.get(i).setGraphic(new ImageView(image1));
            ArrayList_radiobutton_mano.get(i).getStyleClass().remove("radio-button");
            ArrayList_radiobutton_mano.get(i).getStyleClass().add("toggle-button");
            ArrayList_radiobutton_mano.get(i).setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            ArrayList_radiobutton_mano.get(i).setBorder(Border.EMPTY);
        }
        
        
        //FINE PARTE TEMPORANEA
        
    }
    
    
    
    //metodi
    public int sizeGestione(){
        return gestione.size();
        
    }
    
    public int sizeArrayList_radiobutton_mano(){
        return ArrayList_radiobutton_mano.size();
        
    }
    
    public RadioButton get_ArrayList_radiobutton_mano(int i){
        return ArrayList_radiobutton_mano.get(i);
        
    }
    
    //Per scambiare due radiobutton si effettua la chiamata a SWAP_REMOVE dalla classe da cui togliere l'immagine e si passa l'oggetto ac ui dare la card
    
    public void SWAP_REMOVE(int indice_arry, MazzoCampo campo){
        
        RadioButton appoggio = new RadioButton();
        appoggio = ArrayList_radiobutton_mano.get(indice_arry);
        
        ArrayList_radiobutton_mano.set(indice_arry, campo.SWAP_ADD(indice_arry, appoggio));
        
    }
    
    public void SWAP_REMOVE(int indice_arry, Cimitero campo){
        
        RadioButton appoggio = new RadioButton();
        appoggio = ArrayList_radiobutton_mano.get(indice_arry);
        
        ArrayList_radiobutton_mano.set(indice_arry, campo.SWAP_ADD(indice_arry, appoggio));
        
    }
    
    public RadioButton SWAP_ADD(int indice_arry, RadioButton campo){
        
        RadioButton appoggio = new RadioButton();
        appoggio = ArrayList_radiobutton_mano.get(indice_arry);
        
        ArrayList_radiobutton_mano.set(indice_arry, campo);
        
        return appoggio;
        
    }


    
    public boolean Add(Carta carte){
        if(gestione.size()<8){
            gestione.add(carte);
            return true;
        }
        else
            return false;
       
    }
    
    public void Remove(int i){
        gestione.remove(i);
                  
    }
    
    
    
}
