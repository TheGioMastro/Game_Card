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
public class Personaggio extends Carta{
    protected String tipo_personaggio;
    protected int pAttack;
    protected int pDefense;
    protected boolean check = false;
    
    public Personaggio(String tipo_personaggio, int pAttack, int pDefense, String nome, String descrizione, String tipo_carta, Image foto) {
        this.tipo_personaggio = tipo_personaggio;
        this.pAttack = pAttack;
        this.pDefense = pDefense;
        this.nome = nome;
        this.descrizione = descrizione;
        this.tipo_carta = tipo_carta;
        this.foto = foto;
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

    public int getpAttack() {
        return pAttack;
    }

    public int getpDefense() {
        return pDefense;
    }
    
    public boolean attacca(Carta attaccato, Player player_attaccato){
        if(!check){
            attaccato.getPersonaggio().setpDefense(attaccato.getPersonaggio().getpDefense() - this.pAttack);

            if(attaccato.getPersonaggio().getpDefense() < 0){
                player_attaccato.setVita(player_attaccato.getVita() + attaccato.getPersonaggio().getpDefense());
            }

            if(attaccato.getPersonaggio().getpDefense() <= 0){
                return true;
            }else {
                return false;
            }
        }
        
        return false;
    }
    
    public void attacca_diretto(Player player_attaccato){
        
        player_attaccato.setVita(player_attaccato.getVita() - this.pAttack);
    }
    
    public void blocca_attacco(){
        check = true;
    }
    
    public void sblocca_attacco(){
        check = false;
    }
    
    public boolean get_check_blocca_attacco(){
        return check;
    }
}
