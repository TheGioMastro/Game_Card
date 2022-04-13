/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Alessandro Poggi
 */
public class Magia extends Carta{
    protected int indice_magia;
    protected boolean doppio_attacco = false;
    protected boolean ruba_attacco = false;
    protected boolean spirito_indomito = false;
    protected boolean sacca_di_sangue = false;
    protected boolean luna_piena = false;
    Random rand = new Random();
    
    public Magia(int indice_magia, String nome, String descrizione, String tipo_carta, String immagine) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.tipo_carta = tipo_carta;
        this.immagine = immagine;
        this.indice_magia = indice_magia;
    }
    
    public void ability(Mano mano, MazzoCampo campo, Cimitero cimitero, int i){
        switch(indice_magia){
            case 1 -> doppio_attacco = true;
            case 2 -> {
                cimitero.Add(campo.Get(i));
                campo.Remove(i);
            }
            case 3 -> {
                int numero_random = rand.nextInt(cimitero.Size() - 1);
                mano.Add(cimitero.Get(numero_random));
                cimitero.Remove(numero_random);
            }
            case 4 -> ruba_attacco = true;
            case 5 -> spirito_indomito = true;
            case 6 -> sacca_di_sangue = true;
            case 7 -> luna_piena = true;
        }
    }
    
    //disability dovrà essere richiamato alla fine dell'effetto della carta 
    //ATTENZIONE: Non tutte le carte magia hanno la stessa durata, variano dai 1 ai 2 turni (per turno conto il turno di 1 giocatore, non di entrambi)
    //P.S.: non è di fatto finito, lo finirò quando avremo implementato la fine del turno
    public void disability(){
        switch(indice_magia){
            case 1 -> doppio_attacco = false;
            case 4 -> ruba_attacco = false;
            case 5 -> spirito_indomito = false;
            case 6 -> sacca_di_sangue = false;
            case 7 -> luna_piena = false;
        }
    }
}
