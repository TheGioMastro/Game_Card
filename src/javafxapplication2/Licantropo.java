/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication2;

/**
 *
 * @author giorg
 */
public class Licantropo extends Personaggio implements Umano, Mostro{
    
    //Atrributi
    private final int AttaccoGiorno = 3;
    private final int AttaccoNotte = 2;
    private boolean NotteLunare = false;
    
    
    //Costruttori
    public Licantropo(){
        
    }
    
    public Licantropo(String nome, int vita){
        Nome = nome;
        Vita = vita;
        
    }

    //Setter/Getter

    public void setNotteLunare(boolean NotteLunare) {
        this.NotteLunare = NotteLunare;
    }

    public int getAttaccoGiorno() {
        return AttaccoGiorno;
    }

    public int getAttaccoNotte() {
        return AttaccoNotte;
    }

    public boolean isNotteLunare() {
        return NotteLunare;
    }
    
    
    //Altri metodi--------------------------------------------------------------
    
    //Attacco che manda ad azzanno o combattimento in base alla notte lunare
    public void attacco(Personaggio avversario){
        if(avversario.isVivo()){
            if(this.isNotteLunare()){
                this.azzanno(avversario);
                
            }else{
                this.combattimento(avversario);
            
            }
        }
        
    }
    
    //Solo se notte con luna piena
    @Override
    public void combattimento(Personaggio avversario){
            
        avversario.setVita(avversario.getVita()-AttaccoGiorno);


        if(avversario.getVita() < 0){
            avversario.setVita(0);
        }

        if(avversario.getVita() == 0){
            avversario.setVivo(false);
        }
        
        
    }
    
    //Solo se non è notte con luna piena
    @Override
    public void azzanno(Personaggio avversario){

        avversario.setVita(avversario.getVita()-AttaccoNotte);


        if(avversario.getVita() < 0){
            avversario.setVita(0);
        }

        if(avversario.getVita() == 0){
            avversario.setVivo(false);
        }
        
        
    }
    
    
}
