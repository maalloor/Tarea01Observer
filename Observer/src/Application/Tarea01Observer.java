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
			System.out.println(layout.activeOrange());
		});
		layout.getBtnCyan().setOnAction(e->{
			System.out.println(layout.activeCyan());
		});
		layout.getBtnYellow().setOnAction(e->{
			System.out.println(layout.activeYellow());
		});
		primaryStage.setScene(layout.getScene());
		primaryStage.setMaximized(true);
		primaryStage.show();
		
	}

}
