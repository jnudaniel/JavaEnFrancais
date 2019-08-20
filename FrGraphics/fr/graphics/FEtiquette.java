package graphics;
import java.awt.Color;

import acm.graphics.GLabel;

public class FEtiquette extends GLabel implements FObjet {

	public FEtiquette(String str) {
		super(str);
	}
	
	public FEtiquette(String str, double x, double y) {
		super(str, x, y);
	}
	
	public double lireHauteur() {
		return getAscent();
	}
	
	public double lireDescente() {
		return getDescent();
	}
	
	/* change text label */
	public void ecrireTexteDEtiquette(String texte) {
		setLabel(texte);
	}
	
	/* fonts */
	public void appliquerPolice(String police) {
		setFont(police);
	}

	public double lireX() {
		return getX();
	}

	public double lireY() {
		return getY();
	}
	
	
	public void deplacer(double dx, double dy) {
		move(dx, dy);
	}
	public void deplacer(int dx, int dy) {
		move(dx, dy);
	}

	public void emplacer(double i, double j) {
		setLocation(i, j);
	}

	public void emplacer(int i, int j) {
		setLocation(i, j);
	}

	public void appliquerCouleur(Color c) {
		setColor(c);
	}
	
	public double lireLargeur() {
		return getWidth();
	}
	
	public double lireHauteur() {
		return getHeight();
	}
	
	public void mettreVisible(boolean visible) {
		setVisible(visible);
	}

	public boolean estVisible() {
		return isVisible();
	}


}
