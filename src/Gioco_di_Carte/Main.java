/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Gioco_di_Carte;

import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
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
 * @author giorg
 */
public class Main extends Application{

    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        //get the path of the card file on your system
        Path relative1 = Paths.get("Immagini/yugiohretro.jpg");
        Path absolute1 = relative1.toAbsolutePath();
        
        //convert the file path to string and save as a string
        String yugiohretro = absolute1.toString();
        
        //create the card button(radio button)
        RadioButton radiobutton1 = new RadioButton();
        radiobutton1.setPadding(new Insets(5));
        RadioButton radiobutton2 = new RadioButton();
        radiobutton2.setPadding(new Insets(5));
        RadioButton radiobutton3 = new RadioButton();
        radiobutton3.setPadding(new Insets(5));
        RadioButton radiobutton4 = new RadioButton();
        radiobutton4.setPadding(new Insets(5));
        RadioButton radiobutton5 = new RadioButton();
        radiobutton5.setPadding(new Insets(5));
        RadioButton radiobutton6 = new RadioButton();
        radiobutton6.setPadding(new Insets(5));
        RadioButton radiobutton7 = new RadioButton();
        radiobutton7.setPadding(new Insets(5));
        RadioButton radiobutton8 = new RadioButton();
        radiobutton8.setPadding(new Insets(5));
        
        
        
        //create group of radio button and create an Image type contenet the image path
        ToggleGroup group = new ToggleGroup();
        
        FileInputStream is1 = new FileInputStream(yugiohretro);
        Image image1 = new Image(yugiohretro, 100, 146, false, false);

        
        //button1 Style radiobutton1
        radiobutton1.setToggleGroup(group);
        radiobutton1.setGraphic(new ImageView(image1));
        radiobutton1.getStyleClass().remove("radio-button");
        radiobutton1.getStyleClass().add("toggle-button");
        radiobutton1.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        radiobutton1.setBorder(Border.EMPTY);
        
        radiobutton2.setToggleGroup(group);
        radiobutton2.setGraphic(new ImageView(image1));
        radiobutton2.getStyleClass().remove("radio-button");
        radiobutton2.getStyleClass().add("toggle-button");
        radiobutton2.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        radiobutton2.setBorder(Border.EMPTY);
        
        radiobutton3.setToggleGroup(group);
        radiobutton3.setGraphic(new ImageView(image1));
        radiobutton3.getStyleClass().remove("radio-button");
        radiobutton3.getStyleClass().add("toggle-button");
        radiobutton3.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        radiobutton3.setBorder(Border.EMPTY);
        
        radiobutton4.setToggleGroup(group);
        radiobutton4.setGraphic(new ImageView(image1));
        radiobutton4.getStyleClass().remove("radio-button");
        radiobutton4.getStyleClass().add("toggle-button");
        radiobutton4.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        radiobutton4.setBorder(Border.EMPTY);
        
        radiobutton5.setToggleGroup(group);
        radiobutton5.setGraphic(new ImageView(image1));
        radiobutton5.getStyleClass().remove("radio-button");
        radiobutton5.getStyleClass().add("toggle-button");
        radiobutton5.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        radiobutton5.setBorder(Border.EMPTY);
        
        radiobutton6.setToggleGroup(group);
        radiobutton6.setGraphic(new ImageView(image1));
        radiobutton6.getStyleClass().remove("radio-button");
        radiobutton6.getStyleClass().add("toggle-button");
        radiobutton6.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        radiobutton6.setBorder(Border.EMPTY);
        
        radiobutton7.setToggleGroup(group);
        radiobutton7.setGraphic(new ImageView(image1));
        radiobutton7.getStyleClass().remove("radio-button");
        radiobutton7.getStyleClass().add("toggle-button");
        radiobutton7.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        radiobutton7.setBorder(Border.EMPTY);
        
        radiobutton8.setToggleGroup(group);
        radiobutton8.setGraphic(new ImageView(image1));
        radiobutton8.getStyleClass().remove("radio-button");
        radiobutton8.getStyleClass().add("toggle-button");
        radiobutton8.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        radiobutton8.setBorder(Border.EMPTY);
        
        
        
        
        //create help button
        Button mazzo = new Button();
        mazzo.setText("Pesca");
        mazzo.setGraphic(new ImageView(image1));
        
        //open the help page when help button clicked---------------------------
        mazzo.setOnAction((ActionEvent event) -> {
            System.out.println("Come osi PrEmErMi!?!?!?!");
            radiobutton1.setDisable(true);
            radiobutton2.setDisable(true);
            radiobutton3.setDisable(true);
            radiobutton4.setDisable(true);
            radiobutton5.setDisable(true);
            radiobutton6.setDisable(true);
            radiobutton7.setDisable(true);
            radiobutton8.setDisable(true);
        });
        
        
        Button cimitero = new Button();
        cimitero.setText("Cimitero");
        cimitero.setGraphic(new ImageView(image1));
        
        //open the help page when help button clicked---------------------------
        cimitero.setOnAction((ActionEvent event) -> {
            System.out.println("Come osi PrEmErMi!?!?!?!");
            radiobutton1.setDisable(false);
            radiobutton2.setDisable(false);
            radiobutton3.setDisable(false);
            radiobutton4.setDisable(false);
            radiobutton5.setDisable(false);
            radiobutton6.setDisable(false);
            radiobutton7.setDisable(false);
            radiobutton8.setDisable(false);
        });
        
        
        
        
        
        
        //Grid mano
        GridPane gp = new GridPane();
        
        gp.add(radiobutton1, 0, 0);
        gp.add(radiobutton2, 1, 0);
        gp.add(radiobutton3, 2, 0);
        gp.add(radiobutton4, 3, 0);
        gp.add(radiobutton5, 4, 0);
        gp.add(radiobutton6, 5, 0);
        gp.add(radiobutton7, 6, 0);
        gp.add(radiobutton8, 7, 0);
        
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
