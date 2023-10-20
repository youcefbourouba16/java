module com.example.cour8_imageview {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cour8_imageview to javafx.fxml;
    exports com.example.cour8_imageview;
}