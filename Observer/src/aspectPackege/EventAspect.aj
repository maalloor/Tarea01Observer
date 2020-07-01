package aspectPackege;

import Application.Layout;
import notice.EventNotice;
import publisher.EventManager;

public aspect EventAspect {
	
	EventManager observer = new EventManager();
	EventNotice notificacion = new EventNotice(observer);
	
	pointcut changeToOrange(): execution(* activeOrange(..));
	pointcut changeToCyan(): execution(* activeCyan(..));
	pointcut changeToYellow(): execution(* activeYellow(..));
	pointcut global(): execution(* active*(..));
	
	after(): changeToOrange()
	{
		observer.setTimeOrange(observer.increase(observer.getTimesOrange()));
		observer.setStatus("naranja");
		Layout.aviso.setText("El fondo de la ventana ahora es de color " + observer.getStatus() +
				". Veces escogido: "+ observer.getTimesOrange());
	}
	after(): changeToCyan()
	{
		observer.setTimeCyan(observer.increase(observer.getTimesCyan()));
		observer.setStatus("cyan");
		Layout.aviso.setText("El fondo de la ventana ahora es de color " + observer.getStatus() +
				". Veces escogido: "+ observer.getTimesCyan());
	}
	after(): changeToYellow()
	{
		observer.setTimeYellow(observer.increase(observer.getTimesYellow()));
		observer.setStatus("amarillo");
		Layout.aviso.setText("El fondo de la ventana ahora es de color " + observer.getStatus() +
				". Veces escogido: "+ observer.getTimesYellow());
	}
	after(): global()
	{
		observer.setGlobalAccount(observer.increase(observer.getGlobalAccount()));
		Layout.aviso_global.setText(observer.getGlobalAccount()+ " veces se ha cambiado de color");
	}
}