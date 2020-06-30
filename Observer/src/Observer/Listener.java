package observer;

public abstract class Listener {
	
	protected Publisher observador;
	
	public abstract void update();
}
