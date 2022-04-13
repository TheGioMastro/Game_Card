/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;


/**
 *
 * @author Giuliano Tommaso Colombo <colombogiulianotommaso@itis-molinari.eu>
 */
public class Gioco {
    protected Campo giocatore_1; //CAMPO SOPRA
    protected Campo giocatore_2; //CAMPO SOTTO
    
    //Grafica del gioco
    protected GraficaGioco grafica;
    
    

    //Costruttori----
    public Gioco(String nomeG1, String nomeG2, String tipoG1, String tipoG2) {
        
        giocatore_1 = new Campo(nomeG1, tipoG1);
        giocatore_2 = new Campo(nomeG2, tipoG2);
        
        grafica = new GraficaGioco(giocatore_1, giocatore_2);
        
    }
    //--------------------------------------------------------------------------------------------------------------
    
    //setter----------------------------------------
    public void setGiocatore_1(Campo giocatore_1) {
        this.giocatore_1 = giocatore_1;
    }

    public void setGiocatore_2(Campo giocatore_2) {
        this.giocatore_2 = giocatore_2;
    }
    //----------------------------------------------
    
    //getter--------------------------
    public Campo getGiocatore_1() {
        return giocatore_1;
    }

    public Campo getGiocatore_2() {
        return giocatore_2;
    }
    

    public GraficaGioco getGrafica() {
        return grafica;
    }    
    
    //-------------------------------

    
    
}