package fr;

import java.io.*;
import java.util.*;

public class FrLecteurDeFichier {
	String nomDuFichier;

	public FrLecteurDeFichier(String nomDuFichier) {
		this.nomDuFichier = nomDuFichier;
	}

	public ArrayList<String> lireMots() {
		ArrayList<String> mots = new ArrayList<String>();
		try {
			Scanner lecteur = new Scanner(new File(this.nomDuFichier));
			while (lecteur.hasNext()){
			    mots.add(lecteur.next());
			}
			lecteur.close();
			return mots;
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			return mots;
		}
	}

	public ArrayList<String> lireLignes() {		
		ArrayList<String> lignes = new ArrayList<String>();
		try {
			Scanner lecteur = new Scanner(new File(this.nomDuFichier));
			while (lecteur.hasNextLine()){
				lignes.add(lecteur.nextLine());
			}
			lecteur.close();
			return lignes;
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			return lignes;
		} 
	}
	
}

