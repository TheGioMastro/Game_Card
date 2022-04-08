/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 *
 * @author Giuliano Tommaso Colombo <colombogiulianotommaso@itis-molinari.eu>
 */
public class Gioco {
    protected Campo giocatore_1 = new Campo(); //CAMPO SOPRA
    protected Campo giocatore_2 = new Campo(); //CAMPO SOTTO
    
    //Parte interfaccia grafica(componimento interfaccia campo ecc...)
    //PARTE SOPRA---------------------------------------------------------------
    //riga 2
    protected HBox hbox_campo_sopra;
    //riga 1
    protected HBox hbox_mazzo_sopra;
    protected HBox hbox_mano_sopra;
    protected HBox hbox_cimitero_sopra;
    //riga 2
    protected HBox hbox1_sopra;
    //riga 1_2
    protected Label scritta_mazzo_sopra_pesca;
    protected Label scritta_mazzo_sopra;
    protected Label scritta_mazzo_sopra_cimitero;
    protected HBox scritta_mazzo_sopra_hbox;
    protected HBox hbox1_2_sopra;
    //riga 1
    protected HBox hbox2_sopra;
    //contenitore verticale parte sopra
    protected VBox vbox_sopra;
    
    //nomi
    HBox hbox_top_destra;
    HBox hbox_top_sinistra;
    HBox hbox_top;
    VBox vbox_top;
    
    //PARTE SOTTO---------------------------------------------------------------
    //riga 2
    protected HBox hbox_campo_sotto;
    //riga 1
    protected HBox hbox_mazzo_sotto;
    protected HBox hbox_mano_sotto;
    protected HBox hbox_cimitero_sotto;
    //riga 2
    protected HBox hbox1_sotto;
    //riga 1_2
    protected Label scritta_mazzo_sotto_pesca;
    protected Label scritta_mazzo_sotto;
    protected Label scritta_mazzo_sotto_cimitero;
    protected HBox scritta_mazzo_sotto_hbox;
    protected HBox hbox1_2_sotto;
    //riga 1
    protected HBox hbox2_sotto;
    //contenitore verticale parte sopra
    protected VBox vbox_sotto;
    
    //nomi
    protected HBox hbox_bot_destra;
    protected HBox hbox_bot_sinistra;
    protected HBox hbox_bot;
    protected VBox vbox_bot;
    
    //Other
    protected VBox vbox_mezzo;

