package notice;



import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import listener.EventListener;
import publisher.EventManager;

public class EventNotice implements EventListener{
	
	private EventManager observer;
	private Alert alerta;
	public EventNotice(EventManager manager)
	{
		this.observer = manager;
		this.observer.addListener(this);
		alerta = new Alert(AlertType.CONFIRMATION);
	}
	@Override
	public void update() {
		colorAlert();
		
	}
	
	public void colorAlert() {
		alerta.setTitle("Se efectuó el respectivo cambio de color");
		alerta.setContentText("El fondo de la ventana ahora es de color "+ observer.getStatus());
		alerta.showAndWait();
		
	}

}
