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
 * @author giorg
 */
public class Mazzo {
    
    //ArryList per contenere i radiobutton dell'interfaccia grafica
    protected ArrayList<RadioButton> ArrayList_radiobutton_mazzo;
    
    
    //costruttori
    public Mazzo(){
        ArrayList_radiobutton_mazzo = new ArrayList<RadioButton>(15);
        
        
        //PARTE TEMPORANEA(quando si avranno le specifiche delle carte e le immagini bisognerà cambiare tutto
        //IMAGE-----------------------------------------------------------------
        //get the path of the card file on your system
        Path relative1 = Paths.get("Immagini/yugiohretro.jpg");
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
        for(i=0; i<15; i++){
            //aggiunta dello stile a tutti i radiobutton
            ArrayList_radiobutton_mazzo.add(i, new RadioButton());
            ArrayList_radiobutton_mazzo.get(i).setPadding(new Insets(5));
            ArrayList_radiobutton_mazzo.get(i).setGraphic(new ImageView(image1));
            ArrayList_radiobutton_mazzo.get(i).getStyleClass().remove("radio-button");
            ArrayList_radiobutton_mazzo.get(i).getStyleClass().add("toggle-button");
            ArrayList_radiobutton_mazzo.get(i).setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            ArrayList_radiobutton_mazzo.get(i).setBorder(Border.EMPTY);
        }
        
        
        //FINE PARTE TEMPORANEA
    }
    
    
    //metodi
    public boolean remove(RadioButton radiobutton){
        
        //elimino l'elemento dall'arraylist dei radio button
        if(ArrayList_radiobutton_mazzo.indexOf(radiobutton) != -1){
            ArrayList_radiobutton_mazzo.remove(ArrayList_radiobutton_mazzo.indexOf(radiobutton));
            return true;
            
        }else{
            return false;
            
        }
        
        
    }
    
}
