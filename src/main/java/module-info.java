module pl.appcake.stealthlink {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.appcake.stealthlink to javafx.fxml;
    exports pl.appcake.stealthlink;
}