/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;

/**
 *
 * @author Alessandro Poggi
 */
public class Carta {
    protected String nome;
    protected String descrizione;
    protected String tipo_carta;
    protected String immagine;

    public Carta(String nome, String descrizione, String tipo_carta, String immagine) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.tipo_carta = tipo_carta;
        this.immagine = immagine;
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

    public void setImmagine(String immagine) {
        this.immagine = immagine;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getTipo_Carta() {
        return tipo_carta;
    }

    public String getImmagine() {
        return immagine;
    }
}
