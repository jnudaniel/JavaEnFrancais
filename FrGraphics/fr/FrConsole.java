package fr;
import java.awt.Color;
import java.util.ArrayList;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;



/**
 * ATTENTION: S'il vous plaît ne changez pas ce code.  Vous n'avez pas besoin
 * lire / modifier ce fichier. Ce fichier nous permet
 * traduire les bibliothèques en noms de méthodes en francais
 */


public abstract class FrConsole extends ConsoleProgram{

	private RandomGenerator rg = new RandomGenerator();

	public void pause(double ms) { pause(ms);}
	
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

	public boolean lireBoolean(String prompt) {
		return readBoolean(prompt);
	}
	
	public int lireInt(String prompt) {
		return readInt(prompt);
	}
	
	public double lireDouble(String prompt) {
		return readDouble(prompt);
	}

	public String lireLigne(String prompt) {
		return readLine(prompt);
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

	public ArrayList<String> lireFichierParMot(String nomDuFichier) {
		FrLecteurDeFichier lecteur = new FrLecteurDeFichier(nomDuFichier);
		return lecteur.lireMots();
	}

	public ArrayList<String> lireFichierParLigne(String nomDuFichier) {
		FrLecteurDeFichier lecteur = new FrLecteurDeFichier(nomDuFichier);
		return lecteur.lireLignes();
	}
	
}

