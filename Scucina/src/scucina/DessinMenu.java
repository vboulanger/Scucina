/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package scucina;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import moteurJeu.moteur.DessinAbstract;
import moteurJeu.sprite.Sprites;

/**
 *
 * @author vincentboulanger
 */
public class DessinMenu implements DessinAbstract {
    
    
    JeuMenu jeu;
    Cases[][] cases;
    String nom_img = "menu";
    String chemin_map = "/img/menu1.png";
    Bouton b1, b2;
    
    
    public DessinMenu(JeuMenu j) {
        this.jeu = j;
        this.b1 = jeu.b1;
        this.b2 = jeu.b2;
    }
    
    @Override
    public void dessiner(BufferedImage image) {
        // on recupere le graphics
        Graphics2D g=(Graphics2D)image.getGraphics();
        //g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.2f));
        Sprites.dessiner(g, "menu", 0 , 0);
        g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.f));
        /**
         * Récupéré bouton à partir de JeuMenu en attribut
         * --> Dessiner depuis les attributs des boutons !
         */
        g.setColor(Color.white);
        g.setFont(new Font("helvetica", Font.PLAIN, 20)); 
        //g.drawRect(b1.pos_x, b1.pos_y, b1.largeur, b1.hauteur);
        g.drawString(b1.txt, b1.txtx, b1.txty);
        
        /*
        g.drawRect(b2.pos_x, b2.pos_y, b2.largeur, b2.hauteur);
        g.drawString(b2.txt, b2.txtx, b2.txty);
        */
        
        g.dispose();
        
        
        
        //jeu.print();
    }
    
    
}