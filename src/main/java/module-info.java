module com.example.lastbiscuit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lastbiscuit to javafx.fxml;
    exports com.example.lastbiscuit;
}