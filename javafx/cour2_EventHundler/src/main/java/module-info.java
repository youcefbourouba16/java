module com.example.cour2_eventhundler {
    requires javafx.controls;
    requires javafx.fxml;
            
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.cour2_eventhundler to javafx.fxml;
    exports com.example.cour2_eventhundler;
}