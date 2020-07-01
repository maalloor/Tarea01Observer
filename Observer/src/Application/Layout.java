package Application;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import java.io.FileNotFoundException;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Layout {
	
	//Atributos para la creación de la ventana básica
	private VBox root;
	private HBox hButtons;
	private Button btnOrange;
	private Button btnCyan;
	private Button btnYellow;
	private Scene scene;
	public static Label aviso_global;
	public static Label aviso;
	private ImageView imgGif;
	
	public Layout()
	{
		initComponents();
		contentRoot();
	}
	
	public void initComponents()
	{
		root = new VBox(30);
		hButtons = new HBox(20);
		btnOrange = new Button("Color Orange");
		btnCyan = new Button("Color Cyan");
		btnYellow = new Button("Color Yellow");
		aviso = new Label("ELIJA UN COLOR");
		aviso_global = new Label("");
		imgGif = new ImageView("gif/inicio.gif");
		return;
	}
	
	public void contentRoot()
	{
		hButtons.getChildren().addAll(btnOrange,btnCyan,btnYellow);
		hButtons.setAlignment(Pos.CENTER);
		root.getChildren().addAll(hButtons,aviso,aviso_global,imgGif);
		root.setAlignment(Pos.CENTER);
		return;
	}
	//Métodos a utilizar con los pointcuts de la clase EventAspect del paquete aspectPackage
	public String activeOrange()
	{
		root.setStyle("-fx-background-color:orange;");
		try {
			completeImageView("gif/charizard.gif");
		} catch (FileNotFoundException e) {
			System.out.println("Url no encontrada\n");
		}
		return "Naranja";
	}
	
	public String activeCyan()
	{
		root.setStyle("-fx-background-color:cyan;");
		try {
			completeImageView("gif/squirtle.gif");
		} catch (FileNotFoundException e) {
			System.out.println("Url no encontrada\n");
		}
		return "Cyan";
		
	}
	
	public String activeYellow()
	{
		root.setStyle("-fx-background-color:yellow;");
		try {
			completeImageView("gif/pikachu.gif");
		} catch (FileNotFoundException e) {
			System.out.println("Url no encontrada\n");
		}
		return "Yellow";
	}
	
	public void completeImageView(String url) throws FileNotFoundException
	{
		Image image = new Image(url); 
		imgGif.setImage(image);
		return;
	}
	//Getters requeridos
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