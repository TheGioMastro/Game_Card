package Gioco_di_Carte;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
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
        
        
        Gioco game = new Gioco();
        
        //PARTE FINALE GRID
        //contenitore verticale parte sopra e sotto
        VBox vbox_tot = new VBox(game.getVbox_top(), game.getVbox_sopra(), game.getVbox_mezzo(), game.getVbox_sotto(), game.getVbox_bot());
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
