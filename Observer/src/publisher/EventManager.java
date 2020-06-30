package publisher;

import java.util.ArrayList;

import listener.EventListener;

public class EventManager {
	
	//Atributos
	
	private ArrayList<EventListener> listeners;
	private String status;
	
	//Constructor por defecto
	public EventManager ()
	{
		listeners = new ArrayList<>();
		this.status = null;
	}
	//Métodos a implementar
	public void addListener(EventListener observer) {
		listeners.add(observer);
		return;
	}
	public void removeListener(EventListener observer) {
		listeners.remove(observer);
		return;
	}
	
	public void notice() {
		for(EventListener listener: listeners) 
		{
			listener.update();
		}
		return;
	}
	//Getter status
	public String getStatus() {
		return status;
	}
		
	//Setter status
	public void setStatus(String status) {
		this.status = status;	
		notice();
		return;
	}
}
