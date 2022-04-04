/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Gioco_di_Carte;

import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Giorgio Mastrogiovanni
 */
public class Main extends Application{

    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        int i;
        
        /*
        //IMAGE-----------------------------------------------------------------
        //get the path of the card file on your system
        Path relative1 = Paths.get("Immagini/yugiohretro.jpg");
        Path absolute1 = relative1.toAbsolutePath();
        //convert the file path to string, save as a string and define the width and height
        String yugiohretro = absolute1.toString();
        FileInputStream is1 = new FileInputStream(yugiohretro);
        Image image1 = new Image(yugiohretro, 100, 146, false, false);
        
        
        //MAZZO-----------------------------------------------------------------------------------------------------------
        //RADIOBUTTON-----------------------------------------------------------
        //crea l'arraylist in cui inserirre i radiobutton
        ArrayList<RadioButton> ArrayList_radiobutton_mazzo = new ArrayList<RadioButton>(15);
        
        //popola tutto l'arraylist con gli elementi
        for(i=0; i<15; i++){
            //aggiunta dello stile a tutti i radiobutton
            ArrayList_radiobutton_mazzo.add(i, new RadioButton());
            ArrayList_radiobutton_mazzo.get(i).setPadding(new Insets(5));
            ArrayList_radiobutton_mazzo.get(i).setGraphic(new ImageView(image1));
            ArrayList_radiobutton_mazzo.get(i).getStyleClass().remove("radio-button");
            ArrayList_radiobutton_mazzo.get(i).getStyleClass().add("toggle-button");
            ArrayList_radiobutton_mazzo.get(i).setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            ArrayList_radiobutton_mazzo.get(i).setBorder(Border.EMPTY);
        }
        
        */
        
        /*
        //MANO------------------------------------------------------------------------------------------------------------
        //RADIOBUTTON-----------------------------------------------------------
        //crea il gruppo in cui contenere i radiobutton
        ToggleGroup group_radiobutton_mano = new ToggleGroup();
        
        //crea l'arraylist in cui inserirre i radiobutton
        ArrayList<RadioButton> ArrayList_radiobutton_mano = new ArrayList<RadioButton>(8);
        
        //aggiunge ad un gruppo il radiobutton
        ArrayList_radiobutton_mazzo.get(i).setToggleGroup(group_radiobutton_mano);
        
        //rimuove da un gruppo un radiobutton
        group_radiobutton_mano.getToggles().remove(RadioButton);
        
        */
        
        /*
        //CIMITERO--------------------------------------------------------------------------------------------------------
        //RADIOBUTTON-----------------------------------------------------------
        //crea l'arraylist in cui inserirre i radiobutton
        ArrayList<RadioButton> ArrayList_radiobutton_cimitero = new ArrayList<RadioButton>(15);
        
        */
        
        /*
        //MAZZOCAMPO------------------------------------------------------------------------------------------------------
        //RADIOBUTTON-----------------------------------------------------------
        //crea il gruppo in cui contenere i radiobutton
        ToggleGroup group_radiobutton_mazzocampo = new ToggleGroup();
        
        //crea l'arraylist in cui inserirre i radiobutton
        ArrayList<RadioButton> ArrayList_radiobutton_mazzocampo = new ArrayList<RadioButton>(6);
        
        //aggiunge ad un gruppo il radiobutton
        ArrayList_radiobutton_mazzocampo.get(i).setToggleGroup(group_radiobutton_mazzocampo);
        
        //rimuove da un gruppo un radiobutton
        group_radiobutton_mazzocampo.getToggles().remove(RadioButton);
        
        */
        
        //TEST------------------------------------------------------------------
        //IMAGE-----------------------------------------------------------------
        //get the path of the card file on your system
        Path relative1 = Paths.get("Immagini/yugiohretro.jpg");
        Path absolute1 = relative1.toAbsolutePath();
        //convert the file path to string, save as a string and define the width and height
        String yugiohretro = absolute1.toString();
        FileInputStream is1 = new FileInputStream(yugiohretro);
        Image image1 = new Image(yugiohretro, 100, 146, false, false);
        
        
        //MAZZO-----------------------------------------------------------------------------------------------------------
        //RADIOBUTTON-----------------------------------------------------------
        //crea l'arraylist in cui inserirre i radiobutton
        ArrayList<RadioButton> ArrayList_radiobutton_mazzo = new ArrayList<RadioButton>(15);
        ToggleGroup group_radiobutton_sopra = new ToggleGroup();
        
