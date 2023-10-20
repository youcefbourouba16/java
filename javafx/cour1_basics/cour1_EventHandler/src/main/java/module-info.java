module com.example.cour1_eventhandler {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.cour1_eventhandler to javafx.fxml;
    exports com.example.cour1_eventhandler;
}