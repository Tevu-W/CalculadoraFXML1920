package dad.javafx.CalculadoraFXML;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CalculadoraFXMLModel {

	//Propertys
	
	StringProperty numeros = new SimpleStringProperty();

	public StringProperty numerosProperty() {
		return this.numeros;
	}
	

	public String getNumeros() {
		return this.numerosProperty().get();
	}
	

	public void setNumeros(final String numeros) {
		this.numerosProperty().set(numeros);
	}
	
	
	
	
	
}
