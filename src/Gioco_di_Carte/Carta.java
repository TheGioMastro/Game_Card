/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;

import javafx.scene.image.Image;

/**
 *
 * @author Alessandro Poggi <poggialessandro@itis-molinari.eu>
 */
public class Carta {
    //attributi comuni
    protected String nome;
    protected String descrizione;
    protected String tipo_carta;
    protected Image foto;
    
    //oggetti
    protected Personaggio personaggio;
    protected Magia magia;
    
    //costruttore generico
    public Carta(){
    }
    
    //costruttore carte personaggio
    public Carta(String tipo_personaggio, int pAttack, int pDefense, String nome, String descrizione, String tipo_carta, Image foto){
        personaggio = new Personaggio(tipo_personaggio, pAttack, pDefense, nome, descrizione, tipo_carta, foto);
        this.nome = nome;
        this.descrizione = descrizione;
        this.tipo_carta = tipo_carta;
        this.foto = foto;
    }
    
    //costruttore carte magia
    public Carta(String nome, String descrizione, String tipo_carta, Image foto){
        magia = new Magia(nome, descrizione, tipo_carta, foto);
        this.nome = nome;
        this.descrizione = descrizione;
        this.tipo_carta = tipo_carta;
        this.foto = foto;
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

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getTipo_Carta() {
        return tipo_carta;
    }

    public Personaggio getPersonaggio(){
        return personaggio;
    }
    
    public Magia getMagia(){
        return magia;
    }
}
