module com.example.pagada1 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.pagada1 to javafx.fxml;
    exports com.example.pagada1;
}