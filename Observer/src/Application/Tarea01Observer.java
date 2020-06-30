package Application;

import javafx.application.Application;
import javafx.stage.Stage;

public class Tarea01Observer extends Application {

	public static void main(String[] args) {
    	launch(args);
    }
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Layout layout = new Layout();
		primaryStage.setTitle("Tarea01Observer");
		
		layout.getBtnOrange().setOnAction(e->{
			layout.getRoot().setStyle("-fx-background-color:orange;");
		});
		layout.getBtnCyan().setOnAction(e->{
			layout.getRoot().setStyle("-fx-background-color:cyan;");
		});
		layout.getBtnYellow().setOnAction(e->{
			layout.getRoot().setStyle("-fx-background-color:yellow;");
		});
		primaryStage.setScene(layout.getScene());
		primaryStage.show();
		
	}

}
