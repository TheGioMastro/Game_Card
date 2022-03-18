/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication2;

/**
 *
 * @author giorg
 */
public class Vampiro extends Personaggio implements Mostro{
    
    //Attributi
    private final int AttaccoBase = 2;
    
    
    //Costruttori
    public Vampiro(){
        
    }
    
    public Vampiro(String nome, int vita){
        Nome = nome;
        Vita = vita;
        
    }
    
    //Setter/Getter

    public int getAttaccoBase() {
        return AttaccoBase;
    }
    
    
    //Altri metodi
    @Override
    public void azzanno(Personaggio avversario){
        if(avversario.isVivo()){
            avversario.setVita(avversario.getVita()-AttaccoBase);

            if(avversario.getVita() < 0){
                avversario.setVita(0);
            }

            if(avversario.getVita() == 0){
                avversario.setVivo(false);
            }
        }
        
    }
    
}