        //popola tutto l'arraylist con gli elementi
        for(i=0; i<15; i++){
            //aggiunta dello stile a tutti i radiobutton
            ArrayList_radiobutton_mazzo.add(i, new RadioButton());
            ArrayList_radiobutton_mazzo.get(i).setToggleGroup(group_radiobutton_sopra);
            ArrayList_radiobutton_mazzo.get(i).setPadding(new Insets(5));
            ArrayList_radiobutton_mazzo.get(i).setGraphic(new ImageView(image1));
            ArrayList_radiobutton_mazzo.get(i).getStyleClass().remove("radio-button");
            ArrayList_radiobutton_mazzo.get(i).getStyleClass().add("toggle-button");
            ArrayList_radiobutton_mazzo.get(i).setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            ArrayList_radiobutton_mazzo.get(i).setBorder(Border.EMPTY);
        }
        
        ArrayList<RadioButton> ArrayList_radiobutton_mazzo_2 = new ArrayList<RadioButton>(15);
        ToggleGroup group_radiobutton_sotto = new ToggleGroup();
        
        //popola tutto l'arraylist con gli elementi
        for(i=0; i<15; i++){
            //aggiunta dello stile a tutti i radiobutton
            ArrayList_radiobutton_mazzo_2.add(i, new RadioButton());
            ArrayList_radiobutton_mazzo_2.get(i).setToggleGroup(group_radiobutton_sotto);
            ArrayList_radiobutton_mazzo_2.get(i).setPadding(new Insets(5));
            ArrayList_radiobutton_mazzo_2.get(i).setGraphic(new ImageView(image1));
            ArrayList_radiobutton_mazzo_2.get(i).getStyleClass().remove("radio-button");
            ArrayList_radiobutton_mazzo_2.get(i).getStyleClass().add("toggle-button");
            ArrayList_radiobutton_mazzo_2.get(i).setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            ArrayList_radiobutton_mazzo_2.get(i).setBorder(Border.EMPTY);
        }
        
        
        
        
        
        
        
        
        
        //CREAZIONE GRID GENERALE-----------------------------------------------
        //PARTE sopra----------------------------------
        //Grid mazzomano
        GridPane gp_mazzomano_sopra = new GridPane();//
        
        gp_mazzomano_sopra.add(ArrayList_radiobutton_mazzo.get(0), 0, 0);//
        gp_mazzomano_sopra.add(ArrayList_radiobutton_mazzo.get(1), 1, 0);//
        gp_mazzomano_sopra.add(ArrayList_radiobutton_mazzo.get(2), 2, 0);//
        gp_mazzomano_sopra.add(ArrayList_radiobutton_mazzo.get(3), 3, 0);//
        gp_mazzomano_sopra.add(ArrayList_radiobutton_mazzo.get(4), 4, 0);//
        gp_mazzomano_sopra.add(ArrayList_radiobutton_mazzo.get(5), 5, 0);//
        gp_mazzomano_sopra.add(ArrayList_radiobutton_mazzo.get(6), 6, 0);//
        gp_mazzomano_sopra.add(ArrayList_radiobutton_mazzo.get(7), 7, 0);//
        
        gp_mazzomano_sopra.setHgap(10);//
        gp_mazzomano_sopra.setVgap(10);//
        
        //Grid mazzocampo
        GridPane gp_mazzocampo_sopra = new GridPane();//
        
        gp_mazzocampo_sopra.add(ArrayList_radiobutton_mazzo.get(8), 0, 0);//
        gp_mazzocampo_sopra.add(ArrayList_radiobutton_mazzo.get(9), 1, 0);//
        gp_mazzocampo_sopra.add(ArrayList_radiobutton_mazzo.get(10), 2, 0);//
        gp_mazzocampo_sopra.add(ArrayList_radiobutton_mazzo.get(11), 3, 0);//
        gp_mazzocampo_sopra.add(ArrayList_radiobutton_mazzo.get(12), 4, 0);//
        gp_mazzocampo_sopra.add(ArrayList_radiobutton_mazzo.get(13), 5, 0);//
        
