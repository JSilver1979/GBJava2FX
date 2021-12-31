package gb.java2fx.lesson4;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    public TextArea textArea;
    @FXML
    public MenuItem exitMenu;
    @FXML
    public Button sendBtn;
    @FXML
    public TextField inputText;

    @FXML
    protected void SendMessage() {
        textArea.appendText(inputText.getText() + "\n");
        inputText.clear();
    }
    @FXML
    public void clickExit(ActionEvent actionEvent) {
        Platform.runLater(() -> {
            Stage stage = (Stage) sendBtn.getScene().getWindow();
            stage.close();
        });
    }
}