/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;
/**
 *
 * @author Generali Alessandro
 */
public class Deck {
    protected Carta[] dck;
    protected final int nCarte = 15;
    
    public Deck(Mazzo m1){
        int i;
        dck = new Carta[nCarte];
        
        for(i = 0; i < nCarte; i++){
            dck[0] = m1.Get(i);
        }
    }
    
    public Carta getCarta(int i){
        return dck[i];
    }
}
