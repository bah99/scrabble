/*******************************************************************************
Nom ................. : Jeu.java

Description ......... : Classe principale comportant une it�ration de Dictionnai
						-re, la fonction main ainsi que la sc�ne javafx principa
						-le

Auteur(s) ........... : LAMPE Ronan

Derni�re modification : 13/10/2017

*******************************************************************************/

// Package
package scrabble;

// Import(s)
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Jeu extends Application {
	
	// D�claration du dictionnaire
	static Dictionnaire Dictionnaire = new Dictionnaire();
	
	// Ceci est la fonction principale du jeu
	public static void main(String[] args) {		
		
		// Initialisation du dictionnaire
		Dictionnaire.initDico();
		
		// Lancement de la fen�tre javafx --> fonction "start"
		launch(args);
	}

	// Fonction permettant le lancement de l'application
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// Test root cr�� avec Scene Builder
		Parent root = FXMLLoader.load(getClass().getResource("/scrabble/Jeu.fxml"));
		
		// D�claration de la sc�ne et insertion dans le primaryStage
		Scene scene = new Scene(root, 1000, 600);
		primaryStage.setScene(scene);
		
		// Visualisation du primaryStage
		primaryStage.setTitle("Scrabble");
		primaryStage.show();
	}

}
