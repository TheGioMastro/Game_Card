/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;

import javafx.scene.control.MenuItem;

/**
 *
 * @author giorg
 */
public class MyMenuItem extends MenuItem{
    
    //Attributi
    protected MyButton oggetto_da_attaccare;
    
    //Costruttori
    public MyMenuItem(String nome, MyButton item){
        super(nome);
        
        this.oggetto_da_attaccare = item;
    }
    
    //metodi

    public MyButton getOggetto_da_attaccare() {
        return oggetto_da_attaccare;
    }

    public void setOggetto_da_attaccare(MyButton oggetto_da_attaccare) {
        this.oggetto_da_attaccare = oggetto_da_attaccare;
    }
    
}
