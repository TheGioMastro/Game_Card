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
}
