module gb.java2fx.lesson4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens gb.java2fx.lesson4 to javafx.fxml;
    exports gb.java2fx.lesson4;
}