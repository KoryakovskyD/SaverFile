module com.example.saverfile {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.saverfile to javafx.fxml;
    exports com.example.saverfile;
}