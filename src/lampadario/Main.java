package lampadario;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	private Lampadario lampadario;
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("VirtLamp");
			FXMLLoader loader=new FXMLLoader(getClass().getResource("Lampadine.fxml"));
			BorderPane root = (BorderPane)loader.load();
			LampadineController controller=loader.getController();
			// Build the model
			lampadario=new Lampadario();
			controller.setModel(lampadario);
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
