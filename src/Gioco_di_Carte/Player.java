/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 *
 * @author Giuliano Tommaso Colombo <colombogiulianotommaso@itis-molinari.eu>
 */
public class Player {
    protected String nome;
    protected int vita;
    protected int tipo_deck; // 1 == Vampiro / 2 == Licantropo / 3 == Eroe
    
    //Parte interfaccia grafica(contiene il campo per la vita e il nome del giocatore)
    //contiene il nome del giocatore
    protected Label scritta_giocatore_nome;
    //contiene la scritta "Vita:"
    protected Label scritta_giocatore_vita_Stringa;
    //contiene il valore della vita
    protected Label scritta_giocatore_vita;
    
    
    //Costruttori
    public Player(String nome, int tipo_deck) {
        this.nome = nome;
        this.vita = 4000;
        this.tipo_deck = tipo_deck;
        
        //Parte interfaccia grafica(istanziamento)
        scritta_giocatore_nome = new Label(this.nome);
        scritta_giocatore_nome.setFont(new Font("OCR A Extended", 30));
        scritta_giocatore_nome.setTextFill(Color.web("#F8C66D"));
        scritta_giocatore_vita_Stringa = new Label("Vita:");
        scritta_giocatore_vita_Stringa.setFont(new Font("OCR A Extended", 30));
        scritta_giocatore_vita_Stringa.setTextFill(Color.web("#F8C66D"));
        scritta_giocatore_vita = new Label(String.valueOf(this.vita));
        scritta_giocatore_vita.setFont(new Font("OCR A Extended", 30));
        scritta_giocatore_vita.setTextFill(Color.web("#F8C66D"));
    }
    
    public Player(){
        
        //Parte interfaccia grafica(istanziamento)
        scritta_giocatore_nome = new Label(this.nome);
        scritta_giocatore_nome.setFont(new Font("OCR A Extended", 30));
        scritta_giocatore_nome.setTextFill(Color.web("#F8C66D"));
        scritta_giocatore_vita_Stringa = new Label("Vita:");
        scritta_giocatore_vita_Stringa.setFont(new Font("OCR A Extended", 30));
        scritta_giocatore_vita_Stringa.setTextFill(Color.web("#F8C66D"));
        scritta_giocatore_vita = new Label(String.valueOf(this.vita));
        scritta_giocatore_vita.setFont(new Font("OCR A Extended", 30));
        scritta_giocatore_vita.setTextFill(Color.web("#F8C66D"));
    }
    //------------------------------------------------------
    
    //setter----------------------------------
    public void setNome(String nome) {
        this.nome = nome;
        this.scritta_giocatore_nome.setText(nome);
    }

    public void setVita(int vita) {
        this.vita = vita;
        this.scritta_giocatore_vita.setText(String.valueOf(vita));
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

    public Label getScritta_giocatore_nome() {
        return scritta_giocatore_nome;
    }

    public Label getScritta_giocatore_vita_Stringa() {
        return scritta_giocatore_vita_Stringa;
    }

    public Label getScritta_giocatore_vita() {
        return scritta_giocatore_vita;
    }
    
    
    //------------------------------------------
    
    //toString
    public String toString(){
        return "\nNome: " + this.nome + "\nVita: " + this.vita + "Tipo Deck: " + this.tipo_deck;
    }
}
