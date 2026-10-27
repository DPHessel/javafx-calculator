module com.example.j208_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.j208_1 to javafx.fxml;
    exports com.example.j208_1;
}