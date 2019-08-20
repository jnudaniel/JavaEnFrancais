package fr;

import java.awt.Component;
import java.awt.event.MouseEvent;

public class EvenementSouris {

	private EvenementSouris e = null;
	
	public EvenementSouris(MouseEvent toCopy) {
		e = toCopy;
	}
	
	public int lireX() {
		return e.getX();
	}
	
	public int lireY() {
		return e.getY();
	}
	
	public MouseEvent lireEvenement() {
		return e;
	}

}
