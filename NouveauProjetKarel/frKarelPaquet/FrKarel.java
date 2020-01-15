package frKarelPaquet;

import java.awt.Color;

import stanford.karel.SuperKarel;

/**
 * ATTENTION: Merci de ne pas changer ce code.  Vous n'avez pas
 * besoin de lire ou modifier ce fichier. Ce fichier nous permet
 * de traduire les bibliothèques Karel en français.
 */
public abstract class FrKarel extends SuperKarel {

	
	/********************************************** 
	 *              code privé                    *
	 **********************************************/
	
	
	
	public void avancer() {
		move();
	}
	
	public void tournerAGauche() {
		turnLeft();
	}
	
	public void faireDemiTour() {
		turnAround();
	}
	
	public void poserJeton() {
		putBeeper();
	}
	
	public void ramasserJeton() {
		pickBeeper();
	}
	
	public void peindreCoin(Color c) {
		paintCorner(c);
	}
	
	/** Conditions **/
	
	public boolean devantDegage() {
		return frontIsClear();
	}
	
	public boolean devantBloque() {
		return frontIsBlocked();
	}
	
	public boolean gaucheDegagee() {
		return leftIsClear();
	}
	
	public boolean gaucheBloquee() {
		return leftIsBlocked();
	}
	
	public boolean droiteDegagee() {
		return rightIsClear();
	}
	
	public boolean droiteBloquee() {
		return rightIsBlocked();
	}
	
	public boolean jetonsPresents() {
		return beepersPresent();
	}
	
	public boolean aucunJetonPresent() {
		return noBeepersPresent();
	}
	
	public boolean aucunJetonEnPoche() {
		return noBeepersInBag();
	}
	
	public boolean jetonsEnPoche() {
		return beepersInBag();
	}
	
	public boolean faceAuNord() {
		return facingNorth();
	}
	
	public boolean pasFaceAuNord() {
		return notFacingNorth();
	}
	
	public boolean faceALEst() {
		return facingEast();
	}
	
	public boolean pasFaceALEst() {
		return notFacingEast();
	}
	
	public boolean faceAuSud() {
		return facingSouth();
	}
	
	public boolean pasFaceAuSud() {
		return notFacingSouth();
	}
	
	public boolean faceALOuest() {
		return facingWest();
	}
	
	public boolean pasFaceALOuest() {
		return notFacingWest();
	}
	
	public boolean aleatoire() {
		return random();
	}
	
	public boolean aleatoire(double p) {
		return random(p);
	}

	public boolean couleurDuCoinEst(Color c) {
		return cornerColorIs(c);
	}
	
}
