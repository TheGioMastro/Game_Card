/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;
//Generali Alessandro "Autore"
/**
 *
 * @author 
 */
public class Deck {
    protected Descrizione[] Insieme_descrizioni = new Descrizione[15];
    public Deck(){
        for(int i=0; i<15; i++){
            Insieme_descrizioni[i]= new Descrizione();
        }           
    }

    public Descrizione getInsieme_descrizioni(int i) {
        return Insieme_descrizioni[i];
    }

    
    
}
