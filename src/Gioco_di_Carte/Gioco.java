/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;

import java.util.Random;

/**
 *
 * @author Giuliano Tommaso Colombo <colombogiulianotommaso@itis-molinari.eu>
 */
public class Gioco {
    protected Random rand = new Random();
    
    protected Campo giocatore_1; //CAMPO SOPRA
    protected Campo giocatore_2; //CAMPO SOTTO
    
    protected static int nTurno; 
    protected int p1attack;
    protected int p2attack;
    
    
    //Grafica del gioco
    protected GraficaGioco grafica;
    
    
    //Costruttore--------------------------------------------------------------------------------------
    public Gioco(String nomeG1, String nomeG2, String tipoG1, String tipoG2) {
        
        this.nTurno = -1;
        this.p1attack = 0;
        this.p2attack = 0;
        
        giocatore_1 = new Campo(nomeG1, tipoG1, this);
        giocatore_2 = new Campo(nomeG2, tipoG2, this);
        
        grafica = new GraficaGioco(giocatore_1, giocatore_2, this);
        
    }
    //--------------------------------------------------------------------------------------------------
    
    public void moveToCampo (int i){
        if(nTurno % 2 == 1){ //Giocatore 1
            
            if(giocatore_1.getMan().getCarta(i).getTipo_Carta().equals("Magic")){
                
                System.out.println(giocatore_1.getMan().getCarta(i).getNome());
                
                giocatore_1.getMan().getCarta(i).getMagia().ability(giocatore_1.getMan(), giocatore_2.getMazCam(), giocatore_1.getCim(), i);
                //giocatore_1.getMan().SWAP_REMOVE(i, giocatore_1.getCim());
            }else{
                if(giocatore_1.getMazCam().sizeArrayList_radiobutton_mazzocampo()<6){
                    giocatore_1.getMan().get_ArrayList_radiobutton_mano(i).getMycontextmenu().getMettiInCampo().setDisable(true);
                    giocatore_1.getMan().get_ArrayList_radiobutton_mano(i).getMycontextmenu().getAttacca().setDisable((nTurno!=0 && nTurno!=1)?false:true);
                    giocatore_1.getMan().SWAP_REMOVE(i, giocatore_1.getMazCam());
                    //giocatore_1.getMazCam().Add(giocatore_1.getMan().getCarta(i));
                    //giocatore_1.getMan().Remove(i);
                }
            }
            
        }else{
            
            if(giocatore_2.getMan().getCarta(i).getTipo_Carta().equals("Magic")){
                
                System.out.println(giocatore_2.getMan().getCarta(i).getNome());
                
                giocatore_2.getMan().getCarta(i).getMagia().ability(giocatore_2.getMan(), giocatore_1.getMazCam(), giocatore_2.getCim(), i);
                //giocatore_2.getMan().SWAP_REMOVE(i, giocatore_2.getCim());
            }else{
            
                if(giocatore_2.getMazCam().sizeArrayList_radiobutton_mazzocampo()<6){
                    giocatore_2.getMan().get_ArrayList_radiobutton_mano(i).getMycontextmenu().getMettiInCampo().setDisable(true);
                    giocatore_2.getMan().get_ArrayList_radiobutton_mano(i).getMycontextmenu().getAttacca().setDisable((nTurno!=0 && nTurno!=1)?false:true);
                    giocatore_2.getMan().SWAP_REMOVE(i, giocatore_2.getMazCam());
                    //giocatore_2.getMazCam().Add(giocatore_2.getMan().getCarta(i));
                    //giocatore_2.getMan().Remove(i);
                }
            }
        }
        
        grafica.reload_GUI(giocatore_1, giocatore_2);
        grafica.reload_tasto_destro(giocatore_1);
        grafica.reload_tasto_destro(giocatore_2);
    }
    
    public void attacca(int iAttaccante, int iAttaccato){
        System.out.println("indici attacco" + iAttaccante + " " + iAttaccato);
        System.out.println("pattack1 " + p1attack);
        System.out.println("pattack2 " + p2attack);
        
        if(nTurno % 2 == 1 && p1attack > 0){ //Giocatore 1
            System.out.println("Vita 1: " + giocatore_1.getMazCam().Get(iAttaccante).getPersonaggio().getpDefense());
            //INCREMENTARE L'UTILIZZO DELL'ATTACCO DI UNO OGNI VOLTA ESEGUITO UN ATTACCO(CONTROLLARE SE POSSIBILE ATTACCARE)
            
            if(giocatore_1.getMazCam().Get(iAttaccante).getPersonaggio().attacca(giocatore_2.getMazCam().Get(iAttaccato), giocatore_2.getGiocatore())){
                giocatore_2.getMazCam().SWAP_REMOVE(iAttaccato, giocatore_2.getCim());
            }
            p1attack--;
            System.out.println("pattack1 " + p1attack);
        }else if (nTurno %2 == 0 && p2attack > 0){ //Giocatore 2
            System.out.println("Vita 2: " + giocatore_2.getMazCam().Get(iAttaccante).getPersonaggio().getpDefense());
            
            if(giocatore_2.getMazCam().Get(iAttaccante).getPersonaggio().attacca(giocatore_1.getMazCam().Get(iAttaccato), giocatore_1.getGiocatore())){
                giocatore_1.getMazCam().SWAP_REMOVE(iAttaccato, giocatore_1.getCim());
            }
            
            p2attack--;
            System.out.println("pattack2 " + p2attack);
        }
        //reload opzioni tasto destro
        grafica.reload_GUI(giocatore_1, giocatore_2);
        grafica.reload_tasto_destro(giocatore_1);
        grafica.reload_tasto_destro(giocatore_2);
        
        //update tasto destro attacco
        grafica.reload_tasto_destro_attacco(giocatore_1, p1attack, giocatore_2, p2attack);
    }
    
