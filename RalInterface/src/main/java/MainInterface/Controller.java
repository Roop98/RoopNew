package MainInterface;

import javafx.fxml.FXML;

import java.awt.event.ActionEvent;

public class Controller {
    @FXML

    public void pressService(javafx.event.ActionEvent actionEvent) {

        System.out.println("Service Area");


    }

    public void pressAdmin(javafx.event.ActionEvent actionEvent) {

        System.out.println("Admin Area");
    }
}
