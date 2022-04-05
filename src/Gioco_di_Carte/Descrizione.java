/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;
 //Generali Alessandro "Autore"
/**
 *
 * @author alege
 */
public class Descrizione {
    protected String nome_carta;
    protected String posizione;
    protected String tipo_carte;
    public Descrizione(){
        
    }
    public Descrizione(String NC, String P, String TP){
        nome_carta=NC;
        posizione=P;
        tipo_carte=TP;
    }

    public void setNome_carta(String nome_carta) {
        this.nome_carta = nome_carta;
    }

    public void setPosizione(String posizione) {
        this.posizione = posizione;
    }

    public void setTipo_carte(String tipo_carte) {
        this.tipo_carte = tipo_carte;
    }

    public String getNome_carta() {
        return nome_carta;
    }

    public String getPosizione() {
        return posizione;
    }

    public String getTipo_carte() {
        return tipo_carte;
    }
    
    
    
}
