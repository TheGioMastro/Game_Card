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
    
    protected static int nTurno; 
    protected int P1attack;
    protected int p2attack;
    
    
    //Grafica del gioco
    protected GraficaGioco grafica;
    
    
    //Costruttore--------------------------------------------------------------------------------------
    public Gioco(String nomeG1, String nomeG2, String tipoG1, String tipoG2) {
        
        this.nTurno = -1;
        this.P1attack = 0;
        this.p2attack = 0;
        
        giocatore_1 = new Campo(nomeG1, tipoG1, this);
        giocatore_2 = new Campo(nomeG2, tipoG2, this);
        
        grafica = new GraficaGioco(giocatore_1, giocatore_2);
        
    }
    //--------------------------------------------------------------------------------------------------
    
    public void moveToMano (int i){
        if(nTurno % 2 == 1){ //Giocatore 1
            giocatore_1.getMan().SWAP_REMOVE(i, giocatore_1.getMazCam());
            giocatore_1.getMazCam().Add(giocatore_1.getMan().getCarta(i));
            giocatore_1.getMan().Remove(i);
            
        }else{
            giocatore_2.getMan().SWAP_REMOVE(i, giocatore_2.getMazCam());
            giocatore_2.getMazCam().Add(giocatore_2.getMan().getCarta(i));
            giocatore_2.getMan().Remove(i);
        }
    }
    /*
    public void attacca(int iAttaccante, int iAttaccato){
        if(nTurno % 2 == 1){ //Giocatore 1
            giocatore_1.getMan().getCarta(iAttaccante).getPersonaggio().attacca(giocatore_2.getMan().getCarta(iAttaccato));
            
        }else{
            giocatore_2.getMan().getCarta(iAttaccante).attacca(giocatore_1.getMan().getCarta(iAttaccato));
        }
    }*/
    
    
    
    public void nextTurno(){
        /*Turni dispari --> Giocatore 1
          Turni pari -----> Giocatore 2
        */
        
        this.nTurno ++;
        
        int i;
        int nCarte = 4; //Numero carte da estrarre al primo turno
        
        if(nTurno == 0){//Turno Giocatore 2
            for(i=0;i<nCarte;i++){
                giocatore_1.getMazz().SWAP_REMOVE((int)Math.random() % 15, giocatore_1.getMan());
                giocatore_2.getMazz().SWAP_REMOVE((int)Math.random() % 15, giocatore_2.getMan());
            }
            
            //reload grafica
            grafica.reload_GUI(giocatore_1, giocatore_2);
            grafica.hide_GUI(giocatore_1, true, giocatore_2, false);
            
        }else if(nTurno == 1){//Turno Giocatore 1
            
            //reload grafica
            grafica.reload_GUI(giocatore_1, giocatore_2);
            grafica.hide_GUI(giocatore_1, false, giocatore_2, true);
            
        }else if(nTurno % 2 == 1){//Turno Giocatore 1
            this.P1attack ++;
            
            if(giocatore_1.getMan().sizeGestione() < 8){ //Se c'è spazio nella mano pesca
                giocatore_1.getMazz().SWAP_REMOVE((int)Math.random() % 15, giocatore_1.getMan());
            }
            
            //reload grafica
            grafica.reload_GUI(giocatore_1);
            grafica.hide_GUI(giocatore_1, false, giocatore_2, true);
            
        }else{//Turno Giocatore 2
            this.p2attack ++;
            
            if(giocatore_2.getMan().sizeGestione() < 8){ //Se c'è spazio nella mano pesca
                giocatore_2.getMazz().SWAP_REMOVE((int)Math.random() % 15, giocatore_2.getMan());
            }
            
            //reload grafica
            grafica.reload_GUI(giocatore_2);
            grafica.hide_GUI(giocatore_1, true, giocatore_2, false);
            
        }
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