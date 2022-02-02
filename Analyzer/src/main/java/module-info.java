module com.example.analyzer {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;


    opens com.example.analyzer to javafx.fxml;
    exports com.example.analyzer;
}