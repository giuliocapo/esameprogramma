module com.example.esameprogramma {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.esameprogramma to javafx.fxml;
    exports com.example.esameprogramma;
}