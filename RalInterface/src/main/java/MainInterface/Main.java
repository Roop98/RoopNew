package MainInterface;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.InputStream;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Root Scene
        Parent root = FXMLLoader.load(getClass().getResource("Primary.fxml"));
        primaryStage.setTitle("RAL Restaurant Management System");
        InputStream iconStream = getClass().getResourceAsStream("/icon.png");
        Image image = new Image(iconStream);
        primaryStage.getIcons().add(image);
        primaryStage.setScene(new Scene(root, 643, 675));
        primaryStage.show();

    }



    public static void main(String[] args) {
        launch(args);
    }
}
