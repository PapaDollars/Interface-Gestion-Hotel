module com.example.prinved {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prinved to javafx.fxml;
    exports com.example.prinved;
}