/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxapplication2;

import javafx.scene.image.Image;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import javafx.event.ActionEvent;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


/**
 *
 * @author Giorgio Mastrogiovanni
 */
public class Gioco_Carte extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        //get the path of the card file on your system
        Path relative1 = Paths.get("lupomannaro2.jpg");
        Path absolute1 = relative1.toAbsolutePath();
        Path relative2 = Paths.get("persona2.jpg");
        Path absolute2 = relative2.toAbsolutePath();
        Path relative3 = Paths.get("vampiro2.jpg");
        Path absolute3 = relative3.toAbsolutePath();
        
        //convert the file path to string and save as a string
        String imageFilePathlupo = absolute1.toString();
        String imageFilePathpersona = absolute2.toString();
        String imageFilePathvampiro = absolute3.toString();
         
        //create the card button(radio button)
        RadioButton radiobutton1 = new RadioButton();
        RadioButton radiobutton2 = new RadioButton();
        RadioButton radiobutton3 = new RadioButton();

        //create group of radio button and create an Image type contenet the image path
        ToggleGroup group = new ToggleGroup();
        
        FileInputStream is1 = new FileInputStream(imageFilePathlupo);
        Image image1 = new Image(imageFilePathlupo);
        
        FileInputStream is2 = new FileInputStream(imageFilePathpersona);
        Image image2 = new Image(imageFilePathpersona);
        
        FileInputStream is3 = new FileInputStream(imageFilePathvampiro);
        Image image3 = new Image(imageFilePathvampiro);
        
        
        //button1 Style radiobutton1
        radiobutton1.setToggleGroup(group);
        radiobutton1.setGraphic(new ImageView(image1));
        radiobutton1.getStyleClass().remove("radio-button");
        radiobutton1.getStyleClass().add("toggle-button");
        radiobutton1.setBorder(new Border(new BorderStroke(Color.BLACK, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        
        //button2 Style radiobutton2
        radiobutton2.setToggleGroup(group);
        radiobutton2.setGraphic(new ImageView(image2));
        radiobutton2.getStyleClass().remove("radio-button");
        radiobutton2.getStyleClass().add("toggle-button");
        radiobutton2.setBorder(new Border(new BorderStroke(Color.BLACK, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        
        //button3 Style radiobutton3
        radiobutton3.setToggleGroup(group);
        radiobutton3.setGraphic(new ImageView(image3));
        radiobutton3.getStyleClass().remove("radio-button");
        radiobutton3.getStyleClass().add("toggle-button");
        radiobutton3.setBorder(new Border(new BorderStroke(Color.BLACK, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        
        //create help button
        Button helpbutton = new Button();
        helpbutton.setText("HELP");
        
        //open the help page when help button clicked---------------------------
        helpbutton.setOnAction((ActionEvent event) -> {
            Label secondLabel = new Label("Regole:");
            secondLabel.setFont(new Font("Old English Text MT", 55));
            secondLabel.setTextFill(Color.web("#F8C66D"));
            
            //add the radio button to the grid
            GridPane gpsecondary = new GridPane();
            gpsecondary.add( secondLabel, 0, 0 );
            
            
            
            //set the window center alignment
            HBox hbox = new HBox(gpsecondary);
            hbox.setAlignment(Pos.TOP_LEFT);
            
            VBox vbox = new VBox(hbox);
            vbox.setAlignment(Pos.TOP_LEFT);
            
            
            
            //set the scene and it size
            Scene secondScene = new Scene( vbox, 900, 400 );
            
            vbox.setBackground(new Background(new BackgroundFill(Color.web("#213B4C"), CornerRadii.EMPTY, Insets.EMPTY)));
            
            // New window (Stage)
            Stage newWindow = new Stage();
            newWindow.setTitle("Regolamnento");
            newWindow.setScene(secondScene);
            
            // Set position of second window, related to primary window.
            newWindow.setX(primaryStage.getX() + 200);
            newWindow.setY(primaryStage.getY() + 100);
            
            newWindow.show();
        });
        //----------------------------------------------------------------------
        
        
        
        //add the radio button to the grid
        GridPane gp = new GridPane();
        gp.add( radiobutton1, 0, 0 );
        gp.add( radiobutton2, 1, 0 );
        gp.add( radiobutton3, 2, 0 );
        
        gp.add( helpbutton, 4, 4 );

        //set the border of the window
        gp.setHgap(10);
        gp.setVgap(10);

        //set the window center alignment
        HBox hbox = new HBox(gp);
        hbox.setAlignment(Pos.CENTER);

        VBox vbox = new VBox(hbox);
        vbox.setAlignment(Pos.CENTER);
        
        
                
        //set the scene and it size
        Scene scene = new Scene( vbox, 900, 400 );
        
        
        vbox.setBackground(new Background(new BackgroundFill(Color.web("#162B3B"), CornerRadii.EMPTY, Insets.EMPTY)));

        primaryStage.setScene( scene );




        primaryStage.setTitle("Prova JavaFx Mastro Gioco Carte");
        primaryStage.show();
    }

    //MAIN ---------------------------------------------------------------------
    public static void main(String[] args) {
        launch(args);
    }

    
}