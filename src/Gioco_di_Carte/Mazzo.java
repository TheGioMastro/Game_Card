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
import javafx.scene.control.Button;
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
 * @author giorg Michele Celozzi & interfaccia grafica Giorgio Mastrogiovanni
 */
public class Mazzo {
    
    //ArryList per contenere i radiobutton dell'interfaccia grafica
    protected ArrayList<MyButton> ArrayList_radiobutton_mazzo;
    protected ArrayList<Carta> Mazzo;
    
    //costruttori
    public Mazzo(Gioco gioco, Mano man){
        Mazzo = new ArrayList<Carta>(15);
        ArrayList_radiobutton_mazzo = new ArrayList<MyButton>(15);
        
        
        //PARTE TEMPORANEA(quando si avranno le specifiche delle carte e le immagini bisognerà cambiare tutto
        //IMAGE-----------------------------------------------------------------
        //get the path of the card file on your system
        Path relative1 = Paths.get("Carte/void.jpg");
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
            ArrayList_radiobutton_mazzo.add(i, new MyButton());
            ArrayList_radiobutton_mazzo.get(i).setPadding(new Insets(5));
            ArrayList_radiobutton_mazzo.get(i).setGraphic(new ImageView(image1));
            ArrayList_radiobutton_mazzo.get(i).getStyleClass().remove("radio-button");
            ArrayList_radiobutton_mazzo.get(i).getStyleClass().add("toggle-button");
            ArrayList_radiobutton_mazzo.get(i).setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            ArrayList_radiobutton_mazzo.get(i).setBorder(Border.EMPTY);
            
            ArrayList_radiobutton_mazzo.get(i).setMycontextmenu(new MyContextMenu(ArrayList_radiobutton_mazzo.get(i), gioco, man, ArrayList_radiobutton_mazzo));
            
        }
        
        
        //FINE PARTE TEMPORANEA
        
    }
    
    
    //metodi
    public boolean remove(Button radiobutton){
        //elimino l'elemento dall'arraylist dei radio button
        if(ArrayList_radiobutton_mazzo.indexOf(radiobutton) != -1){
            ArrayList_radiobutton_mazzo.remove(ArrayList_radiobutton_mazzo.indexOf(radiobutton));
            return true;
        }else{
            return false;
            
        }   
    }
    
    
    //Per scambiare due radiobutton si effettua la chiamata a SWAP_REMOVE dalla classe da cui togliere l'immagine e si passa l'oggetto ac ui dare la card
    //fatto
    public void SWAP_REMOVE(int indice_arry, Mano mano){
        
        mano.SWAP_ADD(Mazzo.get(indice_arry), ArrayList_radiobutton_mazzo.get(indice_arry));
        ArrayList_radiobutton_mazzo.remove(indice_arry);
        Mazzo.remove(indice_arry);
    }
   
    
    
    
    public boolean addMagia(String nome, Image f1){
        String descr = "";
        if(this.Size()>=15){
            return false;
            
        }else{
            Carta c1 = new Carta (nome, descr, "Magia", f1);
            Mazzo.add(c1);
            return true;
        }
    }
    
    public boolean addPersonaggio(String tipo, String nome, int attacco, int difesa, Image f1){
        String descr = "";
        if(this.Size()>=15){
            return false;
            
        }else{
            Carta c1 = new Carta (tipo, attacco, difesa, nome, descr, "Personaggio", f1);
            Mazzo.add(c1);
            return true;
        }
    }

    //grandezza mazzo
    public int Size(){
        return Mazzo.size();
    }
    
    //get
    public Carta Get(int i){
        return Mazzo.get(i);
    }

    public ArrayList<MyButton> getArrayList_radiobutton_mazzo() {
        return ArrayList_radiobutton_mazzo;
    }
    
    public MyButton get_indice_ArrayList_radiobutton_mazzo(int i){
        return ArrayList_radiobutton_mazzo.get(i);
    }

    public ArrayList<Carta> getMazzo() {
        return Mazzo;
    }
    
    
    
    public boolean Remove(Carta c1){
        return Mazzo.remove(c1);
    }
}
