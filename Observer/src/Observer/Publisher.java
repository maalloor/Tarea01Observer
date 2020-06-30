package observer;

import java.util.ArrayList;

public class Publisher {
	
	//Atributos
	
	private ArrayList<Listener> listeners = new ArrayList<>();
	private String status;
	
	//Constructor por defecto
	public Publisher()
	{
		
	}
	//Métodos a implementar
	public void addListener(Listener observer) {
		listeners.add(observer);
	}
	public void removeListener(Listener observer) {
		listeners.remove(observer);
	}
	
	//Getter status
	public String getStatus() {
		return status;
	}
		
	//Setter status
	public void setStatus(String status) {
		this.status = status;																									
	}
}
