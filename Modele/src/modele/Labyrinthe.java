/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Matthieu Petit
 */
public class Labyrinthe {
    private ArrayList<ArrayList<Cellule>> lab;
    private Explorateur exp;
    private int largeur;
    private int hauteur;
    private int dx;
    private int dy;
    private int fx;
    private int fy;
    private int x;
    private int y;
    
    /*Constructeur*/
    public Labyrinthe()
    {
        /*largeur et hauteur aléatoire*/
        largeur = ThreadLocalRandom.current().nextInt(5, 10 + 1);
        hauteur = ThreadLocalRandom.current().nextInt(5, 10 + 1);
        
        /*On remplit le tableau aléatoirement de cellule si t = 1 la cellule contient un mur*/
        for(int i=0; i<largeur; i++)
        {
            for(int j=0; j<hauteur; j++)
            {
                Cellule c = new Cellule();
                lab.get(i).add(c);
                lab.get(j).add(c);
                int t = ThreadLocalRandom.current().nextInt(1, 2 + 1);
                if((t == 1) || (i == largeur-1) || (j == hauteur - 1))
                {
                    Mur m = new Mur(lab.get(i).get(j));
                    lab.get(i).get(j).prendreOccupant(m);
                } 
            }
        }
        
        /*coordonnées de depart aléatoires*/
        dx = ThreadLocalRandom.current().nextInt(largeur, hauteur + 1);
        dy = ThreadLocalRandom.current().nextInt(largeur, hauteur + 1);
        
        /*Coordonnées d'arrivée aléatoire, sur les bords du labyrinthe et différentes des
        ccoordonnées de départ
        */
        do
        {
            fx = ThreadLocalRandom.current().nextInt(largeur, hauteur + 1);
            fy = ThreadLocalRandom.current().nextInt(largeur, hauteur + 1);
        }while(((fx == dx) && (fy == dy)) && ((fx != largeur)||(fy != hauteur)));
        
        /*coordonnées courantes*/
        x = dx;
        y = dy;
        
        /*explorateur aux coordonnées courantes*/
        exp = new Explorateur(lab.get(x).get(y));
        lab.get(x).get(y).prendreOccupant(exp);

    }
    
    public void deplacer_alea()
    {
        int deplace = ThreadLocalRandom.current().nextInt(1, 4 + 1);
        if(deplace == 1)
        {
            
        }
    }
}
