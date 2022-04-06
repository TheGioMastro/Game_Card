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
    protected boolean canAttack;
    protected int pAttack;
    protected int pDefense;

    public Personaggio(String tipo_personaggio, boolean isAlive, boolean canAttack, int pAttack, int pDefense, String nome, String descrizione, String tipo_carta, String immagine) {
        super(nome, descrizione, tipo_carta, immagine);
        this.tipo_personaggio = tipo_personaggio;
        this.isAlive = isAlive;
        this.canAttack = canAttack;
        this.pAttack = pAttack;
        this.pDefense = pDefense;
    }

    public void setTipo(String tipo_personaggio) {
        this.tipo_personaggio = tipo_personaggio;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public void setCanAttack(boolean canAttack) {
        this.canAttack = canAttack;
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

    public boolean isCanAttack() {
        return canAttack;
    }

    public int getpAttack() {
        return pAttack;
    }

    public int getpDefense() {
        return pDefense;
    }

    public boolean attacca(Personaggio attaccato){
        
    }
    
    public int difesa(){
        
    }
}