        gp_mazzocampo_sopra.setHgap(10);//
        gp_mazzocampo_sopra.setVgap(10);//
        
        //PARTE sotto----------------------------------
        //Grid mazzomano
        GridPane gp_mazzomano_sotto = new GridPane();//
        
        gp_mazzomano_sotto.add(ArrayList_radiobutton_mazzo_2.get(0), 0, 0);//
        gp_mazzomano_sotto.add(ArrayList_radiobutton_mazzo_2.get(1), 1, 0);//
        gp_mazzomano_sotto.add(ArrayList_radiobutton_mazzo_2.get(2), 2, 0);//
        gp_mazzomano_sotto.add(ArrayList_radiobutton_mazzo_2.get(3), 3, 0);//
        gp_mazzomano_sotto.add(ArrayList_radiobutton_mazzo_2.get(4), 4, 0);//
        gp_mazzomano_sotto.add(ArrayList_radiobutton_mazzo_2.get(5), 5, 0);//
        gp_mazzomano_sotto.add(ArrayList_radiobutton_mazzo_2.get(6), 6, 0);//
        gp_mazzomano_sotto.add(ArrayList_radiobutton_mazzo_2.get(7), 7, 0);//
        
        gp_mazzomano_sotto.setHgap(10);//
        gp_mazzomano_sotto.setVgap(10);//
        
        //Grid mazzocampo
        GridPane gp_mazzocampo_sotto = new GridPane();//
        
        gp_mazzocampo_sotto.add(ArrayList_radiobutton_mazzo_2.get(8), 0, 0);//
        gp_mazzocampo_sotto.add(ArrayList_radiobutton_mazzo_2.get(9), 1, 0);//
        gp_mazzocampo_sotto.add(ArrayList_radiobutton_mazzo_2.get(10), 2, 0);//
        gp_mazzocampo_sotto.add(ArrayList_radiobutton_mazzo_2.get(11), 3, 0);//
        gp_mazzocampo_sotto.add(ArrayList_radiobutton_mazzo_2.get(12), 4, 0);//
        gp_mazzocampo_sotto.add(ArrayList_radiobutton_mazzo_2.get(13), 5, 0);//
        
        gp_mazzocampo_sotto.setHgap(10);//
        gp_mazzocampo_sotto.setVgap(10);//
        
        
        //BUTTON----------------------------------------------------------------
        //-----------------------------SOPRA------------------------------------
        //create help button
        Button mazzo_sopra = new Button();//
        mazzo_sopra.setGraphic(new ImageView(image1));//
        
        //open the help page when help button clicked---------------------------
        mazzo_sopra.setOnAction((ActionEvent event) -> {//
            System.out.println("Come osi PrEmErMi!?!?!?!\n Pesca sopra");//
            System.out.println(ArrayList_radiobutton_mazzo.indexOf(group_radiobutton_sopra.getSelectedToggle()));
        });//
        
        
        Button cimitero_sopra = new Button();//
        cimitero_sopra.setGraphic(new ImageView(image1));//
        
        //open the help page when help button clicked---------------------------
        cimitero_sopra.setOnAction((ActionEvent event) -> {//
            System.out.println("Come osi PrEmErMi!?!?!?!\n Cimitero sopra");//

        });//
        
        
        //-----------------------------SOTTO------------------------------------
        //create help button
        Button mazzo_sotto = new Button();//
        mazzo_sotto.setGraphic(new ImageView(image1));//
        
        //open the help page when help button clicked---------------------------
        mazzo_sotto.setOnAction((ActionEvent event) -> {//
            System.out.println("Come osi PrEmErMi!?!?!?!\n Pesca sotto");//
        });//
        
        
        Button cimitero_sotto = new Button();//
        cimitero_sotto.setGraphic(new ImageView(image1));//
        
