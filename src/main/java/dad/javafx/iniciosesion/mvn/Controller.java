package dad.javafx.iniciosesion.mvn;

import java.io.IOException;

import dad.javafx.iniciosesion.LectorCifrado;
import javafx.application.Platform;

public class Controller {
	
	private View view = new View();
	private Model model = new Model();
	
	public Controller() {
		view.getBtCancelar().setOnAction(e-> Platform.exit());
		try {
			System.out.println(LectorCifrado.leerFichero("users.csv"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public View getView() {
		return view;
	}

	public void setView(View view) {
		this.view = view;
	}
	
}
