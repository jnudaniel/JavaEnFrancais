package graphics;
import java.awt.Color;

import acm.graphics.GLine;

public class FLigne extends GLine implements FObjet{

	public FLigne(double x0, double y0, double x1, double y1) {
		super(x0, y0, x1, y1);
	}

	/* Getters and setters for start and end points. */
	public void placerPointDeDepart(double x, double y) {
		setStartPoint(x, y);
	}
	public void placerPointFinal(double x, double y) {
		setEndPoint(x, y);
	}
	public double lirePointDeDepartX() {
		return getStartPoint().getX();
	}
	public double lirePointDeDepartY() {
		return getStartPoint().getY();
	}
	public double lirePointFinalX() {
		return getEndPoint().getX();
	}
	public double lirePointFinalY() {
		return getEndPoint().getY();
	}

	public double lireX() {
		return lirePointDeDepartX();
	}
	public double lireY() {
		return lirePointDeDepartY();
	}

	public void deplacer(double dx, double dy) {
		move(dx, dy);
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
	
	public void mettreVisible(boolean visible) {
		setVisible(visible);
	}
	public boolean estVisible() {
		return isVisible();
	}


}
