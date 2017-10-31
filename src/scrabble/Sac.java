package scrabble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*************************************************************************
 * Nom ...........: Sac.java
 * Description ...: Sac dans lequel les joueurs piochent les tuiles (102 
 * ...............: au total) pour les ajouter à leur chevalet
 * ...............:
 * Auteur(s) .....: MAMADOU BAH
 * Version .......: 1.0
 * Copyright .....: © 2017 MAMADOU BAH ALL RIGHTS RESERVED
 ************************************************************************/

public class Sac {
	
	// Liste de tuiles
	protected ArrayList<Tuile> lettres;
	
	// Constructeur sans paramètre
	public Sac() {
		
		lettres = new ArrayList<Tuile>();
		remplissage();
	}
	
	// Constructeur avec une liste de tuile en entrée
	public Sac(ArrayList<Tuile> _lettres) {
		
		lettres = _lettres;
	}
	
	// Création des tuiles et remplissage du sac
	public void remplissage() {
		
		for(int i = 1; i <= Lettre.A.nombre; i++)
			lettres.add(new Tuile('A', Lettre.A.valeur, Lettre.A.img));
		
		for(int i = 1; i <= Lettre.B.nombre; i++)
			lettres.add(new Tuile('B', Lettre.B.valeur, Lettre.B.img));
		
		for(int i = 1; i <= Lettre.C.nombre; i++)
			lettres.add(new Tuile('C', Lettre.C.valeur, Lettre.C.img));
		
		for(int i = 1; i <= Lettre.D.nombre; i++)
			lettres.add(new Tuile('D', Lettre.D.valeur, Lettre.D.img));
		
		for(int i = 1; i <= Lettre.E.nombre; i++)
			lettres.add(new Tuile('E', Lettre.E.valeur, Lettre.E.img));
		
		for(int i = 1; i <= Lettre.F.nombre; i++)
			lettres.add(new Tuile('F', Lettre.F.valeur, Lettre.F.img));
		
		for(int i = 1; i <= Lettre.G.nombre; i++)
			lettres.add(new Tuile('G', Lettre.G.valeur, Lettre.G.img));
		
		for(int i = 1; i <= Lettre.H.nombre; i++)
			lettres.add(new Tuile('H', Lettre.H.valeur, Lettre.H.img));
		
		for(int i = 1; i <= Lettre.I.nombre; i++)
			lettres.add(new Tuile('I', Lettre.I.valeur, Lettre.I.img));
		
		for(int i = 1; i <= Lettre.J.nombre; i++)
			lettres.add(new Tuile('J', Lettre.J.valeur, Lettre.J.img));
		
		for(int i = 1; i <= Lettre.K.nombre; i++)
			lettres.add(new Tuile('K', Lettre.K.valeur, Lettre.K.img));
		
		for(int i = 1; i <= Lettre.L.nombre; i++)
			lettres.add(new Tuile('L', Lettre.L.valeur, Lettre.L.img));
		
		for(int i = 1; i <= Lettre.M.nombre; i++)
			lettres.add(new Tuile('M', Lettre.M.valeur, Lettre.M.img));
		
		for(int i = 1; i <= Lettre.N.nombre; i++)
			lettres.add(new Tuile('N', Lettre.N.valeur, Lettre.N.img));
		
		for(int i = 1; i <= Lettre.O.nombre; i++)
			lettres.add(new Tuile('O', Lettre.O.valeur, Lettre.O.img));
		
		for(int i = 1; i <= Lettre.P.nombre; i++)
			lettres.add(new Tuile('P', Lettre.P.valeur, Lettre.P.img));
		
		for(int i = 1; i <= Lettre.Q.nombre; i++)
			lettres.add(new Tuile('Q', Lettre.Q.valeur, Lettre.Q.img));
		
		for(int i = 1; i <= Lettre.R.nombre; i++)
			lettres.add(new Tuile('R', Lettre.R.valeur, Lettre.R.img));
		
		for(int i = 1; i <= Lettre.S.nombre; i++)
			lettres.add(new Tuile('S', Lettre.S.valeur, Lettre.S.img));
		
		for(int i = 1; i <= Lettre.T.nombre; i++)
			lettres.add(new Tuile('T', Lettre.T.valeur, Lettre.T.img));
		
		for(int i = 1; i <= Lettre.U.nombre; i++)
			lettres.add(new Tuile('U', Lettre.U.valeur, Lettre.U.img));
		
		for(int i = 1; i <= Lettre.V.nombre; i++)
			lettres.add(new Tuile('V', Lettre.V.valeur, Lettre.V.img));
		
		for(int i = 1; i <= Lettre.W.nombre; i++)
			lettres.add(new Tuile('W', Lettre.W.valeur, Lettre.W.img));
		
		for(int i = 1; i <= Lettre.X.nombre; i++)
			lettres.add(new Tuile('X', Lettre.X.valeur, Lettre.X.img));
		
		for(int i = 1; i <= Lettre.Y.nombre; i++)
			lettres.add(new Tuile('Y', Lettre.Y.valeur, Lettre.Y.img));
		
		for(int i = 1; i <= Lettre.Z.nombre; i++)
			lettres.add(new Tuile('Z', Lettre.Z.valeur, Lettre.Z.img));
		
		for(int i = 1; i <= Lettre.JOCKER.nombre; i++)
			lettres.add(new Tuile('*', Lettre.JOCKER.valeur, Lettre.JOCKER.img));
    }
	
	//Melange le contenu du sac pour bien piocher apres
	public void melangerSac() {
		
		Collections.shuffle(lettres);
	}
	
	//verification si une lettre est dans le sac
	public boolean contientLettre(TuileBis lettre) {
		
		return lettres.contains(lettre);
	}

	//retourne le nombre de lettre dans le sac (taille du sac)
	public int nombreDeJetons() {
		
		return lettres.size();
	}
	
	//retourne true si le sac est vide, false sinon
	public boolean estVide() {
		
		if(lettres == null) 
			return true;
		
		return false;
	}
	
	// Afficher le contenu du sac
	public void afficherSac() {
		for(Tuile t: lettres)
		{
			System.out.println(t);
		}
	}
	
	//tirer une lettre dans le sacAlettre
	public Tuile tirerUneLettre() {
		int taille = nombreDeJetons();
		melangerSac(); // melange le contenu avant de tirer la lettre
		Random rand = new Random();
		int lettre = rand.nextInt(taille) + 1;
		return lettres.remove(lettre);
	}
	
}
