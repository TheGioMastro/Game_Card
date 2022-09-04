/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gioco_di_Carte;

import java.util.concurrent.atomic.AtomicReference;
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
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author giorg
 */
public class Two_Players_local {
    
    //Attributi
    //non so perchè ma serve per il multithreading altrimenti l'assegnazione con =
    protected final AtomicReference<String> nome_giocatore_1;
    protected final AtomicReference<String> nome_giocatore_2;
    protected final AtomicReference<String> tipo_deck_giocatore_1;
    protected final AtomicReference<String> tipo_deck_giocatore_2;
    
    //Finestra iniziale per richiedere il tipo di deck e i nomi dei giocatori
    protected Label giocatore1_scritta;
    protected Label giocatore2_scritta;
    protected TextField giocatore1;
    protected TextField giocatore2;
    protected Label giocatore1_tipo_deck;
    protected Label giocatore2_tipo_deck;
    
    //menù a tendina
    protected ObservableList<String> comboItems1;
    protected Label text1;
    protected ObservableList<String> comboItems2;
    protected Label text2;
    protected Button bottone;
    
    //Grid
    protected GridPane grid1;
    
    //Scene
    protected Scene scene_first;
    protected Scene scene;
    
    //primaryStage
    protected static Stage primaryStage;
    protected static boolean fullscreen = true;
    
    //GIOCO
    protected Gioco game;
    
    protected VBox vbox_tot;
    
    
    //Costruttore
    public Two_Players_local(Stage primaryStage){
        this.primaryStage = primaryStage;
        primaryStage.setFullScreenExitHint("");
        primaryStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
        nome_giocatore_1 = new AtomicReference<>();
        nome_giocatore_2 = new AtomicReference<>();
        tipo_deck_giocatore_1 = new AtomicReference<>();
        tipo_deck_giocatore_2 = new AtomicReference<>();
        
        giocatore1_scritta = new Label();
        giocatore1_scritta.setText("Nome del primo giocatore");
        giocatore1_scritta.setFont(new Font("OCR A Extended", 30));
        giocatore1_scritta.setTextFill(Color.web("#F8C66D"));
        
        giocatore2_scritta = new Label();
        giocatore2_scritta.setText("Nome del secondo giocatore");
        giocatore2_scritta.setFont(new Font("OCR A Extended", 30));
        giocatore2_scritta.setTextFill(Color.web("#F8C66D"));
        
        giocatore1 = new TextField();
        giocatore2 = new TextField();
        
        giocatore1_tipo_deck = new Label();
        giocatore1_tipo_deck.setText("Tipo deck");
        giocatore1_tipo_deck.setFont(new Font("OCR A Extended", 30));
        giocatore1_tipo_deck.setTextFill(Color.web("#F8C66D"));
        
        giocatore2_tipo_deck = new Label();
        giocatore2_tipo_deck.setText("Tipo deck");
        giocatore2_tipo_deck.setFont(new Font("OCR A Extended", 30));
        giocatore2_tipo_deck.setTextFill(Color.web("#F8C66D"));
        
        text1 = new Label("Werewolf");
        text2 = new Label("Werewolf");
        
        bottone = new Button();
        bottone.setText("Invia!");
        bottone.setFont(new Font("OCR A Extended", 30));
        bottone.setTextFill(Color.web("#F8C66D"));
        
        bottone.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                    if(giocatore1.getText().length() > 0 && giocatore2.getText().length() > 0){
                        nome_giocatore_1.set(giocatore1.getText());
                        nome_giocatore_2.set(giocatore2.getText());
                        tipo_deck_giocatore_1.set("Werewolf");
                        tipo_deck_giocatore_2.set("Werewolf");
                        
                        game = new Gioco(String.valueOf(nome_giocatore_1), String.valueOf(nome_giocatore_2), "Werewolf", "Werewolf");
                        
                        /*
                        game.getGiocatore_1().getGiocatore().setNome(String.valueOf(nome_giocatore_1));
                        game.getGiocatore_2().getGiocatore().setNome(String.valueOf(nome_giocatore_2));
                        game.getGiocatore_1().getGiocatore().setTipo_deck(String.valueOf(comboBox1).equals("Vampiro")?1:(String.valueOf(comboBox1).equals("Licantropo")?2:3));
                        game.getGiocatore_2().getGiocatore().setTipo_deck(String.valueOf(comboBox1).equals("Vampiro")?1:(String.valueOf(comboBox1).equals("Licantropo")?2:3));
                        */
                        //PARTE FINALE GRID
                        //contenitore verticale parte sopra e sotto
                        vbox_tot = new VBox(game.getGrafica().getVbox_top(), game.getGrafica().getVbox_sopra(), game.getGrafica().getVbox_mezzo(), game.getGrafica().getVbox_sotto(), game.getGrafica().getVbox_bot());
                        vbox_tot.setAlignment(Pos.CENTER);


                        //set the scene and it size
                        scene = new Scene( vbox_tot, 1400, 600 );
        
                        primaryStage.setScene( scene );
                        primaryStage.setMaximized(true);
                        setFullScreen();
                        
                        vbox_tot.setBackground(new Background(new BackgroundFill(Color.web("#162B3B"), CornerRadii.EMPTY, Insets.EMPTY)));
                        int i;
                        for(i=0; i<game.getGiocatore_1().getMazz().Size(); i++){
                            game.getGiocatore_1().getMazz().get_indice_ArrayList_radiobutton_mazzo(i).getMycontextmenu().setStart(1);
                            game.getGiocatore_2().getMazz().get_indice_ArrayList_radiobutton_mazzo(i).getMycontextmenu().setStart(2);
                        
                        }
                        
                        game.nextTurno();
                    }
            }
        });
        
        grid1 = new GridPane();
        
        grid1.add(giocatore1_scritta, 0, 0);
        grid1.add(giocatore2_scritta, 1, 0);
        grid1.add(giocatore1, 0, 1);
        grid1.add(giocatore2, 1, 1);
        grid1.add(giocatore1_tipo_deck, 0, 2);
        grid1.add(giocatore2_tipo_deck, 1, 2);
        grid1.add(text1, 0, 3);
        grid1.add(text2, 1, 3);
        grid1.add(bottone, 2, 4);
        
        
        grid1.setAlignment(Pos.CENTER);
        
        scene_first = new Scene( grid1, 1400, 600 );
        
        grid1.setBackground(new Background(new BackgroundFill(Color.web("#162B3B"), CornerRadii.EMPTY, Insets.EMPTY)));

    }
    
    
    //SETTER/GETTER

    public AtomicReference<String> getNome_giocatore_1() {
        return nome_giocatore_1;
    }

    public AtomicReference<String> getNome_giocatore_2() {
        return nome_giocatore_2;
    }

    public AtomicReference<String> getTipo_deck_giocatore_1() {
        return tipo_deck_giocatore_1;
    }

    public AtomicReference<String> getTipo_deck_giocatore_2() {
        return tipo_deck_giocatore_2;
    }

    public Gioco getGame() {
        return game;
    }

    public Scene getScene_first() {
        return scene_first;
    }

    public Scene getScene() {
        return scene;
    }
    
    public static void setFullScreen() {
        if(fullscreen){
            primaryStage.setFullScreen(fullscreen);
            fullscreen = false;
        }else{
            primaryStage.setFullScreen(fullscreen);
            fullscreen = true;
        }
    }
}
