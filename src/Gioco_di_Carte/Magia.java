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

enum Carta_Magia{
    Doppio_Attacco,
    Distruggi_Carta,
    Resuscita_Carta,
    Ruba_Attacco,
    Spirito_Indomito,
    Brama_Sangue,
    Luna_Piena
}

public class Magia extends Carta{
    //attributi
    protected boolean doppio_attacco = false;
    protected boolean ruba_attacco = false;
    protected boolean spirito_indomito = false;
    protected boolean brama_sangue = false;
    protected boolean luna_piena = false;
    protected int turno;
    int numero_random;
    
    //oggetti
    Random rand = new Random();
    
    public Magia(String nome, String descrizione, String tipo_carta, Image foto){
        this.nome = nome;
        this.descrizione = descrizione;
        this.tipo_carta = tipo_carta;
        this.foto = foto;
    }
    
    public void ability(Mano mano, MazzoCampo campo, Cimitero cimitero, int index){
        turno = Gioco.nTurno;
        
        System.out.println("Ability");
        
        switch(Carta_Magia.valueOf(nome)){
            case Doppio_Attacco -> {
                System.out.println("Doppio_Attacco");
                if(rand.nextBoolean()){
                    doppio_attacco = true;
                }
                mano.SWAP_REMOVE(index, cimitero);
            }
            case Distruggi_Carta -> {
                System.out.println("Distruggi_Carta");
                if(campo.Size() > 0){
                    numero_random = rand.nextInt(campo.Size());
                    System.out.println("campo.Size(): " + campo.Size() + "\nnumero_random" + numero_random);
                    cimitero.Add(campo.Get(numero_random));
                    System.out.println("HERE1");
                    campo.Remove(numero_random);
                    System.out.println("HERE2");
                    mano.SWAP_REMOVE(index, cimitero);
                    System.out.println("HERE3");
                }else{
                    System.out.println("Non ci sono carte in campo da eliminare");  //eliminare questo print a progetto ultimato
                }
            }
            case Resuscita_Carta -> {
                System.out.println("Resuscita_Carta");
                if(cimitero.Size() > 0){
                    numero_random = rand.nextInt(cimitero.Size());
                    System.out.println("cimitero.Size(): " + cimitero.Size() + "\nnumero_random" + numero_random);
                    mano.Add(cimitero.Get(numero_random));
                    System.out.println("HERE1");
                    cimitero.Remove(numero_random);
                    System.out.println("HERE2");
                    mano.SWAP_REMOVE(index, cimitero);
                    System.out.println("HERE3");
                }else{
                    System.out.println("Non ci sono carte nel cimitero da resuscitare");  //eliminare questo print a progetto ultimato
                }
            }
            case Ruba_Attacco -> {
                System.out.println("Ruba_Attacco");
                ruba_attacco = true;
                mano.SWAP_REMOVE(index, cimitero);
            }
            case Spirito_Indomito -> {
                System.out.println("Spirito_Indomito");
                spirito_indomito = true;
                mano.SWAP_REMOVE(index, cimitero);
            }
            case Brama_Sangue -> {
                System.out.println("Brama_Sangue");
                brama_sangue = true;
                mano.SWAP_REMOVE(index, cimitero);
            }
            case Luna_Piena -> {
                System.out.println("Luna_Piena");
                luna_piena = true;
                mano.SWAP_REMOVE(index, cimitero);
            }
        }
    }
    
    //disability dovrà essere richiamato alla fine dell'effetto della carta 
    //ATTENZIONE: Non tutte le carte magia hanno la stessa durata, variano dai 1 ai 2 turni (per turno conto il turno di 1 giocatore, non di entrambi)
    public void disability(){
        if(((turno + 1 == Gioco.nTurno) && (Carta_Magia.valueOf(nome) != Carta_Magia.Ruba_Attacco)) || ((turno + 2 == Gioco.nTurno) && (Carta_Magia.Ruba_Attacco == Carta_Magia.valueOf(nome)))){
            System.out.println("disability");
            switch(Carta_Magia.valueOf(nome)){
                case Doppio_Attacco -> {
                    System.out.println("Doppio_Attacco");
                    doppio_attacco = false;
                }
                case Ruba_Attacco -> {
                    System.out.println("Ruba_Attacco");
                    ruba_attacco = false;
                }
                case Spirito_Indomito -> {
                    System.out.println("Spirito_Indomito");
                    spirito_indomito = false;
                }
                case Brama_Sangue -> {
                    System.out.println("Brama_Sangue");
                    brama_sangue = false;
                }
                case Luna_Piena -> {
                    System.out.println("Luna_Piena");
                    luna_piena = false;
                }
            }
        }
    }
}
