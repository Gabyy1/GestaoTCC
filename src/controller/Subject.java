package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Subject {
	List observers = new ArrayList();
	
	public void anexar(Observer s) {
		observers.add(s);
	}

	public void desanexar(Observer s) {
		observers.add(s);
	}
	
	public void notificar() {
		Iterator it = observers.iterator();
			while(it.hasNext()) {
				Observer s = (Observer) it.next();
				s.atualizar(this);
			}
	}
}
