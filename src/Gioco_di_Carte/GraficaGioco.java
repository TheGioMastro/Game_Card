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
 * @author giorg
 */
public class GraficaGioco {
    
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
    protected HBox hbox_top_destra;
    protected HBox hbox_top_sinistra;
    protected HBox hbox_top;
    protected VBox vbox_top;
    
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
    
    
    //COSTRUTTORE
    public GraficaGioco(Campo giocatore_1, Campo giocatore_2){
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
    
    
    //SETTER--GETTER

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
    
    //altri metodi
    
    //PER RICARICARE LA GRAFICA
    public void reload_CAMPO(Campo g){
        int i;
        
        g.getGp_mazzocampo().getChildren().clear();
        
        for(i=0; i<g.getMazCam().sizeArrayList_radiobutton_mazzocampo(); i++){
            g.getGp_mazzocampo().add(g.getMazCam().get_ArrayList_radiobutton_mazzocampo(i), i, 0);
            
        }
    }
    
    
    public void reload_MANO(Campo g){
        int i;
        
        g.getGp_mazzomano().getChildren().clear();
        
        for(i=0; i<g.getMan().sizeArrayList_radiobutton_mano(); i++){
            g.getGp_mazzomano().add(g.getMan().get_ArrayList_radiobutton_mano(i), i, 0);
            
        }
        
    }
    
    public void reload_GUI(Campo g1, Campo g2){
        reload_CAMPO(g1);
        reload_MANO(g1);
        
        reload_CAMPO(g2);
        reload_MANO(g2);
        
    }
    
    public void reload_GUI(Campo g){
        reload_CAMPO(g);
        reload_MANO(g);
        
    }
    
    //PER NON RENDERE CLOCKABILI LE CARTE NEL TURNO AVVERSARIO
    public void hide_CAMPO(Campo g, boolean v){
        int i;

        for(i=0; i<g.getMazCam().sizeArrayList_radiobutton_mazzocampo(); i++){
            g.getMazCam().get_ArrayList_radiobutton_mazzocampo(i).setDisable(v);
        }
        
    }
    
    
    public void hide_MANO(Campo g, boolean v){
        int i;
        
        for(i=0; i<g.getMan().sizeArrayList_radiobutton_mano(); i++){
            g.getMan().get_ArrayList_radiobutton_mano(i).setDisable(v);
        }
        
    }
    
    public void hide_GUI(Campo g1, boolean v1, Campo g2, boolean v2){
        hide_CAMPO(g1, v1);
        hide_MANO(g1, v1);
        
        hide_CAMPO(g2, v2);
        hide_MANO(g2, v2);
        
    }
    
    public void hide_GUI(Campo g, boolean v){
        hide_CAMPO(g, v);
        hide_MANO(g, v);
        
    }
    
    
    
}
