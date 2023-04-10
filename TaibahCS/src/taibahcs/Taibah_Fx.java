
package taif_java;

import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Taibah_Fx extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
    BorderPane bor_pane = new BorderPane();
        Button Conveners = new Button();
        Button Lecturers = new Button();
        Button Exit = new Button(); 
        
        Conveners.setMinSize(80, 40);
        Conveners.setText("Conveners");
       
        Lecturers.setMinSize(80, 40);
        Lecturers.setText("Lecturers");
      
        Exit.setMinSize(80, 40);
        Exit.setText("Exit");
        Label label = new Label("Taibah University Project");
        label.setStyle("-fx-font-weight: bold");
        label.setTextFill(Color.BLUE);
        label.setFont(new Font(20));
        int ImageSize =200;
        ImageView viewCard1 = new ImageView(new Image(new File("src/image/logo.png").toURI().toString()));
  
        viewCard1.setFitHeight(ImageSize);
        viewCard1.setFitWidth(ImageSize);

        
        
Conveners.setOnAction(new EventHandler<ActionEvent>() {            
    @Override
public void handle(ActionEvent event) {
        
            }
        });
        Lecturers.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event){ }
        
        });
Exit.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close();
            }
        });

        Exit.setMaxSize(80, 80);
        VBox VB = new VBox();
        VB.getChildren().addAll(viewCard1,label);
        VB.setAlignment(Pos.CENTER);
        bor_pane.setTop(VB);
        HBox HB = new HBox();
        HB.getChildren().addAll(Conveners,Lecturers);
        HB.setAlignment(Pos.CENTER);
        HB.setSpacing(70);
        bor_pane.setCenter(HB);
        HBox HB1 = new HBox();
        HB1.getChildren().add(Exit);
        HB1.setAlignment(Pos.TOP_CENTER);
        HB1.setPadding(new Insets(15, 15, 15, 15));
        bor_pane.setBottom(HB1);
        Scene scene = new Scene(bor_pane, 400, 450);
        
        primaryStage.setTitle("Taibah University Project");
        primaryStage.setScene(scene);
        primaryStage.show();
    }}