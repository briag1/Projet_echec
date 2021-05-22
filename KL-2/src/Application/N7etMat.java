package Application;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Jeu.Jouer;
/** Classe principale de l'application, c'est elle qui gère la fenêtre de base et ouvre
 * les autres fenêtres lors du lancement d'une ou plusieurs partie(s).
 * @author Alexandre
 */
public class N7etMat {
	
	/** Les dimensions de la fenêtre */
	private static Dimension dimFenetre = new Dimension(300, 175);
	
	/** La fenêtre */
	static JFrame fenetre;	
	
    private static Stack<Jouer> parties;

	/** Méthode principale.  */
	public static void main(String[] args) {
		
		parties = new Stack<Jouer>();
		
		fenetre = new JFrame("N7 et Mat");
		
		// Determiner la position de la fenetre
		fenetre.setLocation(500, 200);

		// Determiner les dimensions de la fenetre
		fenetre.setSize(dimFenetre);

		// Construire le contrôleur (gestion des événements)
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// afficher la fenêtre
		java.awt.Container contenu = fenetre.getContentPane();
		contenu.setLayout(new java.awt.FlowLayout());
		
		// Panel Principal
		JPanel principal = new JPanel();
		principal.setLayout(new java.awt.GridLayout(4,1));
		JButton jouer = new JButton("Jouer");
		jouer.addActionListener(new ActionJouer());
		principal.add(jouer);
		JButton apprentissage = new JButton("Apprentissage");
		principal.add(apprentissage);
		JButton regles = new JButton("Règles");
		principal.add(regles);
		JButton profil = new JButton("Profil");
		principal.add(profil);
		contenu.add(principal);
		
		fenetre.setVisible(true);
		
	}
	
	// Les classes Actions

	/** Action permettant de quitter le jeu. */
	class ActionQuitter implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			fenetre.dispose();
			System.exit(0);
		}
	}
	
	/** Action permettant de commencer une partie */
	static class ActionJouer implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			Jouer jouer = new Jouer();
			parties.add(jouer);
			jouer.jouer();
		}
	}

}
