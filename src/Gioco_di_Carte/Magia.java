/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;

import java.util.Random;
import javafx.scene.image.Image;

/**
 *
 * @author Alessandro Poggi <poggialessandro@itis-molinari.eu>
 */

public class Magia extends Carta{
    protected enum Carta_Magia{
        double_attack,
        earthquake,
        resurrect,
        block_attack,
        spirito_indomito,
        brama_sangue,
        full_moon
    }

    //attributi
    protected boolean spirito_indomito = false;
    protected boolean brama_sangue = false;
    protected int turno;
    protected int numero_random;
    protected boolean Luna_piena_attiva = false;
    
    //oggetti
    protected Random rand = new Random();
    
    public Magia(String nome, String descrizione, String tipo_carta, Image foto){
        this.nome = nome;
        this.descrizione = descrizione;
        this.tipo_carta = tipo_carta;
        this.foto = foto;
    }
    
    public void ability(Mano mano, MazzoCampo campo_suo, Cimitero cimitero_mio, Cimitero cimitero_suo, Deck deck_mio, Deck deck_suo, int index, Gioco gioco){
        turno = Gioco.nTurno;
        
        System.out.println("Ability");
        
        switch(Carta_Magia.valueOf(nome)){
            case double_attack -> {
                System.out.println("doppio_attacco");
                if((gioco.getnTurno() % 2) == 1){
                    gioco.incrementAttackPointP1();
                }else{
                    gioco.incrementAttackPointP2();
                }
                mano.SWAP_REMOVE(index, cimitero_mio);
            }
            case earthquake -> {
                System.out.println("terremoto");
                if(campo_suo.Size() > 0){
                    numero_random = rand.nextInt(campo_suo.Size());
                    campo_suo.SWAP_REMOVE(numero_random, cimitero_suo);
                    mano.SWAP_REMOVE(index, cimitero_mio);
                }else{
                    System.out.println("Non ci sono carte in campo da eliminare");  //eliminare questo print a progetto ultimato
                }
            }
            case resurrect -> {
                System.out.println("resuscita");
                if(cimitero_mio.Size() > 0){
                    numero_random = rand.nextInt(cimitero_mio.Size());
                    mano.SWAP_REMOVE(index, cimitero_mio);
                    cimitero_mio.SWAP_REMOVE(numero_random, mano);
                    if(mano.getCarta(mano.sizeArrayList_radiobutton_mano()-1).getPersonaggio().getpAttack() == 100){
                        mano.getCarta(mano.sizeArrayList_radiobutton_mano()-1).getPersonaggio().setpDefense(300);
                        mano.get_ArrayList_radiobutton_mano(mano.sizeArrayList_radiobutton_mano()-1).setDisable(false);
                    }else{
                        mano.getCarta(mano.sizeArrayList_radiobutton_mano()-1).getPersonaggio().setpDefense(100);
                        mano.get_ArrayList_radiobutton_mano(mano.sizeArrayList_radiobutton_mano()-1).setDisable(false);
                    }
                }else{
                    System.out.println("Non ci sono carte nel cimitero da resuscitare");  //eliminare questo print a progetto ultimato
                }
                if(gioco.getnTurno() % 2 == 1){ //giocatore 1
                    gioco.getGiocatore_1().getMan().get_ArrayList_radiobutton_mano(mano.sizeArrayList_radiobutton_mano()-1).getMycontextmenu().getMettiInCampo().setDisable(false);
                }else{
                    gioco.getGiocatore_2().getMan().get_ArrayList_radiobutton_mano(mano.sizeArrayList_radiobutton_mano()-1).getMycontextmenu().getMettiInCampo().setDisable(false);
                }
                gioco.getGrafica().reload_GUI(gioco.getGiocatore_1(), gioco.getGiocatore_2());
                gioco.getGrafica().reload_tasto_destro(gioco.getGiocatore_1());
                gioco.getGrafica().reload_tasto_destro(gioco.getGiocatore_2());
            }
            case block_attack -> {
                System.out.println("blocca_attacco");
                if((gioco.getnTurno() % 2) == 1){
                    gioco.blockAttackP1();
                }else{
                    gioco.blockAttackP2();
                }
                mano.SWAP_REMOVE(index, cimitero_mio);
            }
            case spirito_indomito -> {
                System.out.println("spirito_indomito");
                spirito_indomito = true;
                mano.SWAP_REMOVE(index, cimitero_mio);
            }
            case brama_sangue -> {
                System.out.println("brama_sangue");
                brama_sangue = true;
                mano.SWAP_REMOVE(index, cimitero_mio);
            }
            case full_moon -> {
                System.out.println("luna_piena");
                mano.SWAP_REMOVE(index, cimitero_mio);
                for(int i = 0; i < deck_mio.sizeDeck(); i++){
                    if(deck_mio.getCarta(i).getTipo_Carta().equals("Personaggio"))
                        deck_mio.getCarta(i).getPersonaggio().incrementa_valore_attacco();
                }
                Luna_piena_attiva = true;
            }
        }
    }
    
    //disability dovrà essere richiamato alla fine dell'effetto della carta 
    //ATTENZIONE: Non tutte le carte magia hanno la stessa durata, variano dai 1 ai 2 turni (per turno conto il turno di 1 giocatore, non di entrambi)
    public void disability(MazzoCampo campo_suo, Deck deck_mio, Deck deck_suo){
        if(((turno + 1 == Gioco.nTurno) && (Carta_Magia.valueOf(nome) != Carta_Magia.block_attack)) || ((turno + 2 == Gioco.nTurno) && (Carta_Magia.block_attack == Carta_Magia.valueOf(nome)))){
            System.out.println("disability");
            switch(Carta_Magia.valueOf(nome)){
                case block_attack -> {
                    System.out.println("Ruba_Attacco");
                    for(int i = 0; i < campo_suo.Size(); i++)
                        if(deck_suo.getCarta(i).getTipo_Carta().equals("Personaggio"))
                            deck_suo.getCarta(i).getPersonaggio().sblocca_attacco();
                }
                case spirito_indomito -> {
                    System.out.println("Spirito_Indomito");
                    spirito_indomito = false;
                }
                case brama_sangue -> {
                    System.out.println("Brama_Sangue");
                    brama_sangue = false;
                }
                case full_moon -> {
                    if(Luna_piena_attiva){
                        System.out.println("Luna_Piena");
                        for(int i = 0; i < deck_mio.sizeDeck(); i++){
                            if(deck_mio.getCarta(i).getTipo_Carta().equals("Personaggio"))
                                deck_mio.getCarta(i).getPersonaggio().decrementa_valore_attacco();
                        }
                        Luna_piena_attiva = false;
                    }
                }
            }
        }
    }
}
