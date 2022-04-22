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
    
    protected Button bottone;
    
    protected MenuItem menuItem1;
    protected MenuItem menuItem2;
    
    
    //Costruttori
    public MyContextMenu(Button bottone, Gioco gioco, ArrayList<Button> ArrayList_radiobutton_mazzo){
        super();
        
        this.bottone = bottone;
        
        //menu item contextmenu
        menuItem1 = new MenuItem("Metti in campo");
        menuItem2 = new MenuItem("Attacca");
        

        menuItem1.setOnAction((event) -> {

            gioco.moveToMano(ArrayList_radiobutton_mazzo.indexOf(bottone));
        });

        menuItem2.setOnAction((event) -> {
            //gioco.attack(ArrayList_radiobutton_mazzo.indexOf(bottone));
        });

        this.getItems().addAll(menuItem1, menuItem2);
        
        
    }
        
}