        //open the help page when help button clicked---------------------------
        cimitero_sotto.setOnAction((ActionEvent event) -> {//
            System.out.println("Come osi PrEmErMi!?!?!?!\n Cimitero sotto");//

        });//
        
        //---------------------------------PARTE-SOPRA--------------------------
        //Create multiple HBOX!!!!!! ... in other HBOX!!
        
        //riga 2
        HBox hbox_campo_sopra = new HBox(gp_mazzomano_sopra);
        hbox_campo_sopra.setAlignment(Pos.CENTER);
        //riga 1
        HBox hbox_mazzo_sopra = new HBox(mazzo_sopra);
        hbox_mazzo_sopra.setAlignment(Pos.BOTTOM_LEFT);
        HBox hbox_mano_sopra = new HBox(gp_mazzomano_sopra);
        hbox_mano_sopra.setAlignment(Pos.CENTER);
        HBox hbox_cimitero_sopra = new HBox(cimitero_sopra);
        hbox_cimitero_sopra.setAlignment(Pos.BOTTOM_RIGHT);
        
        //riga 2
        HBox hbox1_sopra = new HBox(gp_mazzocampo_sopra);
        hbox1_sopra.setSpacing(10);
        HBox.setHgrow(hbox_campo_sopra, Priority.ALWAYS);
        hbox1_sopra.setAlignment(Pos.TOP_CENTER);
        
        //riga 1_2
        Label scritta_mazzo_sopra_pesca = new Label("Pesca");
        scritta_mazzo_sopra_pesca.setFont(new Font("OCR A Extended", 30));
        scritta_mazzo_sopra_pesca.setTextFill(Color.web("#F8C66D"));
        
        Label scritta_mazzo_sopra = new Label("Mano");
        scritta_mazzo_sopra.setFont(new Font("OCR A Extended", 45));
        scritta_mazzo_sopra.setTextFill(Color.web("#F8C66D"));
        
        Label scritta_mazzo_sopra_cimitero = new Label("Cimitero");
        scritta_mazzo_sopra_cimitero.setFont(new Font("OCR A Extended", 30));
        scritta_mazzo_sopra_cimitero.setTextFill(Color.web("#F8C66D"));
        
        HBox scritta_mazzo_sopra_hbox = new HBox(scritta_mazzo_sopra);
        scritta_mazzo_sopra_hbox.setSpacing(10);
        HBox.setHgrow(scritta_mazzo_sopra_hbox, Priority.ALWAYS);
        scritta_mazzo_sopra_hbox.setAlignment(Pos.CENTER);
        
        HBox hbox1_2_sopra = new HBox(scritta_mazzo_sopra_cimitero, scritta_mazzo_sopra_hbox, scritta_mazzo_sopra_pesca);
        hbox1_2_sopra.setSpacing(10);
        hbox1_2_sopra.setAlignment(Pos.CENTER);
        
        //riga 1
        HBox hbox2_sopra = new HBox(hbox_cimitero_sopra, hbox_mano_sopra, hbox_mazzo_sopra);
        hbox2_sopra.setSpacing(10);
        HBox.setHgrow(hbox_mano_sopra, Priority.ALWAYS);
        
        
        //contenitore verticale parte sopra
        VBox vbox_sopra = new VBox(hbox2_sopra, hbox1_2_sopra, hbox1_sopra);
        vbox_sopra.setAlignment(Pos.TOP_CENTER);
        
        
        //---------------------------------PARTE-SOTTO--------------------------
                
        //Create multiple HBOX!!!!!! ... in other HBOX!!
        
        //riga 1
        HBox hbox_campo_sotto = new HBox(gp_mazzomano_sotto);//
        hbox_campo_sotto.setAlignment(Pos.CENTER);//
        //riga 2
        HBox hbox_mazzo_sotto = new HBox(mazzo_sotto);//
        hbox_mazzo_sotto.setAlignment(Pos.BOTTOM_LEFT);//
        HBox hbox_mano_sotto = new HBox(gp_mazzomano_sotto);//
        hbox_mano_sotto.setAlignment(Pos.CENTER);//
        HBox hbox_cimitero_sotto = new HBox(cimitero_sotto);//
        hbox_cimitero_sotto.setAlignment(Pos.BOTTOM_RIGHT);//
        
