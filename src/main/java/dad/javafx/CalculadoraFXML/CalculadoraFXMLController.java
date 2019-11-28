package dad.javafx.CalculadoraFXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class CalculadoraFXMLController implements Initializable {

	CalculadoraFXMLModel modelo = new CalculadoraFXMLModel();

	CalculadoraFXMLogica logica = new CalculadoraFXMLogica();

	@FXML
	private GridPane root;

	@FXML
	private TextField resultado;

	@FXML
	private Button boton_7;

	@FXML
	private Button boton_8;

	@FXML
	private Button boton_9;

	@FXML
	private Button boton_4;

	@FXML
	private Button boton_5;

	@FXML
	private Button boton_6;

	@FXML
	private Button boton_1;

	@FXML
	private Button boton_2;

	@FXML
	private Button boton_3;

	@FXML
	private Button boton_0;

	@FXML
	private Button coma;

	@FXML
	private Button borrarTodo;

	@FXML
	private Button producto;

	@FXML
	private Button resta;

	@FXML
	private Button suma;

	@FXML
	private Button borrar;

	@FXML
	private Button division;

	@FXML
	private Button igual;

	public CalculadoraFXMLController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CalculadoraFXMLView.fxml"));
		loader.setController(this);
		loader.load();
	}

	public void initialize(URL location, ResourceBundle resources) {
		resultado.textProperty().bind(modelo.numerosProperty());
	}

	// Operaciones y coma
	@FXML
	void Borrar(ActionEvent event) {
		logica.borrar();
		modelo.setNumeros(logica.getPantalla());
	}

	@FXML
	void BorrarTodo(ActionEvent event) {
		logica.borrarTodo();
		modelo.setNumeros(logica.getPantalla());
	}

	@FXML
	void Coma(ActionEvent event) {
		logica.insertarComa();
		modelo.setNumeros(logica.getPantalla());
	}

	@FXML
	void Dividir(ActionEvent event) {
		logica.operar('/');
		modelo.setNumeros(logica.getPantalla());
	}

	@FXML
	void Igual(ActionEvent event) {
		logica.operar('=');
		modelo.setNumeros(logica.getPantalla());
	}

	@FXML
	void Multiplicar(ActionEvent event) {
		logica.operar('*');
		modelo.setNumeros(logica.getPantalla());
	}

	@FXML
	void Restar(ActionEvent event) {
		logica.operar('-');
		modelo.setNumeros(logica.getPantalla());
	}

	@FXML
	void Sumar(ActionEvent event) {
		logica.operar('+');
		modelo.setNumeros(logica.getPantalla());
	}

	// Numeros
	@FXML
	void insertar_cero(ActionEvent event) {

		logica.insertar('0');
		modelo.setNumeros(logica.getPantalla());

	}

	@FXML
	void insertar_cinco(ActionEvent event) {
		logica.insertar('5');
		modelo.setNumeros(logica.getPantalla());
	}

	@FXML
	void insertar_cuatro(ActionEvent event) {
		logica.insertar('4');
		modelo.setNumeros(logica.getPantalla());
	}

	@FXML
	void insertar_dos(ActionEvent event) {
		logica.insertar('2');
		modelo.setNumeros(logica.getPantalla());
	}

	@FXML
	void insertar_nueve(ActionEvent event) {
		logica.insertar('9');
		modelo.setNumeros(logica.getPantalla());
	}

	@FXML
	void insertar_ocho(ActionEvent event) {
		logica.insertar('8');
		modelo.setNumeros(logica.getPantalla());
	}

	@FXML
	void insertar_seis(ActionEvent event) {
		logica.insertar('6');
		modelo.setNumeros(logica.getPantalla());
	}

	@FXML
	void insertar_siete(ActionEvent event) {
		logica.insertar('7');
		modelo.setNumeros(logica.getPantalla());
	}

	@FXML
	void insertar_tres(ActionEvent event) {
		logica.insertar('3');
		modelo.setNumeros(logica.getPantalla());
	}

	@FXML
	void insertar_uno(ActionEvent event) {
		logica.insertar('1');
		modelo.setNumeros(logica.getPantalla());
	}

	public GridPane getView() {
		return root;
	}

}
