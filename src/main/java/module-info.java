module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.AstonFrolovJava to javafx.fxml;
    exports com.example.AstonFrolovJava;
}