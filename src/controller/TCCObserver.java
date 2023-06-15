package controller;

public class TCCObserver extends Subject {
	private Object myStatus;
	

	public Object getMyStatus() {
		return myStatus;
	}

	public void setMyStatus(Object myStatus) {
		this.myStatus = myStatus;
		notificar();
	}
}
