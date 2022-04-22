/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;

import javafx.scene.control.Button;

/**
 *
 * @author giorg
 */
public class MyButton extends Button{
    
    //Attributi
    //serve per poter riaccedere alle parti aggiuntive crreate nella classe MyContextMenu che altrimenti non si potrebbero vedere(cosa impossibile da fare altrimenti)
    protected MyContextMenu mycontextmenu;
    
    //Costruttori
    public MyButton(){
        super();
        
    }
    
    //Metodi

    public MyContextMenu getMycontextmenu() {
        return mycontextmenu;
    }

    //setta mycontextmenu di questa classe e in automatico setta anche il contextmenu di base
    public void setMycontextmenu(MyContextMenu mycontextmenu) {
        this.mycontextmenu = mycontextmenu;
        
        this.setContextMenu(mycontextmenu);
    }
    
    
}
