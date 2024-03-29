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
    
    protected ArrayList<MyButton> ArrayList_radiobutton_mazzo;
    protected ArrayList<Carta> Mazzo;
    
    protected MenuItem mettiInCampo;
    protected MenuItem attacca_avversario;
    protected Menu attacca_carte_in_campo;
    protected MenuItem vita;
    protected MenuItem attacco;
    
   
    
    
    //Costruttori
    public MyContextMenu(MyButton bottone, Gioco gioco, Mano man, ArrayList<MyButton> ArrayList_radiobutton_mazzo, ArrayList<Carta> Mazzo){
        super();
        
        this.gioco = gioco;
        
        this.bottone = bottone;
        this.ArrayList_radiobutton_mazzo = ArrayList_radiobutton_mazzo;
        this.Mazzo = Mazzo;
        
        
        
        //menu item contextmenu
        mettiInCampo = new MenuItem("");
        attacca_carte_in_campo = new Menu("Attack cards on the field");
        
        attacca_avversario = new MenuItem();
        

        mettiInCampo.setOnAction((event) -> {

            gioco.moveToCampo(man.getArrayList_radiobutton_mano().indexOf(bottone));
            
            gioco.getGrafica().reload_GUI(gioco.getGiocatore_1(), gioco.getGiocatore_2());
            
        });
        
        attacca_avversario.setOnAction((event) -> {
           if(gioco.getnTurno() % 2 == 1){//Turno Giocatore 1
               gioco.giocatore_1.getMazCam().Get(gioco.getGiocatore_1().getMazCam().get_ArrayList_radiobutton_mazzocampo().indexOf(bottone)).getPersonaggio().attacca_diretto(gioco.giocatore_2.getGiocatore());
               gioco.decrementAttackPointP1();
               
           }else{ //Turno Giocatore 2
               gioco.giocatore_2.getMazCam().Get(gioco.getGiocatore_2().getMazCam().get_ArrayList_radiobutton_mazzocampo().indexOf(bottone)).getPersonaggio().attacca_diretto(gioco.giocatore_1.getGiocatore());
               gioco.decrementAttackPointP2();
               
           }
           
           gioco.getGrafica().reload_GUI(gioco.getGiocatore_1(), gioco.getGiocatore_2());
           gioco.getGrafica().reload_tasto_destro_attacco(gioco.getGiocatore_1(), gioco.getP1attack(), gioco.getGiocatore_2(), gioco.getP2attack());
           gioco.checkWinner();
           
               
        });

        
        
        
        attacca_carte_in_campo.setDisable(true);
        
    }

    
    //getter/setter
    public MyButton getBottone() {
        return bottone;
    }

    public MenuItem getMettiInCampo() {
        return mettiInCampo;
    }

    public Menu getAttacca() {
        return attacca_carte_in_campo;
    }

    public void setBottone(MyButton bottone) {
        this.bottone = bottone;
    }

    public void setMettiInCampo(MenuItem mettiInCampo) {
        this.mettiInCampo = mettiInCampo;
    }

    public void setAttacca(Menu attacca) {
        this.attacca_carte_in_campo = attacca;
    }
    
    public MenuItem getAttaccoAvversario(){
        return attacca_avversario;
    }
    
    //other
    public void setStart(int i){
        this.carta_legata_al_bottone = (i == 1)?Mazzo.get(ArrayList_radiobutton_mazzo.indexOf(bottone)):Mazzo.get(ArrayList_radiobutton_mazzo.indexOf(bottone));
        this.attacca_avversario.setText("Attack " + ((i == 1)?gioco.getGiocatore_2().getGiocatore().getNome():gioco.getGiocatore_1().getGiocatore().getNome()));
        this.attacca_avversario.setDisable(true);
        
        if(this.carta_legata_al_bottone.getTipo_Carta().equals("Personaggio")){
            this.getItems().addAll(mettiInCampo, attacca_avversario, attacca_carte_in_campo);
            this.haveLife = true;
            mettiInCampo.setText("Place");
            this.vita = new MenuItem("Life: " + Integer.toString(this.carta_legata_al_bottone.getPersonaggio().getpDefense()));
            this.vita.setStyle("-fx-background-color: #53CA2B");
            this.attacco = new MenuItem("Attack: " + Integer.toString(this.carta_legata_al_bottone.getPersonaggio().getpAttack()));
            this.attacco.setStyle("-fx-background-color: #53CA2B");
            this.getItems().add(vita);
            this.getItems().add(attacco);
        
        }else{
            this.getItems().add(mettiInCampo);
            this.haveLife = false;
            mettiInCampo.setText("Use");
        }
    }
    
    
    public void updateMenuAttacco(){
        if(haveLife){
                if(gioco.getnTurno() % 2 == 1){//Turno Giocatore 1
                    attacca_carte_in_campo.getItems().clear();

                    for(int i=0; i<gioco.getGiocatore_2().getMazCam().Size(); i++){
                        MyMenuItem nuovoitem = new MyMenuItem(gioco.getGiocatore_2().getMazCam().Get(i).getNome(), Integer.toString(gioco.getGiocatore_2().getMazCam().Get(i).getPersonaggio().getpDefense()), gioco.getGiocatore_2().getMazCam().get_ArrayList_radiobutton_mazzocampo(i));
                        attacca_carte_in_campo.getItems().add(nuovoitem);

                        this.vita.setText("HP: " + Integer.toString(this.carta_legata_al_bottone.getPersonaggio().getpDefense()));
                        this.vita.setStyle("-fx-background-color: #53CA2B");
                        this.attacco.setText("Attack: " + Integer.toString(this.carta_legata_al_bottone.getPersonaggio().getpAttack()));
                        this.attacco.setStyle("-fx-background-color: #53CA2B");
                        

                        nuovoitem.setOnAction((event) -> {
                            gioco.attacca(gioco.getGiocatore_1().getMazCam().get_ArrayList_radiobutton_mazzocampo().indexOf(bottone), gioco.getGiocatore_2().getMazCam().get_ArrayList_radiobutton_mazzocampo().indexOf(nuovoitem.getOggetto_da_attaccare()));
                        });

                    }
                }else{//Turno Giocatore 2
                    attacca_carte_in_campo.getItems().clear();

                    for(int i=0; i<gioco.getGiocatore_1().getMazCam().Size(); i++){
                        MyMenuItem nuovoitem = new MyMenuItem(gioco.getGiocatore_1().getMazCam().Get(i).getNome(), Integer.toString(gioco.getGiocatore_1().getMazCam().Get(i).getPersonaggio().getpDefense()), gioco.getGiocatore_1().getMazCam().get_ArrayList_radiobutton_mazzocampo(i));
                        attacca_carte_in_campo.getItems().add(nuovoitem);

                        
                        this.vita.setText("HP: " + Integer.toString(this.carta_legata_al_bottone.getPersonaggio().getpDefense()));
                        this.vita.setStyle("-fx-background-color: #53CA2B");
                        this.attacco.setText("Attack: " + Integer.toString(this.carta_legata_al_bottone.getPersonaggio().getpAttack()));
                        this.attacco.setStyle("-fx-background-color: #53CA2B");
                        

                        nuovoitem.setOnAction((event) -> {
                            gioco.attacca(gioco.getGiocatore_2().getMazCam().get_ArrayList_radiobutton_mazzocampo().indexOf(bottone), gioco.getGiocatore_1().getMazCam().get_ArrayList_radiobutton_mazzocampo().indexOf(nuovoitem.getOggetto_da_attaccare()));
                        });
                    }
                }
        }
    }

        
}
