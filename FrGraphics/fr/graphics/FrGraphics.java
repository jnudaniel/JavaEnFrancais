package graphics;

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;

public abstract class FrGraphics extends GraphicsProgram{

	private RandomGenerator rg = new RandomGenerator();

	/* Ajouter et enlever. */
	public void ajouter(FObjet obj) {
		add((GObject)obj);
	}
	
	public void ajouter(FObjet obj, double x, double y) {
		add((GObject)obj, x, y);
	}
	
	public void enlever(FObjet obj) {
		remove((GObject)obj);
	}
	
	public void toutEnlever() {
		removeAll();
	}

	public void appliquerCouleurDeFond(Color c) {
		setBackground(c);
	}
	
	/* Ecouteurs de souris */
	public void mouseClicked(MouseEvent e) { sourisCliquee(e); }
	public void sourisCliquee(MouseEvent e) { /* overload */ }
	public void mouseMoved(MouseEvent e) { sourisDeplacee(e); }
	public void sourisDeplacee(MouseEvent e) { /* overload */ }
	public void mouseDragged(MouseEvent e) { sourisGlissee(e); }
	public void sourisGlissee(MouseEvent e) { /* overload */ }
	public void mouseEntered(MouseEvent e) { sourisEntree(e); }
	public void sourisEntree(MouseEvent e) { /* overload */ }
	public void mouseExited(MouseEvent e) { sourisSortie(e); }
	public void sourisSortie(MouseEvent e) { /* overload */ }
	public void mousePressed(MouseEvent e) { sourisAppuyee(e); }
	public void sourisAppuyee(MouseEvent e) { /* overload */ }
	public void mouseReleased(MouseEvent e) { sourisRelachee(e); }
	public void sourisRelachee(MouseEvent e) { /* overload */ }

	public void attendreClic() {
		waitForClick();
	}
	
	public void ajouterCapteursDeSouris() {
		addMouseListeners();
	}

	/* Largeur et hauteur */
	public double lireLargeur() { return getWidth(); }
	public double lireHauteur() { return getHeight(); }
	
	public FObjet capterObjetA(double x, double y) {
		return (FObjet)getElementAt(x, y);
	}
	
	/* pause */
	public void pause(double ms) {
		pause(ms);
	}

	/* Quelques outils de FrConsole dont nous avons également besoin ici */
	public void imprimer(String s) {
		println(s);
	}
	
	public void imprimer(double d) {
		println(d);
	}

	public void imprimer(int i) {
		println(i);
	}

	public void imprimerEnLigne(String s) {
		print(s);
	}
	
	public void imprimerEnLigne(double d) {
		print(d);
	}

	public void imprimerEnLigne(int i) {
		print(i);
	}
	
	public int intAleatoire() {
		return rg.nextInt();
	}
	
	public int intAleatoire(int max) {
		return rg.nextInt(max);
	}
	
	public int intAleatoire(int min, int max) {
		return rg.nextInt(min, max);
	}
	
	public double doubleAleatoire() {
		return rg.nextDouble();
	}
	
	public double doubleAleatoire(double min, double max) {
		return rg.nextDouble(min, max);
	}
	
	public Color couleurAleatoire() {
		return rg.nextColor();
	}
	
	public boolean booleanAleatoire() {
		return rg.nextBoolean();
	}
	
	public boolean booleanAleatoire(double p) {
		return rg.nextBoolean(p);
	}
}
