module com.tvn._thaivinhnguyen {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.tvn._thaivinhnguyen to javafx.fxml;
    exports com.tvn._thaivinhnguyen;
}
