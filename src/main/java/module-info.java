module me.p3074098.basketballapplication {
    requires javafx.controls;
    requires javafx.fxml;
    
    
    opens me.p3074098.basketballapplication to javafx.fxml;
    exports me.p3074098.basketballapplication;
    exports me.p3074098.basketballapplication.controller;
    opens me.p3074098.basketballapplication.controller to javafx.fxml;
}