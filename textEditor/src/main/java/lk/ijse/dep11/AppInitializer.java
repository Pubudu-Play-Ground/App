package lk.ijse.dep11;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        AnchorPane root = FXMLLoader.load(getClass().getResource("/view/SplashForm.fxml"));
        Scene Splash = new Scene(root);
     //   primaryStage.setScene(Splash);
       // primaryStage.setTitle("Text Editor");

//        primaryStage.initStyle(StageStyle.TRANSPARENT);
//        root.setBackground(Background.fill(Color.TRANSPARENT));
//        Splash.setFill(Color.TRANSPARENT);

//        primaryStage.centerOnScreen();
//        primaryStage.show();
        Splash.setFill(Color.TRANSPARENT);

        Stage stage = new Stage(StageStyle.TRANSPARENT);
        stage.setTitle("Text Editor");
        stage.setScene(Splash);
        stage.show();
        stage.centerOnScreen();
    }
}
