package graphics;
import java.awt.Color;

import acm.graphics.GOval;

public class FOvale extends GOval implements FObjet{

	public FOvale(double largeur, double hauteurs) {
		super(largeur, hauteur);
	}
	
	public FOvale(double x, double y, double largeur, double hauteur) {
		super(x, y, largeur, hauteur);
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

	public void remplir(boolean b) {
		setFilled(b);
	}

	public boolean estRempli() {
		return isFilled();
	}

	public void appliquerCouleurDeRemplissage(Color c) {
		setFillColor(c);
	}

	public void emplacer(double i, double j) {
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

	public void appliquerTaille(double largeur, double hauteur) {
		setSize(largeur, hauteur);
	}

	public void mettreVisible(boolean visible) {
		setVisible(visible);
	}

	public boolean estVisible() {
		return isVisible();
	}

}
