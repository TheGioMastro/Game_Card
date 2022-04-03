/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;

/**
 *
 * @author Giuliano Tommaso Colombo <colombogiulianotommaso@itis-molinari.eu>
 */
public class Campo {
    protected Deck dck = new Deck();
    protected Mano man = new Mano();
    protected MazzoCampo mazCam = new MazzoCampo();
    protected Cimitero cim = new Cimitero();
    protected Player giocatore = new Player();
    
    //Costruttore
    public Campo() {
    }
    //------------
    
    //Setter------------------------------------
    public void setDck(Deck dck) {
        this.dck = dck;
    }

    public void setMan(Mano man) {
        this.man = man;
    }

    public void setMazCam(MazzoCampo mazCam) {
        this.mazCam = mazCam;
    }

    public void setCim(Cimitero cim) {
        this.cim = cim;
    }

    public void setGiocatore(Player giocatore) {
        this.giocatore = giocatore;
    }
    //--------------------------------------------
    
    //Getter------------------------
    public Deck getDck() {
        return dck;
    }

    public Mano getMan() {
        return man;
    }

    public MazzoCampo getMazCam() {
        return mazCam;
    }

    public Cimitero getCim() {
        return cim;
    }

    public Player getGiocatore() {
        return giocatore;
    }
    //------------------------------
    
    
    
}
