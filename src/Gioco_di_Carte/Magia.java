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
    //attributi
    protected int indice_magia;
    protected boolean doppio_attacco = false;
    protected boolean ruba_attacco = false;
    protected boolean spirito_indomito = false;
    protected boolean brama_sangue = false;
    protected boolean luna_piena = false;
    protected int turno;
    
    //oggetti
    Random rand = new Random();
    
    public Magia(int indice_magia, String nome, String descrizione, Image foto){
        this.nome = nome;
        this.descrizione = descrizione;
        this.tipo_carta = tipo_carta;
        this.foto = foto;
    }
    
    public void ability(Mano mano, MazzoCampo campo, Cimitero cimitero, int i){
        turno = Gioco.nTurno;
        switch(indice_magia){
            case 1 -> {
                if(rand.nextBoolean()){
                    doppio_attacco = true;
                }
            }
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
            case 6 -> brama_sangue = true;
            case 7 -> luna_piena = true;
        }
    }
    
    //disability dovrà essere richiamato alla fine dell'effetto della carta 
    //ATTENZIONE: Non tutte le carte magia hanno la stessa durata, variano dai 1 ai 2 turni (per turno conto il turno di 1 giocatore, non di entrambi)
    //P.S.: non è di fatto finito, lo finirò quando avremo implementato la fine del turno
    public void disability(){
        if(turno + 1 == Gioco.nTurno && indice_magia != 4 || turno + 2 == Gioco.nTurno && indice_magia == 4){
            switch(indice_magia){
                case 1 -> doppio_attacco = false;
                case 4 -> ruba_attacco = false;
                case 5 -> spirito_indomito = false;
                case 6 -> brama_sangue = false;
                case 7 -> luna_piena = false;
            }
        }
    }
}
