package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        StackPane stackPane = new StackPane();
        Button button = new Button();
        stackPane.getChildren().add(button);
        Scene scene = new Scene(stackPane,400,600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Kalkulator");
        primaryStage.show();

    }
}
