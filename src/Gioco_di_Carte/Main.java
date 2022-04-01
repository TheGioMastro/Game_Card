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
        
        
        //create group of radio button and create an Image type contenet the image path
        ToggleGroup group = new ToggleGroup();
        
        FileInputStream is1 = new FileInputStream(yugiohretro);
        Image image1 = new Image(yugiohretro, 100, 146, false, false);
        
        
        
        
        //Array contenente i radio button del mazzo mano
        //create the card button(radio button)
        RadioButton[] Array_radiobutton_mano = new RadioButton[8];
        
        for(int i=0; i<8; i++){
            //aggiunta dello stile a tutti i radiobutton
            Array_radiobutton_mano[i] = new RadioButton();
            Array_radiobutton_mano[i].setPadding(new Insets(5));
            Array_radiobutton_mano[i].setToggleGroup(group);
            Array_radiobutton_mano[i].setGraphic(new ImageView(image1));
            Array_radiobutton_mano[i].getStyleClass().remove("radio-button");
            Array_radiobutton_mano[i].getStyleClass().add("toggle-button");
            Array_radiobutton_mano[i].setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            Array_radiobutton_mano[i].setBorder(Border.EMPTY);
        }
        
        
        
        
        
        //create help button
        Button mazzo = new Button();
        mazzo.setText("Pesca");
        mazzo.setGraphic(new ImageView(image1));
        
        //open the help page when help button clicked---------------------------
        mazzo.setOnAction((ActionEvent event) -> {
            System.out.println("Come osi PrEmErMi!?!?!?!");
            Array_radiobutton_mano[0].setDisable(true);
            Array_radiobutton_mano[1].setDisable(true);
            Array_radiobutton_mano[2].setDisable(true);
            Array_radiobutton_mano[3].setDisable(true);
            Array_radiobutton_mano[4].setDisable(true);
            Array_radiobutton_mano[5].setDisable(true);
            Array_radiobutton_mano[6].setDisable(true);
            Array_radiobutton_mano[7].setDisable(true);
        });
        
        
        Button cimitero = new Button();
        cimitero.setText("Cimitero");
        cimitero.setGraphic(new ImageView(image1));
        
        //open the help page when help button clicked---------------------------
        cimitero.setOnAction((ActionEvent event) -> {
            System.out.println("Come osi PrEmErMi!?!?!?!");
            Array_radiobutton_mano[0].setDisable(false);
            Array_radiobutton_mano[1].setDisable(false);
            Array_radiobutton_mano[2].setDisable(false);
            Array_radiobutton_mano[3].setDisable(false);
            Array_radiobutton_mano[4].setDisable(false);
            Array_radiobutton_mano[5].setDisable(false);
            Array_radiobutton_mano[6].setDisable(false);
            Array_radiobutton_mano[7].setDisable(false);
        });
        
        
        
        
        
        
        //Grid mano
        GridPane gp = new GridPane();
        
        gp.add(Array_radiobutton_mano[0], 0, 0);
        gp.add(Array_radiobutton_mano[1], 1, 0);
        gp.add(Array_radiobutton_mano[2], 2, 0);
        gp.add(Array_radiobutton_mano[3], 3, 0);
        gp.add(Array_radiobutton_mano[4], 4, 0);
        gp.add(Array_radiobutton_mano[5], 5, 0);
        gp.add(Array_radiobutton_mano[6], 6, 0);
        gp.add(Array_radiobutton_mano[7], 7, 0);
        
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
