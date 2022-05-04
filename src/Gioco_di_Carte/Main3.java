package Gioco_di_Carte;

import javafx.application.Application;
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
        
        Two_Players_local twoPlayersLocal = new Two_Players_local(primaryStage);
        
        
        primaryStage.setScene( twoPlayersLocal.getScene_first() );
        primaryStage.setTitle("Yu-Gi-Oh Tarocco");
        primaryStage.show();
          
        
    }

    //MAIN ---------------------------------------------------------------------
    public static void main(String[] args) {
        launch(args);
    }
    
}
