module LampadarioFX {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens lampadario to javafx.graphics, javafx.fxml;
}
