/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;

import java.util.ArrayList;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

/**
 *
 * @author Giorgio Mastrogiovanni
 */
public class MyContextMenu extends ContextMenu{
    
    //Attributi
    //salvo il bottone per far sì che tramite lo stesso bottone si possa ricercare quale oggetto nell'arraylist ha richiamato questo menu(cosa impossibile da fare altrimenti)
    protected MyButton bottone;
    protected Carta carta_legata_al_bottone;
    protected Gioco gioco;
    protected boolean haveLife;
    
    ArrayList<MyButton> ArrayList_radiobutton_mazzo;
    ArrayList<Carta> Mazzo;
    
    protected MenuItem vita;
    protected MenuItem mettiInCampo;
    protected Menu attacca;
   
    
    
    //Costruttori
    public MyContextMenu(MyButton bottone, Gioco gioco, Mano man, ArrayList<MyButton> ArrayList_radiobutton_mazzo, ArrayList<Carta> Mazzo){
        super();
        
        this.gioco = gioco;
        
        this.bottone = bottone;
        this.ArrayList_radiobutton_mazzo = ArrayList_radiobutton_mazzo;
        this.Mazzo = Mazzo;
        
        
        
        //menu item contextmenu
        mettiInCampo = new MenuItem("Metti in campo");
        attacca = new Menu("Attacca");
        

        mettiInCampo.setOnAction((event) -> {

            gioco.moveToCampo(man.getArrayList_radiobutton_mano().indexOf(bottone));
            
            gioco.getGrafica().reload_GUI(gioco.getGiocatore_1(), gioco.getGiocatore_2());
            
        });

        
        

        this.getItems().addAll(mettiInCampo, attacca);
        
        attacca.setDisable(true);
        
    }

    
    //getter/setter
    public MyButton getBottone() {
        return bottone;
    }

    public MenuItem getMettiInCampo() {
        return mettiInCampo;
    }

    public Menu getAttacca() {
        return attacca;
    }

    public void setBottone(MyButton bottone) {
        this.bottone = bottone;
    }

    public void setMettiInCampo(MenuItem mettiInCampo) {
        this.mettiInCampo = mettiInCampo;
    }

    public void setAttacca(Menu attacca) {
        this.attacca = attacca;
    }
    
    //other
    public void setVita(){
        this.carta_legata_al_bottone = (gioco.getnTurno() % 2 == 1)?Mazzo.get(ArrayList_radiobutton_mazzo.indexOf(bottone)):Mazzo.get(ArrayList_radiobutton_mazzo.indexOf(bottone));
        
        if(this.carta_legata_al_bottone.getTipo_Carta().equals("Personaggio")){
            this.haveLife = true;
            this.vita = new MenuItem("Vita: " + Integer.toString(this.carta_legata_al_bottone.getPersonaggio().getpDefense()));
            this.vita.setStyle("-fx-background-color: #53CA2B");
            this.getItems().add(vita);
        
        }else{
            this.haveLife = false;
        }
    }
    
    
    public void updateMenuAttacco(){
        if(gioco.getnTurno() % 2 == 1){//Turno Giocatore 1
            attacca.getItems().clear();
            
            for(int i=0; i<gioco.getGiocatore_2().getMazCam().Size(); i++){
                MyMenuItem nuovoitem = new MyMenuItem(gioco.getGiocatore_2().getMazCam().Get(i).getNome(), gioco.getGiocatore_2().getMazCam().get_ArrayList_radiobutton_mazzocampo(i));
                attacca.getItems().add(nuovoitem);
                
                if(haveLife){
                    this.vita = new MenuItem("Vita: " + Integer.toString(this.carta_legata_al_bottone.getPersonaggio().getpDefense()));
                    this.vita.setStyle("-fx-background-color: #53CA2B");
                }
                
                nuovoitem.setOnAction((event) -> {
                    
                    //RICERCARE I PROBLEMI SI INDICE E POI ELIMINARE I 45 IF INLINE
                    gioco.attacca(gioco.getGiocatore_1().getMazCam().get_ArrayList_radiobutton_mazzocampo().indexOf(bottone), gioco.getGiocatore_2().getMazCam().get_ArrayList_radiobutton_mazzocampo().indexOf(nuovoitem.getOggetto_da_attaccare()));
                });
                
            }
        }else{//Turno Giocatore 2
            attacca.getItems().clear();
            
            for(int i=0; i<gioco.getGiocatore_1().getMazCam().Size(); i++){
                MyMenuItem nuovoitem = new MyMenuItem(gioco.getGiocatore_1().getMazCam().Get(i).getNome(), gioco.getGiocatore_1().getMazCam().get_ArrayList_radiobutton_mazzocampo(i));
                attacca.getItems().add(nuovoitem);
                
                if(haveLife){
                    this.vita = new MenuItem("Vita: " + Integer.toString(this.carta_legata_al_bottone.getPersonaggio().getpDefense()));
                    this.vita.setStyle("-fx-background-color: #53CA2B");
                }
                
                nuovoitem.setOnAction((event) -> {
                    gioco.attacca(gioco.getGiocatore_2().getMazCam().get_ArrayList_radiobutton_mazzocampo().indexOf(bottone), gioco.getGiocatore_1().getMazCam().get_ArrayList_radiobutton_mazzocampo().indexOf(nuovoitem.getOggetto_da_attaccare()));
                });
            }
        }
    }

        
}
