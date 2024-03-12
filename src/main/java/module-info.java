module com.example.aipos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aipos to javafx.fxml;
    exports com.example.aipos;
}