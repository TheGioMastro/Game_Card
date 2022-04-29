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
    protected String nome;
    protected String descrizione;
    protected String tipo_carta;
    protected Image foto;
    protected int indice_magia;
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
        
        if(nome.equals("Doppio Attacco"))
            indice_magia = 1;
        else if(nome.equals("Distruggi Carta"))
            indice_magia = 2;
        else if(nome.equals("Resuscita Carta"))
            indice_magia = 3;
        else if(nome.equals("Ruba Attacco"))
            indice_magia = 4;
        else if(nome.equals("Spirito Indomito"))
            indice_magia = 5;
        else if(nome.equals("Brama Sangue"))
            indice_magia = 6;
        else if(nome.equals("Luna Piena"))
            indice_magia = 7;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setTipo(String tipo_carta) {
        this.tipo_carta = tipo_carta;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }
    
    public void ability(Mano mano, MazzoCampo campo, Cimitero cimitero){
        turno = Gioco.nTurno;
        switch(indice_magia){
            case 1 -> {
                if(rand.nextBoolean()){
                    doppio_attacco = true;
                }
            }
            case 2 -> {
                numero_random = rand.nextInt((campo.Size() == 0)? campo.Size():campo.Size() - 1);
                cimitero.Add(campo.Get(numero_random));
                campo.Remove(numero_random);
            }
            case 3 -> {
                numero_random = rand.nextInt((cimitero.Size() == 0)? cimitero.Size():cimitero.Size() - 1);
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
