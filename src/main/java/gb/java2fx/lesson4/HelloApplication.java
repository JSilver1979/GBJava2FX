package gb.java2fx.lesson4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 450);
        stage.setTitle("Chat Window");
        stage.setScene(scene);
        stage.setMinWidth(300.0);
        stage.setMinHeight(200.0);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}