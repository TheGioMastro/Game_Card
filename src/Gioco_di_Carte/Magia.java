/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;

/**
 *
 * @author Alessandro Poggi
 */
public class Magia extends Carta{
    protected int indice_magia;
    protected boolean doppio_attacco = false;
    protected boolean distruggi_carta = false;
    protected boolean rianima_carta = false;
    protected boolean ruba_attacco = false;
    protected boolean spirito_indomito = false;
    protected boolean sacca_di_sangue = false;
    protected boolean luna_piena = false;
    
    public Magia(int indice_magia, String nome, String descrizione, String tipo_carta, String immagine) {
        super(nome, descrizione, tipo_carta, immagine);
        this.indice_magia = indice_magia;
    }
    
    public void ability(){
        switch(indice_magia){
            case 1 -> doppio_attacco = true;
            case 2 -> distruggi_carta = true;
            case 3 -> rianima_carta = true;
            case 4 -> ruba_attacco = true;
            case 5 -> spirito_indomito = true;
            case 6 -> sacca_di_sangue = true;
            case 7 -> luna_piena = true;
        }
    }
}
