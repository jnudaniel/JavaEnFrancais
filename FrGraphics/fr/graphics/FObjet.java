package graphics;
import java.awt.Color;

public interface FObjet {
	public double lireX();
	public double lireY();
	public void changerCouleur(Color c);
	public void emplacer(double i, double j);
	public void deplacer(double dx, double dy);
	public double lireLargeur();
	public double lireHauteur();
	public void mettreVisible(boolean visible);
	public boolean estVisible();
}
