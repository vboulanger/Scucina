/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scucina;

import java.awt.Color;
import moteurJeu.moteur.CClavier;
import moteurJeu.moteur.CSouris;
import moteurJeu.moteur.DessinAbstract;
import moteurJeu.moteur.JeuAbstract;
import moteurJeu.moteur.MoteurGraphique;


/**
 *
 * @author vincentboulanger
 */
public class JeuMenu implements JeuAbstract {
    
/**
	 * affiche la souris
	 */
	int sx, sy;
	Color c = Color.RED;
        Bouton b1, b2;
        
        

	/**
	 * le mode
	 */
	String mode="menu";

    public JeuMenu() {
        this.b1 = new Bouton(100, 300, 50, 400, "Aller au tutoriel");
        //this.b2 = new Bouton(100, 400, 50, 400, "Aller au tutoriel 2");
    }

	@Override
	public String evoluer(CClavier clavier, CSouris souris) {
		this.mode="menu";
		// evoluer stocke la souris
		this.sx = souris.getX();
		this.sy = souris.getY();
                
		
		// si la souris est dans le carre
		if ((sx > b1.pos_x) && (sy > b1.pos_y) && (sy < b1.pos_y+b1.hauteur) && (sx < b1.pos_x+b1.largeur) && (souris.getClicked())) {
			// on change de mode de jeu
			System.out.println("passe en mode Tutoriel");
			this.mode = "intro";
		}

                // si la souris est dans le carre
                /*
		if ((sx > b2.pos_x) && (sy > b2.pos_y) && (sy < b2.pos_y+b2.hauteur) && (sx < b2.pos_x+b2.largeur) && (souris.getClicked())) {
			// on change de mode de jeu
			System.out.println("passe en mode Tutoriel 2");
			this.mode = "intro";
		}
*/

		return (this.mode);

	}

	@Override
	public boolean etreFini() {
		// TODO Auto-generated method stub
		return false;
	}
    
}