    public int checkWinner(){
        if(giocatore_1.getGiocatore().getVita() > 0 && giocatore_2.getGiocatore().getVita() > 0){
            return 0; //Nessuno è morto :(
        }else if(giocatore_1.getGiocatore().getVita() <= 0){
            return 1; //Giocatore 1 è morto
        }else if(giocatore_2.getGiocatore().getVita() <= 0){
            return 2; //Giocatore 2 è morto
        }
        return -1;
    }
    
    
    public void nextTurno(){
        /*Turni dispari --> Giocatore 1
          Turni pari -----> Giocatore 2
        */
        
        this.nTurno ++;
        
        int i;
        int nCarte = 4; //Numero carte da estrarre al primo turno
        
        //reload opzioni tasto destro
        grafica.reload_tasto_destro(giocatore_1);
        grafica.reload_tasto_destro(giocatore_2);
        if(nTurno == 2){
            for(i=0; i<giocatore_1.getMazCam().sizeArrayList_radiobutton_mazzocampo(); i++){
                giocatore_1.getMazCam().get_ArrayList_radiobutton_mazzocampo(i).getMycontextmenu().getAttacca().setDisable(false);
            }
            for(i=0; i<giocatore_2.getMazCam().sizeArrayList_radiobutton_mazzocampo(); i++){
                giocatore_2.getMazCam().get_ArrayList_radiobutton_mazzocampo(i).getMycontextmenu().getAttacca().setDisable(false);
            }
        }
        
        if(nTurno == 0){//Turno Giocatore 2
            
            for(i=0;i<nCarte;i++){
                giocatore_1.getMazz().SWAP_REMOVE(rand.nextInt(giocatore_1.getMazz().Size()), giocatore_1.getMan());
                giocatore_2.getMazz().SWAP_REMOVE(rand.nextInt(giocatore_2.getMazz().Size()), giocatore_2.getMan());
            }
            
            //reload grafica
            grafica.reload_GUI(giocatore_1, giocatore_2);
            grafica.hide_GUI(giocatore_1, true, giocatore_2, false);
            
        }else if(nTurno == 1){//Turno Giocatore 1
            
            //reload grafica
            grafica.reload_GUI(giocatore_1, giocatore_2);
            grafica.hide_GUI(giocatore_1, false, giocatore_2, true);
            
        }else if(nTurno % 2 == 1){//Turno Giocatore 1
            this.p1attack = 1;
            for(i=0; i < giocatore_1.getCim().Size(); i++){
                if(giocatore_1.getCim().Get(i).getTipo_Carta().equals("Magia")){
                    if(giocatore_1.getCim().Get(i).getMagia().check2P()){
                        this.p1attack = 2;
                    }
                }
            }
            
            
            if(giocatore_1.getMan().sizeGestione() < 8){ //Se c'è spazio nella mano pesca
                giocatore_1.getMazz().SWAP_REMOVE(rand.nextInt(giocatore_1.getMazz().Size()), giocatore_1.getMan());
            }
            
            //reload grafica
            grafica.reload_GUI(giocatore_1);
            grafica.hide_GUI(giocatore_1, false, giocatore_2, true);
            
        }else{//Turno Giocatore 2
            this.p2attack = 1;
            for(i=0; i < giocatore_2.getCim().Size(); i++){
                if(giocatore_2.getCim().Get(i).getTipo_Carta().equals("Magia")){
                    if(giocatore_2.getCim().Get(i).getMagia().check2P()){
                        this.p2attack = 2;
                    }
                }
            }
            
            if(giocatore_2.getMan().sizeGestione() < 8){ //Se c'è spazio nella mano pesca
                giocatore_2.getMazz().SWAP_REMOVE(rand.nextInt(giocatore_2.getMazz().Size()), giocatore_2.getMan());
            }
            
            //reload grafica
            grafica.reload_GUI(giocatore_2);
            grafica.hide_GUI(giocatore_1, true, giocatore_2, false);
            
        }
        
        //update tasto destro attacco
        grafica.reload_tasto_destro_attacco(giocatore_1, p1attack, giocatore_2, p2attack);
        
        //disattivazione carte magia (deve stare in fondo al next turn)
        for(i = 0; i < giocatore_1.getDck().sizeDeck(); i++){
            if(giocatore_1.getDck().getCarta(i).getTipo_Carta().equals("Magia")){
                giocatore_1.getDck().getCarta(i).getMagia().disability();
            }
            if(giocatore_2.getDck().getCarta(i).getTipo_Carta().equals("Magia")){
                giocatore_2.getDck().getCarta(i).getMagia().disability();
            }
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
    
    public static int getnTurno() {
        return nTurno;
    }
    //-------------------------------

   

    
    
}