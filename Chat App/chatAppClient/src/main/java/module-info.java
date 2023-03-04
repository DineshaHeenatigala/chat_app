module com.example.chatappclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chatappclient to javafx.fxml;
    exports com.example.chatappclient;
}