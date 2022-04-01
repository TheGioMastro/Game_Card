/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;
import java.util.*;
/**
 *
 * @author 
 */
public class Mano {
    private int misura;
    public ArrayList<Carta>gestione;
    public Mano(){
        gestione=new <Carta>ArrayList();      
    }
    public int size(){
        return gestione.size();
    }
    
    
}
