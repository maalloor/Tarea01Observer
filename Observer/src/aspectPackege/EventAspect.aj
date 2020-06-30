package aspectPackege;


import notice.EventNotice;
import publisher.EventManager;

public aspect EventAspect {
	
	EventManager observer = new EventManager();
	EventNotice notificacion = new EventNotice(observer);
	
	pointcut changeToOrange(): execution(* activeOrange(..));
	pointcut changeToCyan(): execution(* activeCyan(..));
	pointcut changeToYellow(): execution(* activeYellow(..));
	
	after(): changeToOrange(){
		observer.setStatus("naranja");
	}
	after(): changeToCyan(){
		observer.setStatus("cyan");
	}
	after(): changeToYellow(){
		observer.setStatus("amarillo");
	}
}