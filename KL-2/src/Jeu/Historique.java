package Jeu;

import java.time.LocalDateTime;
import java.util.Stack;
/** Enregistre l'historique d'une partie sous la forme d'un pile d'objet de la
 * classe TourDeJeu.
 * @author Chaimae, Alexandre
 */
public class Historique {
    
    /** Chaque déplacement est enregistré sous forme de (pieceAvant,pieceApres) dans une pile */
    private Stack<TourDeJeu> coupsJoues;

    /** La date et l'heure ou la partie a été lancée */
    private LocalDateTime datePartie;

    /** les deux joueurs de la partie */
    @SuppressWarnings("unused")
	private Joueur joueur1;
    @SuppressWarnings("unused")
	private Joueur joueur2;


    /** Constructeur */
    public Historique(Joueur j1, Joueur j2){
        coupsJoues = new Stack<TourDeJeu>();
        datePartie = LocalDateTime.now();
        joueur1 = j1;
        joueur2 = j2;
    }

    /** Enregistrer un coup
     * @param coup Coup
     */
    public void ajouter(TourDeJeu tour){    
        coupsJoues.push(tour);
    }
    
    /** Supprimer le dernier coup et le retourner
     */
    public TourDeJeu supprimerDernier(){
        return coupsJoues.pop();
    }

    /** Obtenir le nombre des coups enregistrés dans l'historique */
    public int taille(){
        return coupsJoues.size();
    }

    public String toString(){
        String info = "Partie jouée le " + datePartie + " : [";             
        for (TourDeJeu tour : coupsJoues) {
            info += tour;
        }
        info += "]";
        return info;
    }

    /** Afficher l'historique*/
    public void afficher(){
        System.out.println(this);
    }
    
    @SuppressWarnings("unused")
	private Stack<TourDeJeu> getCoupsJoues() {
    	return coupsJoues;
    }

}