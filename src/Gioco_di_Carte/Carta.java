/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;

/**
 *
 * @author Alessandro Poggi
 */
public abstract class Carta {
    //attributi comuni
    protected String nome;
    protected String descrizione;
    protected String tipo_carta;
    protected String immagine;
    
    //attributi carta personaggio
    protected String tipo_personaggio;
    protected boolean isAlive;
    protected int pAttack;
    protected int pDefense;
    
    //attributi carta magia
    protected int indice_magia;
    protected boolean doppio_attacco = false;
    protected boolean ruba_attacco = false;
    protected boolean spirito_indomito = false;
    protected boolean brama_sangue = false;
    protected boolean luna_piena = false;
    
    //oggetti
    protected Personaggio personaggio;
    protected Magia magia;
    
    public Carta(){
        if(tipo_carta.equals("Personaggio")){
            personaggio = new Personaggio(tipo_personaggio, pAttack, pDefense, nome, descrizione, tipo_carta);
        }else{
            magia = new Magia(indice_magia, nome, descrizione, tipo_carta);
        }
    }
    
    //metodi
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
    
    public Personaggio getPersonaggio(){
        return personaggio;
    }
    
    public Magia getMagia(){
        return magia;
    }
}
