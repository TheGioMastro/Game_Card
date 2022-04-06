/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;

/**
 *
 * @author Alessandro Poggi
 */
public class Personaggio extends Carta{
    protected String tipo_personaggio;
    protected boolean isAlive;
    //protected boolean canAttack;  //sostituito dal flag "ruba_attacco" nella classe magia
    protected int pAttack;
    protected int pDefense;

    public Personaggio(String tipo_personaggio, boolean isAlive, int pAttack, int pDefense, String nome, String descrizione, String tipo_carta, String immagine) {
        super(nome, descrizione, tipo_carta, immagine);
        this.tipo_personaggio = tipo_personaggio;
        this.isAlive = isAlive;
        this.pAttack = pAttack;
        this.pDefense = pDefense;
    }

    public void setTipo(String tipo_personaggio) {
        this.tipo_personaggio = tipo_personaggio;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public void setpAttack(int pAttack) {
        this.pAttack = pAttack;
    }

    public void setpDefense(int pDefense) {
        this.pDefense = pDefense;
    }

    public String getTipo_personaggio() {
        return tipo_personaggio;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public int getpAttack() {
        return pAttack;
    }

    public int getpDefense() {
        return pDefense;
    }
    
    public boolean attacca(Personaggio attaccato){
        return attaccato.difesa(pAttack) < 0;
    }
    
    public int difesa(int pAttack){
        return this.pDefense - pAttack;
    }
}
