/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;

import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;

/**
 *
 * @author Giorgio Mastrogiovanni
 */
public class MyContextMenu extends ContextMenu{
    
    //Attributi
    //salvo il bottone per far sì che tramite lo stesso bottone si possa ricercare quale oggetto nell'arraylist ha richiamato questo menu(cosa impossibile da fare altrimenti)
    protected MyButton bottone;
    
    protected MenuItem menuItem1;
    protected MenuItem menuItem2;
    
    
    //Costruttori
    public MyContextMenu(MyButton bottone, Gioco gioco, Mano man, ArrayList<MyButton> ArrayList_radiobutton_mazzo){
        super();
        
        this.bottone = bottone;
        
        //menu item contextmenu
        menuItem1 = new MenuItem("Metti in campo");
        menuItem2 = new MenuItem("Attacca");
        

        menuItem1.setOnAction((event) -> {

            gioco.moveToMano(man.getArrayList_radiobutton_mano().indexOf(bottone));
            
            gioco.getGrafica().reload_GUI(gioco.getGiocatore_1(), gioco.getGiocatore_2());
        });

        menuItem2.setOnAction((event) -> {
            //gioco.attack(ArrayList_radiobutton_mazzo.indexOf(bottone));
        });
        
        menuItem2.setDisable(true);

        this.getItems().addAll(menuItem1, menuItem2);
        
        
    }

    public Button getBottone() {
        return bottone;
    }

    public MenuItem getMenuItem1() {
        return menuItem1;
    }

    public MenuItem getMenuItem2() {
        return menuItem2;
    }

    public void setBottone(MyButton bottone) {
        this.bottone = bottone;
    }

    public void setMenuItem1(MenuItem menuItem1) {
        this.menuItem1 = menuItem1;
    }

    public void setMenuItem2(MenuItem menuItem2) {
        this.menuItem2 = menuItem2;
    }
    
    
        
}
