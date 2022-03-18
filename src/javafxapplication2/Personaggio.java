/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication2;

/**
 *
 * @author giorg
 */
public abstract class Personaggio {
    
    //Attributi
    protected String Nome;
    protected int Vita;
    protected boolean Vivo = true;

    
    //Setter/Getter
    public String getNome() {
        return Nome;
    }

    public int getVita() {
        return Vita;
    }

    public boolean isVivo() {
        return Vivo;
    }
    

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setVita(int Vita) {
        this.Vita = Vita;
    }

    public void setVivo(boolean Vivo) {
        this.Vivo = Vivo;
    }
    
    
    
    
    
}