    //Costruttori----
    public Gioco() {
        
        //parte interfaccia garfica
        //---------------------------------PARTE-SOPRA--------------------------
        //riga 2
        hbox_campo_sopra = new HBox(giocatore_1.getGp_mazzomano());
        hbox_campo_sopra.setAlignment(Pos.CENTER);
        //riga 1
        hbox_mazzo_sopra = new HBox(giocatore_1.getMazzo());
        hbox_mazzo_sopra.setAlignment(Pos.BOTTOM_LEFT);
        hbox_mano_sopra = new HBox(giocatore_1.getGp_mazzomano());
        hbox_mano_sopra.setAlignment(Pos.CENTER);
        hbox_cimitero_sopra = new HBox(giocatore_1.getCimitero());
        hbox_cimitero_sopra.setAlignment(Pos.BOTTOM_RIGHT);
        //riga 2
        hbox1_sopra = new HBox(giocatore_1.getGp_mazzocampo());
        hbox1_sopra.setSpacing(10);
        HBox.setHgrow(hbox_campo_sopra, Priority.ALWAYS);
        hbox1_sopra.setAlignment(Pos.TOP_CENTER);
        //riga 1_2
        scritta_mazzo_sopra_pesca = new Label("Pesca");
        scritta_mazzo_sopra_pesca.setFont(new Font("OCR A Extended", 30));
        scritta_mazzo_sopra_pesca.setTextFill(Color.web("#F8C66D"));
        
        scritta_mazzo_sopra = new Label("Mano");
        scritta_mazzo_sopra.setFont(new Font("OCR A Extended", 45));
        scritta_mazzo_sopra.setTextFill(Color.web("#F8C66D"));
        
        scritta_mazzo_sopra_cimitero = new Label("Cimitero");
        scritta_mazzo_sopra_cimitero.setFont(new Font("OCR A Extended", 30));
        scritta_mazzo_sopra_cimitero.setTextFill(Color.web("#F8C66D"));
        
        scritta_mazzo_sopra_hbox = new HBox(scritta_mazzo_sopra);
        scritta_mazzo_sopra_hbox.setSpacing(10);
        HBox.setHgrow(scritta_mazzo_sopra_hbox, Priority.ALWAYS);
        scritta_mazzo_sopra_hbox.setAlignment(Pos.CENTER);
        
        hbox1_2_sopra = new HBox(scritta_mazzo_sopra_cimitero, scritta_mazzo_sopra_hbox, scritta_mazzo_sopra_pesca);
        hbox1_2_sopra.setSpacing(10);
        hbox1_2_sopra.setAlignment(Pos.CENTER);
        
        //riga 1
        hbox2_sopra = new HBox(hbox_cimitero_sopra, hbox_mano_sopra, hbox_mazzo_sopra);
        hbox2_sopra.setSpacing(10);
        HBox.setHgrow(hbox_mano_sopra, Priority.ALWAYS);
        
        
        //contenitore verticale parte sopra
        vbox_sopra = new VBox(hbox2_sopra, hbox1_2_sopra, hbox1_sopra);
        vbox_sopra.setAlignment(Pos.TOP_CENTER);
        
        //---------------------------------PARTE-SOTTO--------------------------
        //riga 1
        hbox_campo_sotto = new HBox(giocatore_2.getGp_mazzomano());
        hbox_campo_sotto.setAlignment(Pos.CENTER);
        //riga 2
        hbox_mazzo_sotto = new HBox(giocatore_2.getMazzo());
        hbox_mazzo_sotto.setAlignment(Pos.BOTTOM_LEFT);
        hbox_mano_sotto = new HBox(giocatore_2.getGp_mazzomano());
        hbox_mano_sotto.setAlignment(Pos.CENTER);
        hbox_cimitero_sotto = new HBox(giocatore_2.getCimitero());
        hbox_cimitero_sotto.setAlignment(Pos.BOTTOM_RIGHT);
        //riga 1
        hbox1_sotto = new HBox(giocatore_2.getGp_mazzocampo());
        hbox1_sotto.setSpacing(10);
        HBox.setHgrow(hbox_campo_sotto, Priority.ALWAYS);
        hbox1_sotto.setAlignment(Pos.TOP_CENTER);
        //riga 1_2
        scritta_mazzo_sotto_pesca = new Label("Pesca");
        scritta_mazzo_sotto_pesca.setFont(new Font("OCR A Extended", 30));
        scritta_mazzo_sotto_pesca.setTextFill(Color.web("#F8C66D"));
        
        scritta_mazzo_sotto = new Label("Mano");
        scritta_mazzo_sotto.setFont(new Font("OCR A Extended", 45));
        scritta_mazzo_sotto.setTextFill(Color.web("#F8C66D"));
        
        scritta_mazzo_sotto_cimitero = new Label("Cimitero");
        scritta_mazzo_sotto_cimitero.setFont(new Font("OCR A Extended", 30));
        scritta_mazzo_sotto_cimitero.setTextFill(Color.web("#F8C66D"));
        
        scritta_mazzo_sotto_hbox = new HBox(scritta_mazzo_sotto);
        scritta_mazzo_sotto_hbox.setSpacing(10);
        HBox.setHgrow(scritta_mazzo_sotto_hbox, Priority.ALWAYS);
        scritta_mazzo_sotto_hbox.setAlignment(Pos.CENTER);
        
        hbox1_2_sotto = new HBox(scritta_mazzo_sotto_pesca, scritta_mazzo_sotto_hbox, scritta_mazzo_sotto_cimitero);
        hbox1_2_sotto.setSpacing(10);
        hbox1_2_sotto.setAlignment(Pos.CENTER);
        
        //riga 2
        hbox2_sotto = new HBox(hbox_mazzo_sotto, hbox_mano_sotto, hbox_cimitero_sotto);
        hbox2_sotto.setSpacing(10);
        HBox.setHgrow(hbox_mano_sotto, Priority.ALWAYS);
        
        
        //contenitore verticale parte sotto
        vbox_sotto = new VBox(hbox1_sotto, hbox1_2_sotto, hbox2_sotto);
        vbox_sotto.setAlignment(Pos.BOTTOM_CENTER);
        
        
        //FINE GRID GENERALE----------------------------------------------------
        
        //contenitore verticale parte centrale(scritta)
        Label scritta_campo = new Label("----Campo----");
        scritta_campo.setFont(new Font("OCR A Extended", 30));
        scritta_campo.setTextFill(Color.web("#F8C66D"));
        vbox_mezzo = new VBox(scritta_campo);
        vbox_mezzo.setAlignment(Pos.CENTER);
        
        vbox_mezzo.setSpacing(10);
        VBox.setVgrow(vbox_mezzo, Priority.ALWAYS);
        
        //contenitore verticale parte bot(scritta nome e vita giocatore 2)
        hbox_bot_destra = new HBox(giocatore_2.getGiocatore().getScritta_giocatore_nome(), giocatore_2.getGiocatore().getScritta_giocatore_vita_Stringa(), giocatore_2.getGiocatore().getScritta_giocatore_vita());
        hbox_bot_destra.setSpacing(20);
        hbox_bot_destra.setAlignment(Pos.CENTER);
        hbox_bot_destra.setSpacing(10);
        HBox.setHgrow(hbox_bot_destra, Priority.ALWAYS);
        
        hbox_bot_sinistra = new HBox();
        hbox_bot_sinistra.setSpacing(20);
        hbox_bot_sinistra.setAlignment(Pos.CENTER);
        hbox_bot_sinistra.setSpacing(10);
        HBox.setHgrow(hbox_bot_sinistra, Priority.ALWAYS);
        
        hbox_bot = new HBox(hbox_bot_sinistra, hbox_bot_destra);
        hbox_bot.setSpacing(20);
        hbox_bot.setAlignment(Pos.CENTER);
        
        vbox_bot = new VBox(hbox_bot);
        vbox_bot.setAlignment(Pos.CENTER);
        
        //contenitore verticale parte top(scritta nome e vita giocatore 1)
        hbox_top_destra = new HBox(giocatore_1.getGiocatore().getScritta_giocatore_nome(), giocatore_1.getGiocatore().getScritta_giocatore_vita_Stringa(), giocatore_1.getGiocatore().getScritta_giocatore_vita());
        hbox_top_destra.setSpacing(20);
        hbox_top_destra.setAlignment(Pos.CENTER);
        hbox_top_destra.setSpacing(10);
        HBox.setHgrow(hbox_top_destra, Priority.ALWAYS);
        
        hbox_top_sinistra = new HBox();
        hbox_top_sinistra.setSpacing(20);
        hbox_top_sinistra.setAlignment(Pos.CENTER);
        hbox_top_sinistra.setSpacing(10);
        HBox.setHgrow(hbox_top_sinistra, Priority.ALWAYS);
        
        hbox_top = new HBox(hbox_top_destra, hbox_top_sinistra);
        hbox_top.setSpacing(20);
        hbox_top.setAlignment(Pos.CENTER);
        
        vbox_top = new VBox(hbox_top);
        vbox_top.setAlignment(Pos.CENTER);
    }
    //---------------
    
    //setter----------------------------------------
    public void setGiocatore_1(Campo giocatore_1) {
        this.giocatore_1 = giocatore_1;
    }

    public void setGiocatore_2(Campo giocatore_2) {
        this.giocatore_2 = giocatore_2;
    }
    //----------------------------------------------
    
    //getter--------------------------
    public Campo getGiocatore_1() {
        return giocatore_1;
    }

    public Campo getGiocatore_2() {
        return giocatore_2;
    }
    
    public VBox getVbox_sopra() {
        return vbox_sopra;
    }

    public VBox getVbox_top() {
        return vbox_top;
    }

    public VBox getVbox_sotto() {
        return vbox_sotto;
    }

    public VBox getVbox_bot() {
        return vbox_bot;
    }

    public VBox getVbox_mezzo() {
        return vbox_mezzo;
    }
    //-------------------------------

    
    
}