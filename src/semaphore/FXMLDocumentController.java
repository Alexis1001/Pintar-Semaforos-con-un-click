/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphore;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author PC
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    Circle circle1, circle2, circle3;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void greenLight(){
        if (circle1.getFill().equals(javafx.scene.paint.Color.GREEN)) {
            circle1.setFill(javafx.scene.paint.Color.BLACK);
        }else{
            turnOff();
            circle1.setFill(javafx.scene.paint.Color.GREEN);
        }
    }
    
    @FXML
    public void yellowLight(){
        if (circle2.getFill().equals(Color.YELLOW)) {
            circle2.setFill(javafx.scene.paint.Color.BLACK);
        }else{
            turnOff();
            circle2.setFill(Color.YELLOW);
        }
    }
    
    @FXML
    public void redLight(){
        if (circle3.getFill().equals(javafx.scene.paint.Color.RED)) {
            circle3.setFill(javafx.scene.paint.Color.BLACK);
        }else{     
            turnOff();
            circle3.setFill(javafx.scene.paint.Color.RED);
            
        }
    }
    
    public void turnOff(){
        circle1.setFill(Color.BLACK);
        circle2.setFill(Color.BLACK);
        circle3.setFill(Color.BLACK);
    }
}
