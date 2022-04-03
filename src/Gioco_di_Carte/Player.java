/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;

/**
 *
 * @author Giuliano Tommaso Colombo <colombogiulianotommaso@itis-molinari.eu>
 */
public class Player {
    protected String nome;
    protected int vita;
    protected int tipo_deck;
    
    //Costruttori
    public Player(String nome, int vita, int tipo_deck) {
        this.nome = nome;
        this.vita = vita;
        this.tipo_deck = tipo_deck;
    }
    
    public Player(){
    }
    //------------------------------------------------------
    
    //setter----------------------------------
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVita(int vita) {
        this.vita = vita;
    }

    public void setTipo_deck(int tipo_deck) {
        this.tipo_deck = tipo_deck;
    }
    //-----------------------------------------
    
    //getter-----------------------------------
    public String getNome() {
        return nome;
    }

    public int getVita() {
        return vita;
    }

    public int getTipo_deck() {
        return tipo_deck;
    }
    //------------------------------------------
    
    //toString
    public String toString(){
        return "\nNome: " + this.nome + "\nVita: " + this.vita + "Tipo Deck: " + this.tipo_deck;
    }
}
