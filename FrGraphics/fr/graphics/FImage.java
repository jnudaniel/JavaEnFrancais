package graphics;
import java.awt.Color;

import acm.graphics.GImage;

public class FImage extends GImage implements FObjet{

	public FImage(String nomDuFichier) {
		super(nomDuFichier);
	}

	public FImage(String nomDuFichier, double x, double y) {
		super(nomDuFichier, x, y);
	}

	public FImage(int[][] matriceDePixels) {
		super(matriceDePixels);
	}

	public FImage(int[][] matriceDePixels, double x, double y) {
		super(matriceDePixels, x, y);
	}

	public void enregistrerImage(String nomDuFichier) {
		saveImage(nomDuFichier);
	}

	public int[][] lireMatriceDePixels() {
		return getPixelArray();
	}

	public double lireX() {
		return getX();
	}
	public double lireY() {
		return getY();
	}

	/* Utilidades de pixeles. */
	public int creerRVBPixel(int rouge, int vert, int bleu) {
		return createRGBPixel(rouge, vert, bleu);
	}
	public int creerRVBPixel(int rouge, int vert, int bleu, int transparence) {
		return createRGBPixel(rouge, vert, bleu, opacite);
	}
	public int lireTransparence(int pixel) { return getAlpha(pixel); }
	public int lireRouge(int pixel) { return getRed(pixel); }
	public int lireVert(int pixel) { return getGreen(pixel); }
	public int lireBleu(int pixel) { return getBlue(pixel); }
	

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
