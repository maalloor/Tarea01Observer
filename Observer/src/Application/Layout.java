package Application;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class Layout {
	private VBox root;
	private HBox hButtons;
	private Button btnOrange;
	private Button btnCyan;
	private Button btnYellow;
	private Scene scene;
	
	public Layout()
	{
		initComponents();
		contentRoot();
	}
	
	public void initComponents()
	{
		root = new VBox();
		hButtons = new HBox(20);
		btnOrange = new Button("Color Orange");
		btnCyan = new Button("Color Cyan");
		btnYellow = new Button("Color Yellow");
	}
	
	public void contentRoot()
	{
		hButtons.getChildren().addAll(btnOrange,btnCyan,btnYellow);
		hButtons.setAlignment(Pos.CENTER);
		root.getChildren().addAll(hButtons);
		root.setAlignment(Pos.CENTER);
	}
	
	//Getters
	public VBox getRoot()
	{
		return root;
	}
	
	public Scene getScene()
	{
		scene = new Scene(root,400,400);
		return scene;
	}
	
	public Button getBtnOrange()
	{
		return btnOrange;
	}
	
	public Button getBtnCyan()
	{
		return btnCyan;
	}
	
	public Button getBtnYellow()
	{
		return btnYellow;
	}
}
