// Package
package scrabble;

// Import(s)
import java.util.ArrayList;
import java.util.Collections;

/*************************************************************************
 * Nom ...........: Chevalet.java
 * Description ...: Ensemble de tuiles dont dispose le joueur durant la 
 * ...............: partie, il en possede 7 constamment
 * ...............:
 * Auteur(s) .....: SIMON BACQUET
 * Version .......: 1.0
 * Copyright .....: © 2017 SIMON BACQUET ALL RIGHTS RESERVED
 ************************************************************************/

public class Chevalet {
	
	// ArrayList contenant les tuiles du chevalet
	private ArrayList<Tuile> chevalet;
	// Taille constante du chevalet tout au long du jeu 
	private final int TAILLE = 7;
	
	// Constructeur sans parametre
	Chevalet(){
		
		this.chevalet = new ArrayList<Tuile>();
	}
	
	// Constructeur avec un chevalet en parametre 
	Chevalet(ArrayList<Tuile> chevalet){
		
		this.chevalet = chevalet;
	}
	
	// Ajouter une tuile en queue de liste 
	public void ajouterObjet(Tuile t) {
		
		if(this.chevalet.size() < TAILLE)
			this.chevalet.add(t);
	}
	
	// Ajoute la tuile t en indice i 
	public void ajouterObjetIndex(Tuile t, int i) {
		
		if(this.chevalet.size() < TAILLE)
			this.chevalet.add(i, t);
	}
	
	// Obtenir la taille de la liste
	public int getTaille() {
		
		return this.chevalet.size();
	}
	
	// Retourne la tuile correspondante a l'indice donne 
	public Tuile getObjet(int i) {
		
		return this.chevalet.get(i);
	}
	
	// Retourne l'indice de la tuile donnee 
	public int getIndex(Tuile t) {
		
		return this.chevalet.indexOf(t);
	}
	
	// Retourne un boolean selon l'etat de la liste (#t = vide)
	public boolean estVide(){
		
		return this.chevalet.isEmpty();
	}
	
	// Supprime toutes les tuiles du chevalet
	public void supprimerContenu() {
		
		this.chevalet.clear();
	}
	
	// Supprime l'objet a l'indice i
	public void supprimerObjet(int i) {
		
		this.chevalet.remove(i);
	}
	
	
	// Melange les tuile de la liste 
	public void melanger() {
		
		Collections.shuffle(chevalet);
	}

	@Override
	public String toString() {
		return "Chevalet [chevalet=" + chevalet + "]";
	}
}
