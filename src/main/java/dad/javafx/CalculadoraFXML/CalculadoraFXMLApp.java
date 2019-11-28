package dad.javafx.CalculadoraFXML;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculadoraFXMLApp extends Application {

	CalculadoraFXMLController controlador;

	@Override
	public void start(Stage primaryStage) throws Exception {

		controlador = new CalculadoraFXMLController();

		Scene scene = new Scene(controlador.getView(), 600, 400);

		primaryStage.setTitle("Calculadora");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
