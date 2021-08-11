package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("layout.fxml"));
        primaryStage.setTitle("JMGraph");
        primaryStage.setScene(new Scene(root));
        primaryStage.getScene().getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.getIcons().add(new Image(getClass().getClassLoader().getResource("sample/graphWhite.png").toExternalForm()));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
