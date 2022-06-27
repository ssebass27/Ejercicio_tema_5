module com.example.ejercicio_tema_5 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.ejercicio_tema_5 to javafx.fxml;
    exports com.example.ejercicio_tema_5;
}