        //riga 1
        HBox hbox1_sotto = new HBox(gp_mazzocampo_sotto);//
        hbox1_sotto.setSpacing(10);//
        HBox.setHgrow(hbox_campo_sotto, Priority.ALWAYS);//
        hbox1_sotto.setAlignment(Pos.TOP_CENTER);//
        
        //riga 1_2
        Label scritta_mazzo_sotto_pesca = new Label("Pesca");//
        scritta_mazzo_sotto_pesca.setFont(new Font("OCR A Extended", 30));//
        scritta_mazzo_sotto_pesca.setTextFill(Color.web("#F8C66D"));//
        
        Label scritta_mazzo_sotto = new Label("Mano");//
        scritta_mazzo_sotto.setFont(new Font("OCR A Extended", 45));//
        scritta_mazzo_sotto.setTextFill(Color.web("#F8C66D"));//
        
        Label scritta_mazzo_sotto_cimitero = new Label("Cimitero");//
        scritta_mazzo_sotto_cimitero.setFont(new Font("OCR A Extended", 30));//
        scritta_mazzo_sotto_cimitero.setTextFill(Color.web("#F8C66D"));//
        
        HBox scritta_mazzo_sotto_hbox = new HBox(scritta_mazzo_sotto);//
        scritta_mazzo_sotto_hbox.setSpacing(10);//
        HBox.setHgrow(scritta_mazzo_sotto_hbox, Priority.ALWAYS);//
        scritta_mazzo_sotto_hbox.setAlignment(Pos.CENTER);//
        
        HBox hbox1_2_sotto = new HBox(scritta_mazzo_sotto_pesca, scritta_mazzo_sotto_hbox, scritta_mazzo_sotto_cimitero);
        hbox1_2_sotto.setSpacing(10);//
        hbox1_2_sotto.setAlignment(Pos.CENTER);//
        
        //riga 2
        HBox hbox2_sotto = new HBox(hbox_mazzo_sotto, hbox_mano_sotto, hbox_cimitero_sotto);
        hbox2_sotto.setSpacing(10);//
        HBox.setHgrow(hbox_mano_sotto, Priority.ALWAYS);//
        
        
        //contenitore verticale parte sotto
        VBox vbox_sotto = new VBox(hbox1_sotto, hbox1_2_sotto, hbox2_sotto);//
        vbox_sotto.setAlignment(Pos.BOTTOM_CENTER);//
        
        
        
        
        //FINE GRID GENERALE----------------------------------------------------
        
        //contenitore verticale parte centrale(scritta)
        Label scritta_campo = new Label("----Campo----");//
        scritta_campo.setFont(new Font("OCR A Extended", 30));//
        scritta_campo.setTextFill(Color.web("#F8C66D"));//
        VBox vbox_mezzo = new VBox(scritta_campo);//
        vbox_mezzo.setAlignment(Pos.CENTER);//
        
        vbox_mezzo.setSpacing(10);//
        VBox.setVgrow(vbox_mezzo, Priority.ALWAYS);//
        
        
        //NOMI GIOCATORI--------------------------------------------------------
        //contenitore verticale parte top(scritta nome e vita giocatore 1)
        Label scritta_giocatore_top_nome = new Label("Giocatore 1");//
        scritta_giocatore_top_nome.setFont(new Font("OCR A Extended", 30));//
        scritta_giocatore_top_nome.setTextFill(Color.web("#F8C66D"));//
        
        Label scritta_giocatore_top_vita_Stringa = new Label("Vita:");//
        scritta_giocatore_top_vita_Stringa.setFont(new Font("OCR A Extended", 30));//
        scritta_giocatore_top_vita_Stringa.setTextFill(Color.web("#F8C66D"));//
        
        Label scritta_giocatore_top_vita = new Label("?");//
        scritta_giocatore_top_vita.setFont(new Font("OCR A Extended", 30));//
        scritta_giocatore_top_vita.setTextFill(Color.web("#F8C66D"));//
        
