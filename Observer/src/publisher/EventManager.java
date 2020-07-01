package publisher;

import java.util.ArrayList;

import listener.EventListener;

public class EventManager {
	
	//Atributos
	
	private ArrayList<EventListener> listeners;
	private String status;
	private Integer timesYellow;
	private Integer timesCyan;
	private Integer timesOrange;
	private Integer globalAccount;
	//Constructor por defecto
	public EventManager ()
	{
		listeners = new ArrayList<>();
		this.status = null;
		this.globalAccount = this.timesYellow = this.timesCyan = this.timesOrange = 0;
	}
	
	public int increase(int times)
	{
		times++;
		return times;
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
	
	//Getter times
	public Integer getTimesYellow()
	{
		return timesYellow;
	}
	
	public Integer getTimesCyan()
	{
		return timesCyan;
	}
	
	public Integer getTimesOrange()
	{
		return timesOrange;
	}
	
	public Integer getGlobalAccount()
	{
		return globalAccount;
	}
	//Setter status
	public void setStatus(String status) {
		this.status = status;	
		notice();
		return;
	}
	//Setter times
	public void setTimeOrange(Integer timesOrange)
	{
		this.timesOrange = timesOrange;
	}
	
	public void setTimeCyan(Integer timesCyan)
	{
		this.timesCyan = timesCyan;
	}
	
	public void setTimeYellow(Integer timesYellow)
	{
		this.timesYellow = timesYellow;
	}
	
	public void setGlobalAccount(Integer globalAccount)
	{
		this.globalAccount = globalAccount;
	}

}
