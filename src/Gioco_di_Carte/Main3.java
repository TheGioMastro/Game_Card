package Gioco_di_Carte;

import java.util.concurrent.atomic.AtomicReference;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Giorgio Mastrogiovanni
 */
public class Main3 extends Application{
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        
        
        //non so perchè ma serve per il multithreading altrimenti l'assegnazione con =
        final AtomicReference<String> nome_giocatore_1 = new AtomicReference<String>();
        final AtomicReference<String> nome_giocatore_2 = new AtomicReference<String>();
        final AtomicReference<String> tipo_deck_giocatore_1 = new AtomicReference<String>();
        final AtomicReference<String> tipo_deck_giocatore_2 = new AtomicReference<String>();
        
        
        //Finestra iniziale per richiedere il tipo di deck e i nomi dei giocatori
        Label giocatore1_scritta = new Label();
        giocatore1_scritta.setText("Nome del primo giocatore");
        giocatore1_scritta.setFont(new Font("OCR A Extended", 30));
        giocatore1_scritta.setTextFill(Color.web("#F8C66D"));
        Label giocatore2_scritta = new Label();
        giocatore2_scritta.setText("Nome del secondo giocatore");
        giocatore2_scritta.setFont(new Font("OCR A Extended", 30));
        giocatore2_scritta.setTextFill(Color.web("#F8C66D"));
        
        
        TextField giocatore1 = new TextField();
        TextField giocatore2 = new TextField();
        
        Label giocatore1_tipo_deck = new Label();
        giocatore1_tipo_deck.setText("Tipo deck");
        giocatore1_tipo_deck.setFont(new Font("OCR A Extended", 30));
        giocatore1_tipo_deck.setTextFill(Color.web("#F8C66D"));
        Label giocatore2_tipo_deck = new Label();
        giocatore2_tipo_deck.setText("Tipo deck");
        giocatore2_tipo_deck.setFont(new Font("OCR A Extended", 30));
        giocatore2_tipo_deck.setTextFill(Color.web("#F8C66D"));
        
        //menù a tendina
        ObservableList<String> comboItems1 = FXCollections.observableArrayList("Vampiro", "Licantropo", "Eroe");
        ComboBox comboBox1 = new ComboBox(comboItems1);
        ObservableList<String> comboItems2 = FXCollections.observableArrayList("Vampiro", "Licantropo", "Eroe");
        ComboBox comboBox2 = new ComboBox(comboItems2);
        
        Button bottone = new Button();
        bottone.setText("Invia!");
        bottone.setFont(new Font("OCR A Extended", 30));
        bottone.setTextFill(Color.web("#F8C66D"));
        bottone.setOnAction(new EventHandler<ActionEvent>() {
            
            
            @Override
            public void handle(ActionEvent event) {
                    if(giocatore1.getText().length() > 0 && giocatore2.getText().length() > 0 && !String.valueOf(comboBox1.getSelectionModel().getSelectedItem()).equals("null") && !String.valueOf(comboBox2.getSelectionModel().getSelectedItem()).equals("null")){
                        nome_giocatore_1.set(giocatore1.getText());
                        nome_giocatore_2.set(giocatore2.getText());
                        tipo_deck_giocatore_1.set(String.valueOf(comboBox1.getSelectionModel().getSelectedItem()));
                        tipo_deck_giocatore_2.set(String.valueOf(comboBox2.getSelectionModel().getSelectedItem()));
                        
                        Gioco game = new Gioco();
                        
                        game.getGiocatore_1().getGiocatore().setNome();

                        //PARTE FINALE GRID
                        //contenitore verticale parte sopra e sotto
                        VBox vbox_tot = new VBox(game.getVbox_top(), game.getVbox_sopra(), game.getVbox_mezzo(), game.getVbox_sotto(), game.getVbox_bot());
                        vbox_tot.setAlignment(Pos.CENTER);


                        //set the scene and it size
                        Scene scene = new Scene( vbox_tot, 1400, 600 );
        
                        primaryStage.setScene( scene );
                        primaryStage.setMaximized(true);
                        
                        vbox_tot.setBackground(new Background(new BackgroundFill(Color.web("#162B3B"), CornerRadii.EMPTY, Insets.EMPTY)));
                    }else{

                    }
            }
        });
        
        GridPane grid1 = new GridPane();
        
        grid1.add(giocatore1_scritta, 0, 0);
        grid1.add(giocatore2_scritta, 1, 0);
        grid1.add(giocatore1, 0, 1);
        grid1.add(giocatore2, 1, 1);
        grid1.add(giocatore1_tipo_deck, 0, 2);
        grid1.add(giocatore2_tipo_deck, 1, 2);
        grid1.add(comboBox1, 0, 3);
        grid1.add(comboBox2, 1, 3);
        grid1.add(bottone, 2, 4);
        
        
        grid1.setAlignment(Pos.CENTER);
        
        Scene scene_first = new Scene( grid1, 1400, 600 );
        
        
        grid1.setBackground(new Background(new BackgroundFill(Color.web("#162B3B"), CornerRadii.EMPTY, Insets.EMPTY)));

        primaryStage.setScene( scene_first );
        primaryStage.setTitle("Yu-Gi-Oh Tarocco");
        primaryStage.show();
        
        
        
        
    }

    //MAIN ---------------------------------------------------------------------
    public static void main(String[] args) {
        launch(args);
    }
    
}