        HBox hbox_top_destra = new HBox(scritta_giocatore_top_nome, scritta_giocatore_top_vita_Stringa, scritta_giocatore_top_vita);
        hbox_top_destra.setSpacing(20);//
        hbox_top_destra.setAlignment(Pos.CENTER);//
        hbox_top_destra.setSpacing(10);//
        HBox.setHgrow(hbox_top_destra, Priority.ALWAYS);//
        
        HBox hbox_top_sinistra = new HBox();//
        hbox_top_sinistra.setSpacing(20);//
        hbox_top_sinistra.setAlignment(Pos.CENTER);//
        hbox_top_sinistra.setSpacing(10);//
        HBox.setHgrow(hbox_top_sinistra, Priority.ALWAYS);//
        
        HBox hbox_top = new HBox(hbox_top_destra, hbox_top_sinistra);//
        hbox_top.setSpacing(20);//
        hbox_top.setAlignment(Pos.CENTER);//
        
        VBox vbox_top = new VBox(hbox_top);//
        vbox_top.setAlignment(Pos.CENTER);//
       
        
        //contenitore verticale parte bot(scritta nome e vita giocatore 2)
        Label scritta_giocatore_bot_nome = new Label("Giocatore 2");//
        scritta_giocatore_bot_nome.setFont(new Font("OCR A Extended", 30));//
        scritta_giocatore_bot_nome.setTextFill(Color.web("#F8C66D"));//
        
        Label scritta_giocatore_bot_vita_Stringa = new Label("Vita:");//
        scritta_giocatore_bot_vita_Stringa.setFont(new Font("OCR A Extended", 30));//
        scritta_giocatore_bot_vita_Stringa.setTextFill(Color.web("#F8C66D"));//
        
        Label scritta_giocatore_bot_vita = new Label("?");//
        scritta_giocatore_bot_vita.setFont(new Font("OCR A Extended", 30));//
        scritta_giocatore_bot_vita.setTextFill(Color.web("#F8C66D"));//
        
        HBox hbox_bot_destra = new HBox(scritta_giocatore_bot_nome, scritta_giocatore_bot_vita_Stringa, scritta_giocatore_bot_vita);
        hbox_bot_destra.setSpacing(20);//
        hbox_bot_destra.setAlignment(Pos.CENTER);//
        hbox_bot_destra.setSpacing(10);//
        HBox.setHgrow(hbox_bot_destra, Priority.ALWAYS);//
        
        HBox hbox_bot_sinistra = new HBox();//
        hbox_bot_sinistra.setSpacing(20);//
        hbox_bot_sinistra.setAlignment(Pos.CENTER);//
        hbox_bot_sinistra.setSpacing(10);//
        HBox.setHgrow(hbox_bot_sinistra, Priority.ALWAYS);//
        
        HBox hbox_bot = new HBox(hbox_bot_sinistra, hbox_bot_destra);//
        hbox_bot.setSpacing(20);//
        hbox_bot.setAlignment(Pos.CENTER);//
        
        VBox vbox_bot = new VBox(hbox_bot);//
        vbox_bot.setAlignment(Pos.CENTER);//
        
        
        //FINE NOMI GIOCATORI---------------------------------------------------
        
        //PARTE FINALE GRID
        //contenitore verticale parte sopra e sotto
        VBox vbox_tot = new VBox(vbox_top, vbox_sopra, vbox_mezzo, vbox_sotto, vbox_bot);
        vbox_tot.setAlignment(Pos.CENTER);
        
                
        //set the scene and it size
        Scene scene = new Scene( vbox_tot, 1400, 600 );
        
        
        vbox_tot.setBackground(new Background(new BackgroundFill(Color.web("#162B3B"), CornerRadii.EMPTY, Insets.EMPTY)));

        primaryStage.setScene( scene );
        primaryStage.setMaximized(true);




        primaryStage.setTitle("Yu-Gi-Oh Tarocco");
        primaryStage.show();
    }
    
    
    
    //MAIN ---------------------------------------------------------------------
    public static void main(String[] args) {
        launch(args);
    }
    
}
