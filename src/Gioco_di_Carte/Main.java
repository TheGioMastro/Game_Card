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
import javafx.stage.Stage;

/**
 *
 * @author Giorgio Mastrogiovanni
 */
public class Main extends Application{

    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        int i;
        
        
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
        
        
        //BUTTON----------------------------------------------------------------
        //create help button
        Button mazzo = new Button();
        mazzo.setText("Pesca");
        mazzo.setGraphic(new ImageView(image1));
        
        //open the help page when help button clicked---------------------------
        mazzo.setOnAction((ActionEvent event) -> {
            System.out.println("Come osi PrEmErMi!?!?!?!");
        });
        
        
        Button cimitero = new Button();
        cimitero.setText("Cimitero");
        cimitero.setGraphic(new ImageView(image1));
        
        //open the help page when help button clicked---------------------------
        cimitero.setOnAction((ActionEvent event) -> {
            System.out.println("Come osi PrEmErMi!?!?!?!");

        });
        
        
        
        
        
        
        //Grid mano
        GridPane gp = new GridPane();
        
        gp.add(ArrayList_radiobutton_mazzo.get(0), 0, 0);
        gp.add(ArrayList_radiobutton_mazzo.get(1), 1, 0);
        gp.add(ArrayList_radiobutton_mazzo.get(2), 2, 0);
        gp.add(ArrayList_radiobutton_mazzo.get(3), 3, 0);
        gp.add(ArrayList_radiobutton_mazzo.get(4), 4, 0);
        gp.add(ArrayList_radiobutton_mazzo.get(5), 5, 0);
        gp.add(ArrayList_radiobutton_mazzo.get(6), 6, 0);
        gp.add(ArrayList_radiobutton_mazzo.get(7), 7, 0);
        
        gp.setHgap(10);
        gp.setVgap(10);
        
        

        //Create multiple HBOX!!!!!! ... in other HBOX!!
        HBox hbox_mazzo = new HBox(mazzo);
        hbox_mazzo.setAlignment(Pos.BOTTOM_LEFT);
        
        HBox hbox_mano = new HBox(gp);
        hbox_mano.setAlignment(Pos.CENTER);
        
        HBox hbox_cimitero = new HBox(cimitero);
        hbox_cimitero.setAlignment(Pos.BOTTOM_RIGHT);
        
        
        HBox hbox0 = new HBox(hbox_mazzo, hbox_mano, hbox_cimitero);
        

        VBox vbox_sotto = new VBox(hbox0);
        vbox_sotto.setAlignment(Pos.BOTTOM_CENTER);
        
        hbox0.setSpacing(10);
        HBox.setHgrow(hbox_mano, Priority.ALWAYS);
        
        
                
        //set the scene and it size
        Scene scene = new Scene( vbox_sotto, 1400, 600 );
        
        
        vbox_sotto.setBackground(new Background(new BackgroundFill(Color.web("#162B3B"), CornerRadii.EMPTY, Insets.EMPTY)));

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
