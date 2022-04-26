/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Giuliano Tommaso Colombo <colombogiulianotommaso@itis-molinari.eu>
 */
public class Campo {
    protected Deck dck;
    protected Mano man;
    protected MazzoCampo mazCam;
    protected Cimitero cim;
    protected Mazzo mazz;
    protected Player giocatore;
    
    
    //Parte interfaccia grafica(impostazione grid mano e mazzocampo + riempimento deck e creazione cimitero)
    //Grid mazzomano
    protected GridPane gp_mazzomano;
    //Grid mazzocampo
    protected GridPane gp_mazzocampo;
    
    //bottoni
    protected MyButton mazzo;
    protected MyButton cimitero;
    
    //Costruttore--------------------------------------------------------------------------------------------------------------------------
    public Campo(String nome, String tipo, Gioco gioco) {
        //Variabili
        Path relative = Paths.get("Carte/" + tipo + ".txt");
        Path absolute = relative.toAbsolutePath();
        String path = absolute.toString();
        
        
        int aP; //Valore Attacco
        int dP; //Valore Vita
        int nIndice; //Indice carta magia
        int i=0;
        
        //Istanziamento Oggetti
        man = new Mano();
        mazCam = new MazzoCampo();
        cim = new Cimitero();
        mazz = new Mazzo(gioco, man);
        giocatore = new Player(nome, tipo);
        
        //ACQUSIZIONE PROPRIETA CARTE------------------------------------------
        try(BufferedReader br = new BufferedReader (new FileReader(path))){
            StringBuilder fileContents = new StringBuilder();
            
            //Personaggi
            do{
                nome = br.readLine();
                
                if(!nome.equalsIgnoreCase("-")){
                    aP = Integer.parseInt(br.readLine());
                    dP = Integer.parseInt(br.readLine()); //Integer.ParseInt() Metodo che converte una stringa passata come argomento in un INT primitivo
                    
                    Path relative1 = Paths.get("Carte/"+ tipo + "/" + nome + ".png");
                    Path absolute1 = relative1.toAbsolutePath();
                    
                    String carta = absolute1.toString();
                    try {
                        FileInputStream is1 = new FileInputStream(carta);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Mazzo.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
                    Image image1 = new Image(carta, 100, 146, false, false);
                    
                    
                    mazz.addPersonaggio(tipo, nome, aP, dP, image1);
                    mazz.get_indice_ArrayList_radiobutton_mazzo(i).setGraphic(new ImageView(image1));
                    
                    i++;
                }
            }while(!nome.equalsIgnoreCase("-"));
            
            //Magia
            do{
                nome = br.readLine();
                
                if(!nome.equalsIgnoreCase("--")){
                    
                    //Path relative1 = Paths.get("Carte/"+ nome + ".png");
                    Path relative1 = Paths.get("Carte/void.jpg");
                    Path absolute1 = relative1.toAbsolutePath();
                    
                    String carta = absolute1.toString();
                    try {
                        FileInputStream is1 = new FileInputStream(carta);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Mazzo.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
                    Image image1 = new Image(carta, 100, 146, false, false);
                    
                    mazz.addMagia(nome, image1);
                    mazz.get_indice_ArrayList_radiobutton_mazzo(i).setGraphic(new ImageView(image1));
                    
                    i++;
                }
            }while(!nome.equalsIgnoreCase("--"));

            br.close();
            
        }catch (IOException e){
            System.err.println(e);
        }
        //---------------------------------------------------------------------
        
        
        dck = new Deck(mazz);
        
        
        //parte interfaccia grafica
        gp_mazzomano = new GridPane();
        gp_mazzocampo = new GridPane();
        
        
        gp_mazzomano.setHgap(10);
        gp_mazzomano.setVgap(10);
        gp_mazzocampo.setHgap(10);
        gp_mazzocampo.setVgap(10);
        
        
        
        
        //PARTE TEMPORANEA(quando si avranno le specifiche delle carte e le immagini bisognerà cambiare tutto
        //IMAGE-----------------------------------------------------------------
        //get the path of the card file on your system
        Path relative1 = Paths.get("Carte/void.jpg");
        Path absolute1 = relative1.toAbsolutePath();
        
        //convert the file path to string, save as a string and define the width and height
        String yugiohretro = absolute1.toString();
        try {
            FileInputStream is1 = new FileInputStream(yugiohretro);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Mazzo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Image image1 = new Image(yugiohretro, 100, 146, false, false);
        
        //FINE PARTE TEMPORANEA
        
        //bottoni
        mazzo = new MyButton();
        mazzo.setGraphic(new ImageView(image1));
        mazzo.setDisable(true);
        
        cimitero = new MyButton();
        cimitero.setGraphic(new ImageView(image1));
        cimitero.setDisable(true);
        
    }
    //FINE COSTRUTTORE---------------------------------------------------------------------------------------------------------------
    
    //Setter------------------------------------
    public void setDck(Deck dck) {
        this.dck = dck;
    }

    public void setMan(Mano man) {
        this.man = man;
    }

    public void setMazCam(MazzoCampo mazCam) {
        this.mazCam = mazCam;
    }

    public void setCim(Cimitero cim) {
        this.cim = cim;
    }

    public void setGiocatore(Player giocatore) {
        this.giocatore = giocatore;
    }

    public void setMazz(Mazzo mazz) {
        this.mazz = mazz;
    }
    //--------------------------------------------
    
    //Getter------------------------
    public Deck getDck() {
        return dck;
    }

    public Mano getMan() {//
        return man;
    }

    public MazzoCampo getMazCam() {//
        return mazCam;
    }

    public Cimitero getCim() {//
        return cim;
    }

    public Player getGiocatore() {
        return giocatore;
    }

    public Mazzo getMazz() {//
        return mazz;
    }
    
    public GridPane getGp_mazzomano() {
        return gp_mazzomano;
    }

    public GridPane getGp_mazzocampo() {
        return gp_mazzocampo;
    }

    public MyButton getMazzo() {
        return mazzo;
    }

    public MyButton getCimitero() {
        return cimitero;
    }
    //------------------------------

}
