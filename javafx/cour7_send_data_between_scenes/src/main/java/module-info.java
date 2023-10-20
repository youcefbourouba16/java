module com.example.cour7_send_data_between_scenes {
    requires javafx.controls;
    requires javafx.fxml;
            
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.cour7_send_data_between_scenes to javafx.fxml;
    exports com.example.cour7_send_data_between_scenes;
}