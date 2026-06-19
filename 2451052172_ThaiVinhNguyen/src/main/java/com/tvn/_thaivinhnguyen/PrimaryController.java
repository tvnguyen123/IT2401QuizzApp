package com.tvn._thaivinhnguyen;

import com.tvn.utils.MyAlertSingleton;
import com.tvn.utils.themes.ThemeType;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class PrimaryController implements Initializable{
    @FXML private ComboBox<ThemeType> cbThemes;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(ThemeType.values()));
    }
    
    public void manageQuestions(ActionEvent e){
        MyAlertSingleton.getInstance().showMsg("Comming soon...");
    }
    
    public void practice(ActionEvent e){
        MyAlertSingleton.getInstance().showMsg("Comming soon...");
    }
    
    public void exam(ActionEvent e){
        MyAlertSingleton.getInstance().showMsg("Comming soon...");
    }

    public void changeTheme(ActionEvent e) {
        switch (this.cbThemes.getSelectionModel().getSelectedItem()) {
            case DARK:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("dark.css").toExternalForm());
                break;
            case LIGHT:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("light.css").toExternalForm());
                break;
            default:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("style.css").toExternalForm());
                break;
        }
    }
}
