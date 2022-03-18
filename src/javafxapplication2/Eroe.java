/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication2;

/**
 *
 * @author giorg
 */
public class Eroe extends Personaggio implements Umano{
    
    //Attributi
    private final int AttaccoBase = 3;
    
    
    //Costruttori
    public Eroe(){
        
    }
    
    public Eroe(String nome, int vita){
        Nome = nome;
        Vita = vita;
        
    }
    
    //Getter

    public int getAttaccoBase() {
        return AttaccoBase;
    }
    
    
    //Altri metodi
    @Override
    public void combattimento(Personaggio avversario){
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
