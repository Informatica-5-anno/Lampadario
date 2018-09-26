/**
 * Sample Skeleton for 'Lampadine.fxml' Controller Class
 */

package it.gov.feltrinelli.lampadario;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class LampadineController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="shapeOne"
    private Circle shapeOne; // Value injected by FXMLLoader

    @FXML // fx:id="btnOne"
    private Button btnOne; // Value injected by FXMLLoader

    @FXML // fx:id="shapeTwo"
    private Circle shapeTwo; // Value injected by FXMLLoader

    @FXML // fx:id="btnTwo"
    private Button btnTwo; // Value injected by FXMLLoader

    @FXML // fx:id="shapeThree"
    private Circle shapeThree; // Value injected by FXMLLoader

    @FXML // fx:id="btnThree"
    private Button btnThree; // Value injected by FXMLLoader

    @FXML // fx:id="shapeFour"
    private Circle shapeFour; // Value injected by FXMLLoader

    @FXML // fx:id="btnFour"
    private Button btnFour; // Value injected by FXMLLoader
    
    private Lampadario model;
    
    protected void setModel(Lampadario model) {
		this.model = model;
	}

    private void action(Circle shape, Button btn, int lamp) {
         model.l[lamp].onOff();
         switch (model.l[lamp].getStato()) {
         case ACCESO:
      	   shape.setFill(model.l[lamp].getColore());
      	   break;
         case SPENTO:
      	   shape.setFill(Color.WHITE);
      	   break;
         case ROTTO:
      	   shape.setFill(Color.GRAY);
      	   btn.setDisable(true);
      	   break;
         }
    }
    
	@FXML
    void onBtnOne(ActionEvent event) {
	  action(shapeOne,btnOne,0);
    }

    @FXML
    void onFour(ActionEvent event) {
      action(shapeFour,btnFour,3);
    }

    @FXML
    void onThree(ActionEvent event) {
      action(shapeThree,btnThree,2);
    }

    @FXML
    void onTwo(ActionEvent event) {
       action(shapeTwo,btnTwo,1); 
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert shapeOne != null : "fx:id=\"shapeOne\" was not injected: check your FXML file 'Lampadine.fxml'.";
        assert btnOne != null : "fx:id=\"btnOne\" was not injected: check your FXML file 'Lampadine.fxml'.";
        assert shapeTwo != null : "fx:id=\"shapeTwo\" was not injected: check your FXML file 'Lampadine.fxml'.";
        assert btnTwo != null : "fx:id=\"btnTwo\" was not injected: check your FXML file 'Lampadine.fxml'.";
        assert shapeThree != null : "fx:id=\"shapeThree\" was not injected: check your FXML file 'Lampadine.fxml'.";
        assert btnThree != null : "fx:id=\"btnThree\" was not injected: check your FXML file 'Lampadine.fxml'.";
        assert shapeFour != null : "fx:id=\"shapeFour\" was not injected: check your FXML file 'Lampadine.fxml'.";
        assert btnFour != null : "fx:id=\"btnFour\" was not injected: check your FXML file 'Lampadine.fxml'.";

    }
}
