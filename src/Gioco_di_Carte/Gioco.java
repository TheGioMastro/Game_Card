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
    
    protected int nTurno; 
    protected int P1attack;
    protected int p2attack;
    
    
    //Grafica del gioco
    protected GraficaGioco grafica;
    
    
    //Costruttore--------------------------------------------------------------------------------------
    public Gioco(String nomeG1, String nomeG2, String tipoG1, String tipoG2) {
        
        this.nTurno = 0;
        this.P1attack = 0;
        this.p2attack = 0;
        
        giocatore_1 = new Campo(nomeG1, tipoG1);
        giocatore_2 = new Campo(nomeG2, tipoG2);
        
        grafica = new GraficaGioco(giocatore_1, giocatore_2);
        
    }
    //--------------------------------------------------------------------------------------------------
    
    public void nextTurno(){
        /*Turni dispari --> Giocatore 1
          Turni pari -----> Giocatore 2
        */
        
        int i;
        int nCarte = 4; //Numero carte da estrarre al primo turno
        
        if(nTurno == 0){
            for(i=0;i<nCarte;i++){
                giocatore_1.getMazz().SWAP_REMOVE(i = (int)Math.random() % 15, giocatore_1.getMan());
                giocatore_2.getMazz().SWAP_REMOVE(i = (int)Math.random() % 15, giocatore_2.getMan());
            }
        }
        
        if(nTurno % 2 == 1){ //Se turno giocatore 1
            this.P1attack ++;
            
            if(giocatore_1.getMan().sizeGestione() < 8 && giocatore_1.getMazz().Size() > 0){ //controlla spazio nella mano  e ci sono ancora carte pesca
                giocatore_1.getMazz().SWAP_REMOVE(i = (int)Math.random() % 15, giocatore_1.getMan());
            }
            
        //Turno Giocatore 2
        }else{
            this.p2attack ++;
            
            if(giocatore_2.getMan().sizeGestione() < 8 && giocatore_2.getMazz().Size() > 0){
                giocatore_2.getMazz().SWAP_REMOVE(i = (int)Math.random() % 15, giocatore_2.getMan());
            }
        }
        
        this.nTurno ++;
    }
    
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